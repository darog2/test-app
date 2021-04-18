package com.dungeon.task17.service;

import com.dungeon.common.DateFormatUtil;
import com.dungeon.task17.model.Component;
import com.dungeon.task17.model.ComponentAmount;
import com.dungeon.task17.model.Order;
import com.dungeon.task17.model.Pizza;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class OrderService {

    public static final String TOP_BORDER = "____________________________________________________";
    public static final String HEADER = "|                      PIZZA ORDER                 |";
    public static final String EMPTY_LINE = "|                                                  |";
    public static final String MIDDLE_BORDER = "|__________________________________________________|";
    public static final String ORDER_DATE = "| Order date    :  %s             |%n";
    public static final String DELIVERY_DATE = "| Delivery date : %s             |%n";
    public static final String CLIENT_NAME = "| Client  :    %s                         |%n";
    public static final String PHONE = "| Phone   :    %s                       |%n";
    public static final String ADDRESS = "| Address :    %s       |%n";
    public static final String PIZZA_NAME = "|               PIZZA: %s                |%n";
    public static final String BASE_PRICE = "| Base price :                          $%s      |%n";
    public static final String TOTAL_PRICE = "| Total price:                          $%s    |%n";
    public static final String COMPONENT_TEMPLATE = "|  %s              %s            %s x %s     |%n";
    public static final String REPORT_NAME_TEMPLATE = "order_%s__.txt";

    private String prepareReport(Order order) {
        StringBuilder report = new StringBuilder(TOP_BORDER);
        report.append(System.lineSeparator());
        report.append(HEADER);
        report.append(System.lineSeparator());
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(String.format(ORDER_DATE, DateFormatUtil.getStringFromDate(order.getOrderDate())));
        report.append(String.format(DELIVERY_DATE, order.getDeliveryDate()));
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(String.format(CLIENT_NAME, order.getClient().getName()));
        report.append(String.format(PHONE, order.getClient().getPhoneNumber()));
        report.append(String.format(ADDRESS, order.getClient().getAddress()));
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(String.format(PIZZA_NAME, order.getPizza().getName()));
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        double price = Pizza.MIN_PRICE;

        for (Map.Entry<Component, ComponentAmount> entry : order.getPizza().getComposition().entrySet()) {
            price = price + entry.getKey().getPrice() * entry.getValue().getPriceMultiplier();
            report.append(String.format(COMPONENT_TEMPLATE, entry.getKey().getName(), entry.getValue(), entry.getKey().getPrice(), entry.getValue().getPriceMultiplier()));
        }
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(MIDDLE_BORDER);
        report.append(System.lineSeparator());
        report.append(String.format(BASE_PRICE, Pizza.MIN_PRICE));
        report.append(String.format(TOTAL_PRICE, price));
        report.append(MIDDLE_BORDER);
        report.append(System.lineSeparator());
        return report.toString();
    }

    public void printOrder(Order order) {
        String report = prepareReport(order);
        System.out.println(report);
    }

    public void writeOrderToFile(Order order) {
        String report = prepareReport(order);
        try (FileWriter writer = new FileWriter(generateOrderName(order.getOrderDate()))) {
            writer.write(report);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generateOrderName(Date date) {
        return String.format(REPORT_NAME_TEMPLATE, DateFormatUtil.formatDateAsReportNamePart(date));
    }
}

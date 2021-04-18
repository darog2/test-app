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
    public static final String ORDER_DATE = "| Order date    :  %-32.30s|%n";
    public static final String DELIVERY_DATE = "| Delivery date :  %-32.30s|%n";
    public static final String CLIENT_NAME = "| Client  :    %-36.30s|%n";
    public static final String PHONE = "| Phone   :    %-36.30s|%n";
    public static final String ADDRESS = "| Address :    %-36.30s|%n";
    public static final String PIZZA_NAME = "|               PIZZA: %-28.25s|%n";
    public static final String BASE_PRICE = "| Base price :                         $%-11.2f|%n";
    public static final String TOTAL_PRICE = "| Total price:                         $%-11.2f|%n";
    public static final String PRICE_TEMPLATE = "%6.2f x %1.1f";
    public static final String COMPONENT_TEMPLATE = "|  %-16.14s%-14.14s%16.16s  |%n";
    public static final String REPORT_NAME_TEMPLATE = "order_%s_%s__.txt";

    private String prepareReport(Order order) {
        StringBuilder report = new StringBuilder(TOP_BORDER);
        report.append(System.lineSeparator());
        report.append(HEADER);
        report.append(System.lineSeparator());
        report.append(EMPTY_LINE);
        report.append(System.lineSeparator());
        report.append(String.format(ORDER_DATE,
                DateFormatUtil.getStringFromDate(order.getOrderDate())));
        report.append(String.format(DELIVERY_DATE,
                DateFormatUtil.getStringFromDate(order.getDeliveryDate())));
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
            String formattedPrice= String.format(PRICE_TEMPLATE,
                    entry.getKey().getPrice(),
                    entry.getValue().getPriceMultiplier());
            report.append(String.format(COMPONENT_TEMPLATE,
                    entry.getKey().getName(),
                    entry.getValue().getNameInReport(),
                    formattedPrice));
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
        try (FileWriter writer = new FileWriter(generateOrderName(order))) {
            writer.write(report);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generateOrderName(Order order) {
        return String.format(REPORT_NAME_TEMPLATE,
                order.getClient().getName(),
                DateFormatUtil.formatDateAsReportNamePart(order.getOrderDate()));
    }
}

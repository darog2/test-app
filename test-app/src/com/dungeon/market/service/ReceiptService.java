package com.dungeon.market.service;

import com.dungeon.market.model.Cashier;
import com.dungeon.market.model.Market;
import com.dungeon.market.model.Product;
import com.dungeon.market.model.Receipt;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class ReceiptService {
    public static final String MARKET_NAME_FORMAT = "|%25.25s%25s|%n";
    public static final String HORIZONTAL_BORDER = "|__________________________________________________|";
    public static final String TOP_HORIZONTAL_BORDER = "____________________________________________________";
    public static final String EMPTY = "";
    public static final String EMPTY_LINE = "|                                                  |";
    public static final String ROW_NUMBER_FORMAT = "|Касса  :    %-38d|%n";
    public static final String CASHIER_FORMAT = "|Кассир :    %-38.38s|%n";
    public static final String FULLNAME_FORMAT = "%s %s";
    public static final String TIME_FORMAT = "|Время  :    %-38s|%n";
    public static final String PRODUCTS_HEADER = "|                      Товары                      |";
    public static final String PRODUCT_TEMPLATE = "| %-27.27s     %15s  |%n";
    public static final String PRICE_TEMPLATE = "%6.2f x %2d";
    public static final String TOTAL_PRICE_TEMPLATE = "| Total price:  %33.2f  |%n";
    public static final SimpleDateFormat REPORT_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    public static final SimpleDateFormat REPORT_NAME_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy hh-mm-ss");
    public static final String REPORT_NAME_TEMPLATE = "receipt_%s__.txt";
    //    public static final String PRODUCT_TEMPLATE = "| %-27.27s      %6.2f x %2d  |%n";

    public void printReceipt(Market market, Receipt receipt, int rowNumber) {
        double totalPrice = 0;

        String date = new SimpleDateFormat("dd.MM.yyyy hh:mm").format(receipt.getDate());
        System.out.println(TOP_HORIZONTAL_BORDER);
        System.out.printf(MARKET_NAME_FORMAT, market.getName(), EMPTY);
        System.out.println(EMPTY_LINE);
        System.out.printf(ROW_NUMBER_FORMAT, rowNumber);
        System.out.printf(CASHIER_FORMAT, prepareFullName(receipt.getCashier()));
        System.out.printf(TIME_FORMAT, date);
        System.out.println(EMPTY_LINE);
        System.out.println(PRODUCTS_HEADER);
        System.out.println(EMPTY_LINE);
        for (Map.Entry<Product, Integer> entry : receipt.getProducts().entrySet()) {
            totalPrice = totalPrice + entry.getKey().getPrice() * entry.getValue();
            String formattedPrice = String.format(PRICE_TEMPLATE, entry.getKey().getPrice(), entry.getValue());
            System.out.printf(PRODUCT_TEMPLATE, entry.getKey().getName(), formattedPrice);

        }
        System.out.println(HORIZONTAL_BORDER);
        System.out.printf(TOTAL_PRICE_TEMPLATE, totalPrice);
        System.out.println(HORIZONTAL_BORDER);
    }

    public void writeReceiptToFile(Market market, Receipt receipt, int rowNumber) {
        try (FileWriter writer = new FileWriter(generateReceiptName(receipt.getDate()))) {
            double totalPrice = 0;

            String date = REPORT_DATE_FORMAT.format(receipt.getDate());
            writer.write(TOP_HORIZONTAL_BORDER + System.lineSeparator());
            writer.write(String.format(MARKET_NAME_FORMAT, market.getName(), EMPTY));
            writer.write(EMPTY_LINE + System.lineSeparator());
            writer.write(String.format(ROW_NUMBER_FORMAT, rowNumber));
            writer.write(String.format(CASHIER_FORMAT, prepareFullName(receipt.getCashier())));
            writer.write(String.format(TIME_FORMAT, date));
            writer.write(EMPTY_LINE + System.lineSeparator());
            writer.write(PRODUCTS_HEADER + System.lineSeparator());
            writer.write(EMPTY_LINE + System.lineSeparator());
            for (Map.Entry<Product, Integer> entry : receipt.getProducts().entrySet()) {
                totalPrice = totalPrice + entry.getKey().getPrice() * entry.getValue();
                String formattedPrice = String.format(PRICE_TEMPLATE, entry.getKey().getPrice(), entry.getValue());
                writer.write(String.format(PRODUCT_TEMPLATE, entry.getKey().getName(), formattedPrice));

            }
            writer.write(HORIZONTAL_BORDER + System.lineSeparator());
            writer.write(String.format(TOTAL_PRICE_TEMPLATE, totalPrice));
            writer.write(HORIZONTAL_BORDER + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generateReceiptName(Date date) {
        return String.format(REPORT_NAME_TEMPLATE, REPORT_NAME_DATE_FORMAT.format(date));
    }

    public String prepareFullName(Cashier cashier) {
        return String.format(FULLNAME_FORMAT, cashier.getName(), cashier.getLastName());
    }
}

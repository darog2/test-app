package com.dungeon.market.service;

import com.dungeon.market.model.Cashier;
import com.dungeon.market.model.Market;
import com.dungeon.market.model.Product;
import com.dungeon.market.model.Receipt;

import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Map;

public class ReceiptService {
    public static final String MARKET_NAME_FORMAT = "|%25.25s%25s|%n";
    public static final String HORIZONTAL_BORDER = "\n____________________________________________________";
    public static final String EMPTY = "";
    public static final String EMPTY_LINE = "|                                                  |";
    public static final String ROW_NUMBER_FORMAT = "|Касса  :    %-38d|%n";
    public static final String CASHIER_FORMAT = "|Кассир :    %-38.38s|%n";
    public static final String FULLNAME_FORMAT = "%s %s";
    public static final String TIME_FORMAT = "|Время  :    %-38s|%n";
    public static final String PRODUCTS_LINE= "|                      Товары                      |";
    public void printReceipt(Market market, Receipt receipt, int rowNumber){
        double totalPrice = 0;

        String date = new SimpleDateFormat("dd.MM.yyyy hh:mm").format(receipt.getDate());
        System.out.println(HORIZONTAL_BORDER);
        System.out.printf(MARKET_NAME_FORMAT,market.getName(),EMPTY);
        System.out.println(EMPTY_LINE);
        System.out.printf(ROW_NUMBER_FORMAT, rowNumber);
        System.out.printf(CASHIER_FORMAT, prepareFullName(receipt.getCashier()));
        System.out.printf(TIME_FORMAT, date);
        System.out.println(EMPTY_LINE);
        System.out.println(PRODUCTS_LINE);
        System.out.println(EMPTY_LINE);
        Formatter formatter = new Formatter();
        for (Map.Entry<Product, Integer> entry : receipt.getProducts().entrySet()) {
            totalPrice= totalPrice + entry.getKey().getPrice()*entry.getValue();

//            System.out.format(entry.getKey().getName()+"       "+ entry.getKey().getPrice()+" x "+entry.getValue());
            System.out.println((formatter.format(getKey().getName()+"       "+ entry.getKey().getPrice()+" x "+entry.getValue()));
        }
        System.out.println(HORIZONTAL_BORDER);
        System.out.println(("Total price:  ") + totalPrice);
    }

    private Cashier getKey() {
    }

    public String prepareFullName(Cashier cashier){
        return String.format(FULLNAME_FORMAT, cashier.getName(),cashier.getLastName());
    }
}

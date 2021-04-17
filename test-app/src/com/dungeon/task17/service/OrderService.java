package com.dungeon.task17.service;

import com.dungeon.common.DateFormatUtil;
import com.dungeon.task17.model.Component;
import com.dungeon.task17.model.ComponentAmount;
import com.dungeon.task17.model.Order;
import com.dungeon.task17.model.Pizza;

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

    public void printOrder(Order order){
        System.out.println(TOP_BORDER);
        System.out.println(HEADER);
        System.out.println(EMPTY_LINE);
        System.out.printf(ORDER_DATE, DateFormatUtil.getStringFromDate(order.getOrderDate()));
        System.out.printf(DELIVERY_DATE, order.getDeliveryDate());
        System.out.println(EMPTY_LINE);
        System.out.printf(CLIENT_NAME, order.getClient().getName());
        System.out.printf(PHONE, order.getClient().getPhoneNumber());
        System.out.printf(ADDRESS,order.getClient().getAddress());
        System.out.println(EMPTY_LINE);
        System.out.printf(PIZZA_NAME, order.getPizza().getName());
        System.out.println(EMPTY_LINE);
        double price= Pizza.MIN_PRICE;
        for (Map.Entry<Component, ComponentAmount>entry:order.getPizza().getComposition().entrySet()){

            price = price +  entry.getKey().getPrice()* entry.getValue().getPriceMultiplier();

            System.out.printf(COMPONENT_TEMPLATE, entry.getKey().getName(), entry.getValue(), entry.getKey().getPrice(), entry.getValue().getPriceMultiplier());
        }
//        System.out.println("|  Onion            Medium          33   x 1       |");
//        System.out.println("|  Tomato sauce     More            2,3  x 1,5     |");
        System.out.println(EMPTY_LINE);
        System.out.println(EMPTY_LINE);
        System.out.println(MIDDLE_BORDER);
        System.out.printf(BASE_PRICE, Pizza.MIN_PRICE);
        System.out.printf(TOTAL_PRICE, price);
        System.out.println(MIDDLE_BORDER);
    }
}

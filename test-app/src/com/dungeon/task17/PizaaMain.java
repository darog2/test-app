package com.dungeon.task17;

import com.dungeon.common.DateFormatUtil;
import com.dungeon.task17.model.Client;
import com.dungeon.task17.model.Component;
import com.dungeon.task17.model.ComponentAmount;
import com.dungeon.task17.model.Order;
import com.dungeon.task17.model.Pizza;
import com.dungeon.task17.service.OrderService;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PizaaMain {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Vasay");
        client.setAddress("Улица пушкина дом колотушкина");
        client.setPhoneNumber("1232189338");
        Component component=new Component("Hen",15);
        Component component1=new Component();
        Component component2=new Component("tomato sauce",2.3);
        component1.setName("onion");
        component1.setPrice(33);
        Pizza pizza=new Pizza("margoritta");
        pizza.getComposition().put(component, ComponentAmount.LESS);
        pizza.getComposition().put(component2,ComponentAmount.MEDIUM);
        pizza.getComposition().put(component1,ComponentAmount.A_LOT);
        Order order=new Order(pizza,client);
        Date deliver = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(deliver);
        calendar.add(Calendar.HOUR,2);
        deliver = calendar.getTime();
        order.setDeliveryDate(deliver);
        OrderService orderService = new OrderService();
        orderService.printOrder(order);
        orderService.writeOrderToFile(order);
    }
}

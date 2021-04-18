package com.dungeon.pizza.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Order {
   private List<Pizza>pizzaList;
   private Client client;
   private Date orderDate;
   private Date deliveryDate;

    public Order(Client client) {
        this.pizzaList=new LinkedList<>();
        this.client = client;
        this.orderDate = new Date();
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void addPizza(Pizza pizza) {
        this.pizzaList.add(pizza);
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}

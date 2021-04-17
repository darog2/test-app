package com.dungeon.task17.model;

import java.util.Date;

public class Order {
   private Pizza pizza;
   private Client client;
   private Date orderDate;
   private Date deliveryDate;

    public Order(Pizza pizza, Client client) {
        this.pizza = pizza;
        this.client = client;
        this.orderDate = new Date();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
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

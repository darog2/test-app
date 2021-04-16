package com.dungeon.task17;

public class Maine {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Vasay");
        client.setAddress("Улица пушкина дом колотушкина");
        client.setPhoneNumber(1232189338);
        Component component=new Component("Hen",15);
        Component component1=new Component();
        component1.setName("onion");
        component1.setPrice(33);
        Pizza pizza=new Pizza("margoritta");
    }
}

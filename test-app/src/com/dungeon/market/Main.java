package com.dungeon.market;

import com.dungeon.market.model.Cashier;
import com.dungeon.market.model.Market;
import com.dungeon.market.model.Product;
import com.dungeon.market.model.Receipt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        cashier.setName("dasha");
        cashier.setLastName("Pupkina");
        Cashier cashier1 = new Cashier("ivan", "Govnow");
        Product product = new Product("масло подсолнечное 1 литр", 28);
        Product product1 = new Product();
        product1.setName("Шокол. Рошен \"Говно Пети\"");
        product1.setPrice(35);
        Market market=new Market("ATB",5);
        Receipt receipt=new Receipt();
        receipt.setCashier(cashier1);
        receipt.setDate(new Date());
        Map<Product, Integer> products = receipt.getProducts();
        products.put(product,5);
        receipt.getProducts().put(product1,2);
        double totalPrice = 0;

        String date = new SimpleDateFormat("dd.MM.yyyy hh:mm").format(receipt.getDate());
        System.out.println(market.getName());
        System.out.println(date);
        for (Map.Entry<Product, Integer> entry : receipt.getProducts().entrySet()) {
            totalPrice= totalPrice + entry.getKey().getPrice()*entry.getValue();
            System.out.println(entry.getKey().getName()+"       "+ entry.getKey().getPrice()+" x "+entry.getValue());
        }
        System.out.println(("Total price:  ") + totalPrice);
    }
}

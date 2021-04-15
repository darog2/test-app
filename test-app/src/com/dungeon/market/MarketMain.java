package com.dungeon.market;

import com.dungeon.market.model.Cashier;
import com.dungeon.market.model.Market;
import com.dungeon.market.model.Product;
import com.dungeon.market.model.Receipt;
import com.dungeon.market.service.ReceiptService;

import java.util.Date;
import java.util.Map;

public class MarketMain {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        cashier.setName("dasha");
        cashier.setLastName("Pupkina");
        Cashier cashier1 = new Cashier("ivan", "Ivanov");
        Product product = new Product("масло подсолнечное 1 литр", 20008);
        Product product1 = new Product();
        product1.setName("Шокол. Рошен 1111111111111111111111111 \"и\"");
        product1.setPrice(3005);
        Market market=new Market("ATB",5);
        Receipt receipt=new Receipt();
        receipt.setCashier(cashier1);
        receipt.setDate(new Date());
        Map<Product, Integer> products = receipt.getProducts();
        products.put(product,5);
        receipt.getProducts().put(product1,2);
        ReceiptService receiptService=new ReceiptService();
        receiptService.printReceipt(market,receipt, 3);
        receiptService.writeReceiptToFile(market,receipt, 3);
    }
}

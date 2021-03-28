package com.dungeon.tax;

public class TaxMain {

    public static void main(String[] args) {

        TaxManager manager = new TaxManager();
        manager
                .addCalculator("UA",new UkraineTaxCalculator())
                .addCalculator("UK",new GreatBritainTaxCalculator());
        TaxCalculator calculator = new GreatBritainTaxCalculator();
        TaxCalculator calculator1 = new UkraineTaxCalculator();
        double sum = 75_000;
        double total = manager.calculateTotalSum("UA",sum);
        System.out.println("total in UA= " + total);
        total = manager.calculateTotalSum("UK",sum);
        System.out.println("total in Britain= " + total);
    }
}

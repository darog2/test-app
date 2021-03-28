package com.dungeon.tax;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {
    private Map<String,TaxCalculator> calculatorMap = new HashMap<>();
    public TaxManager addCalculator(String country, TaxCalculator calculator){
        calculatorMap.put(country, calculator);
        return this;
    }
    public double calculateTotalSum(String country,double sum){
        TaxCalculator calculator = calculatorMap.get(country);
        double tax = calculator.calculateTax(sum);
        return sum + tax;
    }
}

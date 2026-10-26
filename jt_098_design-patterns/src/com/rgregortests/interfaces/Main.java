package com.rgregortests.interfaces;

/* Interfaces */
public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}

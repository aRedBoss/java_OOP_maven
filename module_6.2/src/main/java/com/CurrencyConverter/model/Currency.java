package com.CurrencyConverter.model;

public class Currency {
    private final String abbreviation;
    private final String name;
    private final double rateToUSD;

    public Currency(String abbreviation, String name, double rateToUSD) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    @Override
    public String toString() {
        return abbreviation + " - " + name;
    }
}


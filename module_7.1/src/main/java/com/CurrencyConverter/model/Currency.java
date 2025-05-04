package com.CurrencyConverter.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Currency")
public class Currency {
    @Id
    @Column(length = 3)
    private String abbreviation;

    private String name;

    @Column(name = "rate_to_usd")
    private double rateToUSD;

    // Default constructor
    public Currency() {
    }

    // Constructor accepting abbreviation and rateToUSD
    public Currency(String abbreviation, double rateToUSD) {
        this.abbreviation = abbreviation;
        this.rateToUSD = rateToUSD;
        this.name = abbreviation;  // If you want the name to be the same as abbreviation, or you can update as needed
    }

    // Constructor with all fields (already present)
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

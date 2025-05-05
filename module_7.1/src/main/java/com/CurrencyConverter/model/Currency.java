package com.CurrencyConverter.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Currency")
public class Currency {
    @Id
    @Column(length = 3)
    private String abbreviation;

    private String name;

    @Column(name = "rate_to_usd")
    private double rateToUSD;

    @OneToMany(mappedBy = "source")
    private List<Transaction> sourceTransactions;

    @OneToMany(mappedBy = "destination")
    private List<Transaction> destinationTransactions;

    public Currency() {}

    public Currency(String abbreviation, double rateToUSD) {
        this.abbreviation = abbreviation;
        this.rateToUSD = rateToUSD;
        this.name = abbreviation;
    }

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

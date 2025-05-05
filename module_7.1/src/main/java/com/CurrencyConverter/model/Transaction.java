package com.CurrencyConverter.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @ManyToOne
    @JoinColumn(name = "source", referencedColumnName = "abbreviation")
    private Currency source;

    @ManyToOne
    @JoinColumn(name = "destination", referencedColumnName = "abbreviation")
    private Currency destination;

    public Transaction() {}

    public Transaction(double amount, Currency source, Currency destination) {
        this.amount = amount;
        this.source = source;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getSource() {
        return source;
    }

    public Currency getDestination() {
        return destination;
    }
}

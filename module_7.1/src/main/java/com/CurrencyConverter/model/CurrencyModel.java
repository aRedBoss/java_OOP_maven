package com.CurrencyConverter.model;

import com.CurrencyConverter.database.CurrencyDAO;

import java.util.HashMap;
import java.util.Map;

public class CurrencyModel {
    private final Map<String, Currency> currencies;

    public CurrencyModel() {
        currencies = new HashMap<>();

        // Fetch currencies from the database using DAO
        CurrencyDAO dao = new CurrencyDAO();
        for (Currency currency : dao.getAllCurrencies()) {
            currencies.put(currency.getAbbreviation(), currency);
        }
    }

    public Map<String, Currency> getCurrencies() {
        return currencies;
    }

    public double convert(double amount, Currency from, Currency to) {
        // Convert to USD first, then to target currency
        double amountInUSD = amount / from.getRateToUSD();
        return amountInUSD * to.getRateToUSD();
    }
}

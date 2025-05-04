package com.CurrencyConverter.model;

import com.CurrencyConverter.database.CurrencyDAO;

import java.util.HashMap;
import java.util.Map;

public class CurrencyModel {
    private final Map<String, Currency> currencies;

    public CurrencyModel() {
        currencies = new HashMap<>();

        CurrencyDAO dao = new CurrencyDAO();
        for (Currency currency : dao.getAllCurrencies()) {
            currencies.put(currency.getAbbreviation(), currency);
        }
    }

    public Map<String, Currency> getCurrencies() {
        return currencies;
    }

    public double convert(double amount, Currency from, Currency to) {

        double amountInUSD = amount / from.getRateToUSD();
        return amountInUSD * to.getRateToUSD();
    }

    public void addCurrency(Currency currency) {
        CurrencyDAO dao = new CurrencyDAO();
        if (!dao.currencyExists(currency.getAbbreviation())) {
            dao.insertCurrency(currency);
            currencies.put(currency.getAbbreviation(), currency);
        } else {
            System.out.println("Currency already exists: " + currency.getAbbreviation());
        }
    }


}

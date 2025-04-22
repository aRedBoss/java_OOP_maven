package com.CurrencyConverter.model;

import java.util.HashMap;
import java.util.Map;

public class CurrencyModel {
    private final Map<String, Currency> currencies;

    public CurrencyModel() {
        currencies = new HashMap<>();

        // Hardcoded currency examples (can be extended later)
        currencies.put("USD", new Currency("USD", "US Dollar", 1.0));       // Base currency
        currencies.put("EUR", new Currency("EUR", "Euro", 0.91));
        currencies.put("GBP", new Currency("GBP", "British Pound", 0.78));
        currencies.put("JPY", new Currency("JPY", "Japanese Yen", 133.12));
        currencies.put("IQD", new Currency("IQD", "Iraqi Dinar", 1309.0));
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

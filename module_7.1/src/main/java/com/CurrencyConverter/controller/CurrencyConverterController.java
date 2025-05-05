package com.CurrencyConverter.controller;

import com.CurrencyConverter.model.Currency;
import com.CurrencyConverter.model.CurrencyModel;

public class CurrencyConverterController {
    private final CurrencyModel model;

    public CurrencyConverterController() {
        this.model = new CurrencyModel();

        // ✅ Preload default currencies
        model.addCurrency(new Currency("USD", "US Dollar", 1.0));
        model.addCurrency(new Currency("EUR", "Euro", 0.85));
        model.addCurrency(new Currency("JPY", "Japanese Yen", 110.0));
        model.addCurrency(new Currency("GBP", "British Pound", 0.75));
    }

    public CurrencyModel getModel() {
        return model;
    }

    public double convert(double amount, Currency from, Currency to) {
        return model.convert(amount, from, to);
    }
}

package com.CurrencyConverter.controller;

import com.CurrencyConverter.model.Currency;
import com.CurrencyConverter.model.CurrencyModel;

public class CurrencyConverterController {
    private final CurrencyModel model;

    public CurrencyConverterController() {
        this.model = new CurrencyModel();
    }

    public CurrencyModel getModel() {
        return model;
    }

    public double convert(double amount, Currency from, Currency to) {
        return model.convert(amount, from, to);
    }
}


package com.CurrencyConverter.database;

import com.CurrencyConverter.model.Currency;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class CurrencyDAO {

    public List<Currency> getAllCurrencies() {
        List<Currency> currencies = new ArrayList<>();

        String sql = "SELECT abbreviation, name, rate_to_usd FROM Currency";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String abbreviation = rs.getString("abbreviation");
                String name = rs.getString("name");
                double rate = rs.getDouble("rate_to_usd");

                currencies.add(new Currency(abbreviation, name, rate));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return currencies;
    }
}


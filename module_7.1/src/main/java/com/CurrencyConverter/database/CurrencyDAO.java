package com.CurrencyConverter.database;

import com.CurrencyConverter.model.Currency;
import jakarta.persistence.*;

import java.util.List;

public class CurrencyDAO {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CurrencyPU");

    public List<Currency> getAllCurrencies() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT c FROM Currency c", Currency.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        } finally {
            em.close();
        }
    }

    public void insertCurrency(Currency currency) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(currency);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public boolean currencyExists(String abbreviation) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Currency.class, abbreviation) != null;
        } finally {
            em.close();
        }
    }

}

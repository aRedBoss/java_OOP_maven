package com.CurrencyConverter.database;

import com.CurrencyConverter.model.Currency;
import com.CurrencyConverter.model.Transaction;
import jakarta.persistence.*;

public class TransactionDAO {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CurrencyPU");

    public void insertTransaction(Transaction transaction) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Currency managedSource = em.find(Currency.class, transaction.getSource().getAbbreviation());
            Currency managedDestination = em.find(Currency.class, transaction.getDestination().getAbbreviation());

            transaction = new Transaction(transaction.getAmount(), managedSource, managedDestination);

            em.persist(transaction);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}


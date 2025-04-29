DROP DATABASE IF EXISTS currency_converter;

CREATE DATABASE currency_converter;

USE currency_converter;

CREATE TABLE Currency (
                          abbreviation CHAR(3) PRIMARY KEY,
                          name VARCHAR(50) NOT NULL,
                          rate_to_usd DOUBLE NOT NULL
);

INSERT INTO Currency (abbreviation, name, rate_to_usd) VALUES
                                                           ('USD', 'US Dollar', 1.0),
                                                           ('EUR', 'Euro', 0.91),
                                                           ('GBP', 'British Pound', 0.78),
                                                           ('JPY', 'Japanese Yen', 133.12),
                                                           ('IQD', 'Iraqi Dinar', 1309.0),
                                                           ('CAD', 'Canadian Dollar', 1.36),
                                                           ('AUD', 'Australian Dollar', 1.52),
                                                           ('CHF', 'Swiss Franc', 0.91);


DROP USER IF EXISTS 'omar'@'localhost';

CREATE USER 'omar'@'localhost' IDENTIFIED BY 'Amoury123';

GRANT SELECT ON currency_converter.* TO 'omar'@'localhost';

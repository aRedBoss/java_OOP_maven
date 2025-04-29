-- 1. Drop existing database if it exists
DROP DATABASE IF EXISTS currency_converter;

-- 2. Create new database
CREATE DATABASE currency_converter;

-- Use the database
USE currency_converter;

-- 3. Create Currency table
CREATE TABLE Currency (
                          abbreviation CHAR(3) PRIMARY KEY,
                          name VARCHAR(50) NOT NULL,
                          rate_to_usd DOUBLE NOT NULL
);

-- 4. Insert at least 8 currencies
INSERT INTO Currency (abbreviation, name, rate_to_usd) VALUES
                                                           ('USD', 'US Dollar', 1.0),
                                                           ('EUR', 'Euro', 0.91),
                                                           ('GBP', 'British Pound', 0.78),
                                                           ('JPY', 'Japanese Yen', 133.12),
                                                           ('IQD', 'Iraqi Dinar', 1309.0),
                                                           ('CAD', 'Canadian Dollar', 1.36),
                                                           ('AUD', 'Australian Dollar', 1.52),
                                                           ('CHF', 'Swiss Franc', 0.91);

-- 5. Drop user account if it exists
DROP USER IF EXISTS 'omar'@'localhost';

-- 6. Create new user account
CREATE USER 'omar'@'localhost' IDENTIFIED BY 'Amoury123';

-- 7. Grant only necessary privileges
GRANT SELECT ON currency_converter.* TO 'omar'@'localhost';

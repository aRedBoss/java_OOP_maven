-- 1. Get all currencies
SELECT * FROM currency_converter.Currency;

-- 2. Get currency with abbreviation 'EUR'
SELECT * FROM currency_converter.Currency WHERE abbreviation = 'EUR';

-- 3. Get number of currencies
SELECT COUNT(*) AS currency_count FROM currency_converter.Currency;

-- 4. Get currency with the highest exchange rate
SELECT * FROM currency_converter.Currency ORDER BY rate_to_usd DESC LIMIT 1;

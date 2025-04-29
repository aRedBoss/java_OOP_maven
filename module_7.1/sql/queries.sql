SELECT * FROM currency_converter.Currency;

SELECT * FROM currency_converter.Currency WHERE abbreviation = 'EUR';

SELECT COUNT(*) AS currency_count FROM currency_converter.Currency;

SELECT * FROM currency_converter.Currency ORDER BY rate_to_usd DESC LIMIT 1;

UPDATE Books SET price= price + 5 WHERE title = 'Machine Learning';

UPDATE Books SET stock_quantity=25  WHERE title= 'Java programming';

DELETE FROM Customers WHERE email='mwlouise@gmail.com';

DELETE FROM orders WHERE order_id=3;

SELECT * FROM Books WHERE genre='programming language';

SELECT * FROM orders WHERE total_amount >'58';

SELECT * FROM customers WHERE last_name LIKE '%son%';


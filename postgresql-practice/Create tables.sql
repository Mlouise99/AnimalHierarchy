CREATE TABLE Books (
book_id SERIAL PRIMARY KEY,
title VARCHAR(300),
author VARCHAR(300),
genre VARCHAR(300),
price INT,
Stock_quantity VARCHAR(300)

);

CREATE TABLE Customers (
customer_id SERIAL PRIMARY KEY,
First_name VARCHAR(300),
Last_name VARCHAR(300),
email VARCHAR(300),
Phone INT

);

CREATE TABLE Orders (
order_id SERIAL PRIMARY KEY,
customer_id INT,
order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
total_amount VARCHAR(300)

);


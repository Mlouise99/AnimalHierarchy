INSERT INTO Books (title, author, genre, price, stock_quantity)
VALUES
 ('Java programming', 'Louise', 'programming language', 10000, 'Fifty books'),
 ('C programming', 'Leah', 'programming language', 50000, '20 books'),
 ('C++ programming', 'Dr.Kalisa', 'programming language', 45000, '40 books'),
 ('Python programming', 'Dr.Keila', 'programming language', 70000, 'Fifty books'),
 ('Machine Learning', 'Louise', 'Artificial Intelligence', 80000, 'sixty books');


INSERT INTO Customers (first_name, last_name, email, phone)
VALUES
 ('Louise', 'Mwubahamana', 'mwlouise99@gmail.com', 078967664),
 ('Kamaliza', 'Ivy', 'kamalizaI@gmail.com', 0786934521),
 ('Mukamana', 'Ange', 'mukangel@gmail.com', 0795412347),
 ('Kabandana', 'Julliene', 'julli@gmail.com', 786750432),
 ('Mushikiwabo', 'Louise', 'mushikiwabo@gmail.com', 0780009890);

 INSERT INTO orders (customer_id, total_amount)
VALUES
 (1, '50000'),
 (2, '70000'),
 (3, '80000'),
 (4, '900000'),
 (5, '1000000');
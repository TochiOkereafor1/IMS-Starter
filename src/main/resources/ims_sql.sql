CREATE SCHEMA IF NOT EXISTS ims_db;

USE ims_db;

CREATE TABLE IF NOT EXISTS customers (
customer_id INT(12) NOT NULL AUTO_INCREMENT,
first_name VARCHAR (30) DEFAULT NULL,
last_name VARCHAR (30) DEFAULT NULL,
PRIMARY KEY (customer_id)
);

CREATE TABLE IF NOT EXISTS orders (
order_id INT(10) NOT NULL AUTO_INCREMENT,
customer_id INT (12) NOT NULL,
PRIMARY KEY (order_id),
FOREIGN KEY (customer_id) REFERENCES customers (customer_id)
);

CREATE TABLE IF NOT EXISTS products(
product_id INT(10) NOT NULL AUTO_INCREMENT,
product_name VARCHAR (30) NOT NULL,
product_price DOUBLE (8,5) NOT NULL,
PRIMARY KEY (product_id)
);

CREATE TABLE IF NOT EXISTS order_line(
order_id INT(10) NOT NULL,
product_id INT (10) NOT NULL,
quantity INT (10) NOT NULL,
FOREIGN KEY (order_id) REFERENCES orders (order_id),
FOREIGN KEY (product_id) REFERENCES products (product_id)
);

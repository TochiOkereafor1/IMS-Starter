CREATE SCHEMA IF NOT EXISTS ims_db;

USE ims_db;

CREATE TABLE IF NOT EXISTS customers (
customer_id INT(12) NOT NULL AUTO_INCREMENT,
first_name VARCHAR (30) DEFAULT NULL,
last_name VARCHAR (30) DEFAULT NULL,
PRIMARY KEY (customer_id)
);

CREATE TABLE IF NOT EXISTS orders (
order_id INT(20) NOT NULL AUTO_INCREMENT,
fk_customer_id INT (20) NOT NULL,
order_quantity INT (20),
total_order_price DOUBLE (8,5),
PRIMARY KEY (order_id),
FOREIGN KEY (fk_customer_id) REFERENCES customers (customer_id)
);


CREATE TABLE IF NOT EXISTS items(
item_id INT(20) NOT NULL AUTO_INCREMENT,
item_name VARCHAR (30),
item_value DOUBLE (8,5),
PRIMARY KEY (item_id)
);

CREATE TABLE IF NOT EXISTS order_lines(
order_lines_id INT(30) NOT NULL AUTO_INCREMENT,
fk_order_id INT(20) NOT NULL,
fk_item_id INT (20) NOT NULL,
PRIMARY KEY (order_lines_id),
FOREIGN KEY (fk_order_id) REFERENCES orders (order_id),
FOREIGN KEY (fk_item_id) REFERENCES items (item_id)
);

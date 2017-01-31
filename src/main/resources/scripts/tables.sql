CREATE TABLE cart (
  cart_id int(11) NOT NULL AUTO_INCREMENT,
  customer_id int(11) NOT NULL,
  amount decimal(10,2) NOT NULL,
  create_date datetime NOT NULL,
  update_date datetime NOT NULL
  );

CREATE TABLE customer (
  customer_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(40) NOT NULL,
  password varchar(16) NOT NULL,
  name varchar(80) NOT NULL,
  address varchar(160) NOT NULL
);

CREATE TABLE orders (
  order_id int(11) NOT NULL AUTO_INCREMENT,
  product_id int(11) NOT NULL,
  cart_id int(11) NOT NULL,
  quantity decimal(10,2) NOT NULL
  );

CREATE TABLE product (
  product_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(80) NOT NULL,
  description varchar(240),
  price decimal(10,2) NOT NULL,
  create_date datetime NOT NULL,
  update_date datetime NOT NULL,
  stock decimal(10,2) NOT NULL
  );


CREATE TABLE customer (
id serial,
name varchar(20) NOT NULL,
PRIMARY KEY (id)
);


CREATE TABLE product (
id serial,
name varchar(20) NOT NULL,
price numeric,
PRIMARY KEY (id)
);
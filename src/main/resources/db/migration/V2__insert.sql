
INSERT INTO PUBLIC.address(id, city, country, county, street_address) VALUES
(1, 'Cluj-Napoca', 'Romania', 'Cluj', 'Brassai'),
(2, 'Cluj-Napoca', 'Romania', 'Cluj', 'Croitorilor');

INSERT INTO PUBLIC.customer(id,first_name, last_name, username)
VALUES (1, 'Ion','Popescu','Ioaneee');

INSERT INTO PUBLIC.location(id,name, address_id)
VALUES (1, 'work',1);

INSERT INTO PUBLIC.ordine(id,address_id, customer_id,location_id)
VALUES (1,1,1,1);

INSERT INTO PUBLIC.product_category(id,description, name)
VALUES (1,'mancare','fructe');

INSERT INTO PUBLIC.supplier(id,name)
VALUES (1,'auchan');

INSERT INTO PUBLIC.product(id,description, name, price,weight, product_category_id, supplier_id)
VALUES (1, 'citrice','portocale',5,1,1,1);

INSERT INTO PUBLIC.stock(quantity, location_id, product_id)
VALUES (5,1,1);

INSERT INTO PUBLIC.order_detail(quantity, order_id,product_id)
values(10,1,1);
create schema if not exists grwndb;

create sequence hibernate_sequence start with 1 increment by 1;
create table grwndb.animal_category (name varchar(255) not null, primary key (name));
create table grwndb.order_table (id bigint not null, value bigint, order_item_id bigint, primary key (id));
create table grwndb.order_item (id bigint not null, count integer, value bigint, product_id bigint not null, primary key (id));
create table grwndb.product (id bigint not null, description clob, gallery clob, name varchar(1000), value bigint, primary key (id));
create table grwndb.product_animal_categories (product_id bigint not null, animal_categories_name varchar(255) not null);
alter table grwndb.order_item add constraint UK_qd4o375qvtt45ierlsgsouhlc unique (product_id);
alter table grwndb.product_animal_categories add constraint UK_1w944yij6n4aqdqpaq66brbpy unique (animal_categories_name);
alter table grwndb.order_table add constraint FKhrj2a2ejtbh8np6v32trxoyer foreign key (order_item_id) references order_item;
alter table grwndb.order_item add constraint FK551losx9j75ss5d6bfsqvijna foreign key (product_id) references product;
alter table grwndb.product_animal_categories add constraint FKjak4yh0oc5743e467l8glc9ic foreign key (animal_categories_name) references animal_category;
alter table grwndb.product_animal_categories add constraint FKkd3gdyphw79pdkllskj7tj8i1 foreign key (product_id) references product;
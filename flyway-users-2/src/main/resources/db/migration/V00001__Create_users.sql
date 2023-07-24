CREATE TABLE users (id bigserial primary key, name VARCHAR(255) not null unique);

insert into users(id, name) values(1, 'user1');
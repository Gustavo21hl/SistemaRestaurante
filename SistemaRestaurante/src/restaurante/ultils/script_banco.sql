create database db_restaurante;

use db_restaurante;

create table pratos(
	id int auto_increment primary key,
    nome varchar(100) not null,
    descricao varchar(255),
    preco decimal(10,2) not null,
    categoria varchar(50) not null
);

create table pedidos(
	id int(10) auto_increment primary key,
    id_prato int not null,
    quantidade int not null,
    mesa int not null,
    total decimal (10,2) not null,
    status tinyint(1) default 0 not null,
    data_hora timestamp not null default current_timestamp(),
    foreign key (id_prato) references pratos (id)
);
SET GLOBAL time_zone = '+3:00';

create database if not exists BookingSystem;
use BookingSystem;

create table if not exists User(
id int not null auto_increment,
name varchar(100) not null,
phoneNumber int not null,
  primary key(id)
);

use BookingSystem;
create table if not exists Specialist(
id int not null auto_increment,
specialist varchar(100) not null,
  primary key(id)
);

use BookingSystem;
CREATE TABLE IF NOT EXISTS Calendar (
    id INT NOT NULL AUTO_INCREMENT,
    date DATE NOT NULL,
    time TIME NOT NULL,
    status VARCHAR(200),
    PRIMARY KEY (id)
);
select*from User;
select*from Specialist;
select*from Calendar;


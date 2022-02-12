DROP DATABASE IF EXISTS pokemon;
DROP USER IF EXISTS `useradmin`@`%`;
DROP USER IF EXISTS `useruser`@`%`;
CREATE DATABASE IF NOT EXISTS pokemon CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `useradmin`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
    CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `pokemon`.* TO `useradmin`@`%`;
CREATE USER IF NOT EXISTS `useruser`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, SHOW VIEW ON `pokemon`.* TO `useruser`@`%`;
FLUSH PRIVILEGES;

use pokemon;

CREATE TABLE `trainer`
(
    `id`       int          NOT NULL AUTO_INCREMENT,
    `email`    varchar(45)  NOT NULL,
    `password` varchar(200) NOT NULL,
    `role`     varchar(45)  NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `trainer` (`email`, `password`, `role`)
VALUES ('dave@password.com', '$2a$12$2IoEixr5h2ezJpiBKh2wU.LXTbNSepu4xvwn0TbAKF8Uq/67Udmym', 'admin');

create table pokemon
(
    id         bigint auto_increment primary key,
    name       varchar(255) not null,
    hit_points int          not null
);

insert into pokemon (name, hit_points)
VALUES ('pikachu', 60);
insert into pokemon (name, hit_points)
VALUES ('evee', 40);
insert into pokemon (name, hit_points)
VALUES ('snorlax', 150);
insert into pokemon (name, hit_points)
VALUES ('charizard', 120);
insert into pokemon (name, hit_points)
VALUES ('lucario', 50);

create table notices
(
    id     bigint auto_increment primary key,
    name   varchar(255) not null,
    notice varchar(255) not null
);

insert into notices (name, notice)
values ('Hey you', 'get off my cloud');
insert into notices (name, notice)
values ('The revolution', 'will not be televised');

create table battles
(
    id       bigint auto_increment primary key,
    name     varchar(255) not null,
    location varchar(255) not null
);

insert into battles (name, location)
values ('Battle of Evermore', 'Evermore');
insert into battles (name, location)
values ('Helms Deep', 'Kingdom of Rohan');


-- Wyczyszczenie bazy
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS customers;

-- Tabela z użytkownikami
CREATE TABLE `users` (
                       `id` bigint NOT NULL AUTO_INCREMENT,
                       `firstName` varchar(255) DEFAULT NULL,
                       `lastName` varchar(255) DEFAULT NULL,
                       `login` varchar(255) NOT NULL,
                       `password` varchar(255) NOT NULL,
                       PRIMARY KEY (`id`),
                       UNIQUE KEY `UK_ow0gan20590jrb00upg3va2fn` (`login`)
);


CREATE TABLE `customers` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `firstName` varchar(255) DEFAULT NULL,
                           `lastName` varchar(255) DEFAULT NULL,
                           `telephoneNumber` varchar(255) DEFAULT NULL,
                           `visit_date` date DEFAULT NULL,
                           `visit_time` time DEFAULT NULL,
                           `assigned_hairdresser` varchar(255) DEFAULT NULL,
                           `additional_info` varchar(500) DEFAULT NULL,
                           `comments` varchar(500) DEFAULT NULL,
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `UK_ow0gan20590jrb00upg3va2fn` (`telephoneNumber`)
);

-- Testowi fryzjerzy
INSERT INTO users (login, password, firstName, lastName) VALUES ('jnowak', 'jnowak', 'Jan', 'Nowak');
INSERT INTO users (login, password, firstName, lastName) VALUES ('jkowalki', 'jkowalki', 'Jan', 'Kowalski');
INSERT INTO users (login, password, firstName, lastName) VALUES ('sgomez', 'sgomez', 'Selena', 'Gomez');
INSERT INTO users (login, password, firstName, lastName) VALUES ('admin', 'admin', 'Admin', 'Admin');


-- testowi petenci

INSERT INTO customers (firstName, lastName, telephoneNumber, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Cameron', 'Diaz', '0700123456789', '2019-01-01', '10:00:00', 'jkowalki', 'Fajna jest', 'Lubi blond');
INSERT INTO customers (firstName, lastName, telephoneNumber, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Rocky', 'Balboa', '00166651098', '2019-01-01', '10:30:00', 'jkowalki', 'Brak additionalInfo', 'Zawsze na krótko');
-- INSERT INTO customers (firstName, lastName, telephoneNumber, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
-- VALUES ('Jack', 'Sparrow', '751974346', '2019-01-01', '11:00:00', 'jkowalki', 'Ukradl terminal', 'Wezwac policję');
INSERT INTO customers (firstName, lastName, telephoneNumber, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Pamela', 'Anderson', '000465468345', '2019-01-02', '12:00:00', 'jkowalki', 'Big tits', 'Brak');
INSERT INTO customers (firstName, lastName, telephoneNumber, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Anna', 'Grodzka', '2657765453543556', '2019-01-02', '13:00:00', 'jkowalki', '...', 'No comments');
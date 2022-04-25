CREATE DATABASE student_db;

CREATE TABLE IF NOT EXISTS student
(
    id                  INT AUTO_INCREMENT PRIMARY KEY,
    name                VARCHAR(100)
    ) ENGINE = InnoDB
    DEFAULT CHARSET = `UTF8MB4`;

INSERT INTO student(name) values ('Krishan'), ('Deshan'), ('Nimal');
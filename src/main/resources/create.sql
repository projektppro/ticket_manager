CREATE TABLE airplane
(
    id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR(50) NOT NULL
);
CREATE UNIQUE INDEX airplane_id_uindex ON airplane (id);
CREATE TABLE city
(
    id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR(255)
);
CREATE TABLE customuser
(
    id INTEGER PRIMARY KEY NOT NULL,
    accounnotlocked BOOLEAN,
    accountnotexpired BOOLEAN,
    credentialsnotexpired BOOLEAN,
    enable BOOLEAN,
    password VARCHAR(50),
    username VARCHAR(50)
);
CREATE UNIQUE INDEX user_id_uindex ON customuser (id);
CREATE TABLE person
(
    id INTEGER PRIMARY KEY NOT NULL,
    dateofbirth TIMESTAMP,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL
);
CREATE UNIQUE INDEX persone_id_uindex ON person (id);
CREATE TABLE role
(
    id INTEGER PRIMARY KEY NOT NULL,
    rolename VARCHAR(50)
);
CREATE UNIQUE INDEX role_id_uindex ON role (id);
CREATE TABLE ticket
(
    id INTEGER PRIMARY KEY NOT NULL,
    airplaneid INTEGER,
    date TIMESTAMP DEFAULT now(),
    personid INTEGER
);
CREATE UNIQUE INDEX ticket_id_uindex ON ticket (id);
CREATE TABLE user_role
(
    id INTEGER PRIMARY KEY NOT NULL,
    roleid INTEGER,
    userid INTEGER
);
CREATE UNIQUE INDEX userrole_id_uindex ON user_role (id);
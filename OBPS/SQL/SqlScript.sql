DROP DATABASE IF EXISTS myapp;

CREATE DATABASE IF NOT EXISTS myapp;

CREATE TABLE IF NOT EXISTS myapp.corporation(
	corporation_id	int,
	corporation_name	varchar(40)	NOT NULL,
	PRIMARY KEY(corporation_id)
);


CREATE TABLE IF NOT EXISTS myapp.department(
	department_id	int,
	department_name	varchar(40)	NOT NULL,
	corporation_id	int,
	PRIMARY KEY(department_id),
	CONSTRAINT department_corporation_fk
		FOREIGN KEY (corporation_id)
		REFERENCES myapp.corporation (corporation_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);


CREATE TABLE IF NOT EXISTS myapp.manager(
	manager_id	int,
	first_name	varchar(40)	NOT NULL,
	last_name	varchar(40)	NOT NULL,
	department_id	int,
	PRIMARY KEY(manager_id),
	CONSTRAINT manager_department_fk
		FOREIGN KEY (department_id)
		REFERENCES myapp.department (department_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);


CREATE TABLE IF NOT EXISTS myapp.employee(
	employee_id	int,
	first_name	varchar(40)	NOT NULL,
	last_name	varchar(40)	NOT NULL,
	department_id	int,
	PRIMARY KEY(employee_id),
	CONSTRAINT employee_department_fk
		FOREIGN KEY (department_id)
		REFERENCES myapp.department (department_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);


CREATE TABLE IF NOT EXISTS myapp.customer(
	customer_id	int,
	customer_name	varchar(40)	NOT NULL,
	PRIMARY KEY(customer_id)
);


CREATE TABLE IF NOT EXISTS myapp.cx_corporation_customer(
	cx_corporation_customer_id	int,
	corporation_id	int,
	customer_id	int,
	PRIMARY KEY(cx_corporation_customer_id),
	CONSTRAINT cx_corporation_customer_corporation_fk
		FOREIGN KEY (corporation_id)
		REFERENCES myapp.corporation (corporation_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	CONSTRAINT cx_corporation_customer_customer_fk
		FOREIGN KEY (customer_id)
		REFERENCES myapp.customer (customer_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);
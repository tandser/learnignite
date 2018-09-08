DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS employees;

DROP SEQUENCE IF EXISTS seq_departments;
DROP SEQUENCE IF EXISTS seq_employees;

CREATE SEQUENCE seq_departments START 1;
CREATE SEQUENCE seq_employees   START 1;

CREATE TABLE departments (
  id             INTEGER PRIMARY KEY DEFAULT nextval('seq_departments'),
  name           VARCHAR,
  location       VARCHAR
);

CREATE TABLE employees (
  id             INTEGER PRIMARY KEY DEFAULT nextval('seq_employees'),
  name           VARCHAR,
  job            VARCHAR,
  manager        INTEGER,
  hired          TIMESTAMP,
  salary         INTEGER,
  department_id  INTEGER REFERENCES departments ON DELETE CASCADE
);

CREATE UNIQUE INDEX unique_employee ON employees (name);
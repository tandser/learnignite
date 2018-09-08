DELETE FROM departments;
DELETE FROM employees;

ALTER SEQUENCE seq_departments RESTART WITH 1;
ALTER SEQUENCE seq_employees   RESTART WITH 1;

INSERT INTO departments(name, location) VALUES
  ('Accounting', 'New York'),
  ('Research',   'Dallas'),
  ('Sales',      'Chicago'),
  ('Operations', 'Boston');

INSERT INTO employees(name, job, manager, hired, salary, department_id) VALUES
  ('King',  'President', null, '2017-10-15', 5000, null),
  ('Blake', 'Manager',   1,    '2017-12-07', 1000, 1),
  ('Clark', 'Manager',   1,    '2018-01-12', 1000, 2),
  ('Jones', 'Manager',   1,    '2018-02-21', 1000, 3),
  ('Scott', 'Analyst',   1,    '2018-02-28', 1200, 4);
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS locations;

CREATE TABLE users (
  id SERIAL4 PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE locations (
  id SERIAL4 PRIMARY KEY,
  category VARCHAR(255),
  name VARCHAR(255)
);

CREATE TABLE visits(
  id SERIAL PRIMARY KEY,
  user_id INT REFERENCES users(id),
  locations_id INT REFERENCES locations(id)
);

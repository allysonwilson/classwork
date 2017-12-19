
--drop (completely gone)the table if it already exists--
DROP TABLE IF EXISTS lightsabers;
DROP TABLE IF EXISTS jedi;

CREATE TABLE jedi (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT

);

CREATE TABLE lightsabers (
  id SERIAL PRIMARY KEY,
  hilt_metal VARCHAR(255),
  colour VARCHAR(255),
  owner INT REFERENCES jedi(id)

);




--add some jedis

INSERT INTO jedi (name, darkside, age)
VALUES ( 'Luke' , false, 21);

INSERT INTO jedi (name, darkside, age)
VALUES  ('Vader', true, 100);

INSERT INTO jedi (name, age)
VALUES ( 'Obiwan', 33 );

INSERT INTO lightsabers(colour, owner, hilt_metal)
  VALUES ('green', 1, 'palladium');

INSERT INTO lightsabers(colour, owner, hilt_metal)
  VALUES ('green', 3, 'gold');


  SELECT * FROM lightsabers;
-- INSERT INTO jedi ( name , darkside, age)
-- VALUES ( 'Anakin' , false, 12);


--
-- -- updating
-- UPDATE jedi SET darkside = true
-- WHERE name = 'Luke' AND age = 33;
-- -- like ruby && can also use or
--
-- --task
--
-- UPDATE jedi SET age = 22, darkside = true
--  WHERE name = 'Anakin';
--
-- --deleting
-- DELETE FROM jedi
--   WHERE name = 'Luke';
--
-- --reading
--
-- SELECT * FROM jedi;

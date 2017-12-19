DROP TABLE IF EXISTS bitings;
DROP TABLE IF EXISTS zombies;
DROP TABLE IF EXISTS victims;



CREATE TABLE zombies (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  type VARCHAR(255)

);

CREATE TABLE victims (

  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  run_speed INT

);

CREATE TABLE bitings (
  id SERIAL PRIMARY KEY,
  victim_id INT REFERENCES victims(id),
  zombie_id INT REFERENCES zombies(id),
  infected_on DATE

);

INSERT INTO zombies ( name, type )
VALUES ('Jill' , 'Drooly');

INSERT INTO zombies ( name, type )
VALUES ('Bill' , 'Bleeding');

INSERT INTO victims ( name, run_speed )
VALUES ('Sam' , 5) ;

INSERT INTO victims ( name, run_speed )
VALUES ('Pam' , 5) ;

INSERT INTO bitings (
  victim_id,
  zombie_id,
  infected_on
) VALUES (
  1,
  1,
  'August 14 2017'
);

INSERT INTO bitings (
  victim_id,
  zombie_id,
  infected_on
) VALUES (
  2,
  2,
  'August 15 2017'
);

SELECT * FROM zombies

-- victims bitten
-- by which zombies
-- when
-- SELECT * FROM zombies
-- SELECT * FROM victims

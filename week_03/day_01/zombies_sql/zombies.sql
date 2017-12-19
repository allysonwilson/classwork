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
  run speed INT,
)


INSERT INTO zombies ( 'Jill' , 'Drooly')
  VALUES

  INSERT INTO victims( 'Sam' , 5 )
  VALUES

-- victims bitten
-- by which zombies
-- when
SELECT * FROM zombies

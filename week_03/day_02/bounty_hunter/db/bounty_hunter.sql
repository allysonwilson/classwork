DROP TABLE IF EXISTS bounty_hunter;



CREATE TABLE bounty_hunter (
	id SERIAL8 PRIMARY KEY,
	name VARCHAR(255),
	species VARCHAR(255),
	bounty_value VARCHAR(255),
	danger_level VARCHAR(255)

);

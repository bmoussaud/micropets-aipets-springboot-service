DROP TABLE IF EXISTS  AI_PET;

CREATE TABLE AI_PET (
    index SERIAL PRIMARY KEY,
    name VARCHAR(255),
    type VARCHAR(255),
    age integer,
    url VARCHAR(1024),
    uri VARCHAR(255),
    hostname VARCHAR(255));

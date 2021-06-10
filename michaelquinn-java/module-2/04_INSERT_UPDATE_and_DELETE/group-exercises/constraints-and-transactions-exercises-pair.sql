-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The
-- countrycode is 'USA', and population of 45001.
START TRANSACTION;
INSERT INTO city(name, countrycode, district, population) VALUES ('Smallville', 'USA', 'Kansas', 45001);
COMMIT;

-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
START TRANSACTION;
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('USA', 'Kryptonese', false, 0.0001);
SELECT * FROM countrylanguage WHERE countrycode = 'USA';
COMMIT;

-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble." Change
-- the appropriate record accordingly.
START TRANSACTION;
UPDATE countrylanguage SET language = 'Krypto-babble' WHERE language = 'Kryptonese';
SELECT * FROM countrylanguage WHERE countrycode = 'USA';
COMMIT;

-- 4. Set the US capital to Smallville, Kansas in the country table.
START TRANSACTION;
UPDATE country SET capital = (SELECT id FROM city WHERE name = 'Smallville') WHERE code = 'USA';
SELECT * FROM country WHERE code = 'USA';
COMMIT;


-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
START TRANSACTION;
DELETE FROM city WHERE 
name = 'Smallville';
ROLLBACK;

-- 6. Return the US capital to Washington.
START TRANSACTION;
UPDATE country SET capital = (SELECT id FROM city WHERE name = 'Washington') WHERE code = 'USA';
COMMIT;
SELECT * FROM country WHERE code = 'USA';


-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
START TRANSACTION;
DELETE FROM city WHERE
name = 'Smallville';
COMMIT;
SELECT * FROM city WHERE name = 'Smallville';

-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972
-- (exclusive).
-- (590 rows affected)
START TRANSACTION;
SELECT * FROM countrylanguage WHERE countrycode IN (SELECT code FROM country WHERE indepyear > 1800 AND indepyear < 1972) ORDER BY countrycode;
UPDATE countrylanguage  SET isofficial =  NOT isofficial WHERE countrycode IN (SELECT code FROM country WHERE indepyear > 1800 AND indepyear < 1972);
COMMIT;

-- 9. Convert population so it's expressed in 1,000s for all cities. (Round up to
-- the nearest integer value.)
-- (4079 rows affected)
START TRANSACTION;
UPDATE city SET population = (population / 1000);
SELECT * FROM city;
COMMIT;

-- 10. Assuming a country's surfacearea is expressed in square miles, convert it to
-- square meters for all countries where French is spoken by more than 20% of the
-- population.
-- (7 rows affected)

START TRANSACTION;
UPDATE country SET surfacearea = (surfacearea * 2589988.1) WHERE
code IN (SELECT countrycode FROM countrylanguage WHERE language = 'French' AND percentage > 20);
COMMIT;


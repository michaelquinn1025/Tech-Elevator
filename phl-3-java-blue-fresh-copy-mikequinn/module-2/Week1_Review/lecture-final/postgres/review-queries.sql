SELECT f.title, COUNT(*) co
FROM film f
JOIN inventory i ON i.film_id = f.film_id
JOIN rental r ON r.inventory_id = i.inventory_id
GROUP BY f.title
ORDER BY co DESC LIMIT 10;

-- this is the same query written with rental as the starting point
SELECT f.title, count(*) FROM rental r
JOIN inventory I ON i.inventory_id = r.inventory_id
JOIN film f ON f.film_id = i.film_id
GROUP BY f.title
ORDER BY count(*) DESC LIMIT 10;

-- this shows there are multiple rental items for some inventory items and multiple inventory items with the same title
-- also shows group by will yield different results depending columns selected as only rows with duplicates for all selected
-- items will be combined. Try r.rental_id from SELECT, GROUP BY, ORDER BY... you'll see inventory items that
-- were different due to different rental ids grey combined
SELECT f.title, i.inventory_id, r.rental_id, count(*) FROM rental r
JOIN inventory I ON i.inventory_id = r.inventory_id
JOIN film f ON f.film_id = i.film_id
GROUP BY f.title, i.inventory_id, r.rental_id
ORDER BY f.title, i.inventory_id, r.rental_id

--shows inventory/rental/film_id/title values for
SELECT i.inventory_id, r.rental_id, f.film_id, f.title FROM rental r
JOIN inventory I ON i.inventory_id = r.inventory_id
JOIN film f ON f.film_id = i.film_id
WHERE f.title = 'BUCKET BROTHERHOOD'
ORDER BY r.rental_id

--- number of rentals for each title
SELECT f.title, count(*) FROM rental r
JOIN inventory I ON i.inventory_id = r.inventory_id
JOIN film f ON f.film_id = i.film_id
GROUP BY f.title
ORDER BY f.title

-- not a great example data wise but shows
-- you can use aggregate functions without 
-- GROUP BY clause if you don't SELECT any columns
-- the aggregate functions will summarize all rows in the db
SELECT SUM(f.film_id) FROM rental r
JOIN inventory I ON i.inventory_id = r.inventory_id
JOIN film f ON f.film_id = i.film_id

-- count(*) vs count(field)
SELECT count(*) FROM country; --239
SELECT count(indepyear) FROM country; --192 because some rows have  null for indepyear and specifying column name only
-- counts rows that do not have null in the counted column

-- all rental ids for a title
SELECT rental_id FROM rental WHERE inventory_id IN
--(SELECT inventory_id FROM inventory WHERE film_id = (SELECT film_id FROM film WHERE title = 'BUCKET BROTHERHOOD'));
(SELECT inventory_id FROM inventory WHERE film_id = (SELECT film_id FROM film WHERE title = 'ROCKETEER MOTHER'));



-- SELECT  concatenation with AS alias for column
SELECT f.title || ' id: ' || r.rental_id AS film_info
FROM film f
JOIN inventory i ON i.film_id = f.film_id
JOIN rental r ON r.inventory_id = i.inventory_id
ORDER BY film_info

-- Simple Union example
SELECT code FROM country 
UNION
SELECT countrycode FROM city 

-- Simple DISTINCT example
SELECT DISTINCT countrycode FROM city ORDER BY countrycode

-- Transaction example
START TRANSACTION;
INSERT INTO FILM_ACTOR
SELECT * FROM FILM_CATEGORY WHERE category_id = (SELECT category_id FROM category WHERE name = 'Comedy');
ROLLBACK;

-- safer UPDATE/DELETE syntax
START TRANSACTION;
-- I include WHERE at end of line and WHERE criteria on next line to
-- avoid runninf only the first line by mistake. The WHERE with no expression
-- will cause an error
DELETE FROM countrylanguage WHERE
language='Spanish';
ROLLBACK;
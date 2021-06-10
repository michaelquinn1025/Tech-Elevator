/*
 STEP ONE: Add a new park with the following data:
  ------------------------------
  name: Ohiopyle State Park
  location: Pennsylvania
  establish date: 1965-01-01
  area: 19052
  visitors: 1000000
  description: Ohiopyle State Park is a Pennsylvania state park on 19,052 acres in Dunbar, Henry Clay and Stewart Townships, Fayette County, Pennsylvania in the United States. The focal point of the park is the more than 14 miles of the Youghiogheny River Gorge that passes through the park.
  ------------------------------
*/
SELECT * FROM park;
START TRANSACTION;
INSERT INTO park (name, location, establish_date, area, visitors, description) VALUES ('Ohiopyle State Park', 'Pennsylvania', '1965-01-01', 19052, 1000000,' ohiopyle State Park 
is a Pennsylvania state park on 19,052 acres in Dunbar, Henry Clay and Stewart Townships, Fayette County, Pennsylvania in the United States. 
The focal point of the park is the more than 14 miles of the Youghiogheny River Gorge that passes through the park.');

COMMIT;




/*
  STEP TWO: You just found out that there was an error with the park data. Please update the park visitors to 1.5 million anually.

*/

SELECT * FROM PARK

START TRANSACTION;
UPDATE park SET visitors = 1500000;
COMMIT;


/*
 STEP THREE: Insert new campground with the following data:
  ------------------------------------------------------------
  park_id: 4 (this should be the id of the new park you just added)
  name: Youghiogheny
  open_from_mm: 01
  open_to_mm: 12
  daily_fee: 95.00
  ------------------------------------------------------------
*/
SELECT * FROM campground;
START TRANSACTION;
INSERT INTO campground (park_id,name, open_from_mm, open_to_mm, daily_fee) VALUES (4, 'Youghiogheny', 01, 12, 95.00);
COMMIT;


/*
 STEP FOUR: Insert 3 new sites with the following data:
 ------------------------------------------------------------
  site_number: 623, campground_id: 8
  site_number: 624, campground_id: 8
  site_number: 625, campground_id: 8
 ------------------------------------------------------------

 > campground_id 8 should be the id of the campground you just added 'Youghiogheny'

*/
SELECT * FROM site;
START TRANSACTION;
INSERT INTO site (site_number, campground_id) VALUES (623, 8);
INSERT INTO site (site_number, campground_id) VALUES (624, 8);
INSERT INTO site (site_number, campground_id) VALUES (625, 8);
COMMIT;


/*
 STEP FIVE: Insert 3 reservations, 1 for each site with the following data:
------------------------------------------------------------------------------------
  site_id: 623, name: Wayne Family, from_date: today + 10 days, to_date: today + 20 days
  site_id: 624, name: Parker Family, from_date: today + 11 days, to_date: today + 20 days
  site_id: 625, name: Kent Family, from_date: today + 12 days, to_date: today + 20 days
------------------------------------------------------------------------------------

*/
SELECT * FROM reservation;

START TRANSACTION;
INSERT INTO reservation (site_id, name, from_date, to_date) VALUES (623, 'Wayne Family', '2021-02-13', '2021-03-03');
INSERT INTO reservation (site_id, name, from_date, to_date) VALUES (624, 'Parker Family', '2021-02-14', '2021-03-04');
INSERT INTO reservation (site_id, name, from_date, to_date) VALUES (625, 'Kent Family', '2021-02-15', '2021-03-05');
COMMIT;


/*
 STEP SIX: The Wayne Family called and asked if they could change their reservation to today. Update the from_date to today and the to_date to a week from today.

 */
 START TRANSACTION;
UPDATE reservation SET from_date = '2021-02-12' WHERE name  = 'Wayne Family';
UPDATE reservation SET to_date = '2021-02-19' WHERE name  = 'Wayne Family';
COMMIT;
 
     
 


/*
 STEP SEVEN: The Kent family called and they would like to cancel their reservation. Delete the reservation for Kent Family.

*/
START TRANSACTION;
DELETE FROM reservation WHERE name = 'Kent Family';
COMMIT;


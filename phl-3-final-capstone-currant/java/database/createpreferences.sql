CREATE TABLE preferences
(
        food_id int,
        food_type varChar(64),
        constraint pk_preferences primary key (food_id)
);

INSERT INTO preferences (food_id, food_type) VALUES (100, 'American');
INSERT INTO preferences (food_id, food_type) VALUES (101, 'Cajun');
INSERT INTO preferences (food_id, food_type) VALUES (102, 'German');
INSERT INTO preferences (food_id, food_type) VALUES (103, 'Indian');
INSERT INTO preferences (food_id, food_type) VALUES (104, 'Spanish');
INSERT INTO preferences (food_id, food_type) VALUES (105, 'Italian');
INSERT INTO preferences (food_id, food_type) VALUES (106, 'Greek');
INSERT INTO preferences (food_id, food_type) VALUES (107, 'Mexican');
INSERT INTO preferences (food_id, food_type) VALUES (108, 'Chinese');
INSERT INTO preferences (food_id, food_type) VALUES (109, 'French');
INSERT INTO preferences (food_id, food_type) VALUES (110, 'Thai');
INSERT INTO preferences (food_id, food_type) VALUES (111, 'Russian');
INSERT INTO preferences (food_id, food_type) VALUES (112, 'Japanese');
INSERT INTO preferences (food_id, food_type) VALUES (113, 'Caribbean');
INSERT INTO preferences (food_id, food_type) VALUES (114, 'Moroccan');
INSERT INTO preferences (food_id, food_type) VALUES (115, 'Vietnamese');
INSERT INTO preferences (food_id, food_type) VALUES (116, 'Turkish');
INSERT INTO preferences (food_id, food_type) VALUES (117, 'Brazilian');
INSERT INTO preferences (food_id, food_type) VALUES (118, 'Cuban');
INSERT INTO preferences (food_id, food_type) VALUES (119, 'Vegetarian');
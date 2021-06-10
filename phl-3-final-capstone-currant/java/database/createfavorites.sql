CREATE TABLE favorites
(
        favorite_api_id int not null,
        favorite_name varChar(200) not null,
        food varChar(200),
        phone_number varChar(200),
        ratings varChar(5),
        description varChar(200),
        image varChar(200),
        currency varChar(200),
        url varChar(500),
        menu_url varChar(500),
        constraint pk_favorites primary key (favorite_api_id)
 );
 CREATE TABLE user_favorites
 (
        user_id int,
        favorite_api_id int,
        constraint pk_user_favorites primary key (user_id, favorite_api_id),
        constraint fk_user_favorites_users foreign key (user_id) references users (user_id),
        constraint fk_user_favorites_favorites foreign key (favorite_api_id) references favorites (favorite_api_id)
 );
 
 //Changes to Preferences table
 ALTER TABLE preferences
 ADD user_id int
 
 ALTER TABLE preferences
 ADD constraint fk_preferences foreign key (user_id) references user_favorites (user_id)
 
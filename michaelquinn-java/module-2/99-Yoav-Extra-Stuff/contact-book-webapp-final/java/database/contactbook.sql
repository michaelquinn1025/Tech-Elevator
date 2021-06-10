DROP TABLE IF EXISTS contact;

CREATE TABLE contact (

    id  SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    phone VARCHAR(25),
    email VARCHAR(255),
    birthyear INTEGER

);

INSERT INTO contact (first_name, last_name, phone, email, birthyear) VALUES ('Julia', 'Turner', '(608) 233-5512', 'juilaturnz@google.com', 1970);
COMMIT;
CREATE DATABASE IF NOT EXISTS userlogin;

USE userlogin;

CREATE TABLE user (
  User_ID INT NOT NULL AUTO_INCREMENT,
  User_name VARCHAR(255) NOT NULL,
  User_password VARCHAR(255) NOT NULL,
  User_email VARCHAR(255) NOT NULL,
  User_admin BOOLEAN NOT NULL DEFAULT false,
  PRIMARY KEY (User_ID),
  UNIQUE INDEX User_ID_UNIQUE (User_ID ASC) VISIBLE,
  UNIQUE INDEX User_email_UNIQUE (User_email ASC) VISIBLE
);

CREATE TABLE movie (
  Movie_ID INT NOT NULL AUTO_INCREMENT,
  Movie_title VARCHAR(255) NOT NULL,
  Movie_description VARCHAR(200) NOT NULL,
  Movie_picture VARCHAR(255) NOT NULL,
  Movie_banner VARCHAR(255) NOT NULL,
  Movie_release DATE NOT NULL,
  Movie_trailerURL VARCHAR(100),
  PRIMARY KEY (Movie_ID),
  UNIQUE INDEX Movie_ID_UNIQUE (Movie_ID ASC) VISIBLE
);

CREATE TABLE comment (
  Comment_ID INT NOT NULL AUTO_INCREMENT,
  User_ID INT NOT NULL,
  Movie_ID INT NOT NULL,
  Comment_text VARCHAR(500) NOT NULL,
  Comment_rating INT NOT NULL CHECK (Comment_rating >=1 AND Comment_rating <= 5),
  Comment_date TIMESTAMP NOT NULL,
  PRIMARY KEY (Comment_ID),
  UNIQUE INDEX Comment_ID_UNIQUE (Comment_ID ASC) VISIBLE,
  INDEX movie_idx (Movie_ID ASC) VISIBLE,
  INDEX user_idx (User_ID ASC) VISIBLE,
  CONSTRAINT movie FOREIGN KEY (Movie_ID)
    REFERENCES movie (Movie_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT user FOREIGN KEY (User_ID)
    REFERENCES user (User_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE genre (
  Genre_ID INT NOT NULL AUTO_INCREMENT,
  Genre_name VARCHAR(255) NOT NULL,
  PRIMARY KEY (Genre_ID),
  UNIQUE INDEX Genre_ID_UNIQUE (Genre_ID ASC) VISIBLE
);

CREATE TABLE language (
  Language_ID INT NOT NULL AUTO_INCREMENT,
  Language_name VARCHAR(255) NOT NULL,
  PRIMARY KEY (Language_ID),
  UNIQUE INDEX Language_ID_UNIQUE (Language_ID ASC) VISIBLE
);

CREATE TABLE moviegenre (
  Movie_ID INT NOT NULL,
  Genre_ID INT NOT NULL,
  PRIMARY KEY (Movie_ID, Genre_ID),
  INDEX genre_idx (Genre_ID ASC) VISIBLE,
  CONSTRAINT genre FOREIGN KEY (Genre_ID)
    REFERENCES genre (Genre_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT movie FOREIGN KEY (Movie_ID)
    REFERENCES movie (Movie_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE movielanguage (
  Movie_ID INT NOT NULL,
  Language_ID INT NOT NULL,
  PRIMARY KEY (Movie_ID, Language_ID),
  INDEX language_idx (Language_ID ASC) VISIBLE,
  CONSTRAINT language FOREIGN KEY (Language_ID)
    REFERENCES language (Language_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT movie FOREIGN KEY (Movie_ID)
    REFERENCES movie (Movie_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

ALTER TABLE userlogin.comment
ADD CHECK (Comment_rating >=1 AND Comment_rating <= 5);
-- Sample data

INSERT INTO user (User_name, User_password, User_email, User_admin) VALUES
('john_doe', 'password123', 'john.doe@example.com', false),
('jane_doe', 'securepass', 'jane.doe@example.com', false);

INSERT INTO movie (Movie_title, Movie_description, Movie_picture, Movie_banner, Movie_release, Movie_trailerURL) VALUES
('Example Movie 1', 'Description of example movie 1', 'picture1.jpg', 'banner1.jpg', '2024-01-01', 'trailer1.com'),
('Example Movie 2', 'Description of example movie 2', 'picture2.jpg', 'banner2.jpg', '2024-02-01', 'trailer2.com');

INSERT INTO genre (Genre_name) VALUES
('Action'),
('Comedy');

INSERT INTO language (Language_name) VALUES
('English'),
('Spanish');

INSERT INTO moviegenre (Movie_ID, Genre_ID) VALUES
(1, 1),
(2, 2); 

INSERT INTO movielanguage (Movie_ID, Language_ID) VALUES
(1, 1), 
(2, 2); 

INSERT INTO comment (User_ID, Movie_ID, Comment_text, Comment_rating, Comment_date) VALUES
(1, 1, 'Great movie!', 5, NOW()),
(2, 2, 'Not bad', 3, NOW());

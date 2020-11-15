--liquibase formatted sql

--changeset edersouza:001_database_schema

CREATE TABLE person
(
	person_id BIGINT NOT NULL PRIMARY KEY,
	name VARCHAR (255) NOT NULL,
	phone_number VARCHAR (255) NOT NULL,
	email VARCHAR (255) NOT NULL
);

CREATE TABLE place
(
	place_id BIGINT NOT NULL PRIMARY KEY,
	coordinates VARCHAR (255) NOT NULL
);

CREATE TABLE problem
(
    problem_id BIGINT NOT NULL PRIMARY KEY,
    problem VARCHAR (255) NOT NULL
);

CREATE TABLE solicitation
(
    solicitation_id BIGINT NOT NULL PRIMARY KEY,
    place_id BIGINT NOT NULL,
    person_id BIGINT NOT NULL,
    problem_id BIGINT NOT NULL,
    CONSTRAINT fk_place FOREIGN KEY (place_id) REFERENCES place(place_id),
    CONSTRAINT fk_person FOREIGN KEY (person_id) REFERENCES person(person_id),
    CONSTRAINT fk_problem FOREIGN KEY (problem_id) REFERENCES problem(problem_id)
);




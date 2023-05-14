CREATE DATABASE HomeWork9;

CREATE TABLE Questions
(
	question_number	SERIAL			PRIMARY KEY UNIQUE,
	question		VARCHAR (100)	NOT NULL UNIQUE,
	correct_answer	VARCHAR (100)	NOT NULL
);

SELECT *
FROM QUESTIONS;

SELECT question_number, question
FROM Questions;

INSERT INTO Questions (question, correct_answer)
VALUES 
	('Лунную сонату написал ...','Людвиг ван Бетховен'),
	('Фраза Время-деньги принадлежит ...','Бенджамину Франклину'),
	('Государственный Музей Эрмитаж появился при ...','Екатерина II'),
	('Самым большим пингвином является ...','Императорский пингвин'),
	('Мужская гимнастика была включена в Олимпийские игры в ...','1896 году');
	
CREATE TABLE Answers
(
	question_number	INTEGER 		REFERENCES Questions (question_number) NOT NULL,
	answer				VARCHAR (100)	NOT NULL
);

INSERT INTO Answers (question_number, answer)
VALUES 
	('1','Пётр Ильич Чайковский'),
	('1','Людвиг ван Бетховен'),
	('1','Иоганн Себастьян Бах'),
	('2','Джону Дэвисону Рокфеллеру'),
	('2','Джорджу Соросу'),
	('2','Бенджамину Франклину'),
	('3','Екатерина II'),
	('3','Пётр III'),
	('3','Пётр I'),
	('4','Королевский пингвин'),
	('4','Хохлатый пингвин'),
	('4','Императорский пингвин'),
	('5','1854 году'),
	('5','1800 году'),
	('5','1896 году');
	
SELECT *
FROM Answers;

DROP TABLE Answers; 

SELECT q.question_number, q.question, a.answer AS answer_option
FROM Questions AS q
JOIN ANswers a ON q.question_number = a.question_number;

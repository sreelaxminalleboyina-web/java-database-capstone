## Table: patient

| Column Name | Data Type | Constraints | Description |
|-------------|-----------|-------------|-------------|
| id | INT | PRIMARY KEY, AUTO_INCREMENT | Unique  ID |
| patientname | VARCHAR(50) | NOT NULL | Username of the user |
| age | VARCHAR(3) | 
| address | VARCHAR(100) | 
| visited_date | Date |
|mobilenumber varchar(10) |
| problemissue | VARCHAR(100)

SQL:
CREATE TABLE patient (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patientname VARCHAR(100),
    age VARCHAR(100),address varchar(100),
   visited_date date,mobilenumber varchar(10),
   problemissue varchar(100));
   




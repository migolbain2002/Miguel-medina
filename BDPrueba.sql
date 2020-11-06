create database Prueba;
use Prueba;
-- Web service paises 

create table Tbl_User
(
userid int auto_increment primary key,
user varchar(50) not null,
password varchar(50) not null,
asesorid int not null
);

create table Tbl_Asesor 
(
asesorid int auto_increment primary key,
fullname varchar(200) not null,
identification varchar(30) unique not null,		
identification_type varchar(30) not null,
experience_years int not null,
speciality varchar(100) not null,
begin_timeatention int not null,
end_timeatention int not null
);
create table Tbl_Client
(
clientid int auto_increment primary key,
name varchar(100) not null,
lastname varchar(100) not null,
identification varchar(30) unique not null,
identification_type varchar(30) not null,
creation_date datetime default NOW(),
cityid int not null,
countryid int not null
);

create table Tbl_Citation
(
citationid int auto_increment primary key,
clientid int not null,
asesorid int not null,
status varchar(20) not null,
citation_date date not null,
begin_citationtime int not null,
end_citationtime int not null,
creation_date datetime default NOW()
);

create table Tbl_City
(
cityid int auto_increment primary key,
name varchar(60) not null
);

create table Tbl_Country
(
countryid int auto_increment primary key,
name varchar(60) not null
);

alter table tbl_client MODIFY  column creation_date timestamp;
alter table tbl_citation MODIFY  column creation_date timestamp;
Alter table Tbl_user add foreign key (asesorid) references Tbl_Asesor(asesorid);
Alter table Tbl_Client add foreign key (cityid) references Tbl_city(cityid);
Alter table Tbl_Client add foreign key (countryid) references Tbl_Country(countryid);
Alter table Tbl_Citation add foreign key (clientid) references Tbl_Client(clientid);
Alter table Tbl_Citation add foreign key (asesorid) references Tbl_Asesor(asesorid);


INSERT INTO Tbl_City values (null,'Bogota');
INSERT INTO Tbl_City values (null,'Cali');
INSERT INTO Tbl_City values (null,'Bucaramanga');
INSERT INTO Tbl_City values (null,'Madrid');
INSERT INTO Tbl_City values (null,'Barcelona');
INSERT INTO Tbl_City values (null,'New York');
INSERT INTO Tbl_Country values (null,'Colombia');
INSERT INTO Tbl_Country values (null,'España');
INSERT INTO Tbl_Country values (null,'Estados Uniidos');
INSERT INTO Tbl_Client values (null,'Miguel Hernan', 'Medina Betancur', '24323', 'CC', null, '1','1');
INSERT INTO Tbl_Citation values (null,'1', '1', 'Activa','2020-11-05','5', '15', '2020-11-06 05:29:17');


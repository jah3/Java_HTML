USE MASTER;
if DB_ID('MAIB_Autentification') IS NOT NULL BEGIN
DECLARE @SQL varchar(max)

SELECT @SQL = COALESCE(@SQL,'') + 'Kill ' + Convert(varchar, SPId) + ';'
FROM MASTER..SysProcesses
WHERE DBId = DB_ID('MAIB_Autentification') AND SPId <> @@SPId

EXEC(@SQL)
	DROP DATABASE MAIB_Autentification;
END
GO
create database MAIB_Autentification
GO
use MAIB_Autentification
create table Autentification(
    ID_				int primary key,
    username_		varchar(30),
	password_		varchar(30),
)
insert into Autentification values
(1,'user','user')
select * from Autentification

--drop  table Studenti

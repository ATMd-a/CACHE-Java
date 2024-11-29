Create Database Ewallet;

#Activate Database
Use Ewallet;

# Create Tables

Create Table tblAccount (
U_Number varchar (11) not null primary key,
U_Name varchar(100) not null,
U_Password varchar (50) not null);
drop table tblAccount;
# Add Record
Insert Into tblaccount Values ('01234567890', 'test', 'tester');

Create Table tblWallet (
W_ID INT auto_increment not null primary key,
U_Number varchar(11) not null,
W_Balance decimal (8,2) not null,
FOREIGN KEY (U_Number)
		REFERENCES tblAccount (U_Number));
        

Insert Into tblWallet (U_Number, W_Balance) Values ('01234567890', 15000);

Create Table tblTransaction (
T_ID INT auto_increment not null primary key,
W_ID int,
T_Balance decimal (8,2),
T_Type varchar(100) not null,
T_Recipient varchar(100) not null,
FOREIGN KEY (W_ID)
		REFERENCES tblWallet (W_ID));
        
Insert Into tblTransaction (T_Balance, T_Type, T_Recipient) Values 
('2500', 'Pay Bills', 'Meralco'),
('300', 'Send Money', '09987654321'),
('800', 'Send Money', '09122333444'),
('5000', 'Deposit', 'TouchPay');

Select * from tblAccount;


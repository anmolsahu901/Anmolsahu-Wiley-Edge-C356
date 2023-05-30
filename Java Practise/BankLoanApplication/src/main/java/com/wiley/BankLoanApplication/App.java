package com.wiley.BankLoanApplication;

import java.sql.*;


public class App 
{
    public static void main( String[] args )
    {
        UserDAO_imple usersdetails = new UserDAO_imple();
    }
}


/*
 CREATE TABLE user (  user_id INT NOT NULL AUTO_INCREMENT,
   acc_number VARCHAR(20) NOT NULL,
     name VARCHAR(50) NOT NULL, 
      mobile VARCHAR(15) NOT NULL,  
      address VARCHAR(100) NOT NULL, 
       gender VARCHAR(7) NOT NULL, 
        pan_number VARCHAR(10) NOT NULL, 
         dob DATE NOT NULL,
           account_type_id INT NOT NULL,
             PRIMARY KEY (user_id),  
             FOREIGN KEY (account_type_id) REFERENCES account_type(account_type_id)
              ON DELETE RESTRICT);
            
               CREATE TABLE account_type (  account_type_id INT NOT NULL AUTO_INCREMENT,
                 type VARCHAR(50) NOT NULL,  PRIMARY KEY (account_type_id));
              
*/
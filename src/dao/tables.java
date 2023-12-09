/*
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author jann marc
 */
public class tables {
    public static void main(String[] args){
        try{
            //String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(10),address varchar(200), password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            //DbOperations.setDataOrDelete(userTable, "User Table Create Successfully");
            //String AdminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values ('Admin','Admin@gmail.com','9075163699','Philippines','adminthecoffee','Favorite Drinks','CoffeeKo','true')";
            //DbOperations.setDataOrDelete(AdminDetails, "Admin Details Added Successfully");
            //String categotyTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            //DbOperations.setDataOrDelete(categotyTable, "Category Table Created Successfully");
            //String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200),price varchar(200))";
            //DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully");
            String billTable = "create table bill(id int primary key, name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author jann marc
 */
public class ConnectionProvider {
    public static Connection getCon() throws SQLException {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?zeroDateTimeBehavior=CONVERT_TO_NULL","root","123456");
        }
        catch(Exception e){
            System.out.println(e);
            return null;
            }
        
    }

}
                                
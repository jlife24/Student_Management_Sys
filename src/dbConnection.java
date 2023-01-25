

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stanley.enemuo
 */
public class dbConnection {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //path for db connectivity
    final static String DB_URL = "jdbc:mysql://localhost:3307/student";
    
    final static String USER = "root";
    final static String PASSWORD = "";
    
    
    //function with return time Connection
    
    
    public static Connection connection(){
        
        try{
            Class.forName(JDBC_DRIVER);
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            
            return conn;
            
            
        } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
        
    }
    
}

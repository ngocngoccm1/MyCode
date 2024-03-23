package data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectJDBC {
     public static Connection getJDBCConnection()
    {
         Connection con= null;
        final String url = "jdbc:sqlserver://localhost:1433;databaseName=Noc";
        final String user = "sa1";
        final String pass = "123456789";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con =  DriverManager.getConnection(url, user, pass);
            System.out.println("Kết nối thành công");
        }catch (SQLException  e){
            e.printStackTrace();
        }
         catch (ClassNotFoundException ex) { 
            Logger.getLogger(ConnectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
     
}
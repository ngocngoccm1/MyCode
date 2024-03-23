/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noc
 */
class DriverManager {
     public static void main(String[] args)  {
        
         Connection a = ConnectJDBC.getJDBCConnection();
        
           try {
            String sql = "insert into Noc1(Ma,Date) values(?,?)";
            PreparedStatement r =  a.prepareCall(sql);
            r.setString(1, "H11111");
            String sDate = "17/07/2017";
            Date date;
         
            date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
            r.setDate(2, new java.sql.Date(date.getTime()) );
            r.execute();
             a.close();
         }catch(Exception ex){
             
         }
            
        
    }
}

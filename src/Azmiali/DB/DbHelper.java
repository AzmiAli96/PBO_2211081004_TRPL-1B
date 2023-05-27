/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azmiali.DB;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.*;
import Azmiali.Model.*;

import javax.swing.JOptionPane;

/**
 *
 * @author nitro
 */
public class DbHelper {
    private static Connection connection ;
            
     public static Connection getConnection() throws SQLException{
         if(connection == null){
             MysqlDataSource dataSource = new MysqlDataSource();
             dataSource.setURL("jdbc:mysql://localhost/pbo_2211081004");
             dataSource.setUser("root");
             dataSource.setPassword("");
             connection = dataSource.getConnection();
         }
         return connection;
     }
     
    public static void main(String[] args) {
        try{
           connection = DbHelper.getConnection();
           AnggotaDao dao = new AnggotaDaoImpl(connection);
           Anggota anggota = new Anggota("A001", "Ali", "Padang", "L");
           dao.insert(anggota);
           JOptionPane.showMessageDialog(null, "koneksi ok");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
 
    
}

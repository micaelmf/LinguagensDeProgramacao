package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/include","root","");
        }catch(SQLException e){
            throw new RuntimeException(e);
            //logger.getlogger(ConnectionFactory.class.getName()).log(level.SEVERE null ex);
        }
    }            
}
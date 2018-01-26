
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private final String URL="jdbc:mysql://localhost:3306/descanso";
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String USER="admingdh";
    private final String PASS="123456";
    
    public Connection conectar(){
        try {
            
            Class.forName(this.DRIVER);
            Connection connec=DriverManager.getConnection(this.URL,this.USER,this.PASS);
            return connec;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar "+e.getMessage());
        }
        return null;
        
    }
}

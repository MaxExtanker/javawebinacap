
package cl.accesodato;
import java.sql.*;
public class Conexion {
    private Connection con;
    private String Driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/INACAP";
    private String user="root";
    private String clave="";
    public Conexion(){
        try{
                Class.forName(Driver);
                con=DriverManager.getConnection(url,user,clave);
                System.out.println("USUARIO CONECTADO");
            }catch(Exception ex){
                System.out.println("ERROR DE CONEXION"+ex.getMessage());
            }
        
        
    }
    
}

package visorconsultas.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    Connection conexion;
    String error;
    /* Creamos un constructor que recibe 4 parámetros:
     * El nombre del servidor MySQL, el de usuario, la contraseña, 
     * y la base de datos */
    
    public Conector(String host, String usuario, String pw, String base){
        try {
            /* Esta línea crea una asociación entre nuestra aplicación * y la clase Driver que está empaquetada en el jar de conexión */
            Class.forName("com.mysql.jdbc.Driver");
            /* La conexión se obtiene con una cadena que usa los parámetros que recibe el constructor */
            conexion = DriverManager.getConnection("jdbc:mysql://" + host+"/" + base, usuario, pw);
        } catch(ClassNotFoundException | SQLException e){
            error = e.getMessage();
        }
    }
    
    // Este método devuelve la conexión
    public Connection getConnection(){
        return conexion;
    }
    
    public void cierraConexion(){
        try {
            conexion.close();
        } catch(Exception ex){            
        }
    }
    
    // Este método devuelve el error que impide la conexión
    public String getMensajeError(){
        return error;
    }
    
}

package Controlador;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Columnas;
import java.sql.Statement;


public class Conexion {
    
    
    public static Connection conexion;
    
    public static ArrayList<String> NombresTablas;
      
    //metodo que establece la conexion en la base de datos, segun los parametros que se le han pasado, que son el servidor,puerto,el usuario y la contraseña
    public Connection establecer_conexion(String servidor, String puerto, String user, String contrasenia){
        try {
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@" +servidor+":" +puerto+":xe",user,contrasenia);
            NombresTablas = getTablas(conexion);//lamma al metodo de obtener las tablas para que una vez iniciada la conexion, se carguen todas las tablas de dicha conexion en un arraylist
            return conexion;//devuelve la conexion
        } catch (SQLException ex) {
            return null;
        }
    }
     
   
     
    //metodo que dependiendo de la conexion, se cargan las tablas de dicha conexion y se guardan en un ArrayList>String> 
    public static ArrayList<String> getTablas(Connection conn)
            throws SQLException {

        ArrayList<String> listofTable = new ArrayList<>();//creo el arraylist de string

        DatabaseMetaData md = conn.getMetaData();//cero el object DatabaseMetaData y le paso los metadatos de la conexion
       
        //Hago u ¡n ResultSet, y utilizo el metodo getTable(), y le pasos parametros (null, user(para obtener las tablas del usuario), % y null
        ResultSet rs = md.getTables(null, md.getUserName(), "%", null);
        
        //hago un ciclo while, que recorre el ResultSet y me va guardando en el arraylist de string los nombres de las tablas
        while (rs.next()) {
            if (rs.getString(4).equalsIgnoreCase("TABLE")) {
                listofTable.add(rs.getString(3));
            }
        }
        //cierro el ResultSet
        rs.close();
        //devuelvo el arraylist que contiene el nombre de las tablas
        return listofTable;
    }
    
    //Es un metodo que pasandole el nombre de una tabla, me saca todas las columnas que tiene dicha tabla
    public ArrayList<Columnas> getColumnas(String tabla) throws SQLException{
         ArrayList<Columnas> listofColumns = new ArrayList<>();//cero el arraylist, pero esta ves de Columnas
         DatabaseMetaData md = conexion.getMetaData();//creo un object DatabaseMetadata y  obtengo los metadatos de la conexion
         
         //Hago un ResultSet y utilizo el metodo getColumns, que le paso como parametros(null, null, tabla(que es el nombre de la tabla a la que quiero sacar las columnas), y null)
         ResultSet rs = md.getColumns(null, null, tabla, null);
         
         //recorro el ResultSet y voy metiendo en el arraylist de tipo columnas el nombre de la columna y el tipo de dato que hay en la columna
         while(rs.next()){
             listofColumns.add(new Columnas(rs.getString(4), rs.getString(6)));
         }
         //cierro el ResultSet
         rs.close();
         //devuelvo el arraylist de columnas
         return listofColumns;
    }

    

    
}

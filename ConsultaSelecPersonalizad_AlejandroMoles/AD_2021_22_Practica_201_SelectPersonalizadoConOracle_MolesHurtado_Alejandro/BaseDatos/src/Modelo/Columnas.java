
package Modelo;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Clase Columna, que contiene los atributos Nombre, y Tipo, los dos tipo String
public class Columnas {
   private String Nombre;
   private String Tipo;
    
    //Constructor de Columnas
    public Columnas(String Nombre, String Tipo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }
    
    //Todos los metodos de Columnas, get, set y toString
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
   @Override
   public String toString(){
       return Nombre;
   } 
    
    
       
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio Madriz
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    private Connection conexion;
    
    public UserCRUD () {
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearUsuario(String nom, String cor, String contra){
        
        //secuencia SQL
        String sqlInsert ="INSERT INTO usuarios(nombre,correo,contrasena)VALUE (?,?,?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1, nom);
            ps.setString(2, cor);
            ps.setString(3, contra);
            return ps.executeUpdate() > 0;
        }
        catch(SQLException e){
        System.out.println("Error al intentar insertar" + e.getMessage());
        return false;
               
        }
    }// FIN DEL INSERT EN BOOLEAN 
    
    public ResultSet obtenerUsuarioPorID (int id){
     String selectSQL = "SELECT * FROM Usuarios WHERE id =? ";
     
     try {
        PreparedStatement ps = conexion.prepareStatement (selectSQL);
        ps.setInt(1, id);
        return ps.executeQuery();
        
     }
     catch (SQLException e){
        System.out.println("Error al intentar consultar" + e.getMessage());
        return null;
     }
     
    }// FIN OBTENER USUARIO POR ID 
    
    public ResultSet obtenerTodos (){
      String sqlTodos ="SELECT * FROM Usuarios";
      
      try {
        PreparedStatement ps = conexion.prepareStatement (sqlTodos);
        return ps.executeQuery();
      }
      catch(SQLException w){
          System.out.println("Error al consultar" + w.getMessage());
          return null;
      }
      
    }// FIN OBTENER TODOS 
    
    public boolean actualizarUsuario(int id, String nombre, String correo, String contrasena) {
    String sqlUpdate = "UPDATE usuarios SET nombre = ?, correo = ?, contrasena = ? WHERE id = ?";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
        ps.setString(1, nombre);
        ps.setString(2, correo);
        ps.setString(3, contrasena);
        ps.setInt(4, id);
        
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al intentar actualizar: " + e.getMessage());
        return false;
    }
}
    
}

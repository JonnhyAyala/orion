   
package Controlador;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private Connection conn = null;
    public Connection CrearBD(){
       try{
         //obtenemos el driver de para MySql
         Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
         //obtenemos la conexión
         conn = DriverManager.getConnection("jdbc:derby:.\\DB\\Derby.DB;create=true");
         if (conn!=null){
            JOptionPane.showMessageDialog(null,"Base de datos listo");
            String creartabla="create table Clientes(nombre varchar(50), ape1 varchar(50), ape2 varchar(50), direccion varchar(40))";
            String creartabla1="CREATE TABLE ciudad (`Codigo_ciudad` int(11) NOT NULL, `Nombre_ciudad` varchar(30) NOT NULL)";
            
            String desc="disconnect;";
            try {
            PreparedStatement pstm = conn.prepareStatement(creartabla1);
            pstm.execute();
            pstm.close();
            
            PreparedStatement pstm2 = conn.prepareStatement(desc);
            pstm2.execute();
            pstm2.close();
            
           JOptionPane.showMessageDialog(null,"BD Creada correctamente");
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
         }
      }
      catch(SQLException e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
      catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
       return conn;
  }
    
     public Connection AccederBD(){
       try{
         //obtenemos el driver de para mysql
         Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
         //obtenemos la conexión
         conn = DriverManager.getConnection("jdbc:derby:.\\DB\\Derby.DB");
         if (conn!=null){
            JOptionPane.showMessageDialog(null,"Coneccion a base de datos correcta ");
         }
      }
      catch(SQLException e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
      catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
       return conn;
  }
     
      public void cerracon (){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     
}

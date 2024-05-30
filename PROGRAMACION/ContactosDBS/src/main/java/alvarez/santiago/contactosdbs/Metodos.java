
package alvarez.santiago.contactosdbs;

import java.awt.Image;
import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Metodos {
static Logger login = Logger.getLogger(Metodos.class.getName());

	public Connection obtenerconexion() {
            Connection conexion = null;
		try{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
		String Basedatos = "jdbc:ucanaccess:///" + System.getProperty("user.dir") + "//Contactos.accdb";
                conexion = DriverManager.getConnection(Basedatos,"usuario","contraseña");
		}catch(ClassNotFoundException cnfex) {
		login.log(Level.SEVERE,null,cnfex);
		JOptionPane.showMessageDialog(null,"ERROR. DRIVER.\n" + cnfex);
		}catch(SQLException cnfex){
		Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE,null,cnfex);
		JOptionPane.showMessageDialog(null, "ERROR. CONEXION.\n" + cnfex);
		}
		return conexion;
	}


	public String Agregar(String nombre, String apellido, String domicilio, String telefono, String email, Date fechanac, int edad, String sexo, String Szodiacal, String Personajeanime, InputStream fis)throws SQLException {
	System.out.println("got called");
        Connection conexion = obtenerconexion();
            if(conexion == null){
                throw new SQLException("Couldn't establish a connection to ADD");
        }
		String query = "INSERT INTO Contactos(Nombre,Apellido,Domicilio,Telefono,Email,Fecha_de_nacimiento,Edad,Sexo,Signo_zodiacal,Personaje_de_anime_favorito,Foto)"
                + "values(?,?,?,?,?,?,?,?,?,?,?";        
		PreparedStatement instruccion = conexion.prepareStatement(query);
		instruccion.setString(1,nombre);
		instruccion.setString(2,apellido);
		instruccion.setString(3,domicilio);
		instruccion.setString(4,telefono);
		instruccion.setString(5,email);
		instruccion.setDate(6,fechanac);
		instruccion.setInt(7,edad);
		instruccion.setString(8,sexo);
		instruccion.setString(9,Szodiacal);
		instruccion.setString(10,Personajeanime);
		instruccion.setBinaryStream(11,fis);
		instruccion.executeUpdate();
		instruccion.close();
                try{
                    conexion.close();                
		}catch(SQLException cnfex) {
			login.log(Level.SEVERE,null,cnfex);		  
                }
                return this.ObtenerCodigo();
            }
    public java.util.List<String[]> Buscar(String target){
        java.util.List<String[]> resultList = new ArrayList<>();
        System.out.println("Hello from search!");
        Connection conexion = obtenerconexion();
        if(conexion != null){
            try{
                            System.out.println("target: " + target );
                String query = "SELECT * FROM Contactos WHERE Nombre = ?";
                PreparedStatement instruccion = 
                        conexion.prepareStatement(query);
                instruccion.setString(1, target);
                
                ResultSet set = instruccion.executeQuery();
                
                while(set.next()){
                    String[] resultados = new String[12];

                    resultados[0] = Integer.toString( set.getInt("Codigo") );
                    resultados[1] = set.getString("Nombre");
                    resultados[2] = set.getString("Apellido");
                    resultados[3] = set.getString("Domicilio");
                    resultados[4] = set.getString("Telefono");
                    resultados[5] = set.getString("Email");

                    resultados[6] = set.getDate("FechadeNacimiento").toString();

                    resultados[7] = Integer.toString( set.getInt("Edad") );
                    resultados[8] = set.getString("Sexo");
                    resultados[9] = set.getString("SignoZodiacal");
                    resultados[10] = set.getString("Personaje");
                    
                    resultList.add( resultados );
                    
                    System.out.print("[ ");
                    for(String s : resultados){
                        System.out.print(s + ", ");
                    }
                    System.out.println(" ]");
                }
            } catch(SQLException cnfex){
                Logger.getLogger(Metodos.class.getName())
                        .log(Level.SEVERE, null, cnfex);
            }finally{
                try {
                    conexion.close();
                } catch(SQLException e){
                    login.log(Level.SEVERE, null, e);
                }
            }
        }
       return resultList;
    }
     public void Modificar(int Codigo,String Nombre,String Apellido,String Domicilio,String Telefono,String Email,Date Nacimiento,int Edad,String Sexo,String Zodiacal,String Personaje,InputStream is) throws SQLException {
        Connection conexion = obtenerconexion();
        if(conexion == null) throw new SQLException("Couldn't establish a connection to MODIFY");
        String query = "UPDATE Contactos SET "+ "Nombre = ?, " + "Apellido = ?, " + "Domicilio = ?, " + "Telefono = ?, " + "Email = ?, " + "FechadeNacimiento = ?, " + "Edad = ?, " + "Sexo = ?, " + "Zodiaco = ?, " + "Personaje = ?, " + "Foto = ? " + "WHERE Codigo = ?";
        PreparedStatement instruccion = 
                conexion.prepareStatement(query);

        instruccion.setString(1, Nombre);
        instruccion.setString(2, Apellido);
        instruccion.setString(3, Domicilio);
        instruccion.setString(4, Telefono);
        instruccion.setString(5, Email);
        instruccion.setDate(6, Nacimiento);
        instruccion.setInt(7, Edad);
        instruccion.setString(8, Sexo);
        instruccion.setString(9, Zodiacal);
        instruccion.setString(10, Personaje);
        instruccion.setBinaryStream(11, is);

        instruccion.setInt(12, Codigo);

        instruccion.executeUpdate();
        instruccion.close();
        System.out.println("LETS GOOO!"); //Esto no lo pongas

        try {
            conexion.close();
        } catch(SQLException cnfex){
            login.log(Level.SEVERE, null, cnfex);
        }
    }
    public void Eliminar(int codigo) throws SQLException{
        Connection conexion = obtenerconexion();
        if(conexion == null) throw new SQLException("Couldn't establish a connection to DELETE");
        
        String query = "DELETE FROM Contactos WHERE Codigo = ?";
        PreparedStatement instruccion = 
                conexion.prepareStatement(query);
        instruccion.setInt(1, codigo);

        instruccion.executeUpdate();

        try {
            conexion.close();
        } catch(SQLException cnfex){
            login.log(Level.SEVERE, null, cnfex);
        }
    }
    
    public java.util.List<String[]> QueryAll(java.util.List<Image> images){
        Connection conexion = obtenerconexion();
        if(conexion == null) return null;
        
        java.util.List<String[]> resultList = new ArrayList<String[]>();
        String query = "SELECT * FROM Contactos";
        try {
            PreparedStatement instruccion = conexion.prepareStatement(query);
            ResultSet set = instruccion.executeQuery();
            int index = 1;
            while(set.next()){
                String[] resultados = new String[12];
                
                resultados[0] = Integer.toString( index );
                resultados[1] = Integer.toString( set.getInt("Codigo") );
                resultados[2] = set.getString("Nombre");
                resultados[3] = set.getString("Apellido");
                resultados[4] = set.getString("Domicilio");
                resultados[5] = set.getString("Telefono");
                resultados[6] = set.getString("Email");
                
                resultados[7] = set.getDate("FechadeNacimiento").toString();
               
                resultados[8] = Integer.toString( set.getInt("Edad") );
                resultados[9] = set.getString("Sexo");
                resultados[10] = set.getString("Zodiacal");
                resultados[11] = set.getString("Personaje");
                
                resultList.add(resultados);
                images.add( ImageIO.read(set.getBinaryStream("Foto") ));
                
                index++;
            }
        } catch (SQLException cnfex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, cnfex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return resultList;
    }
    private String ObtenerCodigo(){
        Connection conexion = obtenerconexion();
        if(conexion == null) return null;
        
        String query = "SELECT * FROM Contactos ORDER BY Codigo DESC LIMIT 1";
        try{
            PreparedStatement instruccion = 
                    conexion.prepareStatement(query);

            ResultSet set = instruccion.executeQuery();
            if(set.next())
                return Integer.toString( set.getInt("Codigo") );

        } catch(SQLException e){
            Logger.getLogger(Metodos.class.getName())
                    .log(Level.SEVERE, null, e);
        } finally{
            try {
                conexion.close();
            } catch(SQLException e){
                login.log(Level.SEVERE, null, e);
            }
        }
        return null;
    }
}
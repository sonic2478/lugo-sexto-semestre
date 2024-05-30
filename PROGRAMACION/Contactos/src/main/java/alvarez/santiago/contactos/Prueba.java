
package alvarez.santiago.contactos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Prueba {
    public static void main(String[] args) throws IOException {
    String rutadelarchivo= System.getProperty("user.dir")+"//Contactos.txt",
    rarchivot= System.getProperty("user.dir")+"//Temp.txt";
    File archivo = new File(rutadelarchivo);
    File temp = new File(rarchivot);
    Scanner leeropcion;
     int opcion;
    //ATRIBUTOS
   
    do{
        System.out.println 
        ("MENU");
        System.out.println 
        ("""
         1. AGREGAR 
        2. MOSTRAR
        3. BUSCAR
        4. MODIFICAR
        5. ELIMINAR
        6. SALIR
         ELIGE UNA OPCIÓN""");        
        leeropcion = new Scanner 
        (System.in);
        opcion = leeropcion.nextInt();
        switch(opcion) {
            case 1 -> {
                String linea;
                System.out.println("PIDIENDO DATOS");
                Metodos me1 = new Metodos();
                linea= me1.Pedirdatos();
                me1.Escribir(archivo,linea);
            }
            case 2 -> {
            System.out.println("MOSTRANDO DATOS");
            Metodos me2 = new Metodos();
            me2.Leer(archivo);                    
            }
            case 3 -> {
            Metodos me3 = new Metodos();
            me3.Buscar(archivo);
            }
            case 4 -> {
            String linea;
            Metodos me4= new Metodos();
            me4.Modificar(archivo);
            }
            case 5 -> {
                String linea;
            Metodos me5= new Metodos();
            me5.Eliminar(archivo);
            }
            case 6 -> {
                System.out.println("HASTA LUEGO");
                System.exit(0);
            }default -> throw new AssertionError();
        }      
    }while(opcion !=6);
        
  }
}
    

           
            
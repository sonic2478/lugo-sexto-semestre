
package alvarez.santiago.escleer;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Prueba {
String linea;
    public static void main(String[] args) {
     String nombrearch, tipoarch, nuevonomarch, escritarch;
     Scanner leeropcion, leerdatos;
     int opcion;
    //ATRIBUTOS
   
    do{
        System.out.println 
        ("MENU");
        System.out.println 
        ("""
         1. Crear 
        2. Eliminar
        3. Renombrar
        4. Escribir
        5. Leer
        6. Salir""");        
        leeropcion = new Scanner 
        (System.in);
        opcion = leeropcion.nextInt();
        switch(opcion) {
            case 1 -> {
                System.out.println("DAME EL NOMBRE DEL ARCHIVO");
                leerdatos= new Scanner (System.in);
                nombrearch = leerdatos.nextLine();
                
                System.out.println("DAME EL TIPO DE ARCHIVO(docx,xlsx,txt)");
                leerdatos= new Scanner (System.in);
                tipoarch= leerdatos.nextLine();
                
                String rutaDelArchivo = System.getProperty("user.dir")+"//"+nombrearch+"."+tipoarch;
                File archivo= new File(rutaDelArchivo);
                
                MetoDos me1= new MetoDos();
                me1.Crear(archivo);               
            }
            case 2 -> {
            System.out.println("DAME EL NOMBRE DEL ARCHIVO");
                leerdatos= new Scanner (System.in);
                nombrearch = leerdatos.nextLine();
                
                System.out.println("DAME EL TIPO DE ARCHIVO(docx,xlsx,txt)");
                leerdatos= new Scanner (System.in);
                tipoarch= leerdatos.nextLine();
                
                String rutaDelArchivo = System.getProperty("user.dir")+"//"+nombrearch+"."+tipoarch;
                File archivo= new File(rutaDelArchivo);
                
                MetoDos me2= new MetoDos();
                me2.Eliminar(archivo);                              
            }
            case 3 -> {
            System.out.println("DAME EL NOMBRE DEL ARCHIVO");
                leerdatos= new Scanner (System.in);
                nombrearch = leerdatos.nextLine();
                
                System.out.println("DAME EL TIPO DE ARCHIVO(docx,xlsx,txt)");
                leerdatos= new Scanner (System.in);
                tipoarch= leerdatos.nextLine();
                
                System.out.println("DAME EL NUEVO NOMBRE DEL ARCHIVO");
                leerdatos= new Scanner (System.in);
                nuevonomarch = leerdatos.nextLine();
                
                String rutaDelArchivo = System.getProperty("user.dir")+"//"+nombrearch+"."+tipoarch;
                File archivo= new File(rutaDelArchivo);
                
                String rutaDelarchivo = System.getProperty("user.dir")+"//"+nuevonomarch+"."+tipoarch;
                File archivo2= new File(rutaDelarchivo);
                
                File oldfile= new File(rutaDelArchivo);
                File newfile= new File(rutaDelarchivo);
                
                if(oldfile.renameTo(newfile))
                    System.out.println("EL ARCHIVO HA SIDO RENOMBRADO");
               else
                    System.out.println("EL ARCHIVO NO EXISTE");
            
            }
            case 4 -> {
            System.out.println("DAME EL NOMBRE DEL ARCHIVO");
                leerdatos= new Scanner (System.in);
                nombrearch = leerdatos.nextLine();
                
                System.out.println("DAME EL TIPO DE ARCHIVO(docx,xlsx,txt)");
                leerdatos= new Scanner (System.in);
                tipoarch= leerdatos.nextLine();
                
                System.out.println("ESCRIBE LO QUE QUIERAS ESCRIBIR EN EL ARCHIVO");
                leerdatos= new Scanner (System.in);
                escritarch = leerdatos.nextLine();
                
                String rutaDelArchivo = System.getProperty("user.dir")+"//"+nombrearch+"."+tipoarch;
                File archivo= new File(rutaDelArchivo);
                
                MetoDos me4 = new MetoDos();
                me4.Escribir(archivo,escritarch);
            }
            case 5 -> {
            System.out.println("DAME EL NOMBRE DEL ARCHIVO");
                leerdatos= new Scanner (System.in);
                nombrearch = leerdatos.nextLine();
                
                System.out.println("DAME EL TIPO DE ARCHIVO(docx,xlsx,txt)");
                leerdatos= new Scanner (System.in);
                tipoarch= leerdatos.nextLine();               
                
                String rutaDelArchivo = System.getProperty("user.dir")+"//"+nombrearch+"."+tipoarch;
                File archivo= new File(rutaDelArchivo);
                
                MetoDos me5 = new MetoDos();
                me5.Leer(archivo);
            }
            case 6 -> {
                System.out.println("HASTA LUEGO");
                System.exit(0);
            }default -> throw new AssertionError();
    }
}while(opcion !=6);
        
    }
}
    

           
            
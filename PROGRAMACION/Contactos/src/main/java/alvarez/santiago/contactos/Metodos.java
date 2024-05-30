
package alvarez.santiago.contactos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Metodos { 
    String linea;  
    public void Escribir(File miArchivo, String linea){
        try{
            if(!miArchivo.exists())
            miArchivo.createNewFile();
            FileWriter fw = new FileWriter(miArchivo.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
        pw.write(linea);
        pw.append("\n");
        pw.close();
        bw.close(); 
        }catch(IOException ex){
            System.err.print(ex.getMessage());        
        }
    }    
    public void Leer(File miArchivo){   
        try{
            if(miArchivo.exists()){
            FileReader fr = new FileReader(miArchivo);
            BufferedReader br = new BufferedReader(fr);           
            System.out.println(br.readLine());
            while((linea=br.readLine()) != null){      
            System.out.println(linea);
            }
            br.close();
            }
            else
                System.out.println("EL CONTACTO NO EXISTE");
        }catch(IOException ex){
            System.err.print(ex.getMessage());        
        }
    }
    public String Pedirdatos(){
    String nombre,apellido,domicilio,telefono,email;
    int edad;
        Scanner valor= new Scanner(System.in);
    
    System.out.println("¿CUÁL ES TU NOMBRE?");
    valor= new Scanner (System.in);
    nombre = valor.nextLine();
    
    System.out.println("¿CUÁL ES TU APELLIDO?");
    valor= new Scanner (System.in);
    apellido = valor.nextLine();
    
    System.out.println("¿CUÁL ES TU DOMICILIO?");
    valor= new Scanner (System.in);
    domicilio = valor.nextLine();
    
    System.out.println("¿CUÁL ES TU TELÉFONO?");
    valor= new Scanner (System.in);
    telefono = valor.nextLine();
    
    System.out.println("¿CUÁL ES TU EMAIL?");
    valor= new Scanner (System.in);
    email = valor.nextLine();
    
    System.out.println("¿CUÁL ES TU EDAD?");
    valor= new Scanner (System.in);
    edad = valor.nextInt();
     String linea= nombre+" "+apellido+" "+domicilio+" "+telefono+" "+email+" "+edad;
    return linea;
    }
    public void Buscar(File miArchivo){
    String nombre2;
    Scanner valor= new Scanner(System.in);
    System.out.println("DIME EL NOMBRE QUE BUSCAS");
    valor= new Scanner (System.in);
    nombre2 = valor.nextLine();
    try{
            if(miArchivo.exists()){
            FileReader fr = new FileReader(miArchivo);
            BufferedReader br = new BufferedReader(fr);           
            while((linea=br.readLine()) != null){      
            String aux= linea.substring(0,nombre2.length());
            if(nombre2.equals(aux))
            System.out.println(linea);
            }
            br.close();
            }
            else
                System.out.println("EL CONTACTO NO EXISTE");
        }catch(IOException ex){
            System.err.print(ex.getMessage());        
        }
    }
    public void Eliminar(File miArchivo)throws IOException{
    String nombre2,rarchivot= System.getProperty("user.dir")+"//Temp.txt",archivo=System.getProperty("user.dir")+"//Contactos.txt";
    Scanner valor;
    try{
            if(!miArchivo.exists())
           miArchivo.createNewFile();
           else{
           valor= new Scanner(System.in);
                System.out.println("DIME EL CONTACTO QUE QUIERES MODIFICAR");
                valor= new Scanner (System.in);
                nombre2 = valor.nextLine();
                File miArchivo2 = new File(rarchivot);
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(miArchivo2, true);
                while((linea=br.readLine()) != null){      
                String aux= linea.substring(0,nombre2.length());
                if(!nombre2.equals(aux))
                fw.write(linea+"\n");
                }
                br.close();
                fw.close();               
                miArchivo.delete();
                miArchivo2.renameTo(new File("Contactos.txt"));
                }
                          
                }catch(IOException ex){
            System.err.print(ex.getMessage());    
            }  
        }
    public void Modificar(File miArchivo)throws IOException{
    String nombre2,rarchivot= System.getProperty("user.dir")+"//Temp.txt",archivo=System.getProperty("user.dir")+"//Contactos.txt";
    Scanner valor;
    try{
            if(!miArchivo.exists())
           miArchivo.createNewFile();
           else{
           valor= new Scanner(System.in);
                System.out.println("DIME EL CONTACTO QUE QUIERES MODIFICAR");
                valor= new Scanner (System.in);
                nombre2 = valor.nextLine();
                File miArchivo2 = new File(rarchivot);
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(miArchivo2, true);
                while((linea=br.readLine()) != null){      
                String aux= linea.substring(0,nombre2.length());
                if(nombre2.equals(aux)){
                String linea2= Pedirdatos();
                fw.write(linea2+"\n");
                }
                else
                fw.write(linea+"\n");
                }
                br.close();
                fw.close();               
                miArchivo.delete();
                miArchivo2.renameTo(new File("Contactos.txt"));
                }
                          
                }catch(IOException ex){
            System.err.print(ex.getMessage());    
            }  
        }
}
    

    

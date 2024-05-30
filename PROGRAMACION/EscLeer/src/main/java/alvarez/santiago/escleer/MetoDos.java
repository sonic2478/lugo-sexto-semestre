
package alvarez.santiago.escleer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class MetoDos {
    String linea;
    public void Crear(File miArchivo){
        try{
            if(!miArchivo.exists()){
                miArchivo.createNewFile();
                System.out.println("EL ARCHIVO HA SIDO CREADO");
            }
                else
                System.out.println("ARCHIVO YA EXISTENTE");
        }catch(IOException ex){
        System.err.print(ex.getMessage());
        }
    }
     public void Eliminar(File miArchivo){
            if(!miArchivo.exists()){
                System.out.println("EL ARCHIVO NO EXISTE");
            }
            else{
                miArchivo.delete();
                System.out.println("ARCHIVO BORRADO");
            }
    
        
    }
     
    public void Escribir(File miArchivo, String linea){
        try{
            if(miArchivo.exists()){
            FileWriter fw = new FileWriter(miArchivo.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
        pw.write(linea);
        pw.append("\n");
        pw.close();
        bw.close();
        }
        else
               System.out.println("EL ARCHIVO NO EXISTE");
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
                System.out.println("EL ARCHIVO NO EXISTE");
        }catch(IOException ex){
            System.err.print(ex.getMessage());        
        }
    }    
    
    

}

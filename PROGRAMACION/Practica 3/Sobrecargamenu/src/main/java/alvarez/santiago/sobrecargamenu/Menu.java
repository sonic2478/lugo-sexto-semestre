
package alvarez.santiago.sobrecargamenu;

import java.util.Scanner;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //ATRIBUTOS
    String color;
    String resolucion;
    String dimensiones;
    float precio;
    String marca;
    int opcion;
    Scanner leeropcion, leerdatos;
    do{
        System.out.println 
        ("MENU");
        System.out.println 
        ("""
         1. Consola por Default
        2. CAMBIAR EL COLOR
        3. CAMBIAR EL COLOR Y LAS DIMENSIONES
        4. CAMBIAR EL COLOR, LAS DIMENSIONES Y LA MARCA
        5. CAMBIAR EL COLOR, LAS DIMENSIONES, LA MARCA Y EL PRECIO
        6. CAMBIAR EL COLOR, LAS DIMENSIONES, LA MARCA, EL PRECIO Y LA RESOLUCI\u00d3N
        7. SALIRELIGE UNA OPCI\u00d3N.""");        
        leeropcion = new Scanner 
        (System.in);
        opcion = leeropcion.nextInt();
        switch(opcion) {
            case 1 -> {
            Consola cl = new Consola();
            cl.Imprimir();
            }
            case 2 -> {
            System.out.println("DIME EL COLOR");
            leerdatos = new Scanner (System.in);
            color= leerdatos.nextLine();
            
            Consola cl2 = new Consola(color);
            cl2.Imprimir();
            }
            case 3 -> {
        
            System.out.println("DIME EL COLOR");
            leerdatos = new Scanner (System.in);
            color= leerdatos.nextLine();
        
            System.out.println("DIME LAS DIMENSIONES");
            leerdatos = new Scanner (System.in);
            dimensiones= leerdatos.nextLine();
        
            Consola cl3 = new Consola(color,dimensiones);
            cl3.Imprimir();
            }    
            case 4 -> {
            System.out.println("DIME EL COLOR");
            leerdatos = new Scanner (System.in);
            color= leerdatos.nextLine();
        
            System.out.println("DIME LAS DIMENSIONES");
            leerdatos = new Scanner (System.in);
            dimensiones= leerdatos.nextLine();
        
            System.out.println("DIME LA MARCA");
            leerdatos = new Scanner (System.in);
            marca= leerdatos.nextLine();
        
            Consola cl4 = new Consola(color,dimensiones,marca);
            cl4.Imprimir();
            }
            case 5 -> {
            System.out.println("DIME EL COLOR");
            leerdatos = new Scanner (System.in);
            color= leerdatos.nextLine();
        
            System.out.println("DIME LAS DIMENSIONES");
            leerdatos = new Scanner (System.in);
            dimensiones= leerdatos.nextLine();
        
            System.out.println("DIME LA MARCA");
            leerdatos = new Scanner (System.in);
            marca= leerdatos.nextLine();
        
            System.out.println("DIME EL PRECIO");
            leerdatos = new Scanner (System.in);
            precio= leerdatos.nextFloat();
        
            Consola cl5 = new Consola(color,dimensiones,marca,precio);
            cl5.Imprimir();
            }
            case 6 -> {
            System.out.println("DIME EL COLOR");
            leerdatos = new Scanner (System.in);
            color= leerdatos.nextLine();
        
            System.out.println("DIME LAS DIMENSIONES");
            leerdatos = new Scanner (System.in);
            dimensiones= leerdatos.nextLine();
        
            System.out.println("DIME LA MARCA");
            leerdatos = new Scanner (System.in);
            marca= leerdatos.nextLine();
        
            System.out.println("DIME EL PRECIO");
            leerdatos = new Scanner (System.in);
            precio= leerdatos.nextFloat();
         
            System.out.println("DIME LA RESOLUCIÓN");
            leerdatos = new Scanner (System.in);
            resolucion= leerdatos.nextLine();
        
            Consola cl6 = new Consola(color,dimensiones,marca,precio,resolucion);
            cl6.Imprimir();
            }
            case 7 -> {
            System.out.println("HASTA PRONTO");
            System.exit(0);
            }
        default -> throw new AssertionError();
      }
      }while(opcion !=7);
       
    }
    
}

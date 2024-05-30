
package alvarez.santiago.herenciamenu;

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
    //5 ATRIBUTOS VEHICULO
    String marca;
    String submarca;
    int modelo; 
    String color;
    String tipo;
    
    //3 ATRIBUTOS AUTOMOVIL
    int cilindros;
    float precio;
    String clase;
    
    //3 ATRIBUTOS AVION
    String destino;
    int asientos;
    String partida; 
    
     //3 ATRIBUTOS BARCO
    String material;
    int ventanas;
    int velas;
    
    //3 ATRIBUTOS BICI
    int rodado;
    String cambios;
    String terreno; 
    
     //3 ATRIBUTOS CAMION
    String ruta;
    String rampa;
    String pago; 
    
    //3 ATRIBUTOS MOTOCICLETA
    int pasajeros;
    int gasolina;
    int compartimientos; 
    
     //3 ATRIBUTOS PATINETA
    String tipo_rueda;
    String tabla;
    int ejes; 
    
    // ATRIBUTOS MENU
    int opcion;
    Scanner leeropcion,leerdatos;
        do{
            System.out.println 
        ("MENU");
        System.out.println 
        ("""
        1. VEHICULO
        2. AUTOMOVIL 
        3. AVION
        4. BARCO
        5. BICI
        6. CAMION
        7. MOTOCICLETA
        8. PATINETA
        9. SALIRELIGE UNA OPCI\u00d3N.""");        
        leeropcion = new Scanner 
        (System.in);
        opcion = leeropcion.nextInt();
        switch(opcion) {
            case 1 -> {
                System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                Vehiculo ve = new Vehiculo();
                ve.setMarca(marca);
                ve.setSubmarca(submarca);
                ve.setModelo(modelo);
                ve.setColor(color);
                ve.setTipo(tipo);
                ve.Imprimir();                           
            }
            case 2 -> {
            System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                System.out.println("DIME LOS CILINDROS");
                leerdatos = new Scanner (System.in);
                cilindros= leerdatos.nextInt();
                
                System.out.println("DIME EL PRECIO");
                leerdatos = new Scanner (System.in);
                precio= leerdatos.nextFloat();
                
                System.out.println("DIME LA CLASE");
                leerdatos = new Scanner (System.in);
                clase= leerdatos.nextLine();
                
                Automovil au = new Automovil();
                au.setMarca(marca);
                au.setSubmarca(submarca);
                au.setModelo(modelo);
                au.setColor(color);
                au.setTipo(tipo);
                au.setCilindros(cilindros);
                au.setPrecio(precio);
                au.setClase(clase);
                au.Imprimir();             
            }
            case 3 -> {
            System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                System.out.println("DIME EL DESTINO");
                leerdatos = new Scanner (System.in);
                destino= leerdatos.nextLine();
                
                System.out.println("DIME LOS ASIENTOS");
                leerdatos = new Scanner (System.in);
                asientos= leerdatos.nextInt();
                
                System.out.println("DIME LA PARTIDA");
                leerdatos = new Scanner (System.in);
                partida= leerdatos.nextLine();
                
                Avion av = new Avion();
                av.setMarca(marca);
                av.setSubmarca(submarca);
                av.setModelo(modelo);
                av.setColor(color);
                av.setTipo(tipo);
                av.setDestino(destino);
                av.setAsientos(asientos);
                av.setPartida(partida);
                av.Imprimir();       
            }    
            case 4 -> {
            System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                System.out.println("DIME EL MATERIAL");
                leerdatos = new Scanner (System.in);
                material= leerdatos.nextLine();
                
                System.out.println("DIME LAS VENTANAS");
                leerdatos = new Scanner (System.in);
                ventanas= leerdatos.nextInt();
                
                System.out.println("DIME LAS VELAS");
                leerdatos = new Scanner (System.in);
                velas= leerdatos.nextInt();
                
                Barco ba = new Barco();
                ba.setMarca(marca);
                ba.setSubmarca(submarca);
                ba.setModelo(modelo);
                ba.setColor(color);
                ba.setTipo(tipo);
                ba.setMaterial(material);
                ba.setVentanas(ventanas);
                ba.setVelas(velas);
                ba.Imprimir();       
            }
            case 5 -> {
            System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                System.out.println("DIME EL RODADO");
                leerdatos = new Scanner (System.in);
                rodado= leerdatos.nextInt();
                
                System.out.println("DIME SI TIENE CAMBIOS O NO");
                leerdatos = new Scanner (System.in);
                cambios= leerdatos.nextLine();
                
                System.out.println("DIME EL TERRENO");
                leerdatos = new Scanner (System.in);
                terreno= leerdatos.nextLine();
                
                Bici bi = new Bici();
                bi.setMarca(marca);
                bi.setSubmarca(submarca);
                bi.setModelo(modelo);
                bi.setColor(color);
                bi.setTipo(tipo);
                bi.setRodado(rodado);
                bi.setCambios(cambios);
                bi.setTerreno(terreno);
                bi.Imprimir();       
            }
            case 6 -> {
            System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                System.out.println("DIME LA RUTA");
                leerdatos = new Scanner (System.in);
                ruta= leerdatos.nextLine();
                
                System.out.println("DIME SI TIENE RAMPA O NO");
                leerdatos = new Scanner (System.in);
                rampa= leerdatos.nextLine();
                
                System.out.println("DIME SI TIENE PAGO CON TARJETA O NO");
                leerdatos = new Scanner (System.in);
                pago= leerdatos.nextLine();
                
                Camion ca = new Camion();
                ca.setMarca(marca);
                ca.setSubmarca(submarca);
                ca.setModelo(modelo);
                ca.setColor(color);
                ca.setTipo(tipo);
                ca.setRuta(ruta);
                ca.setRampa(rampa);
                ca.setPago(pago);
                ca.Imprimir();       
            }
             case 7 -> {
            System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                System.out.println("DIME LOS PASAJEROS");
                leerdatos = new Scanner (System.in);
                pasajeros= leerdatos.nextInt();
                
                System.out.println("DIME LOS LITROS DE GASOLINA");
                leerdatos = new Scanner (System.in);
                gasolina= leerdatos.nextInt();
                
                System.out.println("DIME LOS COMPARTIMIENTOS");
                leerdatos = new Scanner (System.in);
                compartimientos= leerdatos.nextInt();
                
                Motocicleta mo = new Motocicleta();
                mo.setMarca(marca);
                mo.setSubmarca(submarca);
                mo.setModelo(modelo);
                mo.setColor(color);
                mo.setTipo(tipo);
                mo.setPasajeros(pasajeros);
                mo.setGasolina(gasolina);
                mo.setCompartimientos(compartimientos);
                mo.Imprimir();       
            }
            case 8 -> {
            System.out.println("DIME LA MARCA");
                leerdatos = new Scanner (System.in);
                marca= leerdatos.nextLine();
                
                System.out.println("DIME LA SUBMARCA");
                leerdatos = new Scanner (System.in);
                submarca= leerdatos.nextLine();
                
                System.out.println("DIME EL MODELO");
                leerdatos = new Scanner (System.in);
                modelo= leerdatos.nextInt();
                
                System.out.println("DIME EL COLOR");
                leerdatos = new Scanner (System.in);
                color= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO");
                leerdatos = new Scanner (System.in);
                tipo= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO DE RUEDA");
                leerdatos = new Scanner (System.in);
                tipo_rueda= leerdatos.nextLine();
                
                System.out.println("DIME EL TIPO DE TABLA");
                leerdatos = new Scanner (System.in);
                tabla= leerdatos.nextLine();
                
                System.out.println("DIME LOS EJES");
                leerdatos = new Scanner (System.in);
                ejes= leerdatos.nextInt();
                
                Patineta pa = new Patineta();
                pa.setMarca(marca);
                pa.setSubmarca(submarca);
                pa.setModelo(modelo);
                pa.setColor(color);
                pa.setTipo(tipo);
                pa.setTipo_rueda(tipo_rueda);
                pa.setTabla(tabla);
                pa.setEjes(ejes);
                pa.Imprimir();       
            } 
            case 9 -> {
            System.out.println("HASTA PRONTO");
            System.exit(0);
            }
        default -> throw new AssertionError();
        }  
        }while(opcion !=9);
    } 
}

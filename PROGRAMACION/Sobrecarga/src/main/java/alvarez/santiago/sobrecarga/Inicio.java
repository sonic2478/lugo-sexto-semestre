
package alvarez.santiago.sobrecarga;

/**
 *
 * @author Santiago Alvarez Mares 6°A T/M
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Consola consolita = new Consola();
    consolita.Imprimir();
    Consola consolita2 = new Consola("VERDE");
    consolita2.Imprimir();
    Consola consolita3 = new Consola("BLANCO", "12x48x35");
    consolita3.Imprimir();
    Consola consolita4 = new Consola("ROJO", "24x46x22", "PLAY STATION");
    consolita4.Imprimir();
    Consola consolita5 = new Consola("AMARILLO", "25x49x27", "NINTENDO", 13000.00f);
    consolita5.Imprimir();
    Consola consolita6 = new Consola("AMARILLO", "29x34x26", "SEGA", 16000.00f, "4K");
    consolita6.Imprimir();        
    }
    
    
}

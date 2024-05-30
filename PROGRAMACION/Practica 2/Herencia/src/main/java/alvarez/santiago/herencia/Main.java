
package alvarez.santiago.herencia;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
    Vehiculo v = new Vehiculo();
    v.setColor("AZUL");
    v.setMarca("FERRARI");
    v.setSubmarca("ICONA");
    v.setModelo(1997);
    v.setTipo("DEPORTIVO");
    v.Imprimir();
    
    Automovil a = new Automovil();
    a.setColor("ROJO");
    a.setMarca("CHEVROLET");
    a.setSubmarca("AVEO");
    a.setModelo(2018);
    a.setTipo("BÁSICO");
    a.setCilindros(8);
    a.setClase("D");
    a.setPrecio(200000.00f);
    a.Imprimir();
    
    Avion av = new Avion();
    av.setColor("BLANCO");
    av.setMarca("AEROMÉXICO");
    av.setSubmarca("TURISTA");
    av.setModelo(2002);
    av.setTipo("PRIVADO");
    av.setAsientos(248);
    av.setPartida("PARÍS");
    av.setDestino("MÉXICO");
    av.Imprimir();
    
    Barco ba = new Barco();
    ba.setColor("NEGRO");
    ba.setMarca("BAYLINER");
    ba.setSubmarca("BENNINGTON");
    ba.setModelo(1998);
    ba.setTipo("CRUCERO");
    ba.setMaterial("METAL");
    ba.setVelas(4);
    ba.setVentanas(20);
    ba.Imprimir();
    
    Bici bi = new Bici();
    bi.setColor("VERDE");
    bi.setMarca("SCOTT");
    bi.setSubmarca("TREK");
    bi.setModelo(2020);
    bi.setTipo("CASUAL");
    bi.setCambios("Sí");
    bi.setRodado(24);
    bi.setTerreno("Montaña");
    bi.Imprimir();
    
    Camion ca = new Camion();
    ca.setColor("VERDE");
    ca.setMarca("MERCEDES");
    ca.setSubmarca("MITRANSPORTE");
    ca.setModelo(2008);
    ca.setTipo("PÚBLICO");
    ca.setPago("Sí");
    ca.setRampa("No");
    ca.setRuta("634");
    ca.Imprimir();
    
    Motocicleta m = new Motocicleta();
    m.setColor("AMARILLA");
    m.setMarca("HARLEY_DAVIDSON");
    m.setSubmarca("DUCATI");
    m.setModelo(2017);
    m.setTipo("CASUAL");
    m.setCompartimientos(2);
    m.setGasolina(250);
    m.setPasajeros(3);
    m.Imprimir();
    
    Patineta p = new Patineta();
    p.setColor("NARANJA");
    p.setMarca("ANTISKATE");
    p.setSubmarca("PALACE");
    p.setModelo(2022);
    p.setTipo("SKATE");
    p.setEjes(2);
    p.setTabla("MADERA");
    p.setTipo_rueda("LISA");
    p.Imprimir();    
    }
    
}

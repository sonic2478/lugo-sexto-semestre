
package alvarez.santiago.herenciamenu;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Camion extends Vehiculo{
    //3 ATRIBUTOS
    String ruta;
    String rampa;
    String pago; 
    //3 OPERACIONES
    public void Chocar(){
    System.out.println ("EL CAMIÓN PUEDE CHOCAR");
    }
    public void Prioridad(){    
    System.out.println ("EL CAMIÓN TIENE PRIORIDAD EN LA CALLE");
    }
    public void Turbo(){    
    System.out.println ("EL CAMIÓN PUEDE TENER TURBO");    
    }
    //GETTER Y SETTER
    //1
    public String getRuta(){
    return ruta;
    }
    public void setRuta(String ru){
    this.ruta = ru;
    }
    //2
    public String getRampa(){
    return rampa;
    }
    public void setRampa(String ra){
    this.rampa = ra;
    }
    //3
    public String getPago(){
    return pago;
    }
    public void setPago(String pag){
    this.pago = pag;
    }
    //IMPRIMIR
    @Override
    public void Imprimir(){
    Transporta();
    Matar();
    Imponer();
    System.out.println("LA MARCA DEL VEHÍCULO ES: " +getMarca());
    System.out.println("LA SUBMARCA DEL VEHÍCULO ES: " +getSubmarca());
    System.out.println("EL MODELO DEL VEHÍCULO ES: " +getModelo());
    System.out.println("EL COLOR DEL VEHÍCULO ES: " +getColor());
    System.out.println("EL TIPO DE VEHÍCULO ES: " +getTipo());
    Chocar();
    Prioridad();
    Turbo();
     System.out.println("LA RUTA DEL CAMIÓN ES : " +getRuta());
     System.out.println("EL CAMIÓN TIENE RAMPA DE DISCAPACITADOS? : " +getRampa());
     System.out.println("EL CAMIÓN TIENE PAGO CON TARJETA? : " +getPago());
    }
}

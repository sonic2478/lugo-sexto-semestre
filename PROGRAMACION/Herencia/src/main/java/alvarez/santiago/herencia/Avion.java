
package alvarez.santiago.herencia;

/**
 * 
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Avion extends Vehiculo {
    //3 ATRIBUTOS
    String destino;
    int asientos;
    String partida; 
    //3 OPERACIONES
    public void Volar(){
    System.out.println ("EL AVIÓN PUEDE VOLAR");
    }
    public void Estrellar(){    
    System.out.println ("EL AVIÓN PUEDE ESTRELLARSE");
    }
    public void Rodar(){    
    System.out.println ("EL AVIÓN PUEDE RODAR CON SUS POCAS RUEDAS");    
    }
    //GETTER Y SETTER
    //1
    public String getDestino(){
    return destino;
    }
    public void setDestino(String de){
    this.destino = de;
    }
    //2
    public int getAsientos(){
    return asientos;
    }
    public void setAsientos(int as){
    this.asientos = as;
    }
    //3
    public String getPartida(){
    return partida;
    }
    public void setPartida(String pa){
    this.partida = pa;
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
    Volar();
    Estrellar();
    Rodar();
     System.out.println("EL DESTINO DEL AVIÓN ES : " +getDestino());
     System.out.println("EL NÚMERO DE ASIENTOS DEL AVIÓN ES : " +getAsientos());
     System.out.println("EL PUNTO DE PARTIDA DEL AVIÓN ES : " +getPartida());
    }    
}

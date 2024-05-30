
package alvarez.santiago.herencia;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Barco extends Vehiculo {
    //3 ATRIBUTOS
    String material;
    int ventanas;
    int velas; 
    //3 OPERACIONES
    public void Flotar(){
    System.out.println ("EL BARCO PUEDE FLOTAR");
    }
    public void Atacar(){    
    System.out.println ("EL BARCO PUEDE ATACAR CON BALAS DE CAÑÓN");
    }
    public void Explorar(){    
    System.out.println ("EL BARCO PUEDE EXPLORAR TIERRAS DESCONOCIDAS");    
    }
    //GETTER Y SETTER
    //1
    public String getMaterial(){
    return material;
    }
    public void setMaterial(String ma){
    this.material = ma;
    }
    //2
    public int getVentanas(){
    return ventanas;
    }
    public void setVentanas(int ve){
    this.ventanas = ve;
    }
    //3
    public int getVelas(){
    return velas;
    }
    public void setVelas(int ve){
    this.velas = ve;
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
    Flotar();
    Atacar();
    Explorar();
     System.out.println("EL MATERIAL DEL BARCO ES : " +getMaterial());
     System.out.println("EL NÚMERO DE VENTANAS DEL BARCO ES : " +getVentanas());
     System.out.println("EL NÚMERO DE VELAS DEL BARCO ES : " +getVelas());
    }
}

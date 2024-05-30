
package alvarez.santiago.herenciamenu;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M 
 */
public class Automovil extends Vehiculo {
    //3 ATRIBUTOS
    int cilindros;
    float precio;
    String clase; 
    //3 OPERACIONES
    public void Corre(){
    System.out.println ("EL AUTOMÓVIL PUEDE CORRER EN CARRERAS");
    }
    public void Salta(){    
    System.out.println ("EL AUTOMÓVIL PUEDE SALTAR AL ALCANZAR CIERTA VELOCIDAD");
    }
    public void Futuro(){    
    System.out.println ("EL AUTOMÓVIL PUEDE VIAJAR EN EL TIEMPO AL ALCANZAR 88MPH");    
    }
    //GETTER Y SETTER
    //1
    public int getCilindros(){
    return cilindros;
    }
    public void setCilindros(int ci){
    this.cilindros = ci;
    }
    //2
    public float getPrecio(){
    return precio;
    }
    public void setPrecio(float pr){
    this.precio = pr;
    }
    //3
    public String getClase(){
    return clase;
    }
    public void setClase(String cl){
    this.clase = cl;
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
    Corre();
    Salta();
    Futuro();
     System.out.println("EL NÚMERO DE CILINDROS ES : " +getCilindros());
     System.out.println("EL PRECIO DEL AUTOMÓVIL ES : " +getPrecio());
     System.out.println("LA CLASE DEL AUTOMÓVIL ES : " +getCilindros());
    }

  






}
    


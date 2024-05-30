
package alvarez.santiago.herencia;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M 
 */
public class Bici extends Vehiculo {
    //3 ATRIBUTOS
    int rodado;
    String cambios;
    String terreno; 
    //3 OPERACIONES
    public void Derrapar(){
    System.out.println ("LA BICICLETA PUEDE DERRAPAR");
    }
    public void Escaleras(){    
    System.out.println ("LA BICICLETA PUEDE BAJAR ESCALERAS");
    }
    public void Todoterreno(){    
    System.out.println ("HAY BICICLETAS PARA CUALQUIER TIPO DE TERRENO");    
    }
    //GETTER Y SETTER
    //1
    public int getRodado(){
    return rodado;
    }
    public void setRodado(int ro){
    this.rodado = ro;
    }
    //2
    public String getCambios(){
    return cambios;
    }
    public void setCambios(String ca){
    this.cambios = ca;
    }
    //3
    public String getTerreno(){
    return terreno;
    }
    public void setTerreno(String te){
    this.terreno = te;
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
    Derrapar();
    Escaleras();
    Todoterreno();
     System.out.println("EL RODADO DE LA BICI ES : " +getRodado());
     System.out.println("LA BICI TIENE CAMBIOS? : " +getCambios());
     System.out.println("EL TERRENO PENSADO PARA LA BICI ES : " +getTerreno());
    }
}

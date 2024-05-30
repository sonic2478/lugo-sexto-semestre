   
package alvarez.santiago.herencia;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M 
 */
public class Vehiculo {
    //5 ATRIBUTOS
    String marca;
    String submarca;
    int modelo; 
    String color;
    String tipo;
    //3 OPERACIONES
    public void Transporta(){
    System.out.println ("EL VEHÍCULO TRANSPORTA.");
    }
    public void Matar(){    
    System.out.println ("EL VEHÍCULO PUEDE MATAR.");
    }
    public void Imponer(){    
    System.out.println ("EL VEHÍCULO TE HACE VER IMPONENTE.");    
    }
    //GETTER Y SETTER
    //1
    public String getMarca(){
    return marca;
    }
    public void setMarca(String m){
    this.marca = m;
    }
    //2
    public String getSubmarca(){
    return submarca;
    }
    public void setSubmarca(String s){
    this.submarca = s;
    }
    //3
    public int getModelo(){
    return modelo;
    }
    public void setModelo(int o){
    this.modelo = o;
    }
    //4
    public String getColor(){
    return color;
    }
    public void setColor(String c){
    this.color = c;
    }
    //5
    public String getTipo(){
    return tipo;
    }
    public void setTipo(String t){
    this.tipo = t;
    }
    //IMPRIMIR
    public void Imprimir(){
    Transporta();
    Matar();
    Imponer();
    System.out.println("LA MARCA DEL VEHÍCULO ES: " +getMarca());
    System.out.println("LA SUBMARCA DEL VEHÍCULO ES: " +getSubmarca());
    System.out.println("EL MODELO DEL VEHÍCULO ES: " +getModelo());
    System.out.println("EL COLOR DEL VEHÍCULO ES: " +getColor());
    System.out.println("EL TIPO DE VEHÍCULO ES: " +getTipo());
    }
}










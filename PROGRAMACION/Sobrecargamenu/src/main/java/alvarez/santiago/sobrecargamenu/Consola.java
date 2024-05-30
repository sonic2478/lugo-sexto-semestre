
package alvarez.santiago.sobrecargamenu;

/**
 *
 * @author Santiago Alvarez Mares 6°A T/M
 */
public class Consola {
    //ATRIBUTOS
    final String color;
    final String resolucion;
    final String dimensiones;
    final float precio;
    final String marca;
    
    //OPERACIONES
    public void Corre (){
    System.out.println("LA  CONSOLA CORRE VIDEOJUEGOS");
    }
    public void Ver (){
    System.out.println("TAMBIÉN SIRVE PARA VER APLICACIONES DE STREAMING");
    }
    public void Usar (){
    System.out.println("INCLUSO SE PUEDE USAR COMO PC HASTA CIERTO PUNTO");
    }
    
    //CONSTRUCTOR
    //1
    public Consola (){
    this.color = "NEGRO";
    this.dimensiones = "32x18x7";
    this.marca = "XBOX";
    this.precio = 5500.00f;
    this.resolucion = "1440p";  
    }
    //2
    public Consola (String c){
    this.color = c;
    this.dimensiones = "32x18x7";
    this.marca = "XBOX";
    this.precio = 5500.00f;
    this.resolucion = "1440p";  
    }
    //3
    public Consola (String c, String d){
    this.color = c;
    this.dimensiones = d;
    this.marca = "XBOX";
    this.precio = 5500.00f;
    this.resolucion = "1440p";  
    }
    //4
    public Consola (String c, String d, String m){
    this.color = c;
    this.dimensiones = d;
    this.marca = m;
    this.precio = 5500.00f;
    this.resolucion = "1440p";  
    }
    //5
    public Consola (String c, String d, String m, float p){
    this.color = c;
    this.dimensiones = d;
    this.marca = m;
    this.precio = p;
    this.resolucion = "1440p";  
    }
    //6
    public Consola (String c, String d, String m, float p, String r){
    this.color = c;
    this.dimensiones = d;
    this.marca = m;
    this.precio = p;
    this.resolucion = r;  
    }
    
    //GETTER
    public String getColor(){
    return color;
    }
    public String getDimensiones (){
    return dimensiones;
    }
    public String getMarca (){
    return marca;
    }
    public float getPrecio (){
    return precio;
    }
    public String getResolucion (){
    return resolucion;
    }
    public void Imprimir(){
    Corre();
    Ver();
    Usar();
    System.out.println("EL COLOR DE LA CONSOLA ES: " +getColor()); 
    System.out.println("LAS DIMENSIONES DE LA CONSOLA SON (EN CM): " +getDimensiones());
    System.out.println("LA MARCA DE LA CONSOLA ES: " +getMarca());
    System.out.println("EL PRECIO DE LA CONSOLA ES (EN PESOS): " +getPrecio());
    System.out.println("LA RESOLUCIÓN DE LA CONSOLA ES: " +getResolucion());
    }
    










    
}

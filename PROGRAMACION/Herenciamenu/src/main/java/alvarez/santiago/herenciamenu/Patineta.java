
package alvarez.santiago.herenciamenu;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M
 */
public class Patineta extends Vehiculo{
    //3 ATRIBUTOS
    String tipo_rueda;
    String tabla;
    int ejes; 
    //3 OPERACIONES
    public void Romper(){
    System.out.println ("LA PATINETA TE PUEDE ROMPER LOS HUESOS");
    }
    public void Velocidad(){    
    System.out.println ("LA PATINETA PUEDE TOMAR MUCHA VELOCIDAD");
    }
    public void Trucos(){    
    System.out.println ("LA PATINETA PUEDE HACER TRUCOS");    
    }
    //GETTER Y SETTER
    //1
    public String getTipo_rueda(){
    return tipo_rueda;
    }
    public void setTipo_rueda(String tirue){
    this.tipo_rueda = tirue;
    }
    //2
    public String getTabla(){
    return tabla;
    }
    public void setTabla(String ta){
    this.tabla = ta;
    }
    //3
    public int getEjes(){
    return ejes;
    }
    public void setEjes(int ej){
    this.ejes = ej;
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
    Romper();
    Velocidad();
    Trucos();
     System.out.println("EL TIPO DE RUEDA DE LA PATINETA ES : " +getTipo_rueda());
     System.out.println("EL TIPO DE TABLA DE LA PATINETA ES : " +getTabla());
     System.out.println("EL NÚMERO DE EJES DE LA PATINETA ES : " +getEjes());
    }    
}

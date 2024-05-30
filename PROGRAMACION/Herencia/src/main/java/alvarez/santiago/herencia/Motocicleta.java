
package alvarez.santiago.herencia;

/**
 *
 * @author ALVAREZ MARES SANTIAGO 6°A T/M 
 */
public class Motocicleta extends Vehiculo {
//3 ATRIBUTOS
    int pasajeros;
    int gasolina;
    int compartimientos; 
    //3 OPERACIONES
    public void Caballito(){
    System.out.println ("LA MOTO PUEDE HACER CABALLITOS");
    }
    public void Pequeña(){    
    System.out.println ("LA MOTO CABE EN ESPACIOS QUE UN CARRO NO");
    }
    public void Lluvia(){    
    System.out.println ("LA MOTO NO TE CUBRIRÁ DE LA LLUVIA");    
    }
    //GETTER Y SETTER
    //1

    public int getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(int com) {
        this.compartimientos = com;
    }
    //2
    public int getGasolina() {
        return gasolina;
    }
    public void setGasolina(int gas) {
        this.gasolina = gas;
    }
    //3
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pas) {
        this.pasajeros = pas;
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
    Caballito();
    Pequeña();
    Lluvia();
     System.out.println("EL NÚMERO DE COMPARTIMIENTOS DE LA MOTO ES : " +getCompartimientos());
     System.out.println("LOS LITROS DE GASOLINA QUE LE CABEN A LA MOTO SON : " +getGasolina());
     System.out.println("EL NÚMERO DE PASAJEROS DE LA MOTO ES : " +getPasajeros());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transporte;

/**
 *
 * @author javier
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Transportes vehiculo = new Transportes("PGXL-89","Grande",
                                             "2000cc","Diesel");
        Transportes moto     = new Transportes("","","","");
        
        System.out.printf("Bienvenidos a los Siguientes transportes \n");
               
        //Declar Variables
        String patente = vehiculo.getPatente();
        String tamano = vehiculo.getTamano();
        String capacidad = vehiculo.getCapacidad();
        String combustible = vehiculo.getCombustible();
        
        System.out.println("La patente de Su Vehiculo es " + patente + 
        " De tamaño " + tamano + "\n Capacidad del Motor " + capacidad +
        " con tipo de combustible " + combustible      );
        
        //Pasar Datos a Objeto Moto.
        
        moto.setCapacidad("900cc");
        moto.setPatente("PTLG-90");
        moto.setCombustible("Bencina");
        moto.setTamano("Pequeño");
        //Ocupar Variables Declaras anteriormente 
        patente = moto.getPatente();
        tamano = moto.getTamano();
        capacidad = moto.getCapacidad();
        combustible = moto.getCombustible();
        
        System.out.println("La patente de Su Vehiculo es " + patente + 
        " De tamaño " + tamano + "\n Capacidad del Motor " + capacidad +
        " con tipo de combustible " + combustible      );         
        
    }
    
}

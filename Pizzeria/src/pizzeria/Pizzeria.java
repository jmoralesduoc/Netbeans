/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;

/**
 *
 * @author javie
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Mostar en consola text
        
        System.out.println("Bienvenido a la Pizzeria Pixar");
        
        Pizza pizza1 = new Pizza("peperoni","grande","gruesa");
        
        String nombre = pizza1.getNombre();
        
        System.out.println("Usted compro una Pizza del tipo: " + nombre );
        
        
    }
    
}

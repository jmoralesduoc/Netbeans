/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author javie
 */
public class Pizza {
    //Definición Atributos
    private String nombre, tamano , masa;
    
    //Definir los contructores sin parametros y con parametros Inicializar Clase


    public Pizza() {
    }

    public Pizza(String nombre, String tamano, String masa) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }

    //ademas los getters y los setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    
    
    
    
    //Creacion de metodos
    public void preparar(){
        System.out.println("Se esta preparando su orden de pizza");
    }
    
     public void calentar(){
        System.out.println("Se esta calentando su orden de Pizza");
    }
    
    
    
}

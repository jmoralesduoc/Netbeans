/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author javie
 */
public class Transportes {
    private String patente,tamano,capacidad,combustible;

    public Transportes() {
    }

    public Transportes(String patente, String tamano, String capacidad, String combustible) {
        this.patente = patente;
        this.tamano = tamano;
        this.capacidad = capacidad;
        this.combustible = combustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
       
    
    
    public void mover(){
        System.out.println("Se esta moviendo el transporte");
        
    }
    public void detener(){
        System.out.println("Se esta Detenido el transporte");
    }
}

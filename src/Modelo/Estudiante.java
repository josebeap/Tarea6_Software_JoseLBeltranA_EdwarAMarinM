/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JoseLBeltranA - EdwarAMarinM
 */
public class Estudiante {
    
    private String cedula;
    private String nombre;
    private int cantidadMaterias;

    /**
     * 
     * @param cedula
     * @param nombre
     * @param cantidadMaterias 
     */
    public Estudiante(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cantidadMaterias = 1;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the cantidadMaterias
     */
    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    /**
     * @param cantidadMaterias the cantidadMaterias to set
     */
    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }
    
    
}

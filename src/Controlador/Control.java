/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CargaArchivo;
import Modelo.Estudiante;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseLBeltranA - EdwarAMarinM
 */
public class Control {
    
    private ArrayList<Estudiante> estudiantes;
    private CargaArchivo archivo;
    
    /**
     * 
     * @param lista 
     */
    public void validarEstudiante(List lista){  
        
    }
    
    /**
     * 
     * @param cedula
     * @param nombre
     * @return 
     */
    public Estudiante crearEstudiante(String cedula, String nombre){
        return null;
    }
    
    /**
     * Metodo que recibe el archivo seleccionado y le extra las lineas
     * @param archivoAProcesar
     * @return listaDatos con los datos por linea del archivo
     * @throws IOException 
     */
    public List ingresarRutaArchivo(File archivoAProcesar) throws IOException{
        ArrayList<String> listaDatos = new ArrayList<String>();
        CargaArchivo controlArchivo = new CargaArchivo();

        listaDatos = controlArchivo.convertirArchivo(archivoAProcesar);
     
        return listaDatos;
    }
    
    /**
     * 
     * @param lista
     * @return 
     */
    public String resultadoFinal(List lista){
        return null;
    }
    
    /**
     * 
     * @param cedula
     * @return 
     */
    public boolean buscarEstudiante(String cedula){
        return false;
    }
    
    /**
     * 
     * @param estudiante 
     */
    public void aumentarCantidadMaterias(Estudiante estudiante){
        
    }
}

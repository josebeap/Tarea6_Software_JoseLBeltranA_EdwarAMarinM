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
import javax.swing.JOptionPane;

/**
 *
 * @author JoseLBeltranA - EdwarAMarinM
 */
public class Control {
    
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private CargaArchivo archivo;

    public Control() {
    }
    
    
    
    /**
     * 
     * @param lista 
     */
    public void validarEstudiante(ArrayList<String> lista){  
        int contador=0;
            for (String datos : lista) {
                contador++;
                String[] inscripcionDividida = datos.split(",");
                if (inscripcionDividida.length != 4) {
                    JOptionPane.showMessageDialog(null,"El registro en la línea "+ 
                            contador+" no cumple con "
                            + "la estructura necesaria");
                    continue;
                }
                if (this.buscarEstudiante(inscripcionDividida[0]) == false) {
                    Estudiante estudianteTemporal = 
                            this.crearEstudiante(inscripcionDividida[0],
                                    inscripcionDividida[1]);
                    this.estudiantes.add(estudianteTemporal);
                }
                
            }
        this.resultadoFinal();
    }
    
    /**
     * 
     * @param cedula
     * @param nombre
     * @return 
     */
    public Estudiante crearEstudiante(String cedula, String nombre){
        Estudiante estudiante = new Estudiante(cedula,nombre);
        return estudiante;
    }
    
    /**
     * Metodo que recibe el archivo seleccionado y le extra las lineas
     * @param archivoAProcesar
     * @return listaDatos con los datos por linea del archivo
     * @throws IOException 
     */
    public void ingresarRutaArchivo(File archivoAProcesar) throws IOException{
        ArrayList<String> listaDatos = new ArrayList<String>();
        CargaArchivo controlArchivo = new CargaArchivo();

        listaDatos = controlArchivo.convertirArchivo(archivoAProcesar);
        this.validarEstudiante(listaDatos);
    }
    
    /**
     * 
     * @param lista
     * @return 
     */
    public void resultadoFinal(){
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre()+"        " +estudiante.getCantidadMaterias()+
                    " materias");
        }
    }
    
    /**
     * 
     * @param cedula
     * @return 
     */
    public boolean buscarEstudiante(String cedula){
        if (estudiantes != null){
            for (Estudiante estudiante : estudiantes) {
                if(estudiante.getCedula().equals(cedula)){
                    this.aumentarCantidadMaterias(estudiante);
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * 
     * @param estudiante 
     */
    public void aumentarCantidadMaterias(Estudiante estudiante){
        estudiante.setCantidadMaterias(estudiante.getCantidadMaterias()+1);
    }
}

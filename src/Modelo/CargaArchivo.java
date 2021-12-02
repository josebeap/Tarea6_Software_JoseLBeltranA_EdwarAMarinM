/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JoseLBeltranA - EdwarAMarinM
 */
public class CargaArchivo {

    public CargaArchivo() {
    }
    
    /**
     * Recibe un archivo y extrae linea por linea
     *
     * @param archivoLeer es el archivo que sera procesado para extraer su información
     * @return Lista con cada linea del archivo de texto
     * @throws java.io.FileNotFoundException
     */
    public ArrayList<String> convertirArchivo(File archivoLeer)
            throws FileNotFoundException, IOException {
        
        
        ArrayList<String> datos = new ArrayList<>();

        File archivo = new File(archivoLeer.getPath());
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea;

        while ((linea = bufferedReader.readLine()) != null) {
            String[] palabrasLineaComas = linea.split("\n");
            for (String palabra : palabrasLineaComas) {
                datos.add(palabra);

            }
        }
        return datos;
    }
}

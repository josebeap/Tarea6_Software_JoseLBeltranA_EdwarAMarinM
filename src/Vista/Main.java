/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Control;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author JoseLBeltranA - EdwarAMarinM
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String rutaArchivo = "";
        Control control = new Control();
        
        long milisInicio = System.currentTimeMillis();

        
        JFileChooser chooser = new JFileChooser();

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        Component parent = null;
        int returnVal = chooser.showSaveDialog(parent);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            String nombreCarpeta = chooser.getSelectedFile().getParent();
            String nombreArchivo = chooser.getSelectedFile().getName();
            rutaArchivo = nombreCarpeta + "\\" + nombreArchivo;
            System.out.println(rutaArchivo);
        }
        
        File archivoAProcesar=new File(rutaArchivo);
        
        control.ingresarRutaArchivo(archivoAProcesar);
        
        long milisFinal = System.currentTimeMillis();
        System.out.println(milisFinal - milisInicio);

    }
    
}

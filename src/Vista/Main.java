/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author JoseLBeltranA - EdwarAMarinM
 */
public class Main {
    
    static String rutaArchivo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
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
        
        File archivoAConvertir=new File(rutaArchivo);
    }
    
}

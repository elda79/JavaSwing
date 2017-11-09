/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
// Paso 8 - IMPORTAR LA CLASE CON LA VENTANA
import VentanaSwing.VentanaSwing;//import paquete.clase
import javax.swing.JFrame;
/**
 *
 * @author LAB05
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Paso 9 - Llamado a la clase JFrame
        VentanaSwing ventana = new VentanaSwing(); // Creo un objeto tipo Window
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 600, 600);
        //La siguiente inst. le ppone titulo a la ventana
        ventana.setTitle("Mi primer interfaz grafica");
        //La siguiente sentencia es para finalizar el proyecto al cerrar
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

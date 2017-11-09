/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaSwing;
import javax.swing.*;//Importamos todo de swing
import java.awt.*;
/**
 *
 * @author LAB05
 */
//Heredar la clase desde JFrame
public class VentanaSwing extends JFrame
{
  //Paso 3 - DECLARAR LOS ELEMENTOS A UTILIZAR
 JPanel panel;
 JLabel label;
 JTextField text;
 JButton boton;
 JCheckBox ticket;
 JRadioButton seleccionar;
 
 //Paso 4 - DEFINIR EL CONSTRUCTOR
 public VentanaSwing()
 {
    // Paso 5 - CREAR E INICIALIZAR LOS OBJETOS O ELEMENTOS
     panel = new JPanel();//Creo un objeto tipo JPanel
     label = new JLabel();
     text = new JTextField(20);// 20 es la cantidad de caracteres
     boton = new JButton();
     ticket = new JCheckBox();
     seleccionar = new JRadioButton();
     
     //Paso 6 - AGREGAR LOS ELEMENTOS
     this.add(panel);//El this es para agregar el JPanel Al JFrame
     panel.add(label);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     panel.add(text);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     panel.add(boton);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     panel.add(ticket);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     panel.add(seleccionar);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
 }
}

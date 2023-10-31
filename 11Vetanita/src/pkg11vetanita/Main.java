/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11vetanita;

/**
 *
 * @author Amp_1
 */
//vamos a ver el uso de interfaces

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        ///para ocupar necesitamos primero un frame
        
        JFrame ventana =  new JFrame ("Hola mundo ");
        
        //hay que definir el tamano en px de largo y ancho
        ventana.setSize (370, 170);
        
        //hay que definir los botones de accion por defecto 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito donde incorporar los compoenttes 
        //los componentes son los botones , kos cuadro de textoo , etc
        
        JPanel panel = new JPanel();
        
        ventana.add(panel);
        
        //tengo que crear un metodo para ir cargando cada componete a ese panel 
        agregrarComponentes(panel);
        
        //tenemos que hacer visible la ventana por que si no se vera
        ventana.setVisible(true);
         // Centrar la ventana en la pantalla
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
ventana.setLocation(dim.width / 2 - ventana.getSize().width / 2, dim.height / 2 - ventana.getSize().height / 2);
                
    }

    private static void agregrarComponentes(JPanel panel) {
       //lo primero que tenemos que hacer es inicializar el panel 
       panel.setLayout(null);
       
       //vamos agregar componentes al panel
       //quiero una etiqueta
       JLabel userlabel = new JLabel ("Nombre de usuario");
       //ya que tenemos la etiqueta debemos definir sus propiedades
       //el tamano, la orientacion, el tipo de letra, largo , ancho, etc
       userlabel.setBounds(10, 10 ,120, 50 );
       
       // lo agregamos al panel
       panel.add(userlabel);
       
       //campo de texto 
       
       JTextField usertxt =  new JTextField(20);
       //defino sus propiedades 
       usertxt.setBounds(160, 20 , 160, 25);
       //lo agrego 
       panel.add(usertxt);
       
       //etiqueta de password
       JLabel userpass = new JLabel ("Password");
       userpass.setBounds(10, 40, 80, 50);
       panel.add(userpass);
       //agregamos campo password
       
       JPasswordField passtxt = new JPasswordField(20); //este es para convertir las letras en *
       passtxt.setBounds (160, 50, 160, 25);
      
       panel.add(passtxt);
       
      
       
       
       JButton loginbutton =  new JButton ("Iniciar sesion");
       loginbutton.setBounds(10, 80, 120, 25);
       panel.add(loginbutton);
       
       JButton registrarbutton = new JButton ("Registrate");
       registrarbutton.setBounds(180, 80, 120, 25);
       panel.add(registrarbutton);
      
loginbutton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usertxt.getText();
        char[] password = passtxt.getPassword(); 
        
        
        if (username.equals("ArturoMP") && new String(password).equals("987654321")) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario inválido");
        }
        
       
        usertxt.setText("");
        passtxt.setText("");
    }
    
});
   
        }    
}

 /* 
    tarea
    
    DEberan de integrar un metodo para qeu la ventana quede 
    exactamente en el centro cuando se ejecuta el programa
    
    el password no debe de ser visible aparecer  ***** 
    
    deberan crear un usuario ficticio con user  y password
    cuando se ingresen en los campos correspondientes y el usuario
    de clic en iniciar sesion, debera de enviar un mensaje que diga  
    "Bienvenido ", y si no es correcta la credencial que diva "USuario invalido" */
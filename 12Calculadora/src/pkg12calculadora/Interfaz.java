
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12calculadora;

/**
 *
 * @author Amp_1
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Interfaz extends JFrame implements ActionListener {

    //vamos armar la calculadora 
    
    //definimos los campos
    
    JTextField txtnum1;
    JTextField txtnum2;
    
    //defino mis botones
    
    JButton btnsuma;
    JButton btnresta;
    JButton btnproducto;
    JButton btndivision;
    
    //etiqueta 
    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostrarresultado;
    
    //creo mi panel donde voy a incorporar mis componentes 
    JPanel panel = (JPanel)this.getContentPane();
    //es el contenedor de mi interfaz
    
    //constructor
    public Interfaz(){
    //inicializo los elementos del frame o ventana
    setLayout (null);
    //localizacion
    
    setLocation(100,80);
    //propiedades como sin redimencionar
    setResizable(false);
    //defino anco y largo 
    setSize (600, 600);
    //opciones de salir
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   // creo el metodo para la carga de los componentes
      componentes();
    
    }
         private void componentes() {
        //empiezo con las definiciones
        panel.setLayout(null);
        
        //con la carga de etiqueta
        numero1 = new JLabel("Numero 1");
        numero1.setBounds(10,10,70,30); 
        panel.add(numero1);
        
          numero2 = new JLabel("Numero 2");
        numero2.setBounds(10,70,70,30); 
        panel.add(numero2);
        
          resultado = new JLabel("Resultado");
        resultado.setBounds(10,140,70,30); 
        panel.add(resultado);
        
          mostrarresultado = new JLabel();
        mostrarresultado.setBounds(100,140,70,30); 
        panel.add(mostrarresultado);
        
        //agrego los campos
        txtnum1 = new JTextField();
        txtnum1.setBounds(100,10,70,30);
        panel.add(txtnum1);
        
        txtnum2 = new JTextField();
        txtnum2.setBounds(100,70,70,30);
        panel.add(txtnum2);
        
        //agrego los botones
        btnsuma = new JButton ("+");
        btnsuma.setBounds(10,200,50,50);
        panel.add(btnsuma);
        //agregamos el listener
        btnsuma.addActionListener(new ActionListener(this) );
        
         btnresta = new JButton ("-");
        btnresta.setBounds(10,200,50,50);
        panel.add(btnresta);
        //agregamos el listener
        btnresta.addActionListener(new ActionListener(this));
         
        btnproducto = new JButton ("*");
        btnproducto.setBounds(10,270,50,50);
        panel.add(btnproducto);
        //agregamos el listener
        btnproducto.addActionListener(new ActionListener(this));
        
        btndivision = new JButton ("/");
        btndivision.setBounds(100,270,50,50);
        panel.add(btndivision);
        //agregamos el listener
        btndivision.addActionListener(new ActionListener(this));
    }
    @Override
    public void actionPerformed(ActionEvent event) {
    
    //tenemos que aprender cada operacion por boton
    //una instacia de operaciones
    
    Operaciones op = new Operaciones();
    
    if(event.getSource() == btnsuma){
        double num1 = Double.parseDouble(txtnum1.getText());
        op.setNum1(num1);
        double num2 = Double.parseDouble(txtnum2.getText());
        op.setNum1(num2);
        
        //mostrar resultado
        mostrarresultado.setText(String.valueOf(op.suma()));
        
    }
    }

 
    
    
    
}
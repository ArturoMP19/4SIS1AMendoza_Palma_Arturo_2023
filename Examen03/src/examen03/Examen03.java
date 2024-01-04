/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen03;

/**
 *
 * @author Amp_1
 */

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examen03 extends JFrame {

    public Examen03() {
        
        super("CAJERO DE OTSO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        
        JPanel panel = new JPanel(new BorderLayout());
        

        
        JButton boton1 = new JButton("Recarga");
        JButton boton2 = new JButton("Maquina de cafe");
        JButton boton3 = new JButton("Pago de servicios");
        JButton boton4 = new JButton("Transferencia");

        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String[] opcionesCompanias = {"Telcel", "Movistar", "AT&T", "Pillofon"};
                String companiaSeleccionada = (String) JOptionPane.showInputDialog(
                        Examen03.this,
                        "Seleccione la compañía de teléfono:",
                        "Selección de Compañía",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesCompanias,
                        opcionesCompanias[0]);

                if (companiaSeleccionada != null) {
                    String numero = JOptionPane.showInputDialog("Ingrese el número de teléfono:");
                    if (numero != null && !numero.isEmpty()) {
                        try {
                            
                            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la recarga:"));
                            
                            JOptionPane.showMessageDialog(
                                    Examen03.this,
                                    "Recarga exitosa para el número: " + numero + " con monto: " + monto +
                                            "\nCompañía seleccionada: " + companiaSeleccionada);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(
                                    Examen03.this,
                                    "Ingrese un monto válido.",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(
                                Examen03.this,
                                "Ingrese un número de teléfono válido.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String[] opcionesCafe = {"Café Americano", "Capuchino"};
                String cafeSeleccionado = (String) JOptionPane.showInputDialog(
                        Examen03.this,
                        "Seleccione el tipo de café:",
                        "Selección de Café",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesCafe,
                        opcionesCafe[0]);

                if (cafeSeleccionado != null) {
                   
                    String[] opcionesTamanio = {"Chico", "Mediano", "Grande"};
                    String tamanioSeleccionado = (String) JOptionPane.showInputDialog(
                            Examen03.this,
                            "Seleccione el tamaño del café:",
                            "Selección de Tamaño",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opcionesTamanio,
                            opcionesTamanio[0]);

                    if (tamanioSeleccionado != null) {
                        
                        double precioCafe = 0.0;
                        if (cafeSeleccionado.equals("Café Americano")) {
                            precioCafe = 25.0;
                        } else if (cafeSeleccionado.equals("Capuchino")) {
                            precioCafe = 27.0;
                        }

                        double precioTamanio = 0.0;
                        if (tamanioSeleccionado.equals("Chico")) {
                            precioTamanio = 0.5;
                        } else if (tamanioSeleccionado.equals("Mediano")) {
                            precioTamanio = 1.0;
                        } else if (tamanioSeleccionado.equals("Grande")) {
                            precioTamanio = 1.5;
                        }

                        
                        double precioTotal = precioCafe + precioTamanio;

                        
                        JOptionPane.showMessageDialog(
                                Examen03.this,
                                "Café seleccionado: " + cafeSeleccionado +
                                        "\nTamaño seleccionado: " + tamanioSeleccionado +
                                        "\nPrecio Total: $" + precioTotal);
                    }
                }
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String[] opcionesServicios = {"Agua", "Luz", "Internet"};
                String servicioSeleccionado = (String) JOptionPane.showInputDialog(
                        Examen03.this,
                        "Seleccione el servicio a pagar:",
                        "Selección de Servicio",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesServicios,
                        opcionesServicios[0]);

                if (servicioSeleccionado != null) {
                    String numeroReferencia = JOptionPane.showInputDialog("Ingrese el número de referencia:");

                    if (numeroReferencia != null && !numeroReferencia.isEmpty()) {
                        
                        double precioServicio = 0.0;
                        if (servicioSeleccionado.equals("Agua")) {
                            precioServicio = 200.0;
                        } else if (servicioSeleccionado.equals("Luz")) {
                            precioServicio = 350.0;
                        } else if (servicioSeleccionado.equals("Internet")) {
                            precioServicio = 600.0;
                        }

                      
                        int opcion = JOptionPane.showConfirmDialog(
                                Examen03.this,
                                "Pago de " + servicioSeleccionado + " realizado por $" + precioServicio +
                                        "\n¿Desea imprimir el comprobante de pago?",
                                "Imprimir Comprobante",
                                JOptionPane.YES_NO_OPTION);

                        if (opcion == JOptionPane.YES_OPTION) {
                            
                            JOptionPane.showMessageDialog(
                                    Examen03.this,
                                    "Comprobante de pago impreso.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(
                                Examen03.this,
                                "Ingrese un número de referencia válido.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    String numero = JOptionPane.showInputDialog("Ingrese el número de cuenta :");
                    if (numero != null && !numero.isEmpty()) {
                        try {
                            
                            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la transferencia"));
                            
                            JOptionPane.showMessageDialog(
                                    Examen03.this,
                                    "Transferencia exitosa: " + numero +"\n"+ " monto: " + monto + "$" );
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(
                                    Examen03.this,
                                    "Ingrese un monto válido.",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(
                                Examen03.this,
                                "Ingrese un número de teléfono válido.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            
        });
        
       

        panel.add(boton1, BorderLayout.PAGE_START);
        panel.add(boton2, BorderLayout.WEST);
        panel.add(boton3, BorderLayout.EAST);
        panel.add(boton4, BorderLayout.CENTER);

        
        add(panel);

       
        setVisible(true);
    }

   

   

    public static void main(String[] args) {
       
        Examen03 interfaz = new Examen03();
    }
}
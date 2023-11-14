/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amp_1
 */
public class Titan3 extends javax.swing.JFrame {

    
    public Titan3() {
        initComponents();
    }

   
     
    @SuppressWarnings("unchecked")
   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Principal P1 = new Principal();
        P1.setVisible(true);
        dispose();
    }

    
    public static void main(String args[]) {
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Titan3().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
   
    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
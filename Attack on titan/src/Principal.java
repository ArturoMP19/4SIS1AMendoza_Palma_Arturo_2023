/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Amp_1
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("TITANES");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 50));

        jButton2.setText("Titan Fundador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 40));

        jButton3.setText("Titan Ataque");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, 40));

        jButton4.setText("Titan Colosal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 130, 40));

        jButton5.setText("Titan Acorazado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 40));

        jButton6.setText("Titan Hembra");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, 40));

        jButton7.setText("Titan Bestia");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, 40));

        jButton8.setText("Titan Mandibula");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 40));

        jButton9.setText("Titan Carguero");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 120, 40));

        jButton10.setText("Titan Martillo");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 130, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan1 T1 = new Titan1();
        T1.setVisible(true);
        dispose();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan2 T2 = new Titan2();
        T2.setVisible(true);
        dispose();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan3 T3 = new Titan3();
        T3.setVisible(true);
        dispose();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan4 T4 = new Titan4();
        T4.setVisible(true);
        dispose();
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan5 T5 = new Titan5();
        T5.setVisible(true);
        dispose();
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan6 T6 = new Titan6();
        T6.setVisible(true);
        dispose();
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan7 T7 = new Titan7();
        T7.setVisible(true);
        dispose();
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan8 T8 = new Titan8();
        T8.setVisible(true);
        dispose();
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        Titan9 T9 = new Titan9();
        T9.setVisible(true);
        dispose();
    }
    
    public static void main(String args[]) {
      

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
   

    @Override
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

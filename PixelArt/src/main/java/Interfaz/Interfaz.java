/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Pixel.Pixel;
import Sprite.Sprite;
import java.awt.Color;
import java.awt.color.ColorSpace;
import javax.swing.JColorChooser;

/**
 *
 * @author samuelson
 */
public class Interfaz extends javax.swing.JFrame {
    Color color = (Color.black);
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        setBounds(100, 100, 730, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void crearLienzo(Sprite sprite){
        hoja.add(sprite);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        barraLateral = new javax.swing.JPanel();
        panelColor = new javax.swing.JPanel();
        colorElegido = new javax.swing.JPanel();
        hoja = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 600));
        setPreferredSize(new java.awt.Dimension(730, 600));

        base.setMinimumSize(new java.awt.Dimension(730, 600));
        base.setPreferredSize(new java.awt.Dimension(730, 600));
        base.setLayout(new java.awt.BorderLayout());

        barraLateral.setBackground(new java.awt.Color(204, 255, 255));
        barraLateral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraLateral.setPreferredSize(new java.awt.Dimension(130, 516));

        panelColor.setBackground(new java.awt.Color(204, 204, 255));
        panelColor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ELEGIR COLOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Chandas", 0, 12))); // NOI18N
        panelColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelColorMouseClicked(evt);
            }
        });
        panelColor.setLayout(new java.awt.GridLayout());

        colorElegido.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout colorElegidoLayout = new javax.swing.GroupLayout(colorElegido);
        colorElegido.setLayout(colorElegidoLayout);
        colorElegidoLayout.setHorizontalGroup(
            colorElegidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        colorElegidoLayout.setVerticalGroup(
            colorElegidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelColor.add(colorElegido);

        javax.swing.GroupLayout barraLateralLayout = new javax.swing.GroupLayout(barraLateral);
        barraLateral.setLayout(barraLateralLayout);
        barraLateralLayout.setHorizontalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraLateralLayout.setVerticalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLateralLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        base.add(barraLateral, java.awt.BorderLayout.LINE_START);

        hoja.setLayout(new java.awt.BorderLayout());
        base.add(hoja, java.awt.BorderLayout.CENTER);

        getContentPane().add(base, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelColorMouseClicked
        color = Color.BLACK;
        color = JColorChooser.showDialog(this, "Elija un color", color);
        if (color == null) {
            color = Color.black;
            colorElegido.setBackground(color);
        }
        colorElegido.setBackground(color);
        Pixel.setColor(color);
    }//GEN-LAST:event_panelColorMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraLateral;
    private javax.swing.JPanel base;
    private javax.swing.JPanel colorElegido;
    private javax.swing.JPanel hoja;
    private javax.swing.JPanel panelColor;
    // End of variables declaration//GEN-END:variables
}

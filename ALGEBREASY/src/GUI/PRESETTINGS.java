/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.GUI;

import java.awt.*;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;
/**
 *
 * @author David Müller
 */
public class PRESETTINGS extends javax.swing.JFrame {

    MAINGUI maingui;
    
    boolean aoAddition;
    boolean aoSubtraction;
    boolean aoMultiplication;
    boolean aoDivision;
    int bracketDepht;
    int Substitutions;
    int Digits;
    int decimalPlaces;
    boolean justPositive;
    boolean withFraction;
    
    /**
     * Creates new form PRESETTINGS
     */
    public PRESETTINGS(MAINGUI main) {
        initComponents();
        
        maingui = main;
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        classDropdown = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        partDropdown = new javax.swing.JComboBox();
        CancelButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();

        setTitle("Einstellungen - Automatisch");
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Voreinstellungen");

        jLabel2.setText("Jahrgangsstufe:");

        classDropdown.setMaximumRowCount(4);
        classDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1/2", "3/4", "5", "6" }));
        classDropdown.setSelectedIndex(2);
        classDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classDropdownActionPerformed(evt);
            }
        });

        jLabel3.setText("Abschnitt:");

        partDropdown.setMaximumRowCount(5);
        partDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Addition und Subtraktion natürlicher Zahlen", "Addition und Subtraktion ganzer Zahlen", "Multiplikation und Division natürlicher Zahlen", "Multiplikation und Division ganzer Zahlen", "Gesamt" }));

        CancelButton.setText("Abbrechen");
        CancelButton.setPreferredSize(new java.awt.Dimension(93, 23));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        generateButton.setText("OK");
        generateButton.setPreferredSize(new java.awt.Dimension(93, 23));
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(classDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(partDropdown, 0, 316, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(classDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(partDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        
        if(classDropdown.getSelectedIndex() == 0){
            if(partDropdown.getSelectedIndex() == 0){
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = false;
                aoDivision = false;
                bracketDepht = 0;
                Substitutions = 2;
                Digits = 2;
                decimalPlaces = 0;
                justPositive = true;
                withFraction = false;
            }
            else if(partDropdown.getSelectedIndex() == 1){
                aoAddition = false;
                aoSubtraction = false;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 0;
                Substitutions = 2;
                Digits = 2;
                decimalPlaces = 0;
                justPositive = true;
                withFraction = false;
            }
        }
        else if(classDropdown.getSelectedIndex() == 1){
            if(partDropdown.getSelectedIndex() == 0){
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = false;
                aoDivision = false;
                bracketDepht = 2;
                Substitutions = 2;
                Digits = 6;
                decimalPlaces = 0;
                justPositive = true;
                withFraction = false;
            }
            else if(partDropdown.getSelectedIndex() == 1){
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 3;
                Substitutions = 3;
                Digits = 7;
                decimalPlaces = 0;
                justPositive = true;
                withFraction = false;
            }
        }
        else if(classDropdown.getSelectedIndex() == 2){
            if(partDropdown.getSelectedIndex() == 0){
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = false;
                aoDivision = false;
                bracketDepht = 3;
                Substitutions = 3;
                Digits = 4;
                decimalPlaces = 0;
                justPositive = true;
                withFraction = false;
            }
            else if(partDropdown.getSelectedIndex() == 1){
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = false;
                aoDivision = false;
                bracketDepht = 3;
                Substitutions = 4;
                Digits = 5;
                decimalPlaces = 0;
                justPositive = false;
                withFraction = false;
            }
            else if(partDropdown.getSelectedIndex() == 2){
                aoAddition = false;
                aoSubtraction = false;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 2;
                Substitutions = 2;
                Digits = 3;
                decimalPlaces = 0;
                justPositive = true;
                withFraction = false;
            }
            else if(partDropdown.getSelectedIndex() == 3){
                aoAddition = false;
                aoSubtraction = false;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 3;
                Substitutions = 3;
                Digits = 4;
                decimalPlaces = 0;
                justPositive = false;
                withFraction = false;
            }
            else{
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 4;
                Substitutions = 5;
                Digits = 5;
                decimalPlaces = 0;
                justPositive = false;
                withFraction = false;
            }
        }
        else if(classDropdown.getSelectedIndex() == 3){
            if(partDropdown.getSelectedIndex() == 0){
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = false;
                aoDivision = false;
                bracketDepht = 3;
                Substitutions = 4;
                Digits = 4;
                decimalPlaces = round(Math.random() * 4);
                justPositive = true;
                withFraction = true;
            }
            else if(partDropdown.getSelectedIndex() == 1){
                aoAddition = false;
                aoSubtraction = false;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 3;
                Substitutions = 4;
                Digits = 4;
                decimalPlaces = round(Math.random() * 4);
                justPositive = true;
                withFraction = true;
            }
            else if(partDropdown.getSelectedIndex() == 2){
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 4;
                Substitutions = 5;
                Digits = 4;
                decimalPlaces = round(Math.random() * 4);
                justPositive = true;
                withFraction = true;
            }
            else{
                aoAddition = true;
                aoSubtraction = true;
                aoMultiplication = true;
                aoDivision = true;
                bracketDepht = 5;
                Substitutions = 5;
                Digits = 5;
                decimalPlaces = round(Math.random() * 4);
                justPositive = false;
                withFraction = true;
            }
        }
        generateTerm();
    }//GEN-LAST:event_generateButtonActionPerformed

    public void generateTerm(){
        this.setVisible(false);
        TERM term = new TERM(aoAddition, aoSubtraction, aoMultiplication, aoDivision, bracketDepht, Substitutions, Digits, decimalPlaces, justPositive);
        maingui.mode = 1;
        maingui.showTerm(term);
    }
    
    private void classDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classDropdownActionPerformed
        if(classDropdown.getSelectedIndex() == 0){
            partDropdown.setMaximumRowCount(2);
            partDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Das Einspluseins", "Das kleine Einmaleins" }));
        }
        else if(classDropdown.getSelectedIndex() == 1){
            partDropdown.setMaximumRowCount(2);
            partDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Strukturelle Darstellung von Zahlen + Formulierung von Zahlenbeziehungen", "Zahlenbereich bis zur Millionen" }));
        }
        else if(classDropdown.getSelectedIndex() == 2){
            partDropdown.setMaximumRowCount(4);
            partDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Addition und Subtraktion von nicht negativen Brüchen", "Multiplikation und Division von nicht negativen Brüchen", "Verbindung der Rechenarten", "Gesamt" }));
        }
        else if(classDropdown.getSelectedIndex() == 3){
            partDropdown.setMaximumRowCount(4);
            partDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Addition und Subtraktion von nicht negativen Brüchen", "Multiplikation und Division von nicht negativen Brüchen", "Verbindung der Rechenarten", "Gesamt" }));
        }
    }//GEN-LAST:event_classDropdownActionPerformed

    private int round(double d){
        double dAbs = Math.abs(d);
        int i = (int) dAbs;
        double result = dAbs - (double) i;
        if(result<0.5){
            return d<0 ? -i : i;            
        }else{
            return d<0 ? -(i+1) : i+1;          
        }
    }
    
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
            java.util.logging.Logger.getLogger(PRESETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRESETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRESETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRESETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PRESETTINGS(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox classDropdown;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox partDropdown;
    // End of variables declaration//GEN-END:variables
}

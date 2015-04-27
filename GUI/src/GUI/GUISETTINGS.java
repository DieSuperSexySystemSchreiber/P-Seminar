/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static java.lang.Math.pow;
import javax.swing.JOptionPane;

/**
 *
 * @author David Müller
 */
public class GUISETTINGS extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    boolean noFaults = true;
    
    public GUISETTINGS() {
        initComponents();
        operationError.setText("");
        bracketDephtError.setText("");
        substitutionsError.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        operanten = new javax.swing.JLabel();
        substitutionDropdown = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        digitsDropdown = new javax.swing.JComboBox();
        addCheckbox = new javax.swing.JCheckBox();
        positiveCheckbox = new javax.swing.JCheckBox();
        subtractCheckbox = new javax.swing.JCheckBox();
        fractionCheckbox = new javax.swing.JCheckBox();
        multiplyCheckbox = new javax.swing.JCheckBox();
        generateCancelButton = new javax.swing.JButton();
        divideCheckbox = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        bracketDephtDropdown = new javax.swing.JComboBox();
        generateButton = new javax.swing.JButton();
        bracketDephtError = new javax.swing.JLabel();
        substitutionsError = new javax.swing.JLabel();
        operationError = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lernplattform | Mathematik");
        setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Aufgabeneinstellungen");

        operanten.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        operanten.setText("Operantenanzahl:");

        substitutionDropdown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        substitutionDropdown.setMaximumRowCount(10);
        substitutionDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        substitutionDropdown.setToolTipText("");
        substitutionDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bracketDephtOrSubstitutionDropdownActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("maximale Stellen:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Rechenoperationen:");

        digitsDropdown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitsDropdown.setMaximumRowCount(5);
        digitsDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        digitsDropdown.setToolTipText("");

        addCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addCheckbox.setText("Plus ( + )");

        positiveCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        positiveCheckbox.setText("nur positive Zahlen");

        subtractCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subtractCheckbox.setText("Minus ( - )");

        fractionCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fractionCheckbox.setText("mit Brüchen");

        multiplyCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        multiplyCheckbox.setText("Mal ( * )");

        generateCancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        generateCancelButton.setText("Abbrechen");
        generateCancelButton.setToolTipText("");

        divideCheckbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        divideCheckbox.setText("Geteilt ( / )");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Klammertiefe:");

        bracketDephtDropdown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bracketDephtDropdown.setMaximumRowCount(10);
        bracketDephtDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        bracketDephtDropdown.setToolTipText("");
        bracketDephtDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bracketDephtOrSubstitutionDropdownActionPerformed(evt);
            }
        });

        generateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        generateButton.setText("OK");
        generateButton.setToolTipText("");
        generateButton.setMaximumSize(new java.awt.Dimension(93, 23));
        generateButton.setMinimumSize(new java.awt.Dimension(93, 23));
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        bracketDephtError.setForeground(new java.awt.Color(255, 0, 0));
        bracketDephtError.setText("bracketDephtError");

        substitutionsError.setForeground(new java.awt.Color(255, 0, 0));
        substitutionsError.setText("substitutionsError");

        operationError.setForeground(new java.awt.Color(255, 0, 0));
        operationError.setText("operationError");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(operanten)
                                .addGap(172, 172, 172))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(positiveCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fractionCheckbox))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(digitsDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bracketDephtDropdown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(substitutionDropdown, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bracketDephtError)
                                    .addComponent(substitutionsError))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(146, 146, 146))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multiplyCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divideCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subtractCheckbox)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generateCancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(operationError)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(multiplyCheckbox)
                    .addComponent(divideCheckbox)
                    .addComponent(addCheckbox)
                    .addComponent(subtractCheckbox))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operationError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(bracketDephtDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bracketDephtError))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operanten)
                            .addComponent(substitutionDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(substitutionsError))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(digitsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(positiveCheckbox)
                            .addComponent(fractionCheckbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateCancelButton)
                    .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bracketDephtOrSubstitutionDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bracketDephtOrSubstitutionDropdownActionPerformed
        int subs = Integer.parseInt(substitutionDropdown.getSelectedItem().toString());
        int brackets = Integer.parseInt(bracketDephtDropdown.getSelectedItem().toString());
        
        int minBrackets = (int) Math.ceil(Math.log(subs) / Math.log(2) + 1);
        int maxBrackets = subs;
        
        int minSubs = brackets;
        int maxSubs = (int) pow(2, brackets - 1);
        
        if(brackets < minBrackets || subs > maxSubs){
            bracketDephtError.setText("Mindestklammertiefe: " + minBrackets);
            substitutionsError.setText("Maximaloperanten: " + maxSubs);
            noFaults = false;
        }
        else if(brackets > maxBrackets || subs < minSubs){
            bracketDephtError.setText("Maximalklammertiefe: " + maxBrackets);
            substitutionsError.setText("Mindestoperanten: " + minSubs);
            noFaults = false;
        }
        else{
            bracketDephtError.setText("");
            substitutionsError.setText("");
            noFaults = true;
        }
    }//GEN-LAST:event_bracketDephtOrSubstitutionDropdownActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        boolean aoAddition = addCheckbox.isSelected();
        boolean aoSubtraction = subtractCheckbox.isSelected();
        boolean aoMultiplication = multiplyCheckbox.isSelected();
        boolean aoDivision = divideCheckbox.isSelected();
        int bracketDepht = bracketDephtDropdown.getSelectedIndex() + 1;
        int Substitutions = substitutionDropdown.getSelectedIndex() + 1;
        int Digits = digitsDropdown.getSelectedIndex() + 1;
        boolean justPositive = positiveCheckbox.isSelected();
        boolean withFraction = fractionCheckbox.isSelected();
        
        if(!aoAddition && !aoSubtraction && !aoMultiplication && !aoDivision){
            operationError.setText("Keine Rechenoperation(en) ausgewählt!");
        }
        else{
            operationError.setText("");
            if(noFaults){
                this.setVisible(false);
                //class.generiereTerm(aoAddition, aoSubtraction, aoMultiplication, aoDivision, bracketDepht, Substitutions, Digits, justPositive, withFraction)
            }
        }
    }//GEN-LAST:event_generateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUISETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISETTINGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISETTINGS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addCheckbox;
    private javax.swing.JComboBox bracketDephtDropdown;
    private javax.swing.JLabel bracketDephtError;
    private javax.swing.JComboBox digitsDropdown;
    private javax.swing.JCheckBox divideCheckbox;
    private javax.swing.JCheckBox fractionCheckbox;
    private javax.swing.JButton generateButton;
    private javax.swing.JButton generateCancelButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox multiplyCheckbox;
    private javax.swing.JLabel operanten;
    private javax.swing.JLabel operationError;
    private javax.swing.JCheckBox positiveCheckbox;
    private javax.swing.JComboBox substitutionDropdown;
    private javax.swing.JLabel substitutionsError;
    private javax.swing.JCheckBox subtractCheckbox;
    // End of variables declaration//GEN-END:variables
}

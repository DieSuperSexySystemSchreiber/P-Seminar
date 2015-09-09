/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author David Müller
 */
public class MAINGUI extends javax.swing.JFrame {

    /**
     * Creates new form GUIFINAL
     */
    
    GUISETTINGS manuelSettings;
    GUISETTINGSPDF pdfSettings;
    PRESETTINGS preSettings;
    int taskNum = 0;
    
    //PDF pdfGenerator;
    
    public MAINGUI() {
        initComponents();
        
        //JFrame layout
        this.setLayout(null);

        //JPanel layout
        buttonMathTrainingPresettingsStart.setLayout(null);
        buttonMathTrainingManuelStart.setLayout(null);
        buttonWorksheetStart.setLayout(null);

        // postioning
        buttonMathTrainingPresettingsStart.setLocation(this.getWidth() / 2 - buttonMathTrainingPresettingsStart.getWidth() / 2, this.getHeight() / 2 - 200);
        buttonMathTrainingManuelStart.setLocation(this.getWidth() / 2 - buttonMathTrainingManuelStart.getWidth() / 2, this.getHeight() / 2 - 100);
        buttonWorksheetStart.setLocation(this.getWidth() / 2 - buttonWorksheetStart.getWidth() / 2, this.getHeight() / 2 + 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonMathTrainingPresettingsStart = new javax.swing.JButton();
        buttonMathTrainingManuelStart = new javax.swing.JButton();
        buttonWorksheetStart = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        buttonMathTrainingPresettings = new javax.swing.JMenuItem();
        buttonMathTrainingManuel = new javax.swing.JMenuItem();
        buttonWorksheet = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lernplattform Mathematik");
        setExtendedState(6);
        setName("Lernplattform Mathematik"); // NOI18N

        buttonMathTrainingPresettingsStart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonMathTrainingPresettingsStart.setText("Eigene Übung");
        buttonMathTrainingPresettingsStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMathTrainingPresettingsStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMathTrainingManuelActionPerformed(evt);
            }
        });

        buttonMathTrainingManuelStart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonMathTrainingManuelStart.setText("Übung mit Voreinstellungen");
        buttonMathTrainingManuelStart.setToolTipText("");
        buttonMathTrainingManuelStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMathTrainingManuelStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMathTrainingPresettingsActionPerformed(evt);
            }
        });

        buttonWorksheetStart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonWorksheetStart.setText("Arbeitsblatt erstellen");
        buttonWorksheetStart.setToolTipText("");
        buttonWorksheetStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonWorksheetStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWorksheetActionPerformed(evt);
            }
        });

        jMenu1.setText("Datei");
        jMenu1.setToolTipText("");

        jMenu3.setText("Neu");

        jMenu7.setText("Direktübung");

        buttonMathTrainingPresettings.setText("Voreinstellungen");
        buttonMathTrainingPresettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMathTrainingPresettingsActionPerformed(evt);
            }
        });
        jMenu7.add(buttonMathTrainingPresettings);

        buttonMathTrainingManuel.setText("Manuelle Einstellung");
        buttonMathTrainingManuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMathTrainingManuelActionPerformed(evt);
            }
        });
        jMenu7.add(buttonMathTrainingManuel);

        jMenu3.add(jMenu7);

        buttonWorksheet.setText("Arbeitsblatt");
        buttonWorksheet.setToolTipText("");
        buttonWorksheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWorksheetActionPerformed(evt);
            }
        });
        jMenu3.add(buttonWorksheet);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Beenden");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Einstellungen");

        jMenuItem3.setText("Standartwerte");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(255, 0, 0));
        jMenu6.setText("Hilfe");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonMathTrainingManuelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMathTrainingPresettingsStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonWorksheetStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(buttonMathTrainingPresettingsStart)
                .addGap(72, 72, 72)
                .addComponent(buttonMathTrainingManuelStart)
                .addGap(72, 72, 72)
                .addComponent(buttonWorksheetStart)
                .addContainerGap(642, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonWorksheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWorksheetActionPerformed
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        pdfSettings = new GUISETTINGSPDF(this, null, 1,"Aufgabenblatt vom " + ft.format(date));
        taskNum = 0;
        
        pdfSettings.setVisible(true);
    }//GEN-LAST:event_buttonWorksheetActionPerformed

    private void buttonMathTrainingManuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMathTrainingManuelActionPerformed
        if(manuelSettings == null){
            manuelSettings = new GUISETTINGS(this);
        }
        
        manuelSettings.setVisible(true);
    }//GEN-LAST:event_buttonMathTrainingManuelActionPerformed

    public void showTerm(TERM term){
        System.out.println("Term: "+term.infix());
        GUI3 gui3 = new GUI3(term);
        gui3.setVisible(true);
    }
    
    public GUISETTINGSPDF[] getParameters(GUISETTINGSPDF start, int max){
        GUISETTINGSPDF[] parList = new GUISETTINGSPDF[max];
        GUISETTINGSPDF currSettings = start;
        
        for(int n = max-1; n >= 0; n--){
            parList[n] = currSettings;
            currSettings = currSettings.previous;
        }
        
        return parList;
    }
    
    public void createPDF(GUISETTINGSPDF erster, String headline, int num){
        PDFGEN pdfGenerator = new PDFGEN();
        pdfGenerator.PDFAB(headline, num, erster, false);
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buttonMathTrainingPresettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMathTrainingPresettingsActionPerformed
        preSettings = new PRESETTINGS(this);
        preSettings.setVisible(true);
    }//GEN-LAST:event_buttonMathTrainingPresettingsActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        GUICONFIG config = new GUICONFIG();
        config.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(MAINGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAINGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAINGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAINGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MAINGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem buttonMathTrainingManuel;
    private javax.swing.JButton buttonMathTrainingManuelStart;
    private javax.swing.JMenuItem buttonMathTrainingPresettings;
    private javax.swing.JButton buttonMathTrainingPresettingsStart;
    private javax.swing.JMenuItem buttonWorksheet;
    private javax.swing.JButton buttonWorksheetStart;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
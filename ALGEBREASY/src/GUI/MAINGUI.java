/*
Copyright (C) <2015>  <name of author>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package src.GUI;

import java.awt.*;
import java.awt.Dimension;
import static java.awt.SystemColor.desktop;
import java.awt.Toolkit;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import static java.nio.file.FileVisitOption.*;

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
    GUISTANDARTS standartSettings;
    int taskNum = 0;
    String solution01;
    int mode = 0;
    JPictureBox logo;
    
    Color background = new Color(0,80,50);
    
    //PDF pdfGenerator;
    
    public MAINGUI() {
        initComponents();
        
        
//        JFrame hwnd;
        
//        hwnd=new JFrame();
        
        int imgSize = 200;
        try{
            panelImage.add(new JPictureBox("Logo_PSeminar_Algebreasy_V01.jpg",imgSize,imgSize,true));
        }
        catch(Exception e){
        }
        panelImage.setSize(imgSize,imgSize);
//        panelImage.setLocation(this.getWidth() / 2 - panelImage.getWidth() / 2, this.getHeight() / 2 - 530);
        panelImage.setLocation(this.getWidth() - panelImage.getWidth() - 40, 20);
        panelImage.setVisible(true);
        
        
//        logo = new JPictureBox("/Logo_PSeminar_Algebreasy_V01.png",200,200,true);
//        logo.setLocation(this.getWidth() / 2 - logo.getWidth() / 2, this.getHeight() / 2 - 400);
//        logo.setVisible(true);
        
        //JFrame layout
        this.setLayout(null);
        this.getContentPane().setBackground(background);

        //JPanel layout
        buttonMathTrainingPresettingsStart.setLayout(null);
        buttonMathTrainingManuelStart.setLayout(null);
        buttonWorksheetStart.setLayout(null);
        buttonExit.setLayout(null);
        buttonMainMenu.setLayout(null);

        // postioning
        buttonMathTrainingPresettingsStart.setLocation(this.getWidth() / 2 - buttonMathTrainingPresettingsStart.getWidth() / 2, this.getHeight() / 2 - 200);
        buttonMathTrainingManuelStart.setLocation(this.getWidth() / 2 - buttonMathTrainingManuelStart.getWidth() / 2, this.getHeight() / 2 - 100);
        buttonWorksheetStart.setLocation(this.getWidth() / 2 - buttonWorksheetStart.getWidth() / 2, this.getHeight() / 2 + 0);
        buttonExit.setLocation(this.getWidth() / 2 - buttonExit.getWidth() / 2, this.getHeight() / 2 + 150);
        buttonMainMenu.setLocation(this.getWidth() / 2 - buttonMainMenu.getWidth() / 2, this.getHeight() / 2 + 150);
        
        buttonMainMenu.setVisible(false);
        
        panel01.setLayout(null);
        panel01.setLocation(this.getWidth() / 2 - panel01.getWidth() / 2, this.getHeight() / 2 - panel01.getHeight() / 2 - 100);
        panel01.setVisible(false);
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
        jMenuItem4 = new javax.swing.JMenuItem();
        buttonMathTrainingPresettingsStart = new javax.swing.JButton();
        buttonMathTrainingManuelStart = new javax.swing.JButton();
        buttonWorksheetStart = new javax.swing.JButton();
        panel01 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfieldTask01 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textfieldSolution01 = new javax.swing.JTextField();
        buttonCheck01 = new javax.swing.JButton();
        buttonSolution01 = new javax.swing.JButton();
        buttonNewTask = new javax.swing.JButton();
        buttonMainMenu = new javax.swing.JButton();
        panelImage = new javax.swing.JPanel();
        buttonExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        buttonMathTrainingPresettings = new javax.swing.JMenuItem();
        buttonMathTrainingManuel = new javax.swing.JMenuItem();
        buttonWorksheet = new javax.swing.JMenuItem();
        buttonClear = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        buttonStandarts = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        buttonManual = new javax.swing.JMenuItem();
        buttonReadme = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lernplattform Mathematik");
        setBackground(new java.awt.Color(0, 102, 100));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setName("Lernplattform Mathematik"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        buttonMathTrainingPresettingsStart.setBackground(new java.awt.Color(255, 153, 0));
        buttonMathTrainingPresettingsStart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonMathTrainingPresettingsStart.setText("Eigene Übung");
        buttonMathTrainingPresettingsStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMathTrainingPresettingsStart.setMaximumSize(new java.awt.Dimension(297, 67));
        buttonMathTrainingPresettingsStart.setMinimumSize(new java.awt.Dimension(297, 67));
        buttonMathTrainingPresettingsStart.setPreferredSize(new java.awt.Dimension(297, 67));
        buttonMathTrainingPresettingsStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMathTrainingManuelActionPerformed(evt);
            }
        });

        buttonMathTrainingManuelStart.setBackground(new java.awt.Color(255, 153, 0));
        buttonMathTrainingManuelStart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonMathTrainingManuelStart.setText("Übung nach Lehrplan");
        buttonMathTrainingManuelStart.setToolTipText("");
        buttonMathTrainingManuelStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMathTrainingManuelStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMathTrainingPresettingsActionPerformed(evt);
            }
        });

        buttonWorksheetStart.setBackground(new java.awt.Color(255, 153, 0));
        buttonWorksheetStart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonWorksheetStart.setText("Arbeitsblatt erstellen");
        buttonWorksheetStart.setToolTipText("");
        buttonWorksheetStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonWorksheetStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWorksheetActionPerformed(evt);
            }
        });

        panel01.setBackground(new java.awt.Color(255, 153, 0));
        panel01.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Berechne:");

        textfieldTask01.setEditable(false);
        textfieldTask01.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textfieldTask01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfieldTask01.setText("[Aufgabe]");
        textfieldTask01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldTask01ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("=");

        textfieldSolution01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textfieldSolution01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textfieldSolution01.setToolTipText("Hier Lösung eintragen");
        textfieldSolution01.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldSolution01FocusGained(evt);
            }
        });
        textfieldSolution01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheck01ActionPerformed(evt);
            }
        });

        buttonCheck01.setBackground(new java.awt.Color(0, 153, 102));
        buttonCheck01.setForeground(new java.awt.Color(255, 255, 255));
        buttonCheck01.setText("Prüfen");
        buttonCheck01.setToolTipText("Prüfe dein Ergebnis");
        buttonCheck01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheck01ActionPerformed(evt);
            }
        });

        buttonSolution01.setBackground(new java.awt.Color(0, 153, 102));
        buttonSolution01.setForeground(new java.awt.Color(255, 255, 255));
        buttonSolution01.setText("Ergebnis");
        buttonSolution01.setToolTipText("Richtiges Ergebnis anzeigen");
        buttonSolution01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSolution01ActionPerformed(evt);
            }
        });

        buttonNewTask.setBackground(new java.awt.Color(0, 153, 102));
        buttonNewTask.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonNewTask.setForeground(new java.awt.Color(255, 255, 255));
        buttonNewTask.setText("Neue Aufgabe");
        buttonNewTask.setToolTipText("Generiert neue Aufgabe mit den gleichen Einstellungen");
        buttonNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel01Layout = new javax.swing.GroupLayout(panel01);
        panel01.setLayout(panel01Layout);
        panel01Layout.setHorizontalGroup(
            panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfieldTask01)
                    .addGroup(panel01Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel01Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfieldSolution01, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonNewTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel01Layout.createSequentialGroup()
                                .addComponent(buttonCheck01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSolution01)))))
                .addContainerGap())
        );
        panel01Layout.setVerticalGroup(
            panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldTask01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel01Layout.createSequentialGroup()
                        .addGroup(panel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel01Layout.createSequentialGroup()
                                .addGap(0, 33, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(buttonCheck01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSolution01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNewTask))
                    .addComponent(textfieldSolution01))
                .addContainerGap())
        );

        buttonMainMenu.setBackground(new java.awt.Color(0, 153, 102));
        buttonMainMenu.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonMainMenu.setText("Hauptmenü");
        buttonMainMenu.setToolTipText("");
        buttonMainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformedOrbuttonMainMenubuttonWorksheetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImageLayout = new javax.swing.GroupLayout(panelImage);
        panelImage.setLayout(panelImageLayout);
        panelImageLayout.setHorizontalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImageLayout.setVerticalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        buttonExit.setBackground(new java.awt.Color(0, 153, 102));
        buttonExit.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        buttonExit.setText("Beenden");
        buttonExit.setToolTipText("");
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(0, 50, 10));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
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

        buttonClear.setText("Hauptmenü");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformedOrbuttonMainMenubuttonWorksheetActionPerformed(evt);
            }
        });
        jMenu1.add(buttonClear);
        jMenu1.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Beenden");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Einstellungen");

        buttonStandarts.setText("Standartwerte");
        buttonStandarts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStandartsActionPerformed(evt);
            }
        });
        jMenu5.add(buttonStandarts);

        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Hilfe");

        buttonManual.setText("Handbuch");
        buttonManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManualActionPerformed(evt);
            }
        });
        jMenu6.add(buttonManual);

        buttonReadme.setText("Readme");
        buttonReadme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReadmeActionPerformed(evt);
            }
        });
        jMenu6.add(buttonReadme);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        buttonMathTrainingPresettingsStart.setLayout(new GridBagLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonMathTrainingPresettingsStart, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonMathTrainingManuelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonWorksheetStart, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(641, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(buttonMathTrainingPresettingsStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(buttonMathTrainingManuelStart)
                        .addGap(72, 72, 72)
                        .addComponent(buttonWorksheetStart)
                        .addGap(72, 72, 72)
                        .addComponent(buttonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonMainMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonWorksheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWorksheetActionPerformed
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        pdfSettings = new GUISETTINGSPDF(this, null, 1,"Aufgabenblatt vom " + ft.format(date));
        taskNum = 0;
        
        pdfSettings.getParas();
        pdfSettings.setVisible(true);
    }//GEN-LAST:event_buttonWorksheetActionPerformed

    private void buttonMathTrainingManuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMathTrainingManuelActionPerformed
        if(manuelSettings == null){
            manuelSettings = new GUISETTINGS(this);
        }
        
        manuelSettings.getParas();
        manuelSettings.setVisible(true);
    }//GEN-LAST:event_buttonMathTrainingManuelActionPerformed

    public void showTerm(TERM term){
        buttonMathTrainingPresettingsStart.setVisible(false);
        buttonMathTrainingManuelStart.setVisible(false);
        buttonWorksheetStart.setVisible(false);
        buttonExit.setVisible(false);
        buttonMainMenu.setVisible(true);
        
        System.out.println("Term: "+term.infix());
        //GUI3 gui3 = new GUI3(term);
        //gui3.setVisible(true);
        textfieldTask01.setText(term.infix());
        panel01.setVisible(true);
        solution01 = term.getSolution();
        textfieldSolution01.setText("");
        textfieldSolution01.setBackground(Color.white);
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
        pdfGenerator.PDFAB(headline, num, erster);
    }
    
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void buttonMathTrainingPresettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMathTrainingPresettingsActionPerformed
        preSettings = new PRESETTINGS(this);
        preSettings.setVisible(true);
    }//GEN-LAST:event_buttonMathTrainingPresettingsActionPerformed

    private void buttonStandartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStandartsActionPerformed
        if(standartSettings == null){
            standartSettings = new GUISTANDARTS(this);
        }
        
        standartSettings.getParas();
        standartSettings.setVisible(true);
    }//GEN-LAST:event_buttonStandartsActionPerformed

    private void textfieldTask01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldTask01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldTask01ActionPerformed

    private void buttonSolution01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSolution01ActionPerformed
        textfieldSolution01.setText(solution01);
    }//GEN-LAST:event_buttonSolution01ActionPerformed

    private void buttonCheck01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheck01ActionPerformed
        if(Double.parseDouble(solution01) == Double.parseDouble(textfieldSolution01.getText())){
            textfieldSolution01.setForeground(Color.green);
        }
        else{
            textfieldSolution01.setForeground(Color.red);
        }
    }//GEN-LAST:event_buttonCheck01ActionPerformed

    private void textfieldSolution01FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldSolution01FocusGained
        textfieldSolution01.setForeground(Color.black);
    }//GEN-LAST:event_textfieldSolution01FocusGained

    private void buttonNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewTaskActionPerformed
        textfieldSolution01.setForeground(Color.black);
        if(mode == 0){
            manuelSettings.generateTerm();
        }
        else if(mode == 1){
            preSettings.generateTerm();
        }
    }//GEN-LAST:event_buttonNewTaskActionPerformed

    private void buttonReadmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReadmeActionPerformed
        try{
            //new ProcessBuilder( "cmd", "/c", "README_DE.doc" ).start();
            File file = new File("README_DE.doc");
            if(file.exists()){
                Desktop.getDesktop().open(file);
            }
        }
        catch (Exception exp){
            System.out.println("Die Datei konnte nicht geöffnet werden.");
        }
        
        try{
            //new ProcessBuilder( "cmd", "/c", "READMEtest.txt" ).start();
            File file = new File("READMEtest.txt");
            if(file.exists()){
                Desktop.getDesktop().open(file);
            }
        }
        catch (Exception exp){
            System.out.println("Die Datei konnte nicht geöffnet werden.");
        }
        
        try{
            //new ProcessBuilder( "cmd", "/c", "README_DE.txt" ).start();
            File file = new File("README_DE.txt");
            if(file.exists()){
                Desktop.getDesktop().open(file);
            }
        }
        catch (Exception exp){
            System.out.println("Die Datei konnte nicht geöffnet werden.");
        }
    }//GEN-LAST:event_buttonReadmeActionPerformed

    private void buttonManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManualActionPerformed
        try{
            //new ProcessBuilder( "cmd", "/c", "Bedienungsanleitung.pdf" ).start();
            File file = new File("Bedienungsanleitung.pdf");
            if(file.exists()){
                Desktop.getDesktop().open(file);
            }
        }
        catch (Exception exp){
            System.out.println("Die Datei konnte nicht geöffnet werden.");
        }
    }//GEN-LAST:event_buttonManualActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        buttonMathTrainingPresettingsStart.setLocation(this.getWidth() / 2 - buttonMathTrainingPresettingsStart.getWidth() / 2, this.getHeight() / 2 - 200);
        buttonMathTrainingManuelStart.setLocation(this.getWidth() / 2 - buttonMathTrainingManuelStart.getWidth() / 2, this.getHeight() / 2 - 100);
        buttonWorksheetStart.setLocation(this.getWidth() / 2 - buttonWorksheetStart.getWidth() / 2, this.getHeight() / 2 + 0);
        buttonExit.setLocation(this.getWidth() / 2 - buttonExit.getWidth() / 2, this.getHeight() / 2 + 150);
        buttonMainMenu.setLocation(this.getWidth() / 2 - buttonMainMenu.getWidth() / 2, this.getHeight() / 2 + 150);
        panel01.setLocation(this.getWidth() / 2 - panel01.getWidth() / 2, this.getHeight() / 2 - panel01.getHeight() / 2 - 100);
        panelImage.setLocation(this.getWidth() - panelImage.getWidth() - 40, 20);
    }//GEN-LAST:event_formComponentResized

    private void buttonClearActionPerformedOrbuttonMainMenubuttonWorksheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformedOrbuttonMainMenubuttonWorksheetActionPerformed
        textfieldSolution01.setText("");
        textfieldSolution01.setBackground(Color.white);
        panel01.setVisible(false);
        
        buttonMathTrainingPresettingsStart.setVisible(true);
        buttonMathTrainingManuelStart.setVisible(true);
        buttonWorksheetStart.setVisible(true);
        buttonExit.setVisible(true);
        buttonMainMenu.setVisible(false);
    }//GEN-LAST:event_buttonClearActionPerformedOrbuttonMainMenubuttonWorksheetActionPerformed

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
    private javax.swing.JButton buttonCheck01;
    private javax.swing.JMenuItem buttonClear;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMainMenu;
    private javax.swing.JMenuItem buttonManual;
    private javax.swing.JMenuItem buttonMathTrainingManuel;
    private javax.swing.JButton buttonMathTrainingManuelStart;
    private javax.swing.JMenuItem buttonMathTrainingPresettings;
    private javax.swing.JButton buttonMathTrainingPresettingsStart;
    private javax.swing.JButton buttonNewTask;
    private javax.swing.JMenuItem buttonReadme;
    private javax.swing.JButton buttonSolution01;
    private javax.swing.JMenuItem buttonStandarts;
    private javax.swing.JMenuItem buttonWorksheet;
    private javax.swing.JButton buttonWorksheetStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel panel01;
    private javax.swing.JPanel panelImage;
    private javax.swing.JTextField textfieldSolution01;
    private javax.swing.JTextField textfieldTask01;
    // End of variables declaration//GEN-END:variables
}

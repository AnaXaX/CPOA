
package festival.vue;

import festival.dao.oracle.OracleDataSourceDAO;
import festival.dao.oracle.OraclePlanningDAO;
import festival.daoo.IPlanning;
import festival.metier.Planning;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ListModel;


public class FenetreFestival extends javax.swing.JFrame {

        private static List<Planning> listePlanning;
        private static IPlanning planningDAO;
        private static DataSource dataSourceDAO;
        private static Vector listeNomPlanning = new Vector();
        private final CreationPlanning fenetrePlanning = new CreationPlanning();
        private final AjoutProjection fenetreProjection = new AjoutProjection();
    
    public FenetreFestival() {
        int i;
        initComponents();
        placerLogo();
         try {
                dataSourceDAO=OracleDataSourceDAO.getOracleDataSource();
            } 
         catch (Exception ex) {
                System.out.println("probleme de merde");
            } 
        planningDAO=new OraclePlanningDAO();
        planningDAO.setDataSource(dataSourceDAO);
        listePlanning=planningDAO.getObjetsPlanning();
        planningDAO.afficheNomPlanning();
        //for(i=0;i<listePlanning.size();i++) listeNomPlanning.add(listePlanning.get(i).getNomPlanning());
        
        System.out.println(listeNomPlanning.get(1));
        //affichagePlanningList.setModel((ListModel) listeNomPlanning);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        planningTable = new javax.swing.JTable();
        nomPlanningLabel = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        choixPlanningLabel = new javax.swing.JLabel();
        createPlanningButton = new javax.swing.JButton();
        suppPlanningButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        affichagePlanningList = new javax.swing.JList();
        labelLogo = new javax.swing.JLabel();
        addProjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planning de projection Cannes - Consulter une projection");
        setPreferredSize(new java.awt.Dimension(755, 421));
        setResizable(false);

        planningTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Jour", "Salle", "Planning"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(planningTable);
        if (planningTable.getColumnModel().getColumnCount() > 0) {
            planningTable.getColumnModel().getColumn(0).setResizable(false);
            planningTable.getColumnModel().getColumn(1).setResizable(false);
            planningTable.getColumnModel().getColumn(2).setResizable(false);
        }

        nomPlanningLabel.setEditable(false);
        nomPlanningLabel.setText("Planning");
        nomPlanningLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomPlanningLabelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        choixPlanningLabel.setText("Choisissez le planning à modifier:");

        createPlanningButton.setText("Créer planning");
        createPlanningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlanningButtonActionPerformed(evt);
            }
        });

        suppPlanningButton.setText("Supprimer planning");
        suppPlanningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppPlanningButtonActionPerformed(evt);
            }
        });

        affichagePlanningList.setModel(new javax.swing.AbstractListModel() {
            String[] listeNomPlanning;
            public int getSize() { return listeNomPlanning.length; }
            public Object getElementAt(int i) { return listeNomPlanning[i]; }
        });
        jScrollPane3.setViewportView(affichagePlanningList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(choixPlanningLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suppPlanningButton)
                            .addComponent(createPlanningButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choixPlanningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createPlanningButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suppPlanningButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addProjButton.setText("Ajouter une projection");
        addProjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Pour la première utilisation cliquez sur ce bouton afin d'ajouter les films, salles, compétitions et jurys.");

        jButton1.setText("Ajouts films, salles, compétitons, jurys");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addProjButton)
                                .addGap(314, 314, 314))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomPlanningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(labelLogo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(nomPlanningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addProjButton)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomPlanningLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomPlanningLabelActionPerformed
        nomPlanningLabel.setText(affichagePlanningList.getSelectedValue().toString());
    }//GEN-LAST:event_nomPlanningLabelActionPerformed

    private void suppPlanningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppPlanningButtonActionPerformed
        int numP=affichagePlanningList.getSelectionMode();
        planningDAO.supprimerPlanning(numP);
    }//GEN-LAST:event_suppPlanningButtonActionPerformed

    private void addProjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjButtonActionPerformed
        fenetreProjection.setVisible(true);
    }//GEN-LAST:event_addProjButtonActionPerformed

    private void createPlanningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlanningButtonActionPerformed
        fenetrePlanning.setVisible(true);
    }//GEN-LAST:event_createPlanningButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private JLabel placerLogo() {
        labelLogo.setIcon(new ImageIcon(".\\src\\festival\\vue\\logo.png"));
        return labelLogo ;
    }
    
        
    public static void main(String args[]) {
        /*Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FenetreFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FenetreFestival fest = new FenetreFestival();
                fest.setVisible(true);
            }
            });
        }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProjButton;
    private javax.swing.JList affichagePlanningList;
    private javax.swing.JLabel choixPlanningLabel;
    private javax.swing.JButton createPlanningButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTextField nomPlanningLabel;
    private javax.swing.JTable planningTable;
    private javax.swing.JButton suppPlanningButton;
    // End of variables declaration//GEN-END:variables

}

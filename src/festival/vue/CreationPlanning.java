/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package festival.vue;

/**
 *
 * @author mikou
 */
public class CreationPlanning extends javax.swing.JInternalFrame {

    /**
     * Creates new form CreationPlanning
     */
    public CreationPlanning() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsetPlanning = new javax.swing.JPanel();
        tfNomPlanning = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spinnerDuree = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        choixDate = new com.toedter.calendar.JDateChooser();
        validerButton = new javax.swing.JButton();
        annulerButton = new javax.swing.JButton();
        cboxCompet = new javax.swing.JComboBox();

        setTitle("Planning de projection Cannes - Créer un planning");

        fieldsetPlanning.setBorder(javax.swing.BorderFactory.createTitledBorder("Création Planning:"));

        tfNomPlanning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomPlanningActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom:");

        jLabel2.setText("Compétition:");

        jLabel3.setText("Durée:");

        jLabel4.setText("Début:");

        validerButton.setText("Valider");

        annulerButton.setText("Annuler");
        annulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerButtonActionPerformed(evt);
            }
        });

        cboxCompet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout fieldsetPlanningLayout = new javax.swing.GroupLayout(fieldsetPlanning);
        fieldsetPlanning.setLayout(fieldsetPlanningLayout);
        fieldsetPlanningLayout.setHorizontalGroup(
            fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsetPlanningLayout.createSequentialGroup()
                .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fieldsetPlanningLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(validerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annulerButton))
                    .addGroup(fieldsetPlanningLayout.createSequentialGroup()
                        .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldsetPlanningLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1))
                            .addGroup(fieldsetPlanningLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(fieldsetPlanningLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(30, 30, 30)
                        .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choixDate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboxCompet, javax.swing.GroupLayout.Alignment.LEADING, 0, 99, Short.MAX_VALUE)
                                .addComponent(tfNomPlanning, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        fieldsetPlanningLayout.setVerticalGroup(
            fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsetPlanningLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxCompet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spinnerDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choixDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(fieldsetPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validerButton)
                    .addComponent(annulerButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldsetPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(fieldsetPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomPlanningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomPlanningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomPlanningActionPerformed

    private void annulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerButton;
    private javax.swing.JComboBox cboxCompet;
    private com.toedter.calendar.JDateChooser choixDate;
    private javax.swing.JPanel fieldsetPlanning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner spinnerDuree;
    private javax.swing.JTextField tfNomPlanning;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidesign;

/**
 *
 * @author cloud
 */
public class PanelDisplayTemplates extends javax.swing.JFrame {

    /**
     * Creates new form PanelDisplayTemplates
     */
    public PanelDisplayTemplates() {
        initComponents();
        this.tableItems.setShowGrid(false);
        this.revalidate();
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTemplateInfo = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        tfieldTemplateName = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        tfieldTemplateDescription = new javax.swing.JTextField();
        tfieldImportedTime = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        scrollpane1 = new javax.swing.JScrollPane();
        tableItems = new javax.swing.JTable();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1160, 940));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTemplateInfo.setBackground(new java.awt.Color(73, 125, 222));
        panelTemplateInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label1.setText("Template Name:");
        panelTemplateInfo.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 40));

        tfieldTemplateName.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        tfieldTemplateName.setText(". . .");
        tfieldTemplateName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tfieldTemplateName.setOpaque(false);
        tfieldTemplateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldTemplateNameActionPerformed(evt);
            }
        });
        panelTemplateInfo.add(tfieldTemplateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 330, 40));

        label2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label2.setText("Template Description:");
        panelTemplateInfo.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 40));

        tfieldTemplateDescription.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        tfieldTemplateDescription.setText(". . .");
        tfieldTemplateDescription.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tfieldTemplateDescription.setOpaque(false);
        tfieldTemplateDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldTemplateDescriptionActionPerformed(evt);
            }
        });
        panelTemplateInfo.add(tfieldTemplateDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 330, 40));

        tfieldImportedTime.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        tfieldImportedTime.setText(". . .");
        tfieldImportedTime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tfieldImportedTime.setOpaque(false);
        tfieldImportedTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldImportedTimeActionPerformed(evt);
            }
        });
        panelTemplateInfo.add(tfieldImportedTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 330, 40));

        label3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label3.setText("Imported Time:");
        panelTemplateInfo.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 40));

        getContentPane().add(panelTemplateInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 260));

        label4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label4.setText("Items:");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 40));

        tableItems.setBorder(null);
        tableItems.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollpane1.setViewportView(tableItems);

        getContentPane().add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 950, 480));

        buttonCancel.setBackground(new java.awt.Color(73, 125, 222));
        buttonCancel.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        buttonCancel.setForeground(java.awt.Color.white);
        buttonCancel.setText("Cancel");
        buttonCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancel.setBorderPainted(false);
        getContentPane().add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 850, 100, 40));

        buttonSave.setBackground(new java.awt.Color(73, 125, 222));
        buttonSave.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        buttonSave.setForeground(java.awt.Color.white);
        buttonSave.setText("Save");
        buttonSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSave.setBorderPainted(false);
        getContentPane().add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 850, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfieldTemplateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfieldTemplateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfieldTemplateNameActionPerformed

    private void tfieldTemplateDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfieldTemplateDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfieldTemplateDescriptionActionPerformed

    private void tfieldImportedTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfieldImportedTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfieldImportedTimeActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelDisplayTemplates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelDisplayTemplates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelDisplayTemplates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelDisplayTemplates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelDisplayTemplates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JPanel panelTemplateInfo;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JTable tableItems;
    private javax.swing.JTextField tfieldImportedTime;
    private javax.swing.JTextField tfieldTemplateDescription;
    private javax.swing.JTextField tfieldTemplateName;
    // End of variables declaration//GEN-END:variables
}
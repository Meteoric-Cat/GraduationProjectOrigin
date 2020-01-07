/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidesign;

import java.awt.Color;

/**
 *
 * @author cloud
 */
public class PanelNotificationInfo extends javax.swing.JFrame {

    /**
     * Creates new form PanelNotificationInfo
     */
    public PanelNotificationInfo() {
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

        panelOverlay = new javax.swing.JPanel();
        panelNotificationData = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        labelIPAddress = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        labelDeviceLabel = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        labelCommunity = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        labelExtra = new javax.swing.JLabel();
        scrollpane1 = new javax.swing.JScrollPane();
        tareaContent = new javax.swing.JTextArea();
        label5 = new javax.swing.JLabel();
        labelClose = new javax.swing.JLabel();
        scrollpane2 = new javax.swing.JScrollPane();
        tableExtraData = new javax.swing.JTable();
        label6 = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 940));
        setMinimumSize(new java.awt.Dimension(1600, 940));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOverlay.setBackground(new Color(0, 0, 0, 50));
        panelOverlay.setPreferredSize(new java.awt.Dimension(1600, 940));
        panelOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNotificationData.setBackground(java.awt.Color.white);
        panelNotificationData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label1.setText("IP Address");
        panelNotificationData.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 110, 30));

        labelIPAddress.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelIPAddress.setText(". . .");
        panelNotificationData.add(labelIPAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 330, 30));

        label2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label2.setText("Device Label:");
        panelNotificationData.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 63, 130, 30));

        labelDeviceLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelDeviceLabel.setText(". . .");
        panelNotificationData.add(labelDeviceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 63, 340, 30));

        label3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label3.setText("Community");
        panelNotificationData.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, 30));

        labelCommunity.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelCommunity.setText(". . .");
        panelNotificationData.add(labelCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 330, 30));

        labelType.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelType.setText(". . .");
        panelNotificationData.add(labelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 330, 30));

        label4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label4.setText("Type:");
        panelNotificationData.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, 30));

        labelExtra.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        labelExtra.setText("Extra Data");
        panelNotificationData.add(labelExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 110, 30));

        scrollpane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tareaContent.setEditable(false);
        tareaContent.setColumns(20);
        tareaContent.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tareaContent.setLineWrap(true);
        tareaContent.setRows(5);
        scrollpane1.setViewportView(tareaContent);

        panelNotificationData.add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 330, 80));

        label5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label5.setText("Content:");
        panelNotificationData.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 110, 30));

        labelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_close_30.png"))); // NOI18N
        panelNotificationData.add(labelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 30));

        scrollpane2.setBackground(java.awt.Color.white);

        tableExtraData.setBorder(null);
        tableExtraData.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tableExtraData.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollpane2.setViewportView(tableExtraData);

        panelNotificationData.add(scrollpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 460, 160));

        label6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label6.setText("Time:");
        panelNotificationData.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 110, 30));

        labelTime.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelTime.setText(". . .");
        panelNotificationData.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 330, 30));

        panelOverlay.add(panelNotificationData, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 121, 610, 680));

        getContentPane().add(panelOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PanelNotificationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelNotificationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelNotificationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelNotificationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelNotificationInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelCommunity;
    private javax.swing.JLabel labelDeviceLabel;
    private javax.swing.JLabel labelExtra;
    private javax.swing.JLabel labelIPAddress;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelType;
    private javax.swing.JPanel panelNotificationData;
    private javax.swing.JPanel panelOverlay;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JScrollPane scrollpane2;
    private javax.swing.JTable tableExtraData;
    private javax.swing.JTextArea tareaContent;
    // End of variables declaration//GEN-END:variables
}

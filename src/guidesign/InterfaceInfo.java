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
public class InterfaceInfo extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceInfo
     */
    public InterfaceInfo() {
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

        panelAdditionalInformation = new javax.swing.JPanel();
        label11 = new javax.swing.JLabel();
        labelInPackAmount = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        labelOutPackAmount = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        labelInboundBytes = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        labelOutboundBytes = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        labelInErrPackCount = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();
        labelOutErrPackCount = new javax.swing.JLabel();
        labelMTU = new javax.swing.JLabel();
        label17 = new javax.swing.JLabel();
        label18 = new javax.swing.JLabel();
        labelCurrentBandwidth = new javax.swing.JLabel();
        panelSeparator1 = new javax.swing.JPanel();
        panelBasicInformation = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        labelIPAddress = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        labelNetmask = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        panelConnectedNode = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        labelNextNodeIpAddress = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        labelNextNodeMaxAddress = new javax.swing.JLabel();
        label23 = new javax.swing.JLabel();
        tfieldUpdatePeriod = new javax.swing.JTextField();
        buttonStart = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1160, 940));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAdditionalInformation.setBackground(java.awt.Color.white);
        panelAdditionalInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Additional Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N
        panelAdditionalInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label11.setText("Inbound Packet Amount:");
        panelAdditionalInformation.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        labelInPackAmount.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelInPackAmount.setText(". . .");
        panelAdditionalInformation.add(labelInPackAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 90, 30));

        label12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label12.setText("Outbound Packet Amount:");
        panelAdditionalInformation.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 30));

        labelOutPackAmount.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelOutPackAmount.setText(". . .");
        panelAdditionalInformation.add(labelOutPackAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 90, 30));

        label13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label13.setText("Inbound Bytes");
        panelAdditionalInformation.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 30));

        labelInboundBytes.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelInboundBytes.setText(". . .");
        panelAdditionalInformation.add(labelInboundBytes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 90, 30));

        label14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label14.setText("Outbound Bytes");
        panelAdditionalInformation.add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, 30));

        labelOutboundBytes.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelOutboundBytes.setText(". . .");
        panelAdditionalInformation.add(labelOutboundBytes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 90, 30));

        label15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label15.setText("Inbound Error Packet Count:");
        panelAdditionalInformation.add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 30));

        labelInErrPackCount.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelInErrPackCount.setText(". . .");
        panelAdditionalInformation.add(labelInErrPackCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 90, 30));

        label16.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label16.setText("Outbound Error Packet Count:");
        panelAdditionalInformation.add(label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, 30));

        labelOutErrPackCount.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelOutErrPackCount.setText(". . .");
        panelAdditionalInformation.add(labelOutErrPackCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 90, 30));

        labelMTU.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelMTU.setText(". . .");
        panelAdditionalInformation.add(labelMTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 90, 30));

        label17.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label17.setText("MTU:");
        panelAdditionalInformation.add(label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        label18.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label18.setText("Current Bandwidth:");
        panelAdditionalInformation.add(label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        labelCurrentBandwidth.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelCurrentBandwidth.setText(". . .");
        panelAdditionalInformation.add(labelCurrentBandwidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, 30));

        panelSeparator1.setBackground(java.awt.Color.black);
        panelSeparator1.setPreferredSize(new java.awt.Dimension(440, 5));

        javax.swing.GroupLayout panelSeparator1Layout = new javax.swing.GroupLayout(panelSeparator1);
        panelSeparator1.setLayout(panelSeparator1Layout);
        panelSeparator1Layout.setHorizontalGroup(
            panelSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        panelSeparator1Layout.setVerticalGroup(
            panelSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        panelAdditionalInformation.add(panelSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 440, 5));

        getContentPane().add(panelAdditionalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 500, 730));

        panelBasicInformation.setBackground(java.awt.Color.white);
        panelBasicInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Basic Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N
        panelBasicInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label1.setText("Name:");
        panelBasicInformation.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        labelName.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelName.setText(". . .");
        panelBasicInformation.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, 30));

        label3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label3.setText("IP Address:");
        panelBasicInformation.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        labelIPAddress.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelIPAddress.setText(". . .");
        panelBasicInformation.add(labelIPAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 210, 30));

        label4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label4.setText("Netmask:");
        panelBasicInformation.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        labelNetmask.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelNetmask.setText(". . .");
        panelBasicInformation.add(labelNetmask, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 210, 30));

        label2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label2.setText("Type:");
        panelBasicInformation.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        labelType.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelType.setText(". . .");
        panelBasicInformation.add(labelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 30));

        panelConnectedNode.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Connected Node", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N
        panelConnectedNode.setOpaque(false);
        panelConnectedNode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label5.setText("IP Address:");
        panelConnectedNode.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 30));

        labelNextNodeIpAddress.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelNextNodeIpAddress.setText(". . .");
        panelConnectedNode.add(labelNextNodeIpAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 210, 30));

        label6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label6.setText("MAC Address:");
        panelConnectedNode.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        labelNextNodeMaxAddress.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelNextNodeMaxAddress.setText(". . .");
        panelConnectedNode.add(labelNextNodeMaxAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 210, 30));

        panelBasicInformation.add(panelConnectedNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 440, 410));

        getContentPane().add(panelBasicInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 440, 730));

        label23.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label23.setText("Update Period(s):");
        getContentPane().add(label23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 840, 150, 30));

        tfieldUpdatePeriod.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        tfieldUpdatePeriod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfieldUpdatePeriod.setText("0");
        tfieldUpdatePeriod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tfieldUpdatePeriod.setOpaque(false);
        getContentPane().add(tfieldUpdatePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 840, 90, 30));

        buttonStart.setBackground(new java.awt.Color(62, 89, 207));
        buttonStart.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        buttonStart.setForeground(java.awt.Color.white);
        buttonStart.setText("Start");
        buttonStart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(buttonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 840, 70, 30));

        buttonCancel.setBackground(new java.awt.Color(62, 89, 207));
        buttonCancel.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        buttonCancel.setForeground(java.awt.Color.white);
        buttonCancel.setText("Stop");
        buttonCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 840, 70, 30));

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
            java.util.logging.Logger.getLogger(InterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonStart;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel labelCurrentBandwidth;
    private javax.swing.JLabel labelIPAddress;
    private javax.swing.JLabel labelInErrPackCount;
    private javax.swing.JLabel labelInPackAmount;
    private javax.swing.JLabel labelInboundBytes;
    private javax.swing.JLabel labelMTU;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNetmask;
    private javax.swing.JLabel labelNextNodeIpAddress;
    private javax.swing.JLabel labelNextNodeMaxAddress;
    private javax.swing.JLabel labelOutErrPackCount;
    private javax.swing.JLabel labelOutPackAmount;
    private javax.swing.JLabel labelOutboundBytes;
    private javax.swing.JLabel labelType;
    private javax.swing.JPanel panelAdditionalInformation;
    private javax.swing.JPanel panelBasicInformation;
    private javax.swing.JPanel panelConnectedNode;
    private javax.swing.JPanel panelSeparator1;
    private javax.swing.JTextField tfieldUpdatePeriod;
    // End of variables declaration//GEN-END:variables
}

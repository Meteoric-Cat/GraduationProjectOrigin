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
public class PanelDeviceResources extends javax.swing.JFrame {

    /**
     * Creates new form PanelDeviceResources
     */
    public PanelDeviceResources() {
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

        panelCPU = new javax.swing.JPanel();
        scrollpane1 = new javax.swing.JScrollPane();
        tableCPU = new javax.swing.JTable();
        panelMemory = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        labelTotalRam = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        labelUsedRam = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        labelTotalVirtual = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        labelUsedVirtual = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        labelUsedOther = new javax.swing.JLabel();
        labelTotalOther = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        scrollpane2 = new javax.swing.JScrollPane();
        tableDisks = new javax.swing.JTable();
        label11 = new javax.swing.JLabel();
        tfieldUpdatePeirod = new javax.swing.JTextField();
        buttonStart = new javax.swing.JButton();
        buttonStop = new javax.swing.JButton();
        labelUpdatedTime = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1160, 940));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCPU.setBackground(java.awt.Color.white);
        panelCPU.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CPU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N
        panelCPU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollpane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane1.setViewportBorder(null);

        tableCPU.setBorder(null);
        tableCPU.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tableCPU.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollpane1.setViewportView(tableCPU);

        panelCPU.add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 921, 120));

        getContentPane().add(panelCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 1060, 220));

        panelMemory.setBackground(java.awt.Color.white);
        panelMemory.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Memory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N
        panelMemory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label2.setText("Disks:");
        panelMemory.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 70, 30));

        label3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label3.setText("Total Size (bytes):");
        panelMemory.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 20));

        labelTotalRam.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelTotalRam.setText(". . .");
        panelMemory.add(labelTotalRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 131, 20));

        label4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label4.setText("Used Size (bytes):");
        panelMemory.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 20));

        labelUsedRam.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelUsedRam.setText(". . .");
        panelMemory.add(labelUsedRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 131, 20));

        label5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label5.setText("Virtual:");
        panelMemory.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        label6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label6.setText("Total Size (bytes):");
        panelMemory.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 170, 20));

        labelTotalVirtual.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelTotalVirtual.setText(". . .");
        panelMemory.add(labelTotalVirtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 131, 20));

        label7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label7.setText("Used Size (bytes):");
        panelMemory.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 20));

        labelUsedVirtual.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelUsedVirtual.setText(". . .");
        panelMemory.add(labelUsedVirtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 131, 20));

        label8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label8.setText("Other:");
        panelMemory.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        label9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label9.setText("Total Size (bytes):");
        panelMemory.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 170, 20));

        label10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label10.setText("Used Size (bytes):");
        panelMemory.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 170, 20));

        labelUsedOther.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelUsedOther.setText(". . .");
        panelMemory.add(labelUsedOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 131, 20));

        labelTotalOther.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelTotalOther.setText(". . .");
        panelMemory.add(labelTotalOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 131, 20));

        label1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label1.setText("RAM:");
        panelMemory.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        scrollpane2.setBorder(null);
        scrollpane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tableDisks.setBorder(null);
        tableDisks.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tableDisks.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollpane2.setViewportView(tableDisks);

        panelMemory.add(scrollpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 520, 340));

        getContentPane().add(panelMemory, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 1060, 540));

        label11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label11.setText("Update Period (s):");
        getContentPane().add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 880, -1, 30));

        tfieldUpdatePeirod.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        getContentPane().add(tfieldUpdatePeirod, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 880, 90, 30));

        buttonStart.setBackground(new java.awt.Color(70, 120, 227));
        buttonStart.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        buttonStart.setForeground(java.awt.Color.white);
        buttonStart.setText("Start");
        buttonStart.setBorderPainted(false);
        getContentPane().add(buttonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 880, 80, -1));

        buttonStop.setBackground(new java.awt.Color(70, 120, 227));
        buttonStop.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        buttonStop.setForeground(java.awt.Color.white);
        buttonStop.setText("Stop");
        buttonStop.setBorderPainted(false);
        getContentPane().add(buttonStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 880, 80, -1));

        labelUpdatedTime.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        labelUpdatedTime.setText(". . .");
        getContentPane().add(labelUpdatedTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 890, 280, 20));

        label12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label12.setText("Updated Time:");
        getContentPane().add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 890, 130, 20));

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
            java.util.logging.Logger.getLogger(PanelDeviceResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelDeviceResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelDeviceResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelDeviceResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelDeviceResources().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonStart;
    private javax.swing.JButton buttonStop;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel labelTotalOther;
    private javax.swing.JLabel labelTotalRam;
    private javax.swing.JLabel labelTotalVirtual;
    private javax.swing.JLabel labelUpdatedTime;
    private javax.swing.JLabel labelUsedOther;
    private javax.swing.JLabel labelUsedRam;
    private javax.swing.JLabel labelUsedVirtual;
    private javax.swing.JPanel panelCPU;
    private javax.swing.JPanel panelMemory;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JScrollPane scrollpane2;
    private javax.swing.JTable tableCPU;
    private javax.swing.JTable tableDisks;
    private javax.swing.JTextField tfieldUpdatePeirod;
    // End of variables declaration//GEN-END:variables
}
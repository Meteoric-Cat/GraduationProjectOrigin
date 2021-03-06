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
public class PanelSSH extends javax.swing.JFrame {

    /**
     * Creates new form PanelSSH
     */
    public PanelSSH() {
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

        panelCommand = new javax.swing.JPanel();
        scrollpane1 = new javax.swing.JScrollPane();
        tareaResult = new javax.swing.JTextArea();
        tfieldCommand = new javax.swing.JTextField();
        labelClose1 = new javax.swing.JLabel();
        labelHostInfo = new javax.swing.JLabel();
        panelInformation = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        tfieldHostAddress = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        tfieldPassword = new javax.swing.JPasswordField();
        tfieldUserName = new javax.swing.JTextField();
        labelPort = new javax.swing.JLabel();
        tfieldPort = new javax.swing.JTextField();
        buttonConnect = new javax.swing.JButton();
        labelClose2 = new javax.swing.JLabel();

        panelCommand.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tareaResult.setEditable(false);
        tareaResult.setBackground(new java.awt.Color(58, 58, 87));
        tareaResult.setColumns(20);
        tareaResult.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tareaResult.setForeground(java.awt.Color.white);
        tareaResult.setLineWrap(true);
        tareaResult.setRows(20);
        tareaResult.setPreferredSize(new java.awt.Dimension(500, 1000));
        scrollpane1.setViewportView(tareaResult);

        panelCommand.add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 420));

        tfieldCommand.setBackground(new java.awt.Color(59, 59, 99));
        tfieldCommand.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tfieldCommand.setForeground(java.awt.Color.white);
        tfieldCommand.setText("jTextField1");
        tfieldCommand.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfieldCommand.setCaretColor(java.awt.Color.white);
        panelCommand.add(tfieldCommand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 500, 50));

        labelClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_close_30.png"))); // NOI18N
        panelCommand.add(labelClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 30));

        labelHostInfo.setText("Host");
        panelCommand.add(labelHostInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 30));

        panelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label1.setText("User Name:");
        panelInformation.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        tfieldHostAddress.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        panelInformation.add(tfieldHostAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 298, 40));

        label3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label3.setText("Host Address:");
        panelInformation.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        label2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label2.setText("Password:");
        panelInformation.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        tfieldPassword.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        panelInformation.add(tfieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 298, 40));

        tfieldUserName.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        panelInformation.add(tfieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 298, 40));

        labelPort.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelPort.setText("Port:");
        panelInformation.add(labelPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, 40));

        tfieldPort.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelInformation.add(tfieldPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, 40));

        buttonConnect.setBackground(new java.awt.Color(38, 56, 163));
        buttonConnect.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        buttonConnect.setForeground(java.awt.Color.white);
        buttonConnect.setText("Connect");
        buttonConnect.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelInformation.add(buttonConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 80, 40));

        labelClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_close_30.png"))); // NOI18N
        panelInformation.add(labelClose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            java.util.logging.Logger.getLogger(PanelSSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelSSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelSSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelSSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelSSH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConnect;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel labelClose1;
    private javax.swing.JLabel labelClose2;
    private javax.swing.JLabel labelHostInfo;
    private javax.swing.JLabel labelPort;
    private javax.swing.JPanel panelCommand;
    private javax.swing.JPanel panelInformation;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JTextArea tareaResult;
    private javax.swing.JTextField tfieldCommand;
    private javax.swing.JTextField tfieldHostAddress;
    private javax.swing.JPasswordField tfieldPassword;
    private javax.swing.JTextField tfieldPort;
    private javax.swing.JTextField tfieldUserName;
    // End of variables declaration//GEN-END:variables
}

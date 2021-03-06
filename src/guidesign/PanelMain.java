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
public class PanelMain extends javax.swing.JFrame {

    /**
     * Creates new form PanelMain
     */
    public PanelMain() {
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

        panelDeviceMenu = new javax.swing.JPanel();
        labelImportedDevices = new javax.swing.JLabel();
        labelScannedDevices = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        panelTemplateMenu = new javax.swing.JPanel();
        labelTabularTemplates = new javax.swing.JLabel();
        labelSingularTemplates = new javax.swing.JLabel();
        separator2 = new javax.swing.JSeparator();
        panelAccountMenu = new javax.swing.JPanel();
        labelLogout = new javax.swing.JLabel();
        labelProfile = new javax.swing.JLabel();
        separator3 = new javax.swing.JSeparator();
        panelMain = new javax.swing.JPanel();
        panelOptionsBar = new javax.swing.JPanel();
        panelOptionNotifications = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        panelOptionDevices = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        panelOptionTemplates = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        labelIconAccount = new javax.swing.JLabel();
        labelIconSettings = new javax.swing.JLabel();
        panelNotificationBoard = new javax.swing.JPanel();
        labelCloseBoard = new javax.swing.JLabel();
        scrollpane1 = new javax.swing.JScrollPane();
        panelNotifications = new javax.swing.JPanel();
        labelNotification = new javax.swing.JPanel();
        labelContent = new javax.swing.JLabel();
        labelHeader = new javax.swing.JLabel();

        panelDeviceMenu.setBackground(new java.awt.Color(39, 87, 159));
        panelDeviceMenu.setBorder(null);
        panelDeviceMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImportedDevices.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelImportedDevices.setForeground(java.awt.Color.white);
        labelImportedDevices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImportedDevices.setText("Imported Devices");
        labelImportedDevices.setBorder(null);
        panelDeviceMenu.add(labelImportedDevices, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 198, 49));

        labelScannedDevices.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelScannedDevices.setForeground(java.awt.Color.white);
        labelScannedDevices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelScannedDevices.setText("Scanned Devices");
        labelScannedDevices.setBorder(null);
        panelDeviceMenu.add(labelScannedDevices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 198, 44));
        panelDeviceMenu.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 10));

        panelTemplateMenu.setBackground(new java.awt.Color(39, 87, 159));
        panelTemplateMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTabularTemplates.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelTabularTemplates.setForeground(java.awt.Color.white);
        labelTabularTemplates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTabularTemplates.setText("Tabular Templates");
        labelTabularTemplates.setBorder(null);
        panelTemplateMenu.add(labelTabularTemplates, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 198, 44));

        labelSingularTemplates.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelSingularTemplates.setForeground(java.awt.Color.white);
        labelSingularTemplates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSingularTemplates.setText("Singular Templates");
        labelSingularTemplates.setBorder(null);
        panelTemplateMenu.add(labelSingularTemplates, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 198, 49));
        panelTemplateMenu.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 10));

        panelAccountMenu.setBackground(new java.awt.Color(39, 87, 159));
        panelAccountMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogout.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelLogout.setForeground(java.awt.Color.white);
        labelLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogout.setText("Logout");
        labelLogout.setBorder(null);
        panelAccountMenu.add(labelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 198, 44));

        labelProfile.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelProfile.setForeground(java.awt.Color.white);
        labelProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProfile.setText("Profile");
        labelProfile.setBorder(null);
        panelAccountMenu.add(labelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 198, 49));
        panelAccountMenu.add(separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMain.setBackground(java.awt.Color.white);
        panelMain.setPreferredSize(new java.awt.Dimension(1600, 1000));
        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOptionsBar.setBackground(new java.awt.Color(20, 62, 125));
        panelOptionsBar.setForeground(new java.awt.Color(34, 52, 143));
        panelOptionsBar.setPreferredSize(new java.awt.Dimension(1600, 60));
        panelOptionsBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOptionNotifications.setBackground(java.awt.Color.red);
        panelOptionNotifications.setOpaque(false);
        panelOptionNotifications.setPreferredSize(new java.awt.Dimension(200, 60));
        panelOptionNotifications.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_traps_40.png"))); // NOI18N
        label5.setFocusable(false);
        panelOptionNotifications.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        label6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label6.setForeground(java.awt.Color.white);
        label6.setText("Notifications");
        label6.setFocusable(false);
        panelOptionNotifications.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 60));

        label7.setBackground(java.awt.Color.red);
        label7.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label7.setForeground(java.awt.Color.red);
        label7.setText("News");
        panelOptionNotifications.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        panelOptionsBar.add(panelOptionNotifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        panelOptionDevices.setBackground(java.awt.Color.red);
        panelOptionDevices.setFocusable(false);
        panelOptionDevices.setOpaque(false);
        panelOptionDevices.setPreferredSize(new java.awt.Dimension(200, 60));
        panelOptionDevices.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_network_40.png"))); // NOI18N
        label1.setFocusable(false);
        panelOptionDevices.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        label2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label2.setForeground(java.awt.Color.white);
        label2.setText("Devices");
        label2.setFocusable(false);
        panelOptionDevices.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 60));

        panelOptionsBar.add(panelOptionDevices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelOptionTemplates.setBackground(java.awt.Color.red);
        panelOptionTemplates.setOpaque(false);
        panelOptionTemplates.setPreferredSize(new java.awt.Dimension(200, 60));
        panelOptionTemplates.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label3.setForeground(java.awt.Color.white);
        label3.setText("Templates");
        label3.setFocusable(false);
        panelOptionTemplates.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 60));

        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_template2_40.png"))); // NOI18N
        label4.setFocusable(false);
        panelOptionTemplates.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        panelOptionsBar.add(panelOptionTemplates, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        labelIconAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_account_40.png"))); // NOI18N
        panelOptionsBar.add(labelIconAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 0, 60, 60));

        labelIconSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_settings_40.png"))); // NOI18N
        labelIconSettings.setToolTipText("");
        panelOptionsBar.add(labelIconSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 0, 60, 60));

        panelMain.add(panelOptionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelNotificationBoard.setOpaque(false);
        panelNotificationBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCloseBoard.setBackground(java.awt.Color.white);
        labelCloseBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCloseBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_double_up_30.png"))); // NOI18N
        labelCloseBoard.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        labelCloseBoard.setOpaque(true);
        panelNotificationBoard.add(labelCloseBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 400, 30));

        scrollpane1.setBackground(new Color(0, 0, 0, 100));
        scrollpane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane1.setOpaque(false);

        panelNotifications.setBackground(new Color(0, 0, 0, 100));
        panelNotifications.setOpaque(false);
        panelNotifications.setPreferredSize(new java.awt.Dimension(100, 1000));
        panelNotifications.setLayout(new javax.swing.BoxLayout(panelNotifications, javax.swing.BoxLayout.PAGE_AXIS));

        labelNotification.setBackground(java.awt.Color.white);
        labelNotification.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        labelNotification.setMaximumSize(new java.awt.Dimension(400, 70));
        labelNotification.setMinimumSize(new java.awt.Dimension(400, 70));
        labelNotification.setPreferredSize(new java.awt.Dimension(400, 70));
        labelNotification.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelContent.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        labelContent.setForeground(java.awt.Color.blue);
        labelContent.setText("jLabel1");
        labelNotification.add(labelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, -1));

        labelHeader.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        labelHeader.setForeground(java.awt.Color.red);
        labelHeader.setText("jLabel1");
        labelNotification.add(labelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 30));

        panelNotifications.add(labelNotification);

        scrollpane1.setViewportView(panelNotifications);

        panelNotificationBoard.add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 420));

        panelMain.add(panelNotificationBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, 400, 450));

        getContentPane().add(panelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(PanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMain().setVisible(true);
            }
        });
    }

    public void rememberPositioning() {
        panelMain.add(panelDeviceMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 110));
        panelMain.add(panelTemplateMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 200, 110));
        panelMain.add(panelAccountMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 60, 200, 110));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel labelCloseBoard;
    private javax.swing.JLabel labelContent;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelIconAccount;
    private javax.swing.JLabel labelIconSettings;
    private javax.swing.JLabel labelImportedDevices;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JPanel labelNotification;
    private javax.swing.JLabel labelProfile;
    private javax.swing.JLabel labelScannedDevices;
    private javax.swing.JLabel labelSingularTemplates;
    private javax.swing.JLabel labelTabularTemplates;
    private javax.swing.JPanel panelAccountMenu;
    private javax.swing.JPanel panelDeviceMenu;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelNotificationBoard;
    private javax.swing.JPanel panelNotifications;
    private javax.swing.JPanel panelOptionDevices;
    private javax.swing.JPanel panelOptionNotifications;
    private javax.swing.JPanel panelOptionTemplates;
    private javax.swing.JPanel panelOptionsBar;
    private javax.swing.JPanel panelTemplateMenu;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    // End of variables declaration//GEN-END:variables
}

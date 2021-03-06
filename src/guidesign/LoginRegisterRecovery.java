/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidesign;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPasswordField;

/**
 *
 * @author cloud
 */
public class LoginRegisterRecovery extends javax.swing.JFrame {

    /**
     * Creates new form LoginRegisterRecovery
     */
    public LoginRegisterRecovery() {
        initComponents();
//        this.remove(this.scrollpaneAccountList);
//        this.scrollpaneAccountList.setVisible(false);
//        this.scrollpaneAccountList.setEnabled(false);
//        this.revalidate();
//        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpaneAccountList = new javax.swing.JScrollPane();
        listAccount = new javax.swing.JList<>();
        panelRegister = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        tfieldRegisterName = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        tfieldRegisterPosition = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        tfieldRegisterEmail = new javax.swing.JTextField();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        tfieldRegisterAccount = new javax.swing.JTextField();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        buttonRegister = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelAddQuestions = new javax.swing.JLabel();
        checkboxTerms = new javax.swing.JCheckBox();
        labelTerms = new javax.swing.JLabel();
        tfieldRegisterAge = new javax.swing.JFormattedTextField();
        tfieldRegisterPhone = new javax.swing.JFormattedTextField();
        pfieldRegisterPassword = new javax.swing.JPasswordField();
        pfieldRegisterConfirm = new javax.swing.JPasswordField();
        panelAddQuestions = new javax.swing.JPanel();
        label12 = new javax.swing.JLabel();
        tfieldAddQuestion1 = new javax.swing.JTextField();
        label13 = new javax.swing.JLabel();
        scrollpane1 = new javax.swing.JScrollPane();
        tareaAddAnswer1 = new javax.swing.JTextArea();
        label14 = new javax.swing.JLabel();
        tfieldAddQuestion2 = new javax.swing.JTextField();
        label15 = new javax.swing.JLabel();
        scrollpane2 = new javax.swing.JScrollPane();
        tareaAddAnswer2 = new javax.swing.JTextArea();
        label16 = new javax.swing.JLabel();
        tfieldAddQuestion3 = new javax.swing.JTextField();
        label17 = new javax.swing.JLabel();
        scrollpane3 = new javax.swing.JScrollPane();
        tareaAddAnswer3 = new javax.swing.JTextArea();
        labelIconBackAddingQuestion = new javax.swing.JLabel();
        panelSubmitQuestions = new javax.swing.JPanel();
        label18 = new javax.swing.JLabel();
        label19 = new javax.swing.JLabel();
        scrollpane4 = new javax.swing.JScrollPane();
        tareaSubmitAnswer1 = new javax.swing.JTextArea();
        label20 = new javax.swing.JLabel();
        label21 = new javax.swing.JLabel();
        scrollpane5 = new javax.swing.JScrollPane();
        tareaSubmitAnswer2 = new javax.swing.JTextArea();
        label22 = new javax.swing.JLabel();
        label23 = new javax.swing.JLabel();
        scrollpane6 = new javax.swing.JScrollPane();
        tareaSubmitAnswer3 = new javax.swing.JTextArea();
        buttonSubmitAnswers = new javax.swing.JButton();
        buttonCancelSubmission = new javax.swing.JButton();
        labelSubmitQuestion3 = new javax.swing.JLabel();
        labelSubmitQuestion1 = new javax.swing.JLabel();
        labelSubmitQuestion2 = new javax.swing.JLabel();
        labelIconBackSumittingQuestions = new javax.swing.JLabel();
        panelOverlay = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        labelIconAccount = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        labelRecoverPassword = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        labelRegister = new javax.swing.JLabel();
        labelOpenAccountList = new javax.swing.JLabel();
        pfieldPassword = new javax.swing.JPasswordField();
        tfieldAccount = new javax.swing.JTextField();
        cboxRememberPassword = new javax.swing.JCheckBox();
        labelBackground = new javax.swing.JLabel();

        scrollpaneAccountList.setBorder(null);
        scrollpaneAccountList.setOpaque(false);

        listAccount.setBorder(null);
        listAccount.setOpaque(false);
        scrollpaneAccountList.setViewportView(listAccount);

        panelRegister.setBackground(new java.awt.Color(255, 255, 255));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label4.setForeground(new java.awt.Color(20, 99, 236));
        label4.setText("Name");
        panelRegister.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 30));

        tfieldRegisterName.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldRegisterName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        panelRegister.add(tfieldRegisterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 300, 30));

        label5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label5.setForeground(new java.awt.Color(20, 99, 236));
        label5.setText("Age");
        panelRegister.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, 30));

        tfieldRegisterPosition.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldRegisterPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        panelRegister.add(tfieldRegisterPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 300, 30));

        label6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label6.setForeground(new java.awt.Color(20, 99, 236));
        label6.setText("Position");
        panelRegister.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, 30));

        tfieldRegisterEmail.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldRegisterEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        panelRegister.add(tfieldRegisterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 300, 30));

        label7.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label7.setForeground(new java.awt.Color(20, 99, 236));
        label7.setText("Email");
        panelRegister.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, 30));

        label8.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label8.setForeground(new java.awt.Color(20, 99, 236));
        label8.setText("Phone");
        panelRegister.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, 30));

        label9.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label9.setForeground(new java.awt.Color(20, 99, 236));
        label9.setText("Account");
        panelRegister.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 30));

        tfieldRegisterAccount.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldRegisterAccount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        panelRegister.add(tfieldRegisterAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 30));

        label10.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label10.setForeground(new java.awt.Color(20, 99, 236));
        label10.setText("Password");
        panelRegister.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        label11.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label11.setForeground(new java.awt.Color(20, 99, 236));
        label11.setText("Confirm");
        panelRegister.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 30));

        buttonRegister.setBackground(new java.awt.Color(20, 99, 236));
        buttonRegister.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        buttonRegister.setForeground(java.awt.Color.white);
        buttonRegister.setText("Register");
        buttonRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegister.add(buttonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 670, 80, 30));

        buttonCancel.setBackground(new java.awt.Color(20, 99, 236));
        buttonCancel.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        buttonCancel.setForeground(java.awt.Color.white);
        buttonCancel.setText("Cancel");
        buttonCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRegister.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, 80, 30));

        labelAddQuestions.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        labelAddQuestions.setForeground(new java.awt.Color(254, 13, 13));
        labelAddQuestions.setText("Add questions to recover password later?");
        panelRegister.add(labelAddQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 390, -1));

        checkboxTerms.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        checkboxTerms.setText("I aggree to the");
        panelRegister.add(checkboxTerms, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, -1, 30));

        labelTerms.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        labelTerms.setForeground(new java.awt.Color(20, 99, 236));
        labelTerms.setText("terms and conditions");
        panelRegister.add(labelTerms, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, -1, 30));

        tfieldRegisterAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        tfieldRegisterAge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        tfieldRegisterAge.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldRegisterAge.setOpaque(false);
        panelRegister.add(tfieldRegisterAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 300, 30));

        tfieldRegisterPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        tfieldRegisterPhone.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldRegisterPhone.setOpaque(false);
        panelRegister.add(tfieldRegisterPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 300, 30));

        pfieldRegisterPassword.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        pfieldRegisterPassword.setText("jPasswordField1");
        pfieldRegisterPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        pfieldRegisterPassword.setOpaque(false);
        panelRegister.add(pfieldRegisterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 300, 30));

        pfieldRegisterConfirm.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        pfieldRegisterConfirm.setText("jPasswordField2");
        pfieldRegisterConfirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(20, 99, 236)));
        pfieldRegisterConfirm.setOpaque(false);
        panelRegister.add(pfieldRegisterConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 300, 30));

        panelAddQuestions.setBackground(java.awt.Color.white);
        panelAddQuestions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label12.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label12.setForeground(new java.awt.Color(12, 73, 197));
        label12.setText("Question 1:");
        panelAddQuestions.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        tfieldAddQuestion1.setBackground(java.awt.Color.white);
        tfieldAddQuestion1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldAddQuestion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAddQuestions.add(tfieldAddQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 330, 30));

        label13.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label13.setForeground(new java.awt.Color(216, 23, 23));
        label13.setText("Answer:");
        panelAddQuestions.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 30));

        scrollpane1.setForeground(new java.awt.Color(60, 60, 60));

        tareaAddAnswer1.setBackground(java.awt.Color.white);
        tareaAddAnswer1.setColumns(20);
        tareaAddAnswer1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tareaAddAnswer1.setLineWrap(true);
        tareaAddAnswer1.setRows(5);
        tareaAddAnswer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollpane1.setViewportView(tareaAddAnswer1);

        panelAddQuestions.add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 330, -1));

        label14.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label14.setForeground(new java.awt.Color(12, 73, 197));
        label14.setText("Question 2:");
        panelAddQuestions.add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 30));

        tfieldAddQuestion2.setBackground(java.awt.Color.white);
        tfieldAddQuestion2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldAddQuestion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAddQuestions.add(tfieldAddQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 330, 30));

        label15.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label15.setForeground(new java.awt.Color(216, 23, 23));
        label15.setText("Answer:");
        panelAddQuestions.add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 30));

        scrollpane2.setForeground(new java.awt.Color(60, 60, 60));

        tareaAddAnswer2.setBackground(java.awt.Color.white);
        tareaAddAnswer2.setColumns(20);
        tareaAddAnswer2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tareaAddAnswer2.setLineWrap(true);
        tareaAddAnswer2.setRows(5);
        tareaAddAnswer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollpane2.setViewportView(tareaAddAnswer2);

        panelAddQuestions.add(scrollpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 330, -1));

        label16.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label16.setForeground(new java.awt.Color(216, 23, 23));
        label16.setText("Answer:");
        panelAddQuestions.add(label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, 30));

        tfieldAddQuestion3.setBackground(java.awt.Color.white);
        tfieldAddQuestion3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tfieldAddQuestion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAddQuestions.add(tfieldAddQuestion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 330, 30));

        label17.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label17.setForeground(new java.awt.Color(12, 73, 197));
        label17.setText("Question 3:");
        panelAddQuestions.add(label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, 30));

        scrollpane3.setForeground(new java.awt.Color(60, 60, 60));

        tareaAddAnswer3.setBackground(java.awt.Color.white);
        tareaAddAnswer3.setColumns(20);
        tareaAddAnswer3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tareaAddAnswer3.setLineWrap(true);
        tareaAddAnswer3.setRows(5);
        tareaAddAnswer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollpane3.setViewportView(tareaAddAnswer3);

        panelAddQuestions.add(scrollpane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 330, -1));

        labelIconBackAddingQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_arrow_back80.png"))); // NOI18N
        panelAddQuestions.add(labelIconBackAddingQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        panelSubmitQuestions.setBackground(java.awt.Color.white);
        panelSubmitQuestions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label18.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label18.setForeground(new java.awt.Color(12, 73, 197));
        label18.setText("Question 1:");
        panelSubmitQuestions.add(label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 30));

        label19.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label19.setForeground(new java.awt.Color(216, 23, 23));
        label19.setText("Answer:");
        panelSubmitQuestions.add(label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 30));

        scrollpane4.setForeground(new java.awt.Color(60, 60, 60));

        tareaSubmitAnswer1.setBackground(java.awt.Color.white);
        tareaSubmitAnswer1.setColumns(20);
        tareaSubmitAnswer1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tareaSubmitAnswer1.setLineWrap(true);
        tareaSubmitAnswer1.setRows(5);
        tareaSubmitAnswer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollpane4.setViewportView(tareaSubmitAnswer1);

        panelSubmitQuestions.add(scrollpane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 330, -1));

        label20.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label20.setForeground(new java.awt.Color(12, 73, 197));
        label20.setText("Question 2:");
        panelSubmitQuestions.add(label20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 30));

        label21.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label21.setForeground(new java.awt.Color(216, 23, 23));
        label21.setText("Answer:");
        panelSubmitQuestions.add(label21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 30));

        scrollpane5.setForeground(new java.awt.Color(60, 60, 60));

        tareaSubmitAnswer2.setBackground(java.awt.Color.white);
        tareaSubmitAnswer2.setColumns(20);
        tareaSubmitAnswer2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tareaSubmitAnswer2.setLineWrap(true);
        tareaSubmitAnswer2.setRows(5);
        tareaSubmitAnswer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollpane5.setViewportView(tareaSubmitAnswer2);

        panelSubmitQuestions.add(scrollpane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 330, -1));

        label22.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label22.setForeground(new java.awt.Color(216, 23, 23));
        label22.setText("Answer:");
        panelSubmitQuestions.add(label22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, 30));

        label23.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label23.setForeground(new java.awt.Color(12, 73, 197));
        label23.setText("Question 3:");
        panelSubmitQuestions.add(label23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, 30));

        scrollpane6.setForeground(new java.awt.Color(60, 60, 60));

        tareaSubmitAnswer3.setBackground(java.awt.Color.white);
        tareaSubmitAnswer3.setColumns(20);
        tareaSubmitAnswer3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tareaSubmitAnswer3.setLineWrap(true);
        tareaSubmitAnswer3.setRows(5);
        tareaSubmitAnswer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollpane6.setViewportView(tareaSubmitAnswer3);

        panelSubmitQuestions.add(scrollpane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 330, -1));

        buttonSubmitAnswers.setBackground(new java.awt.Color(119, 119, 255));
        buttonSubmitAnswers.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonSubmitAnswers.setForeground(new java.awt.Color(255, 255, 255));
        buttonSubmitAnswers.setText("Submit");
        buttonSubmitAnswers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSubmitQuestions.add(buttonSubmitAnswers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 100, 40));

        buttonCancelSubmission.setBackground(new java.awt.Color(119, 119, 255));
        buttonCancelSubmission.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonCancelSubmission.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelSubmission.setText("Cancel");
        buttonCancelSubmission.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSubmitQuestions.add(buttonCancelSubmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 100, 40));

        labelSubmitQuestion3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        panelSubmitQuestions.add(labelSubmitQuestion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 330, 30));

        labelSubmitQuestion1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        panelSubmitQuestions.add(labelSubmitQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 330, 30));

        labelSubmitQuestion2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        panelSubmitQuestions.add(labelSubmitQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 330, 30));

        labelIconBackSumittingQuestions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_back_arrow_16.png"))); // NOI18N
        panelSubmitQuestions.add(labelIconBackSumittingQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SNMP Manager");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOverlay.setBackground(new Color(0, 0, 0, 130));
        panelOverlay.setPreferredSize(new java.awt.Dimension(1600, 1000));
        panelOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new Color(255, 255, 255, 200));
        panelLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIconAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account_icon.png"))); // NOI18N
        panelLogin.add(labelIconAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        label1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label1.setForeground(new java.awt.Color(20, 99, 236));
        label1.setText("account");
        panelLogin.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        labelRecoverPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelRecoverPassword.setForeground(new java.awt.Color(236, 46, 20));
        labelRecoverPassword.setText("Recover password");
        panelLogin.add(labelRecoverPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        buttonLogin.setBackground(new java.awt.Color(20, 99, 236));
        buttonLogin.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        buttonLogin.setForeground(java.awt.Color.white);
        buttonLogin.setText("Login");
        buttonLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLogin.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 170, 30));

        label2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        label2.setForeground(new java.awt.Color(20, 99, 236));
        label2.setText("password");
        panelLogin.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        label3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        label3.setText("or");
        panelLogin.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        labelRegister.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelRegister.setForeground(new java.awt.Color(236, 46, 20));
        labelRegister.setText("Register");
        panelLogin.add(labelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        labelOpenAccountList.setBackground(java.awt.Color.white);
        labelOpenAccountList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down_arrow_icon.png"))); // NOI18N
        labelOpenAccountList.setOpaque(true);
        panelLogin.add(labelOpenAccountList, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 30, 30));

        pfieldPassword.setBackground(java.awt.Color.white);
        pfieldPassword.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        pfieldPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelLogin.add(pfieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 330, 30));

        tfieldAccount.setBackground(java.awt.Color.white);
        tfieldAccount.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        tfieldAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelLogin.add(tfieldAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 300, 30));

        cboxRememberPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cboxRememberPassword.setForeground(new java.awt.Color(236, 46, 20));
        cboxRememberPassword.setText("Remember me");
        panelLogin.add(cboxRememberPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 130, -1));

        panelOverlay.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 420, 560));

        getContentPane().add(panelOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelBackground.setBackground(java.awt.Color.black);
        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_background.jpg"))); // NOI18N
        getContentPane().add(labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(LoginRegisterRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRegisterRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRegisterRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegisterRecovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegisterRecovery().setVisible(true);
            }
        });
    }

    public void rememberedPositions() {
        panelLogin.add(scrollpaneAccountList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 330, 230));
        panelOverlay.add(panelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 620, 750));
        panelOverlay.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 420, 560));
        panelOverlay.add(panelAddQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 620, 750));
        panelOverlay.add(panelSubmitQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 620, 750));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCancelSubmission;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JButton buttonSubmitAnswers;
    private javax.swing.JCheckBox cboxRememberPassword;
    private javax.swing.JCheckBox checkboxTerms;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label22;
    private javax.swing.JLabel label23;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel labelAddQuestions;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelIconAccount;
    private javax.swing.JLabel labelIconBackAddingQuestion;
    private javax.swing.JLabel labelIconBackSumittingQuestions;
    private javax.swing.JLabel labelOpenAccountList;
    private javax.swing.JLabel labelRecoverPassword;
    private javax.swing.JLabel labelRegister;
    private javax.swing.JLabel labelSubmitQuestion1;
    private javax.swing.JLabel labelSubmitQuestion2;
    private javax.swing.JLabel labelSubmitQuestion3;
    private javax.swing.JLabel labelTerms;
    private javax.swing.JList<String> listAccount;
    private javax.swing.JPanel panelAddQuestions;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelOverlay;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPanel panelSubmitQuestions;
    private javax.swing.JPasswordField pfieldPassword;
    private javax.swing.JPasswordField pfieldRegisterConfirm;
    private javax.swing.JPasswordField pfieldRegisterPassword;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JScrollPane scrollpane2;
    private javax.swing.JScrollPane scrollpane3;
    private javax.swing.JScrollPane scrollpane4;
    private javax.swing.JScrollPane scrollpane5;
    private javax.swing.JScrollPane scrollpane6;
    private javax.swing.JScrollPane scrollpaneAccountList;
    private javax.swing.JTextArea tareaAddAnswer1;
    private javax.swing.JTextArea tareaAddAnswer2;
    private javax.swing.JTextArea tareaAddAnswer3;
    private javax.swing.JTextArea tareaSubmitAnswer1;
    private javax.swing.JTextArea tareaSubmitAnswer2;
    private javax.swing.JTextArea tareaSubmitAnswer3;
    private javax.swing.JTextField tfieldAccount;
    private javax.swing.JTextField tfieldAddQuestion1;
    private javax.swing.JTextField tfieldAddQuestion2;
    private javax.swing.JTextField tfieldAddQuestion3;
    private javax.swing.JTextField tfieldRegisterAccount;
    private javax.swing.JFormattedTextField tfieldRegisterAge;
    private javax.swing.JTextField tfieldRegisterEmail;
    private javax.swing.JTextField tfieldRegisterName;
    private javax.swing.JFormattedTextField tfieldRegisterPhone;
    private javax.swing.JTextField tfieldRegisterPosition;
    // End of variables declaration//GEN-END:variables
}

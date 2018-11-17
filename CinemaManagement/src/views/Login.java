/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import control.MyExcuteQuery;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HAU
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    ArrayList<String> parameters;
    MyExcuteQuery myExcuteQuery;
    static String nameOfUser;
    static String username;
    static String password;

    public Login() {
        initComponents();
        parameters = new ArrayList<>();
        myExcuteQuery = new MyExcuteQuery();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jTextFiledPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblUserIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 51, 204));
        jLabelTitle.setText("SIGN IN");

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelName.setText("Username");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldName.setText("Enter User Name");
        jTextFieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusLost(evt);
            }
        });

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelPassword.setText("Password");

        jTextFiledPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFiledPassword.setForeground(new java.awt.Color(204, 204, 204));
        jTextFiledPassword.setText("Enter Password");
        jTextFiledPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextFiledPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFiledPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFiledPasswordFocusLost(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 153, 204));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.PNG"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        btnCancel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 153, 204));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.PNG"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextFiledPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(177, 177, 177))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelTitle)
                .addGap(59, 59, 59)
                .addComponent(jLabelName)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPassword)
                .addGap(18, 18, 18)
                .addComponent(jTextFiledPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 480, 530));

        lblUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grap.png"))); // NOI18N
        getContentPane().add(lblUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 350, 270));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Simplify");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Cinema Management");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue-background.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusGained
        if (jTextFieldName.getText().trim().equals("Enter User Name")) {
            jTextFieldName.setText("");
        }
        jTextFieldName.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldNameFocusGained

    private void jTextFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusLost
        if (jTextFieldName.getText().trim().equals("")) {
            jTextFieldName.setText("Enter User Name");
        }
        jTextFieldName.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jTextFieldNameFocusLost

    private void jTextFiledPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFiledPasswordFocusGained
        if (String.valueOf(jTextFiledPassword.getPassword()).trim().equals("Enter Password")) {
            jTextFiledPassword.setText("");
        }
        jTextFiledPassword.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFiledPasswordFocusGained

    private void jTextFiledPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFiledPasswordFocusLost
        if (String.valueOf(jTextFiledPassword.getPassword()).trim().equals("")) {
            jTextFiledPassword.setText("Enter Password");
        }
        jTextFiledPassword.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jTextFiledPasswordFocusLost

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        setColor(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        resetColor(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelKeyPressed
        System.exit(0);
    }//GEN-LAST:event_btnCancelKeyPressed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        setColor(btnLogin);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        resetColor(btnLogin);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        parameters.clear();
        if (jTextFieldName.getText().equals("Enter User Name")) {
            jTextFieldName.requestFocus();
        } else if (String.valueOf(jTextFiledPassword.getPassword()).equals("Enter Password")) {
            jTextFiledPassword.requestFocus();
        } else {
            String query = "select * from account where username =? and user_password =?";
            String queryUpdate = "update account set trang_thai = 1 where username =? and user_password =?";
            String queryGetName = "select a.hoten from nhanvien a, account b where a.username = b.username and b.username =?";
            String _username = jTextFieldName.getText().toUpperCase();
            String _password = String.valueOf(jTextFiledPassword.getPassword()).toUpperCase();
            parameters.add(_username);
            parameters.add(String.valueOf(_password.hashCode()));

            if (myExcuteQuery.checkStatus(query, parameters)) {
                JOptionPane.showMessageDialog(null, "Account has been logged in already!!!");
                System.exit(0);
            }
            
            if (myExcuteQuery.checkDisable(query, parameters)) {
                JOptionPane.showMessageDialog(null, "Account is not activated!!!");
                jTextFieldName.setText("");
                jTextFiledPassword.setText("");
                jTextFieldName.requestFocus();
                return;
            }
            
            if (myExcuteQuery.checkAccount(query, parameters)) {
                myExcuteQuery.updateStatus(queryUpdate, parameters);
                nameOfUser = myExcuteQuery.getName(queryGetName, _username);
                username = _username;
                password = String.valueOf(_password.hashCode());
                
                MainForm mf = new MainForm();
                mf.setVisible(true);
                this.dispose();
                
                jTextFieldName.setText("");
                jTextFiledPassword.setText("");
                jTextFieldName.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(null, "User or password is not correct!!!");
                jTextFieldName.setText("");
                jTextFiledPassword.setText("");
                jTextFieldName.requestFocus();
            }
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        parameters.clear();
        if (jTextFieldName.getText().equals("Enter User Name")) {
            jTextFieldName.requestFocus();
        } else if (String.valueOf(jTextFiledPassword.getPassword()).equals("Enter Password")) {
            jTextFiledPassword.requestFocus();
        } else {
            String query = "Select * from account where username =? and user_password =?";
            String queryUpdate = "Update account set trang_thai = 1 where username =? and user_password =?";
            String queryGetName = "Select a.hoten from nhanvien a, account b where a.username = b.username and b.username =?";
            String _username = jTextFieldName.getText().toUpperCase();
            String _password = String.valueOf(jTextFiledPassword.getPassword()).toUpperCase();
            parameters.add(_username);
            parameters.add(String.valueOf(_password.hashCode()));

            if (myExcuteQuery.checkStatus(query, parameters)) {
                JOptionPane.showMessageDialog(null, "Account has been logged in already!!!");
                System.exit(0);
            }
            
            if (myExcuteQuery.checkDisable(query, parameters)) {
                JOptionPane.showMessageDialog(null, "Account is not activated!!!");
                jTextFieldName.setText("");
                jTextFiledPassword.setText("");
                jTextFieldName.requestFocus();
                return;
            }
            
            if (myExcuteQuery.checkAccount(query, parameters)) {
                myExcuteQuery.updateStatus(queryUpdate, parameters);
                nameOfUser = myExcuteQuery.getName(queryGetName, _username);
                username = _username;
                password = String.valueOf(_password.hashCode());
                
                MainForm mf = new MainForm();
                mf.setVisible(true);
                this.dispose();
                
                jTextFieldName.setText("");
                jTextFiledPassword.setText("");
                jTextFieldName.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(null, "User or password is not correct!!!");
                jTextFieldName.setText("");
                jTextFiledPassword.setText("");
                jTextFieldName.requestFocus();
            }
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    public void setColor(javax.swing.JButton button) {
        button.setBackground(new java.awt.Color(115, 163, 239));
    }

    public void resetColor(javax.swing.JButton button) {
        button.setBackground(new java.awt.Color(0, 153, 204));
    }
    
    public String getUserName(){
        return nameOfUser;
    }
    
    public String getUser(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JPasswordField jTextFiledPassword;
    private javax.swing.JLabel lblUserIcon;
    // End of variables declaration//GEN-END:variables
}

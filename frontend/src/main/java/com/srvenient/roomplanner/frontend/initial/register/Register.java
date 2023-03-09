package com.srvenient.roomplanner.frontend.initial.register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Register extends JFrame {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private final JTextField txtUsername;
    private final JTextField txtGmail;
    private final JPasswordField txtPassword;
    private javax.swing.JLabel lblUserIcon;
    private final JLabel lblGmail;
    private javax.swing.JLabel lblPadlock;
    private final JButton btnLogin;
    private final JButton btnRegister;

    /**
     * Creates new form Register
     */
    public Register() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        this.lblUserIcon = new JLabel();
        this.lblGmail = new JLabel();
        this.lblPadlock = new JLabel();
        this.txtUsername = new JTextField();
        this.txtGmail = new JTextField();
        this.txtPassword = new JPasswordField();
        this.jSeparator1 = new JSeparator();
        this.jSeparator2 = new JSeparator();
        this.jSeparator3 = new JSeparator();
        this.btnLogin = new JButton();
        this.btnRegister = new JButton();

        createWindow();
    }

    private void createWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final GroupLayout layout = new GroupLayout(jPanel1);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );

        this.jPanel1.setBackground(new Color(3, 47, 143));
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jPanel1.setLayout(layout);

        this.txtUsername.setBackground(new Color(255, 255, 255));
        this.txtUsername.setForeground(new Color(0, 0, 0));
        this.txtUsername.setText("Username");
        this.txtUsername.setToolTipText("");
        this.txtUsername.setBorder(null);
        this.txtUsername.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        this.txtGmail.setBackground(new Color(255, 255, 255));
        this.txtGmail.setForeground(new Color(0, 0, 0));
        this.txtGmail.setText("Gmail");
        this.txtGmail.setToolTipText("");
        this.txtGmail.setBorder(null);
        this.txtGmail.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        this.txtPassword.setBackground(new Color(255, 255, 255));
        this.txtPassword.setForeground(new Color(0, 0, 0));
        this.txtPassword.setText("Password");
        this.txtPassword.setBorder(null);
        this.txtPassword.addActionListener(this::jPasswordField1ActionPerformed);

        this.btnLogin.setBackground(new Color(255, 255, 255));
        this.btnLogin.setForeground(new Color(0, 0, 0));
        this.btnLogin.setText("Sing In");
        this.btnLogin.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204)));
        this.btnLogin.addActionListener(this::jButton2ActionPerformed);

        this.btnRegister.setBackground(new Color(255, 255, 255));
        this.btnRegister.setForeground(new Color(0, 0, 0));
        this.btnRegister.setText("Sing Up");
        this.btnRegister.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204)));
        this.btnRegister.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        this.btnRegister.addActionListener(this::jButton1ActionPerformed);

        this.txtGmail.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        this.txtGmail.addActionListener(this::jTextField2ActionPerformed);
        this.txtGmail.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        this.lblUserIcon.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/usuario.png")))); // NOI18N
        this.lblGmail.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/gmail.png")))); // NOI18N
        this.lblPadlock.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/candado-abierto.png")))); // NOI18N

        this.txtUsername.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        this.txtUsername.addActionListener(this::jTextField3ActionPerformed);
        this.txtUsername.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });


        final GroupLayout layout1 = new GroupLayout(this.jPanel2);

        this.jPanel2.setLayout(layout1);
        layout1.setHorizontalGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout1.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout1.createSequentialGroup()
                                        .addComponent(this.lblUserIcon)
                                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout1.createSequentialGroup()
                                                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(this.btnRegister, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.LEADING, layout1.createSequentialGroup()
                                                                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(this.txtUsername, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(this.txtGmail)
                                                                                .addComponent(jSeparator3)
                                                                                .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                                                                        .addComponent(this.txtPassword, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout1.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))))
                                .addGroup(GroupLayout.Alignment.TRAILING, layout1.createSequentialGroup()
                                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(this.lblGmail, GroupLayout.Alignment.TRAILING)
                                                .addComponent(this.lblPadlock, GroupLayout.Alignment.TRAILING))
                                        .addGap(242, 242, 242)))
                        .addContainerGap(100, Short.MAX_VALUE))
        );
        layout1.setVerticalGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout1.createSequentialGroup()
                        .addContainerGap(94, Short.MAX_VALUE)
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout1.createSequentialGroup()
                                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(this.txtUsername, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, GroupLayout.Alignment.TRAILING))
                                        .addGap(4, 4, 4)
                                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                                .addComponent(this.lblUserIcon))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout1.createSequentialGroup()
                                                .addComponent(this.txtGmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                                .addComponent(this.lblGmail))
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout1.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout1.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(this.txtPassword, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(this.lblPadlock))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(this.btnRegister, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
        );

        final GroupLayout layout2 = new GroupLayout(getContentPane());

        getContentPane().setLayout(layout2);
        layout2.setHorizontalGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout2.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))
        );
        layout2.setVerticalGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
    }

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

}

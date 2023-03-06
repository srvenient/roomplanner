package com.srvenient.roomplanner.frontend.initial.login;

import com.srvenient.roomplanner.frontend.initial.register.Register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame {

    private final String DEFAULT_USERNAME = "Username or gmail";
    private final String DEFAULT_PASSWORD = "Enter your password";

    private final JPanel jPanel1;
    private final JPanel jPanel2;
    private final JLabel jLabel1;
    private final JLabel jLabel2;
    private final JLabel jLabel3;
    private final JLabel lblUserIcon;
    private final JLabel lblPadlock;
    private final JTextField txtUsername;
    private final JPasswordField txtPassword;
    private final JSeparator jSeparator1;
    private final JSeparator jSeparator2;
    private final JButton btnLogin;
    private final JButton btnRegister;

    public Login() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.lblUserIcon = new JLabel();
        this.lblPadlock = new JLabel();
        this.txtUsername = new JTextField();
        this.txtPassword = new JPasswordField();
        this.jSeparator1 = new JSeparator();
        this.jSeparator2 = new JSeparator();
        this.btnLogin = new JButton();
        this.btnRegister = new JButton();

        createWindow();
    }

    private void createWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        final GroupLayout jPanel1Layout = new GroupLayout(jPanel1);

        this.jPanel1.setBackground(new Color(3, 47, 143));
        this.jPanel2.setBackground(new Color(255, 255, 255));

        this.jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 404, Short.MAX_VALUE)
        );

        this.lblUserIcon.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/usuario.png")))); // NOI18N
        this.lblPadlock.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/candado-abierto.png")))); // NOI18N

        this.txtUsername.setBackground(new Color(255, 255, 255));
        this.txtUsername.setForeground(new Color(0, 0, 0));
        this.txtUsername.setText(this.DEFAULT_USERNAME);
        this.txtUsername.setBorder(null);
        this.txtUsername.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtUsernameFocusGained(e);
            }

            public void focusLost(FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });

        this.txtPassword.setBackground(new Color(255, 255, 255));
        this.txtPassword.setForeground(new Color(0, 0, 0));
        this.txtPassword.setText(this.DEFAULT_PASSWORD);
        this.txtPassword.setBorder(null);
        this.txtPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtPasswordFocusGained(e);
            }

            public void focusLost(FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        this.btnLogin.setBackground(new Color(255, 255, 255));
        this.btnLogin.setForeground(new Color(0, 0, 0));
        this.btnLogin.setText("Sing In");
        this.btnLogin.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204)));
        this.btnLogin.addActionListener(this::btnLoginActionPerformed);

        this.btnRegister.setBackground(new Color(255, 255, 255));
        this.btnRegister.setForeground(new Color(0, 0, 0));
        this.btnRegister.setText("Sing Up");
        this.btnRegister.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204)));
        this.btnRegister.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        this.btnRegister.addActionListener(this::btnRegisterActionPerformed);

        final GroupLayout jPanel2Layout = new GroupLayout(jPanel2);

        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblUserIcon)
                                        .addGap(240, 240, 240))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblPadlock)
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtPassword)
                                                                        .addComponent(txtUsername)
                                                                        .addComponent(jSeparator1)
                                                                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
                                                        )
                                                )
                                        )
                                )
                        )
                        .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(lblUserIcon)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblPadlock))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
        );

        btnRegister.getAccessibleContext().setAccessibleName("");

        pack();
    }

    private void btnLoginActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnRegisterActionPerformed(ActionEvent evt) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());

                    break;
                }
            }
        } catch (ClassNotFoundException |
                 InstantiationException |
                 IllegalAccessException |
                 UnsupportedLookAndFeelException ex
        ) {
            Logger.getLogger(Register.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            setVisible(false);
            dispose();

            new Register().setVisible(true);
        });
    }

    private void txtUsernameFocusGained(FocusEvent event) {
        final String test = this.txtUsername.getText();

        if (test.equals(this.DEFAULT_USERNAME)) {
            this.txtUsername.setText("");
        }
    }

    private void txtUsernameFocusLost(FocusEvent evt) {
        final String test = this.txtUsername.getText();

        if (Objects.equals("", test)) {
            this.txtUsername.setText(this.DEFAULT_USERNAME);

            this.btnLogin.setEnabled(false);
        } else {
            this.btnLogin.setEnabled(true);
        }
    }

    private void txtPasswordFocusGained(FocusEvent event) {
        final char[] password = this.txtPassword.getPassword();

        if (Arrays.equals(password, this.DEFAULT_PASSWORD.toCharArray())) {
            this.txtPassword.setText("");
        }
    }

    private void txtPasswordFocusLost(FocusEvent evt) {
        final char[] password = this.txtPassword.getPassword();

        if (password.length == 0) {
            this.txtPassword.setText(this.DEFAULT_PASSWORD);

            this.btnLogin.setEnabled(false);
        } else {
            this.btnLogin.setEnabled(true);
        }
    }

}

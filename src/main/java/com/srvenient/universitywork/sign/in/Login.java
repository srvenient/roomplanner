package com.srvenient.universitywork.sign.in;

import com.srvenient.universitywork.sign.up.Register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame {

    private final JPanel jPanel1;
    private final JPanel jPanel2;
    private final JLabel jLabel1;
    private final JLabel jLabel2;
    private final JLabel jLabel3;
    private final JLabel jLabelUserIcon;
    private final JLabel jLabelPadlock;
    private final JTextField jTextFieldUsername;
    private final JPasswordField jPasswordField;
    private final JSeparator jSeparator1;
    private final JSeparator jSeparator2;
    private final JButton jButtonSingIn;
    private final JButton jButtonSingUp;

    public Login() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabelUserIcon = new JLabel();
        this.jLabelPadlock = new JLabel();
        this.jTextFieldUsername = new JTextField();
        this.jPasswordField = new JPasswordField();
        this.jSeparator1 = new JSeparator();
        this.jSeparator2 = new JSeparator();
        this.jButtonSingUp = new JButton();
        this.jButtonSingIn = new JButton();

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

        this.jLabelUserIcon.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/usuario (1).png")))); // NOI18N
        this.jLabelPadlock.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/candado-abierto.png")))); // NOI18N

        this.jTextFieldUsername.setBackground(new Color(255, 255, 255));
        this.jTextFieldUsername.setForeground(new Color(0, 0, 0));
        this.jTextFieldUsername.setText("Username");
        this.jTextFieldUsername.setToolTipText("");
        this.jTextFieldUsername.setBorder(null);
        this.jTextFieldUsername.addActionListener(this::jTextField2ActionPerformed);
        this.jTextFieldUsername.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        this.jPasswordField.setBackground(new Color(255, 255, 255));
        this.jPasswordField.setForeground(new Color(0, 0, 0));
        this.jPasswordField.setText("Password");
        this.jPasswordField.setBorder(null);
        this.jPasswordField.addActionListener(this::jPasswordField1ActionPerformed);

        this.jButtonSingIn.setBackground(new Color(255, 255, 255));
        this.jButtonSingIn.setForeground(new Color(0, 0, 0));
        this.jButtonSingIn.setText("Sing In");
        this.jButtonSingIn.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204)));
        this.jButtonSingIn.addActionListener(this::jButton2ActionPerformed);

        this.jButtonSingUp.setBackground(new Color(255, 255, 255));
        this.jButtonSingUp.setForeground(new Color(0, 0, 0));
        this.jButtonSingUp.setText("Sing Up");
        this.jButtonSingUp.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204)));
        this.jButtonSingUp.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        this.jButtonSingUp.addActionListener(this::jButton1ActionPerformed);

        final GroupLayout jPanel2Layout = new GroupLayout(jPanel2);

        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelUserIcon)
                                        .addGap(240, 240, 240))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelPadlock)
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jButtonSingIn, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButtonSingUp, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jPasswordField)
                                                                        .addComponent(jTextFieldUsername)
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
                                                .addComponent(jTextFieldUsername, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelUserIcon)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jPasswordField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelPadlock))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSingUp, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSingIn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
        );

        jButtonSingUp.getAccessibleContext().setAccessibleName("");

        pack();
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jTextField2KeyTyped(KeyEvent event) {
        int key = event.getKeyChar();

        boolean uppercase = key >= 65 && key <= 90;
        boolean lowercase = key >= 67 && key <= 122;
        boolean space = key == 32;

        if (!(uppercase || lowercase || space)) {
            event.consume();
        }
    }


}

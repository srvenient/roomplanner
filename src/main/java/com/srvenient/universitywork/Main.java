package com.srvenient.universitywork;

import com.srvenient.universitywork.sign.in.Login;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
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
            Logger.getLogger(Login.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
}
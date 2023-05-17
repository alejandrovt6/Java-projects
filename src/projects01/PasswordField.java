/* 
Form with fields for username and password. The password field should only 
allow 8 to 12 characters.
*/

package projects01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PasswordField {

    public static void main(String[] args) {

        PasswordFrame myFrame = new PasswordFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class PasswordFrame extends JFrame {

    public PasswordFrame() {

        setBounds(400, 300, 550, 400);
        PasswordPanel myPanel = new PasswordPanel();
        add(myPanel);
        setVisible(true);
    }
}

class PasswordPanel extends JPanel {

    public PasswordPanel() {

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2));
        add(topPanel, BorderLayout.NORTH);

        JLabel label1 = new JLabel("User: ");
        JLabel label2 = new JLabel("Password: ");
        CheckPassword event = new CheckPassword();

        JTextField userField = new JTextField(15);
        passwordField = new JPasswordField(15);
        passwordField.getDocument().addDocumentListener(event);

        topPanel.add(label1);
        topPanel.add(userField);
        topPanel.add(label2);
        topPanel.add(passwordField);

        JButton sendButton = new JButton("Send");
        add(sendButton, BorderLayout.SOUTH);
    }

    private class CheckPassword implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {

            char[] password;
            password = passwordField.getPassword();
            if (password.length < 8 || password.length > 12) {
                passwordField.setBackground(Color.RED);
            } else {
                passwordField.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // TODO Auto-generated method stub

        }

    }

    JPasswordField passwordField;
}
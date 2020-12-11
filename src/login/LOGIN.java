/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Santos
 */
public class LOGIN extends JFrame implements ActionListener {

    JTextField emailuserfield;
    JPasswordField loginpasswordfield;

    public static void main(String[] args) {
        new LOGIN();
    }

    public LOGIN() {
        super("Daniel's Barbear");
        this.setVisible(true);
        this.setSize(800, 600);
        BorderLayout frameLayout = new BorderLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(frameLayout);

        //Header
        JPanel header = new JPanel();
        header.setBackground(Color.LIGHT_GRAY);
        this.add(header);
        JLabel headerlabel = new JLabel("Welcome to Daniel's Barbear, where you belong");
        header.add(headerlabel);
        GridLayout GL1 = new GridLayout(1, 2);
        headerlabel.setLayout(GL1);
        this.add(header, BorderLayout.PAGE_START);
        initCreateaccount();

        //Login
        JPanel loginaccount = new JPanel();
        BoxLayout loginbox = new BoxLayout(loginaccount, BoxLayout.Y_AXIS);
        loginaccount.setLayout(loginbox);
        this.add(loginaccount, BorderLayout.EAST);
        JLabel emailuser = new JLabel("e-mail user");
        loginaccount.add(emailuser);
        emailuserfield = new JTextField(20);
        emailuserfield.setMaximumSize(emailuserfield.getPreferredSize());
        loginaccount.add(emailuserfield);
        JLabel loginpassword = new JLabel("Password");
        loginaccount.add(loginpassword);
        loginpasswordfield = new JPasswordField(20);
        loginpasswordfield.setMaximumSize(loginpasswordfield.getPreferredSize());
        loginaccount.add(loginpasswordfield);

        //Button Login
        JButton loginbutton = new JButton("Login");
        loginaccount.add(loginbutton);
        loginbutton.addActionListener(this);

        this.validate();
        this.repaint();
    }

    private void initCreateaccount() {
        //Createaccount
        JPanel createaccountpanel = new JPanel();
        BoxLayout createaccountbox = new BoxLayout(createaccountpanel, BoxLayout.Y_AXIS);
        createaccountpanel.setLayout(createaccountbox);
        JLabel fullnamelabel = new JLabel("Full Name");
        this.add(createaccountpanel, BorderLayout.WEST);
        createaccountpanel.add(fullnamelabel);
        JTextField fullnamefield = new JTextField(20);
        fullnamefield.setMaximumSize(fullnamefield.getPreferredSize());
        createaccountpanel.add(fullnamefield);
        JLabel phonenumber = new JLabel("phone Number");
        createaccountpanel.add(phonenumber);
        JTextField phonenumberfield = new JTextField(20);
        phonenumberfield.setMaximumSize(phonenumberfield.getPreferredSize());
        createaccountpanel.add(phonenumberfield);
        JLabel emailaddress = new JLabel("Email Address");
        createaccountpanel.add(emailaddress);
        JTextField emailaddressfield = new JTextField(20);
        emailaddressfield.setMaximumSize(emailaddressfield.getPreferredSize());
        createaccountpanel.add(emailaddressfield);
        JLabel password = new JLabel("password");
        createaccountpanel.add(password);
        JPasswordField passwordfield = new JPasswordField(20);
        passwordfield.setMaximumSize(passwordfield.getPreferredSize());
        createaccountpanel.add(passwordfield);

        //Button create account
        JButton createaccountbutton = new JButton("submit");
        createaccountpanel.add(createaccountbutton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailuserfield.getText();
        String clientemail = "client";
        char[] password = loginpasswordfield.getPassword();
        char[] clientpassword = {'c', 'l', 'i', 'e', 'n', 't'};

        if (clientemail.equals(email) && Arrays.equals(password, clientpassword)) {
            this.dispose();
            new Client();
        }
    }

}

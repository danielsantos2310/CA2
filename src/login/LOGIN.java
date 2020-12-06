/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public static void main(String[] args) {
        new LOGIN();
    }

    public LOGIN() {
        this.setVisible(true);
        this.setSize(800, 600);
        BorderLayout frameLayout = new BorderLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(frameLayout);
        this.setTitle("Daniel's Barbear");

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
        this.add(loginaccount, BorderLayout.EAST);
        JLabel loginlabel = new JLabel("tes1");
        loginaccount.add(loginlabel);

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

        //Button
        JButton createaccountbutton = new JButton("submit");
        createaccountpanel.add(createaccountbutton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

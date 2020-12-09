/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Daniel Santos
 */
class Client extends JFrame implements ActionListener{

    public Client() {
        super("Client Area");
        JPanel clientest = new JPanel();
        JLabel clientitle = new JLabel("Pick a Date & Time");
        clientitle.setAlignmentX(TOP_ALIGNMENT);
        clientest.add(clientitle);
        this.add(clientest);
        GridLayout clientlayout = new GridLayout(1, 2);
        this.setLayout(clientlayout);
        this.setSize(400, 300);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Date and time pick
        JLabel clientdate = new JLabel("test");
        this.add(clientdate);
        String labels[] = {"08:00", "09:00", "10:00", "11:00", "12:00", "14:00", "15:00", "16:00", "17:00", "18:00"};
        JList list = new JList(labels);
        JScrollPane scrollPane = new JScrollPane(list);
        Container contentPane = this.getContentPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
//      

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}

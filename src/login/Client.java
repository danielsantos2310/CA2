/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Daniel Santos
 */
class Client extends JFrame implements ActionListener {

//    private JList leftlist;
//    private JList rightlist;
//    private JButton movebutton;
    private static String[] time = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00"};

    public Client() {
        this.setVisible(true);
        this.setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //Date pick panel
        
        
        
        
        
        // time pick panel  
        JPanel timepanel = new JPanel();
        JLabel timelabel = new JLabel("pick time");
        this.add(timelabel);
//        timelabel.setAlignmentY(TOP_ALIGNMENT);
        this.add(timepanel);
        JList leftlist = new JList(time);
        timepanel.add(leftlist);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane js = new JScrollPane();
        timepanel.add(js, leftlist);
        timepanel.add(js);

        JList rightlist = new JList();
        timepanel.add(rightlist);
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(30);
        rightlist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane jsr = new JScrollPane();
        timepanel.add(jsr, rightlist);
        timepanel.add(jsr);

        JButton movebutton = new JButton("add Day");
        movebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String[] selected = {(String) leftlist.getSelectedValue()};
                rightlist.setListData(selected);
            }
        });
        add(movebutton);

//        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

//
//    public Client() {
//        super("Client Area");
//        JPanel clientest = new JPanel();
//        JLabel clientitle = new JLabel("Pick a Date");
//        clientitle.setAlignmentX(TOP_ALIGNMENT);
//        clientest.add(clientitle);
//        this.add(clientest);
//        GridLayout clientlayout = new GridLayout(1, 2);
//        this.setLayout(clientlayout);
//        this.setSize(600, 300);
//        this.setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Pick  date
//        Date date = new Date();
//    
//        // time pick
//        JPanel timepanel =new JPanel();
//        BoxLayout timebox = new BoxLayout(timepanel, BoxLayout.Y_AXIS);
//        timepanel.setLayout(timebox);
//        this.add(timepanel, BorderLayout.CENTER);
//        JLabel clientdate = new JLabel("Pick a Time");
//        timepanel.add(clientdate);
//        String labels[] = {"08:00", "09:00", "10:00", "11:00", "12:00", "14:00", "15:00", "16:00", "17:00", "18:00"};
//        JList list = new JList(labels);
//        JScrollPane scrollPane = new JScrollPane(list);
//        Container contentPane = this.getContentPane();
//        timepanel.add(scrollPane);
//        scrollPane.setMaximumSize(scrollPane.getPreferredSize());
//        
//        //        
//        //time pick button
////       
//        JButton pickdaybutton = new JButton("Pick a Time");
//        timepanel.add(pickdaybutton);
////        this.add(pickdaybutton, BorderLayout.PAGE_START);
////        pickdaybutton.setBounds(50, 50, 30, 30);
//        //pickdaybutton.setMaximumSize(pickdaybutton.getPreferredSize());
//        
//        this.validate();
//        this.repaint();
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }


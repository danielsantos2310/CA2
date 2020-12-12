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
//    private JButton addtimebutton;
    private static String[] time = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00"};
    private static String[] month = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String[] day = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

    public Client() {
        this.setVisible(true);
        this.setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //month pick panel
        JPanel monthpanel = new JPanel();
        JLabel monthlabel = new JLabel("pick a month");
        this.add(monthlabel);
        this.add(monthpanel);

        //monthlistleft
        JList Monthleft = new JList(month);
        monthpanel.add(Monthleft);
        Monthleft.setVisibleRowCount(3);
        Monthleft.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane jsml = new JScrollPane();
        monthpanel.add(jsml, Monthleft);
        monthpanel.add(jsml);

        //monthlistright
        JList monthright = new JList();
        monthpanel.add(monthright);
        monthright.setVisibleRowCount(3);
        monthright.setFixedCellWidth(100);
        monthright.setFixedCellHeight(30);
        monthright.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane jsmr = new JScrollPane();
        monthpanel.add(jsmr, monthright);
        monthpanel.add(jsmr);

        //addmonth button
        JButton addmonthbutton = new JButton("add month");
        addmonthbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String[] selected = {(String) Monthleft.getSelectedValue()};
                monthright.setListData(selected);
            }
        });
        add(addmonthbutton);

        //day pick panel
        JPanel daypanel = new JPanel();
        JLabel daylabel = new JLabel("pick a Day");
        this.add(daylabel);
        this.add(daypanel);

        //daylistleft
        JList dayleft = new JList(day);
        daypanel.add(dayleft);
        dayleft.setVisibleRowCount(3);
        dayleft.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane jsdl = new JScrollPane();
        monthpanel.add(jsdl, dayleft);
        monthpanel.add(jsdl);

        //daylistright
        JList dayright = new JList();
        monthpanel.add(dayright);
        dayright.setVisibleRowCount(3);
        dayright.setFixedCellWidth(100);
        dayright.setFixedCellHeight(30);
        dayright.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane jsdr = new JScrollPane();
        monthpanel.add(jsdr, dayright);
        monthpanel.add(jsdr);

        //addmonth button
        JButton addDaybutton = new JButton("add Day");
        addDaybutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String[] selected = {(String) dayleft.getSelectedValue()};
                dayright.setListData(selected);
            }
        });
        add(addDaybutton);

        // time pick panel
        JPanel timepanel = new JPanel();
        JLabel timelabel = new JLabel("pick time");
        this.add(timelabel);
        this.add(timepanel);

        //timelistleft
        JList leftlist = new JList(time);
        timepanel.add(leftlist);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane js = new JScrollPane();
        timepanel.add(js, leftlist);
        timepanel.add(js);

        //timelistright
        JList rightlist = new JList();
        timepanel.add(rightlist);
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(30);
        rightlist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane jsr = new JScrollPane();
        timepanel.add(jsr, rightlist);
        timepanel.add(jsr);

        //addtime button
        JButton addtimebutton = new JButton("add Time");
        addtimebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String[] selected = {(String) leftlist.getSelectedValue()};
                rightlist.setListData(selected);
            }
        });
        add(addtimebutton);
        //logout button

        JButton logout = new JButton("logout");
        this.add(logout);
        logout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            logout.getAction();

            }
        });
        add(logout);
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


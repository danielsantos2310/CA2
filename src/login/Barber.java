/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Daniel Santos
 */
class Barber extends JFrame implements TableModel{
    JPanel paneltable = new JPanel();
    JMenuBar bar = new JMenuBar();
    JMenu menu1 = new JMenu ("close") ;
    JMenuItem exit =new JMenuItem ("exit");

    public Barber() {
        this.add(paneltable);
        setJMenuBar (bar);
        bar.add(menu1);
        menu1.add(exit);
        exit.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e){
        System.exit(0);}
        });
        
        this.setVisible(true);
        this.setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Barber table view books
        String [] coluns = {"Name", "Date", "Time"};
        Object [][] data = {
	{"Claudia Obrien", "09/04/2020", "09:00"},
	{"Chico Kanavhgna", "12/09/2020", "11:00"},
	{"Thiago koswijta", "12/09/2020", "15:00"}};
         JTable table = new JTable(data, coluns);
         JScrollPane jsb = new JScrollPane(table);
        paneltable.add(jsb);
};

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    }

    
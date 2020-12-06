/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Santos
 */
class Client extends JFrame {

    public Client() {
        super("Client Area");
        JPanel clientest = new JPanel ();
        JLabel clientlabel = new JLabel("Teste");
        clientest.add(clientlabel);
        this.add(clientest);
        this.setSize(400, 300);
        this.setVisible(true);
        
        
        
        
    }
    
}

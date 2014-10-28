
package lab1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Joe
 */
public class MainWindow extends JFrame implements ActionListener {
    
    private JLabel lblPrompt, lblOutput;
    private JTextField txtInput;
    private JButton btnSayHello;  
    private Container container;
    
    public MainWindow () {
        lblPrompt = new  JLabel ("Enter Name");
        lblOutput =new JLabel();
        txtInput = new JTextField ();
        btnSayHello = new JButton("Say Hello");
        btnSayHello.addActionListener(this);
        container = this.getContentPane();
        container.add(lblPrompt,BorderLayout.WEST);
        container.add(txtInput,BorderLayout.CENTER);
        container.add(lblOutput,BorderLayout.EAST);
        container.add(btnSayHello,BorderLayout.SOUTH);
        
        this.setSize(300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String name = txtInput.getText();
       String message = "Hello " + name;
       lblOutput.setText(message);
    }
    
}

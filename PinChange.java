

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.awt.*;

import javax.swing.*;
public class PinChange  implements KeyListener,ActionListener {
	JTextField t=new JTextField();
    JLabel l1=new JLabel("Enter Old PIN");
     JFrame f=new JFrame("PIN Change");
	JButton b=new JButton("Save" );
   JButton b1=new JButton("Cancel" );
    public PinChange() {
		
       
        f.setBounds(0, 0, 200, 300);
        f.setLayout(null);
        f.setExtendedState(f.MAXIMIZED_BOTH);
        f.setVisible(true);

        Container c = f.getContentPane();

        JLabel la = new JLabel(); 
        la.setIcon(new ImageIcon("indmoney.png")); 
        Dimension size = la.getPreferredSize(); 
        la.setBounds(0, 0, 2000, 1000); 

        c.add(la);

        JPanel j=new JPanel();
        j.setBounds(450,160,650,580);
        j.setBackground(Color.white);
        j.setLayout(null);
        j.setVisible(true);
        la.add(j);

        JPanel j1=new JPanel();
        j1.setBounds(450,120,650,40);
        j1.setBackground(Color.decode("#b30059"));
        j1.setLayout(null);
        j1.setVisible(true);
        la.add(j1);
        
        String text = "<html><B>MCA CHIT FUND</B></html>";

        JLabel l3=new JLabel(text);
        l3.setForeground(Color.white);
        l3.setBounds(190,9,650,30);
		  l3.setFont(new Font("Times New Roman", Font.PLAIN, 40));
	     j1.add(l3);

       JLabel l=new JLabel();
	    l.setIcon(new ImageIcon("logocoloured2.png"));
	    l.setBounds(255, 30, 150, 130);
	    j.add(l);
       
        
        l1.setBounds(280,60,150,150);
        j.add(l1);
        JLabel l2=new JLabel("Enter New PIN");
        l2.setBounds(280,210,150,20);
        j.add(l2);

        
        
        t.setBounds(230,170,210,20);
        j.add(t);
        t.addKeyListener(this);
        JTextField t1=new JTextField();
        t1.setBounds(230,260,210,20);
        t1.addKeyListener(this);
        j.add(t1);

       

        
         b.setBounds(230,300,100,24);
			b.addActionListener(this) ;
	        j.add(b);
			
	        b1.setBounds(340,300,100,24);
			b1.addActionListener(this) ;
	        j.add(b1);

        String text2 = "<html><B>Paisa hi Paisa hoga...! </B></html>";
		  JLabel l4=new JLabel(text2);
	     l4.setBounds(190,400,350,150);
	     l4.setForeground(Color.decode("#b30059"));
		  l4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
	     j.add(l4);
    }
       public void actionPerformed(ActionEvent ae) {
		
        	if(ae.getSource()==b1) {
        		f.dispose();
    			new Language();
        	}
       }
     
         public void keyPressed(KeyEvent k) {
            String value = t.getText();
           // int a=Integer.parseInt(value);
            int l = value.length();
            if (k.getKeyChar() >= '0' && k.getKeyChar() <= '9') {
               t.setEditable(true);
              
            }/*
            else if(a<=10000){
                t.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only numbers ");
            } */
            else {
               t.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only numbers are allowed");
            }
         }
         public void keyReleased (KeyEvent e) {    
         }    
         public void keyTyped (KeyEvent e) {    
         } 

       
}

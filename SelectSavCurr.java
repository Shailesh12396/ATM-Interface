
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class SelectSavCurr implements ActionListener {
	
	    private  JFrame f=new JFrame("Account Type Selection");
        //String st="हिंदी";
	    private JButton b1=new JButton("Savings" );

        private JButton b2=new JButton("Current" );
        
      
        
        public SelectSavCurr() {
			f.setExtendedState(f.MAXIMIZED_BOTH);
        	f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			f.getContentPane().add(b1);
			f.setExtendedState(f.MAXIMIZED_BOTH);
	        b1.setBounds(100,650,370,90);
			b1.setBackground(Color.decode("#d1e0e0"));
			//b1.setBackground(Color.gray);
	        b1.addActionListener(this) ;
	        
	        f.getContentPane().add(b2);
			b2.setBackground(Color.decode("#d1e0e0"));
	        b2.setBounds(1080,650,370,90);
			b2.addActionListener(this) ;

			
	        f.setLayout(null);
			 Container c = f.getContentPane();

        JLabel la = new JLabel(); 
        la.setIcon(new ImageIcon("logocoloured.png")); 
        Dimension size = la.getPreferredSize(); 
        la.setBounds(-200, 0, 1950, 1100); 

        c.add(la);
	      
	        f.setVisible(true);
		}
 
        public void actionPerformed(ActionEvent ae) {
        	if(ae.getSource()==b1) {
        		f.dispose();
    			new HindiOption();
        	}
        	if(ae.getSource()==b2) {
        		f.dispose();
    			new EngOption();
        	}
			
		}
    /*
public static void main(String[] args){
	new Language();
	
}*/
}

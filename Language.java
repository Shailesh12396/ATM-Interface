
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Language implements ActionListener {
	
	    private  JFrame f=new JFrame("MCA CHIT FUND ATM");
        //String st="हिंदी";
	    private JButton b1=new JButton("Hindi" );

        private JButton b2=new JButton("English" );
        
      
        
        public Language() {
			f.setExtendedState(f.MAXIMIZED_BOTH);
        	f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			f.getContentPane().add(b1);
	        b1.setBounds(100,650,370,90);
			b1.setBackground(Color.decode("#d1e0e0"));
	        b1.addActionListener(this) ;
	        
	        f.getContentPane().add(b2);
	        b2.setBounds(1080,650,370,90);
			b2.setBackground(Color.decode("#d1e0e0"));
			b2.addActionListener(this) ;

			//f.setSize(600,500);
	        f.setLayout(null);
			Container c = f.getContentPane();

        JLabel la = new JLabel(); 
        la.setIcon(new ImageIcon("finallogo2.png")); 
        Dimension size = la.getPreferredSize(); 
        la.setBounds(-200, 0, 1950, 1100); 

        c.add(la);
	       // f.getContentPane().setBackground(Color.decode("#3b5998"));
	        f.setVisible(true);
		}
 
        public void actionPerformed(ActionEvent ae) {
        	if(ae.getSource()==b1) {
        		f.dispose();
    			new SelectSavCurr();
        	}
        	if(ae.getSource()==b2) {
        		f.dispose();
    			new SelectSavCurr();
        	}
			
		}
    
public static void main(String[] args){
	new Language();
	
}
}

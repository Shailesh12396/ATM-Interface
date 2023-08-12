
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;


	  public class EngOption implements ActionListener{
		   JFrame f=new JFrame("MCA CHIT FUND ATM");
		   JButton b1=new JButton("PIN Change" );
		   JButton b2=new JButton("Fast cash" );
	       JButton b3=new JButton("Balance Enquiry" );
	       JButton b4=new JButton("Mini Statement" );
	       JButton b5=new JButton("Withdrawal" );
	       JButton b6=new JButton("Deposit" );
	       JButton b7=new JButton("Fund Transfer" );
	       JButton b8=new JButton("Green PIN" );

	   
	     
	     public EngOption() {
			f.setExtendedState(f.MAXIMIZED_BOTH);
		    f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    f.setSize(600,500);
	        f.setLayout(null);
	        //f.getContentPane().setBackground(Color.decode("#d1e0e0"));
			Container c = f.getContentPane(); 

            JLabel la = new JLabel(); 
            la.setIcon(new ImageIcon("background.png")); 
            Dimension size = la.getPreferredSize(); 
            la.setBounds(-200, 0, 2000, 1100); 

            c.add(la);
	        f.setVisible(true);

			

			
	     
			f.getContentPane().add(b1);
	        b1.setBounds(80,200,370,90);
	        b1.addActionListener(this) ;
	     
			f.getContentPane().add(b2);
	        b2.setBounds(80,350,370,90);
	        b2.addActionListener(this) ;
	     
			f.getContentPane().add(b3);
	        b3.setBounds(80,500,370,90);
	        b3.addActionListener(this) ;
	     
	     
			f.getContentPane().add(b4);
	        b4.setBounds(80,650,370,90);
	        b4.addActionListener(this) ;
	     
			f.getContentPane().add(b5);
	        b5.setBounds(1080,200,370,90);
	        b5.addActionListener(this) ;
	     
			f.getContentPane().add(b6);
	        b6.setBounds(1080,350,370,90);
	        b6.addActionListener(this) ;
	     
			f.getContentPane().add(b7);
	        b7.setBounds(1080,500,370,90);
	        b7.addActionListener(this) ;
	     
			f.getContentPane().add(b8);
	        b8.setBounds(1080,650,370,90);
	        b8.addActionListener(this) ;
	    

	}

	     public void actionPerformed(ActionEvent ae) {
		     if(ae.getSource()==b1) {
			    f.dispose();
			    new PinChange();
		     }
		     if(ae.getSource()==b2) {
			    f.dispose();
			    new FastCash();
		     }
		     if(ae.getSource()==b3) {
			    f.dispose();
			    new BalanceEnquiry();
		     }
		     if(ae.getSource()==b4) {
			    f.dispose();
			    new MiniStatement();
		     }
		     if(ae.getSource()==b5) {
			    f.dispose();
			    WithDraw w=new WithDraw();
				w.WithDraw2();
		     }
		     if(ae.getSource()==b6) {
			    f.dispose();
			    new Deposit();
		     }
		     if(ae.getSource()==b7) {
			    f.dispose();
			    new FundTransfer();
		     }
		     if(ae.getSource()==b8) {
		     	f.dispose();
			    new GreenPin();
		}

	}
	     public static void main(String[] args) throws IOException{
	       
	      new EngOption();
	}
	}




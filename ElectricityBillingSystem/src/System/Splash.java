package System;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JWindow;


public class Splash extends JWindow implements Runnable {

	Thread t;
	
	public Splash() {
		// TODO Auto-generated constructor stub
		JWindow w =new JWindow(this);
		w.setSize(376,451); 
		
		w.setLocationRelativeTo(null);
		w.setVisible(true);
		
		//Use your folder image location in string to see the output
		String str="ElectricityBillingSystem/src/icon/elect.jpg";
		

		JLabel label=new JLabel(new ImageIcon(str));
		w.add(label);

		w.setVisible(true);
		
		//This loop is for splash frame size gradually increment
		int x = 1;
        for (int i = 2; i < 450; i+=4, x+=1) {
        	w.setSize(i + x, i);
        	w.setLocation(700 - ((i + x)/2), 400 - (i/2));
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        t = new Thread(this);
        //start() internally calls run()
        t.start();
        w.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 try {
			 //screen will wait for 4sec
	            Thread.sleep(4000);
	            setVisible(false);
	            
	            // To invoke Login Frame
	            new Login();
	          
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Splash();

	}
}

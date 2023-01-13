package System;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BillDetails extends JFrame{

    BillDetails() {
   
    	super("BillDetails");
        setSize(700, 650);
        setLocation(400, 150);
        
        getContentPane().setBackground(Color.WHITE);
        
        JTable table = new JTable();
        
//-------------------------------------------------------------------------------------------------------------------
        
        //My-SQl code is here
          
//------------------------------------------------------------------------------------------------------------------- 
        
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0, 0, 700, 650);
        add(sp);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new BillDetails();
    }
}

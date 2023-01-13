package System;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculateBill extends JFrame implements ActionListener{

    JTextField tfname, tfaddress, tfstate, tfunits, tfemail, tfphone;
    JButton next, cancel;
    JLabel lblname, labeladdress;
    Choice meternumber, cmonth;
    CalculateBill() {
        setSize(700, 500);
        setLocation(400, 150);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(173, 216, 230));
        add(p);
        
//-------------------------------------------------------------------------------------------------------------------
        
        JLabel heading = new JLabel("Calculate Electricity Bill");
        heading.setBounds(100, 10, 400, 25);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        p.add(heading);
        
        JLabel lblmeternumber = new JLabel("Meter Number");
        lblmeternumber.setBounds(100, 80, 100, 20);
        p.add(lblmeternumber);
//-------------------------------------------------------------------------------------------------------------------
        
        meternumber = new Choice();
        
        
      //My-SQl code is here
        
        
        meternumber.setBounds(240, 80, 200, 20);
        p.add(meternumber);
//-------------------------------------------------------------------------------------------------------------------
        
        JLabel lblmeterno = new JLabel("Name");
        lblmeterno.setBounds(100, 120, 100, 20);
        p.add(lblmeterno);
        
        lblname = new JLabel("");
        lblname.setBounds(240, 120, 100, 20);
        p.add(lblname);
//-------------------------------------------------------------------------------------------------------------------
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(100, 160, 100, 20);
        p.add(lbladdress);
        
        labeladdress = new JLabel();
        labeladdress.setBounds(240, 160, 200, 20);
        p.add(labeladdress);
//-------------------------------------------------------------------------------------------------------------------
        
        
        
      //My-SQl code is here
        
        
//-------------------------------------------------------------------------------------------------------------------
        meternumber.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
            	
            	//My-SQl code is here
            	
            }
        });
//-------------------------------------------------------------------------------------------------------------------
        JLabel lblcity = new JLabel("Units Consumed");
        lblcity.setBounds(100, 200, 100, 20);
        p.add(lblcity);
        
        tfunits = new JTextField();
        tfunits.setBounds(240, 200, 200, 20);
        p.add(tfunits);
//-------------------------------------------------------------------------------------------------------------------
        
        JLabel lblstate = new JLabel("Month");
        lblstate.setBounds(100, 240, 100, 20);
        p.add(lblstate);
        
        cmonth = new Choice();
        cmonth.setBounds(240, 240, 200, 20);
        cmonth.add("January");
        cmonth.add("February");
        cmonth.add("March");
        cmonth.add("April");
        cmonth.add("May");
        cmonth.add("June");
        cmonth.add("July");
        cmonth.add("August");
        cmonth.add("September");
        cmonth.add("October");
        cmonth.add("November");
        cmonth.add("December");
        p.add(cmonth);
//-------------------------------------------------------------------------------------------------------------------
        
        next = new JButton("Submit");
        next.setBounds(120, 350, 100,25);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        p.add(next);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(250, 350, 100,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        p.add(cancel);
        
        setLayout(new BorderLayout());
        
        add(p, "Center");
//-------------------------------------------------------------------------------------------------------------------
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hicon2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image, "West");
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
    }
//-------------------------------------------------------------------------------------------------------------------
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            
            	//My-SQl code is here
            	
        } else {
            setVisible(false);
        }
    }
//-------------------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args) {
        new CalculateBill();
    }
}

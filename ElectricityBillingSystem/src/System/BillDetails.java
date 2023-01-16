package System;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BillDetails extends JFrame{

    BillDetails(String meter) {
   
    	super("BillDetails");
        setSize(700, 650);
        setLocation(400, 150);
        
        getContentPane().setBackground(Color.WHITE);
        
        JTable table = new JTable();
        
//-------------------------------------------------------------------------------------------------------------------
        try {
            Connector c = new Connector();
            String query = "select * from bill where meter_no = '"+meter+"'";
            ResultSet rs = c.s.executeQuery(query);

            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
          
//------------------------------------------------------------------------------------------------------------------- 
        
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0, 0, 700, 650);
        add(sp);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new BillDetails("");
    }
}

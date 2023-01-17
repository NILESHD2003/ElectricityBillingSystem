package System;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {
    Connection c;
    Statement s;
    Connector()
    {
        try
        {
            //for nilesh
//            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Nilesh");
            //for karan
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","karan1234");
            s=c.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

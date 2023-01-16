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
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Nilesh");
            s=c.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

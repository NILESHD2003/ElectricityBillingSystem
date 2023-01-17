package System;

import javax.swing.*;
import java.awt.*;

public class Analytics{

    Analytics(){
        JFrame frame = new JFrame();
        frame.setTitle("Analytics");
        frame.setSize(500,700);
        frame.setBackground(Color.BLUE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading = new JLabel("Unit Analytics");
        heading.setBounds(130, 30, 400, 60);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 38));
        frame.add(heading);

        JLabel j1 = new JLabel("January");
        j1.setBounds(20, 100, 200, 25);
        j1.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j1);

        JProgressBar bar1 = new JProgressBar(0,1000);
        bar1.setBackground(Color.BLACK);
        bar1.setStringPainted(true);
        bar1.setString("50 unit");//fetch the data of user here
        bar1.setValue(50);//fetch the data of user here
        bar1.setBounds(130,100,330,25);
        bar1.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar1);

        JLabel j2 = new JLabel("February");
        j2.setBounds(20, 130, 200, 25);
        j2.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j2);

        JProgressBar bar2 = new JProgressBar(0,1000);
        bar2.setBackground(Color.BLACK);
        bar2.setStringPainted(true);
        bar2.setString("150 unit");
        bar2.setValue(150);
        bar2.setBounds(130,130,330,25);
        bar2.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar2);

        JLabel j3 = new JLabel("March");
        j3.setBounds(20, 160, 200, 25);
        j3.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j3);

        JProgressBar bar3 = new JProgressBar(0,1000);
        bar3.setBackground(Color.BLACK);
        bar3.setStringPainted(true);
        bar3.setString("220 unit");
        bar3.setValue(220);
        bar3.setBounds(130,160,330,25);
        bar3.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar3);

        JLabel j4 = new JLabel("April");
        j4.setBounds(20, 190, 200, 25);
        j4.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j4);

        JProgressBar bar4 = new JProgressBar(0,1000);
        bar4.setBackground(Color.BLACK);
        bar4.setStringPainted(true);
        bar4.setString("300 unit");
        bar4.setValue(300);
        bar4.setBounds(130,190,330,25);
        bar4.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar4);

        JLabel j5 = new JLabel("May");
        j5.setBounds(20, 220, 200, 25);
        j5.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j5);

        JProgressBar bar5 = new JProgressBar(0,1000);
        bar5.setBackground(Color.BLACK);
        bar5.setStringPainted(true);
        bar5.setString("850 unit");
        bar5.setValue(850);
        bar5.setBounds(130,220,330,25);
        bar5.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar5);

        JLabel j6 = new JLabel("June");
        j6.setBounds(20, 250, 200, 25);
        j6.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j6);

        JProgressBar bar6 = new JProgressBar(0,1000);
        bar6.setBackground(Color.BLACK);
        bar6.setStringPainted(true);
        bar6.setString("556 unit");
        bar6.setValue(556);
        bar6.setBounds(130,250,330,25);
        bar6.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar6);

        JLabel j7 = new JLabel("Jully");
        j7.setBounds(20, 280, 200, 25);
        j7.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j7);

        JProgressBar bar7 = new JProgressBar(0,1000);
        bar7.setBackground(Color.BLACK);
        bar7.setStringPainted(true);
        bar7.setString("990 unit");
        bar7.setValue(990);
        bar7.setBounds(130,280,330,25);
        bar7.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar7);

        JLabel j8 = new JLabel("August");
        j8.setBounds(20, 310, 200, 25);
        j8.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j8);

        JProgressBar bar8 = new JProgressBar(0,1000);
        bar8.setBackground(Color.BLACK);
        bar8.setStringPainted(true);
        bar8.setString("730 unit");
        bar8.setValue(730);
        bar8.setBounds(130,310,330,25);
        bar8.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar8);

        JLabel j9 = new JLabel("September");
        j9.setBounds(20, 340, 200, 25);
        j9.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j9);

        JProgressBar bar9 = new JProgressBar(0,1000);
        bar9.setBackground(Color.BLACK);
        bar9.setStringPainted(true);
        bar9.setString("540 unit");
        bar9.setValue(540);
        bar9.setBounds(130,340,330,25);
        bar9.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar9);

        JLabel j10 = new JLabel("October");
        j10.setBounds(20, 370, 200, 25);
        j10.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j10);

        JProgressBar bar10 = new JProgressBar(0,1000);
        bar10.setBackground(Color.BLACK);
        bar10.setStringPainted(true);
        bar10.setString("660 unit");
        bar10.setValue(660);
        bar10.setBounds(130,370,330,25);
        bar10.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar10);

        JLabel j11 = new JLabel("November");
        j11.setBounds(20, 400, 200, 25);
        j11.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j11);

        JProgressBar bar11 = new JProgressBar(0,1000);
        bar11.setBackground(Color.BLACK);
        bar11.setStringPainted(true);
        bar11.setString("813 unit");
        bar11.setValue(813);
        bar11.setBounds(130,400,330,25);
        bar11.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar11);

        JLabel j12 = new JLabel("December");
        j12.setBounds(20, 430, 200, 25);
        j12.setFont(new Font("Thoma", Font.PLAIN, 20));
        frame.add(j12);

        JProgressBar bar12 = new JProgressBar(0,1000);
        bar12.setBackground(Color.BLACK);
        bar12.setStringPainted(true);
        bar12.setString("460 unit");
        bar12.setValue(460);
        bar12.setBounds(130,430,330,25);
        bar12.setOrientation(SwingConstants.HORIZONTAL);
        frame.add(bar12);

        JLabel total = new JLabel("Total Unit Consumed :");
        total.setBounds(20, 480, 250, 50);
        total.setFont(new Font("Thoma", Font.PLAIN, 25));
        frame.add(total);

        frame.setVisible(true);
    }

    public static void main(String [] args){
        new Analytics();
    }
}

package airlinereservationsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class dashboard extends JFrame implements ActionListener {
    JButton p2,p4,p5,p6;

    
    dashboard(){
        setExtendedState(JFrame.MAXIMIZED_BOTH); // to maximize frame when we don't know screen size
         setLayout(null);
         getContentPane().setBackground(Color.white);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlineicons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel (i3);
        i4.setBounds(600,0,1000,900);
        add(i4);

        p2 = new JButton("ABOUT");
        p2.setBounds(50,30,120,40);
        p2.setForeground(Color.white);
        p2.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.setBackground(new Color(99,3,48));
        p2.addActionListener(this);
        add(p2);
       
        
        p4 = new JButton("CONTACT");
        p4.setBounds(200,30,130,40);
        p4.setForeground(Color.white);
        p4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p4.setBackground(new Color(99,3,48));
        p4.addActionListener(this);
        add(p4);
        
        JPanel panel = new JPanel();
        panel.setBounds(100,200,500,80);
        panel.setBackground(new Color(216,191,216));
        add(panel);
        
        JLabel text = new JLabel("TRAVEL WITH US");
        text.setBounds(50,50,400,80);
        text.setFont(new Font("Tahoma",Font.BOLD,50));
        panel.add(text);
    
        p5 = new JButton("Login");
        p5.setBounds(140,300,150,48);
        p5.setForeground(Color.white);
        p5.setFont(new Font("Tahoma",Font.PLAIN,22));
        p5.setBackground(new Color(99,3,48));
        p5.addActionListener(this);
        add(p5);
        
        p6 = new JButton("SignUp");
        p6.setBounds(290,300,150,48);
        p6.setForeground(Color.white);
        p6.setFont(new Font("Tahoma",Font.PLAIN,22));
        p6.setBackground(new Color(99,3,48));
        p6.addActionListener(this);
        add(p6);

         
         setVisible(true);
                
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==p2){
            new About();
        } else if(ae.getSource()==p4){
            new Contact();
        } else if(ae.getSource()==p5){
            new login();
        } else if(ae.getSource()==p6){
            new Signup();
        }
    }
    

    public static void main(String[] args){
        new dashboard();
    }
    
}

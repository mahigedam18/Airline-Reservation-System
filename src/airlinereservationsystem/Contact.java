package airlinereservationsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Contact extends JFrame implements ActionListener{
    JButton back,send;
    Contact(){
    
    setExtendedState(JFrame.MAXIMIZED_BOTH); // to maximize frame when we don't know screen size
    setLayout(null);
    getContentPane().setBackground(Color.white);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlineicons/contact.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel (i3);
        i4.setBounds(900,0,700,800);
        add(i4);
         
    JLabel text = new JLabel("Get In Touch");
    text.setBounds(100,50,300,80);
    text.setFont(new Font("Tahoma",Font.BOLD,40));
    add(text);
    
    
    JLabel fname = new JLabel("First Name");
    fname.setFont(new Font("Tahoma",Font.PLAIN,18));
    fname.setBounds(100,200,150,25);
    add(fname);
    
    JTextField tffname = new JTextField();
    tffname.setBounds(300,240,150,25);
    add(tffname);
    
    JLabel lname = new JLabel("Last Name");
    lname.setFont(new Font("Tahoma",Font.PLAIN,18));
    lname.setBounds(300,200,150,25);
    add(lname);
    
    JTextField tflname = new JTextField();
    tflname.setBounds(100,240,150,25);
    add(tflname);
    
    JLabel email = new JLabel("Email");
    email.setFont(new Font("Tahoma",Font.PLAIN,18));
    email.setBounds(100,300,150,25);
    add(email);
    
    JTextField tfemail = new JTextField();
    tfemail.setBounds(100,340,150,25);
    add(tfemail);
    
    JLabel phone = new JLabel("Phone");
    phone.setFont(new Font("Tahoma",Font.PLAIN,18));
    phone.setBounds(300,300,150,25);
    add(phone);
    
    JTextField tfphone = new JTextField();
    tfphone.setBounds(300,340,150,25);
    add(tfphone);
    
    JLabel message = new JLabel("Message");
    message.setFont(new Font("Tahoma",Font.PLAIN,18));
    message.setBounds(100,400,150,25);
    add(message);
    
    TextArea tarea = new TextArea();
    tarea.setBounds(100,440,450,150);
    add(tarea);
    
    send = new JButton("SEND");
    send.setBounds(250,620,100,25);
    send.setBackground(Color.LIGHT_GRAY);
    add(send);
    
    JLabel phone1 = new JLabel("Phones");
    phone1.setFont(new Font("Tahoma",Font.PLAIN,18));
    phone1.setBounds(700,200,150,25);
    add(phone1);
    
    JLabel phonenumber1 = new JLabel("1-800-9876-544");
    phonenumber1.setFont(new Font("Tahoma",Font.PLAIN,14));
    phonenumber1.setBounds(700,230,150,25);
    add(phonenumber1);
    
    JLabel phonenumber2 = new JLabel("1-800-9876-540");
    phonenumber2.setFont(new Font("Tahoma",Font.PLAIN,14));
    phonenumber2.setBounds(700,250,150,25);
    add(phonenumber2);
    
    JLabel contactemail = new JLabel("Email");
    contactemail.setFont(new Font("Tahoma",Font.PLAIN,18));
    contactemail.setBounds(700,300,150,25);
    add(contactemail);
    
    JLabel contactemail1 = new JLabel("info@gmail.com");
    contactemail1.setFont(new Font("Tahoma",Font.PLAIN,14));
    contactemail1.setBounds(700,330,150,25);
    add(contactemail1);
    
    JLabel address = new JLabel("Address");
    address.setFont(new Font("Tahoma",Font.PLAIN,18));
    address.setBounds(700,400,150,25);
    add(address);
    
    JLabel address1 = new JLabel("xyz square, Bombay");
    address1.setFont(new Font("Tahoma",Font.PLAIN,14));
    address1.setBounds(700,430,200,25);
    add(address1);
    
    back = new JButton("Back");
        back.setBounds(700,50,80,40);
        back.addActionListener(this);
        add(back);
    
    
    
    
    setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
        setVisible(false);
        }
     else {
        JOptionPane.showMessageDialog(null,"Message send successfully"); 
        setVisible(false);
    }
    }
    
    public static void main(String[] args){
        new Contact();
    }
}


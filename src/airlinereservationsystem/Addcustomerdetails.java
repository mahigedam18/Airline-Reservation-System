
package airlinereservationsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Addcustomerdetails extends JFrame implements ActionListener{
    
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfphone,tfemail;
    JRadioButton rmale,rfemale,rothers;  
    JButton add,back;
    
    
    String username;
    Addcustomerdetails(String username){
        this.username = username;
  
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,850,45);
        p1.setBackground(new Color(204, 204, 255));
        add(p1);
        
        JLabel text = new JLabel("ADD CUSTOMER DETAILS");
        text.setBounds(50,10,350,25);
        text.setForeground(Color.black);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid = new JLabel ("ID");
        lblid.setBounds(30,90,150,25);
        add(lblid);
        
        comboid = new JComboBox(new String[]{"Aadhar Card","Pan Card","PassPort"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.white);
        add(comboid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber = new JTextField ();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.white);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.white);
        add(rfemale);
        
        rothers = new JRadioButton("Others");
        rothers.setBounds(380,210,70,25);
        rothers.setBackground(Color.white);
        add(rothers);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        bg.add(rothers);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);   
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30,330,150,25);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30,370,150,25);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(220,370,150,25);
        add(tfemail);
                
        add = new JButton("ADD");
        add.setBackground(new Color(204, 204, 255));
        add.setForeground(Color.black);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        back = new JButton("BACK");
        back.setBackground(new Color(204, 204, 255));
        back.setForeground(Color.black);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlineicons/addcustomerdetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350,550,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel (i3);
        i4.setBounds(500,20,350,550);
        add(i4);
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==add){
            String username18 = labelusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rmale.isSelected()){

                gender="Male";
            } else if(rfemale.isSelected()){
                gender="Female";
            } else {
                gender="Other";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            try{
                conn c = new conn();
                String query = "insert into customerdetails values ('"+username18+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Customer details added successfully");
                setVisible(false);
                new Confirmbooking(username);
                
            } catch(Exception e){
                e.printStackTrace();
            }
            
        } else{
            setVisible(false);
        }
        
    }
    
    
    public static void main(String[] args){
        new Addcustomerdetails("");
    }

}

    













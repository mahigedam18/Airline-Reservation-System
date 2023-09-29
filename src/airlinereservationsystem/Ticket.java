package airlinereservationsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Ticket extends JFrame implements ActionListener{
    
    JButton back;
String username;
    Ticket(String username){
        this.username=username;
        
        setBounds(200,50,1000,750);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,1000,70);
        p1.setBackground(Color.green);
        add(p1);
        
        JLabel text = new JLabel("TICKET CONFIRMED");
        text.setBounds(50,20,450,25);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,80,150,25);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,80,150,25);
        add(labelusername);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,140,150,25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,140,150,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,200,150,25);
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,200,150,25);
        add(labelnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,260,150,25);
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(220,260,150,25);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,320,150,25);
        add(lblgender);
        
        JLabel labelgender = new JLabel();
        labelgender.setBounds(220,320,150,25);
        add(labelgender);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30,380,150,25);
        add(lblcountry);
        
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(220,380,150,25);
        add(labelcountry);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30,440,150,25);
        add(lbladdress);
        
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(220,440,150,25);
        add(labeladdress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30,500,150,25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,500,150,25);
        add(labelphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30,560,150,25);
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        labelemail.setBounds(220,560,150,25);
        add(labelemail);
        
        JLabel lblway = new JLabel("Way");
       lblway.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblway.setBounds(500, 80,50, 25);
       add(lblway);
       
       JLabel labelway = new JLabel();
        labelway.setBounds(690,80,150,25);
        add(labelway);
       
       JLabel lblfrom = new JLabel("From");
       lblfrom.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblfrom.setBounds(500, 140,130, 25);
       add(lblfrom);
       
       JLabel labelfrom = new JLabel();
       labelfrom.setBounds(690,140,150,25);
       add(labelfrom);
       
       JLabel lbldest = new JLabel("To");
       lbldest.setFont(new Font("Tahoma",Font.PLAIN,14));
       lbldest.setBounds(500, 200,130, 25);
       add(lbldest);
       
       JLabel labelto = new JLabel();
       labelto.setBounds(690,200,150,25);
       add(labelto);
       
       JLabel lbltime = new JLabel("Time");
       lbltime.setFont(new Font("Tahoma",Font.PLAIN,14));
       lbltime.setBounds(500, 260,130, 25);
       add(lbltime);
       
       JLabel labeltime = new JLabel();
       labeltime.setBounds(690,260,150,25);
       add(labelto);
       
       JLabel lblclass = new JLabel("Class");
       lblclass.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblclass.setBounds(500, 320,130, 25);
       add(lblclass);
       
       JLabel labelclass = new JLabel();
       labelclass.setBounds(690,320,150,25);
       add(labelclass);
       
       JLabel lblperson = new JLabel("Passengers");
       lblperson.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblperson.setBounds(500, 380,80, 25);
       add(lblperson);
       
       JLabel labelperson = new JLabel();
       labelperson.setBounds(690,380,150,25);
       add(labelperson);
       
       JLabel departdate = new JLabel("Depart");
       departdate.setFont(new Font("Tahoma",Font.PLAIN,14));
       departdate.setBounds(500, 440,130, 25);
       add(departdate);
       
       JLabel labeldepartdate = new JLabel();
       labeldepartdate.setBounds(690,440,30,25);
       add(labeldepartdate);
       JLabel labeldepartmonth = new JLabel();
       labeldepartmonth.setBounds(720,440,60,25);
       add(labeldepartmonth);
       JLabel labeldepartyear = new JLabel();
       labeldepartyear.setBounds(780,440,60,25);
       add(labeldepartyear);
       
       JLabel returndate = new JLabel("Return");
       returndate.setFont(new Font("Tahoma",Font.PLAIN,14));
       returndate.setBounds(500, 500,130, 25);
       add(returndate);
       
       JLabel labelreturndate = new JLabel();
       labelreturndate.setBounds(690,500,30,25);
       add(labelreturndate);
       JLabel labelreturnmonth = new JLabel();
       labelreturnmonth.setBounds(720,500,60,25);
       add(labelreturnmonth);
       JLabel labelreturnyear = new JLabel();
       labelreturnyear.setBounds(780,500,60,25);
       add(labelreturnyear);
       
       JLabel price = new JLabel("Price");
       price.setFont(new Font("Tahoma",Font.PLAIN,14));
       price.setBounds(500, 560,150, 25);
       add(price);
       
       JLabel labelprice = new JLabel();
       labelprice.setBounds(690,560,150,25);
       add(labelprice);
       
       try{
            conn c= new conn();
            String query = "select * from customerdetails where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
            }
            
        } catch (Exception e){
        }
       
       try{
           conn c= new conn();
            String query = "select * from mainpagevalues ";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelway.setText(rs.getString("way"));
                labelfrom.setText(rs.getString("From1"));
                labelto.setText(rs.getString("To1"));
                labeltime.setText(rs.getString("time"));
                labelclass.setText(rs.getString("class"));
                labelperson.setText(rs.getString("passengers"));
                labeldepartdate.setText(rs.getString("departdate"));
                labeldepartmonth.setText(rs.getString("departmonth"));
                labeldepartyear.setText(rs.getString("departyear"));
                
                labelreturndate.setText(rs.getString("returndate"));
                labelreturnmonth.setText(rs.getString("returnmonth"));
                labelreturnyear.setText(rs.getString("returnyear"));
                
                
                labelprice.setText(rs.getString(""));
                
            }
       
       } catch (Exception e){
           
       }
          
       back = new JButton("BACK");
        
        back.setForeground(Color.BLACK);
        back.setBounds(400,650,100,35);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==back){
        setVisible(false);
        
    }
    }
    
    public static void main(String[] args){
        new Ticket("");
    }
    
}


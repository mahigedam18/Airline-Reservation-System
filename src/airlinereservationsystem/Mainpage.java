
package airlinereservationsystem;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;



public class Mainpage extends JFrame implements ActionListener{
String username;
        JButton search,back,book;
        Choice from,dest,time,dd,mm,yy,class1,person,way,dd1,mm1,yy1;
        JLabel labelprice;
    Mainpage(String username){
        this.username = username;
        
        setBounds(300,200,800,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
       

       JLabel lblway = new JLabel("WAY");
       lblway.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblway.setBounds(30, 30,50, 25);
       add(lblway);

       way = new Choice();
       way.add("One Way");
       way.add("Return");
       way.setBounds(100,30,120,25);
       add(way);
        
       JLabel lblfrom = new JLabel("FROM");
       lblfrom.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblfrom.setBounds(30, 70,130, 25);
       add(lblfrom);

       from = new Choice();
       from.add("Delhi");
       from.add("Mumbai");
       from.add("Hyderabad");
       from.setBounds(30,100,120,25);
       add(from);
       
       JLabel lbldest = new JLabel("TO");
       lbldest.setFont(new Font("Tahoma",Font.PLAIN,14));
       lbldest.setBounds(200, 70,130, 25);
       add(lbldest);
       
       dest = new Choice();
       dest.add("Delhi");
       dest.add("Mumbai");
       dest.add("Hyderabad");
       dest.setBounds(200,100,120,25);
       add(dest);
       
       JLabel lbltime = new JLabel("Time");
       lbltime.setFont(new Font("Tahoma",Font.PLAIN,14));
       lbltime.setBounds(370, 70,130, 25);
       add(lbltime);
       
       time = new Choice();
       time.add("9:00 IST");
       time.add("10:00 IST");
       time.add("12:00 IST");
       time.setBounds(370,100,120,25);
       add(time);
       
       JLabel lblclass = new JLabel("Class");
       lblclass.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblclass.setBounds(540, 70,130, 25);
       add(lblclass);
       
       class1 = new Choice();
       class1.add("Economy");
       class1.add("Business");
       class1.setBounds(540,100,120,25);
       add(class1);
       
       JLabel lblperson = new JLabel("Passengers");
       lblperson.setFont(new Font("Tahoma",Font.PLAIN,14));
       lblperson.setBounds(680, 70,80, 25);
       add(lblperson);
       
       person = new Choice();
       person.add("1");
       person.add("2");
       person.setBounds(680,100,80,25);
       add(person);
       
       JLabel departdate = new JLabel("DEPART");
       departdate.setFont(new Font("Tahoma",Font.PLAIN,14));
       departdate.setBounds(30, 150,130, 25);
       add(departdate);
       
       dd = new Choice();
       dd.add("1");
       dd.add("2");
       dd.add("3");
       dd.add("4");
       dd.add("5");
       dd.add("6");
       dd.add("7");
       dd.add("8");
       dd.add("9");
       dd.add("10");
       dd.add("11");
       dd.add("12");
       dd.add("13");
       dd.add("14");
       dd.add("15");
       dd.add("16");
       dd.add("17");
       dd.add("18");
       dd.add("19");
       dd.add("20");
       dd.add("21");
       dd.add("22");
       dd.add("23");
       dd.add("24");
       dd.add("25");
       dd.add("26");
      dd.add("27");
      dd.add("28");
      dd.add("29");
      dd.add("30");
      dd.add("31");
       dd.setBounds(30,180,40,25);
       add(dd);
       
       mm = new Choice();
       mm.add("Jan");
       mm.add("Feb");
       mm.add("March");
       mm.add("April");
       mm.add("May");
       mm.add("June");
       mm.add("July");
       mm.add("Aug");
       mm.add("Sept");
       mm.add("Oct");
       mm.add("Nov");
       mm.add("Dec");
       mm.setBounds(70,180,60,25);
       add(mm);
       
       yy = new Choice();
       yy.add("2023");
       yy.add("2024");
       yy.setBounds(130,180,60,25);
       add(yy);
       
       JLabel returndate = new JLabel("RETURN");
       returndate.setFont(new Font("Tahoma",Font.PLAIN,14));
       returndate.setBounds(200, 150,130, 25);
       add(returndate);
       
       dd1 = new Choice();
       dd1.add("1");
       dd1.add("2");
       dd1.add("3");
       dd1.add("4");
       dd1.add("5");
       dd1.add("6");
       dd1.add("7");
       dd1.add("8");
       dd1.add("9");
       dd1.add("10");
       dd1.add("11");
       dd1.add("12");
       dd1.add("13");
       dd1.add("14");
       dd1.add("15");
       dd1.add("16");
       dd1.add("17");
       dd1.add("18");
       dd1.add("19");
       dd1.add("20");
       dd1.add("21");
       dd1.add("22");
       dd1.add("23");
       dd1.add("24");
       dd1.add("25");
       dd1.add("26");
      dd1.add("27");
      dd1.add("28");
      dd1.add("29");
      dd1.add("30");
      dd1.add("31");
       dd1.setBounds(200,180,40,25);
       add(dd1);
       
       mm1= new Choice();
       mm1.add("Jan");
       mm1.add("Feb");
       mm1.add("March");
       mm1.add("April");
       mm1.add("May");
       mm1.add("June");
       mm1.add("July");
       mm1.add("Aug");
       mm1.add("Sept");
       mm1.add("Oct");
       mm1.add("Nov");
       mm1.add("Dec");
       mm1.setBounds(240,180,60,25);
       add(mm1);
       
       yy1 = new Choice();
       yy1.add("2023");
       yy1.add("2024");
       yy1.setBounds(300,180,60,25);
       add(yy1);
       
       search = new JButton("Check Price");
       search.setBounds(80,270,150,25);
       search.setBackground(Color.white);
       search.setForeground( Color.black);
       search.setFont(new Font("Tahoma",Font.PLAIN,14));
       search.addActionListener(this);
       add(search);
       
       labelprice = new JLabel();
       labelprice.setBounds(250,270,150,25);
       add(labelprice);
       
       back = new JButton("BACK");
       back.setBounds(80,350,100,25);
       back.setBackground(Color.white);
       back.setForeground( Color.black);
       back.setFont(new Font("Tahoma",Font.PLAIN,14));
       back.addActionListener(this);
       add(back);
       
       book = new JButton("BOOK");
       book.setBounds(230,350,100,25);
       book.setBackground(Color.white);
       book.setForeground( Color.black);
       book.setFont(new Font("Tahoma",Font.PLAIN,14));
       book.addActionListener(this);
       add(book);
       
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlineicons/mainpage.png"));
        Image i2 = i1.getImage().getScaledInstance(550,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel (i3);
        i4.setBounds(320,120,550,450);
        add(i4);

setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            new dashboard();
        } 
        
        else if(ae.getSource()==search){
            
            String destfrom = from.getSelectedItem();
            String destto = dest.getSelectedItem();
            
           
                if((destfrom.equals("Delhi") && destto.equals("Mumbai")) || (destfrom.equals("Mumbai") && destto.equals("Delhi"))){
                    try{
                       String query = "select * from price where fromdest = '"+from.getSelectedItem()+"' AND todest = '"+dest.getSelectedItem()+"'";
                conn c = new conn();
                ResultSet rs = c.s. executeQuery(query);
                while(rs.next()){
                int cost = Integer.parseInt(rs.getString("priceperperson"));
                int wayprice = Integer.parseInt(rs.getString("selectedway"));
                int classprice = Integer.parseInt(rs.getString("selectedclass"));
                int noofperson = Integer.parseInt(person.getSelectedItem());
                
                String wayselected = way.getSelectedItem();
                String classselected = class1.getSelectedItem();
                
                int total =0;
                    total += wayselected.equals("One Way")? wayprice:200;
                    total+=classselected.equals("Business")? classprice :500;
                    total+=cost;
                    total=total*noofperson;
                    labelprice.setText("Rs "+total);
                }
                       
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                }

             else if((destfrom.equals("Mumbai") && destto.equals("Hyderabad")) || (destfrom.equals("Hyderabad") && destto.equals("Mumbai"))){
                 
                 try{
                       String query = "select * from price where fromdest = '"+from.getSelectedItem()+"' AND todest = '"+dest.getSelectedItem()+"'";
                conn c = new conn();
                ResultSet rs = c.s. executeQuery(query);
                while(rs.next()){
                int cost = Integer.parseInt(rs.getString("priceperperson"));
                int wayprice = Integer.parseInt(rs.getString("selectedway"));
                int classprice = Integer.parseInt(rs.getString("selectedclass"));
                int noofperson = Integer.parseInt(person.getSelectedItem());
                
                String wayselected = way.getSelectedItem();
                String classselected = class1.getSelectedItem();
                
                int total =0;
                    total += wayselected.equals("One Way")? wayprice:200;
                    total+=classselected.equals("Business")? classprice :500;
                    total+=cost;
                    total=total*noofperson;
                    labelprice.setText("Rs "+total);
                }
                       
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                
                
            } else if((destfrom.equals("Hyderabad") && destto.equals("Delhi")) || (destfrom.equals("Delhi") && destto.equals("Hyderabad"))){
                
                try{
                       String query = "select * from price where fromdest = '"+from.getSelectedItem()+"' AND todest = '"+dest.getSelectedItem()+"'";
                conn c = new conn();
                ResultSet rs = c.s. executeQuery(query);
                while(rs.next()){
                int cost = Integer.parseInt(rs.getString("priceperperson"));
                int wayprice = Integer.parseInt(rs.getString("selectedway"));
                int classprice = Integer.parseInt(rs.getString("selectedclass"));
                int noofperson = Integer.parseInt(person.getSelectedItem());
                
                String wayselected = way.getSelectedItem();
                String classselected = class1.getSelectedItem();
                
                int total =0;
                    total += wayselected.equals("One Way")? wayprice:200;
                    total+=classselected.equals("Business")? classprice :500;
                    total+=cost;
                    total=total*noofperson;
                    labelprice.setText("Rs "+total);
                }
                       
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                
            } else{
                JOptionPane.showMessageDialog(null,"Select correct location");
            }
     
       
          
        } else if(ae.getSource()==book){
            
            try{

                conn c= new conn();
                c.s.executeUpdate("insert into mainpagevalues values ('"+way.getSelectedItem()+"','"+from.getSelectedItem()+"','"+dest.getSelectedItem()+"','"+time.getSelectedItem()+"','"+class1.getSelectedItem()+"','"+person.getSelectedItem()+"','"+dd.getSelectedItem()+"','"+mm.getSelectedItem()+"','"+yy.getSelectedItem()+"','"+dd1.getSelectedItem()+"','"+mm1.getSelectedItem()+"','"+yy1.getSelectedItem()+"','"+labelprice.getText()+"')");
                setVisible(false);
                new Addcustomerdetails(username);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        }
        
        
    }
    public static void main(String[] args){
        new Mainpage("");
    }
}

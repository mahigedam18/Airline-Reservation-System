package airlinereservationsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class About extends JFrame implements ActionListener{
    About(){
    setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(new Color(204,204,255));
        
        JLabel text = new JLabel ("ABOUT");
        text.setBounds(200,10,100,40);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        String s = "About project \nWhy MakeMyTrip?\n" +
"Established in 2000, MyTrip has since positioned itself as one of the leading companies, providing great offers, "
                + "competitive airfares, exclusive discounts, and a seamless online booking experience to many of its customers."
                + " The experience of booking your flight tickets, hotel stay, and holiday package through our desktop site or mobile app can "
                + "be done with complete ease and no hassles at all. We also deliver amazing offers, such as Instant Discounts, Fare Calendar,"
                + " MyRewardsProgram, MyWallet, and many more while updating them from time to time to better suit our customers’ evolving needs"
                + " and demands\n\nBooking Flights with MakeMyTrip\n" +
"At MakeMyTrip, you can find the best of deals and cheap air tickets to any place you want by booking your tickets on "
                + "our website or app. Being India’s leading website for hotel, flight, and holiday bookings, MakeMyTrip"
                + " helps you book flight tickets that are affordable and customized to your convenience. With customer "
                + "satisfaction being our ultimate goal, we also have a 24/7 dedicated helpline to cater to our customer’s"
                + " queries and concerns. Serving over 5 million happy customers, we at MakeMyTrip are glad to fulfill the dreams "
                + "of folks who need a quick and easy means to find air tickets. You can get a hold of the cheapest flight of your choice"
                + " today while also enjoying the other available options for your travel needs with us.\n\nDomestic Flights with MakeMyTrip\n" +
"MakeMyTrip is India's leading player for flight bookings. With the cheapest fare guarantee, experience great value at the lowest price. Instant notifications ensure current flight status, instant fare drops, amazing discounts, instant refunds and rebook options, price comparisons and many more interesting features.";
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(200,420,80,40);
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        
    }
    
    public static void main(String[] args){
        new About();
    }
    
}

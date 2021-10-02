
package quizpro;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    JButton b1,b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(600,200,800,650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " " +  "to Quiz Project");
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        l1.setBounds(50,20,700,30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        l2.setBounds(30,90,600,350);
        l2.setText("<html>" +
                        "Share several times a day, but space out your posts every few hours." + "<br>" +
                        "Respond to all comments as quickly as you can."+
                        "Know the art of the hashtag. 1 hashtag is fine. 10 hashtags are not."+ "<br>" +
                        "Always keep the 80/20 rule! Entertain and inform your audience first, sell to them second"+ "<br>" +
                        "Use first person plural when talking about your company brand (We, Us)."+ "<br>" +
                    "<html>"
                  );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(new Color(30,144,255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("start");
        b2.setBounds(400,500,100,30);
        b2.setBackground(new Color(30,144,255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new QuizPro().setVisible(true);
        }
     else if (ae.getSource() == b2){
         this.setVisible(false);
         new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
    
}

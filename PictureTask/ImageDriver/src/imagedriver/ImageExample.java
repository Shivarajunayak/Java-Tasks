package imagedriver;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ImageExample implements ActionListener
{
    JFrame frame;
    JButton btn1,btn2;
    JLabel lab1,lab2;
    Container c;
    int test = 0;
    int back = 0;
    
    ImageExample()
    {
        frame = new JFrame("Images on the Label");
        c = frame.getContentPane();    
        frame.setSize(500,500);
        c.setLayout(new FlowLayout());
                
        btn1 = new JButton("Next");
        btn2 = new JButton("Back");
        
        btn1.setBounds(80,40,120,90);
        lab1 = new JLabel("Programmer is angry");
        lab1.setBounds(230,40,190,140);
        
        ImageIcon i = new ImageIcon("F:\\JAVA\\Sir Inam Lab\\PictureTask\\IMages\\one.jpg");
        lab2 = new JLabel(i);        
        lab2.setBounds(10,40,500,500);
                       
        c.add(lab2);
        c.add(btn1);
        c.add(btn2);
        c.add(lab1);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
   
    }
     public void actionPerformed(ActionEvent e)
     {

          if(e.getSource()==btn1)
          {
         test++;
         if(test==1)
         {
             lab2.setIcon(new ImageIcon("F:\\JAVA\\Sir Inam Lab\\PictureTask\\IMages\\two.png"));
             lab1.setText("Programmer is Crazy 2");             
         }
         if(test==2)
         {
             lab2.setIcon(new ImageIcon("F:\\JAVA\\Sir Inam Lab\\PictureTask\\IMages\\three.png"));
             lab1.setText("Programmer is Happy 3");     
         }
         if(test==3)
         {
             lab2.setIcon(new ImageIcon("F:\\JAVA\\Sir Inam Lab\\PictureTask\\IMages\\four.jpg"));
             lab1.setText("Good Bye 4");
         }
              
          }
          if(e.getSource()==btn2)
          {
              
         test--;
         if(test==1)
         {
             lab2.setIcon(new ImageIcon("F:\\JAVA\\Sir Inam Lab\\PictureTask\\IMages\\two.png"));
             lab1.setText("Programmer is Crazy 2");             
         }
         if(test==2)
         {
             lab2.setIcon(new ImageIcon("F:\\JAVA\\Sir Inam Lab\\PictureTask\\IMages\\three.png"));
             lab1.setText("Programmer is Happy 3");     
         }
         if(test==3)
         {
             lab2.setIcon(new ImageIcon("F:\\JAVA\\Sir Inam Lab\\PictureTask\\IMages\\four.jpg"));
             lab1.setText("Good Bye 4");
         }
              
          }
         
         
     }
     }

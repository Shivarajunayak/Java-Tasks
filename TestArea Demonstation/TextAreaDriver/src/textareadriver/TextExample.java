package textareadriver;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;

public class TextExample extends JFrame implements ActionListener 
{
    JFrame frame;
    JTextArea area;
    JTextField field;
    JButton btn1,btn2;
    Container c;
    String s1,s2,s3;
    int press;
    TextExample()
    {
        frame = new JFrame("Text Area Demonstration");
        c = frame.getContentPane();
       
        frame.setSize(300,300);
        c.setLayout(new FlowLayout());
        
        //frame.setResizable(false);
        
            
        area = new JTextArea();         // Large Area
        
        Border Tborder = BorderFactory.createLineBorder(Color.BLACK, 5);
        area.setBorder(Tborder);
   
        area.setColumns(15);
        area.setRows(10);
        
        
        field = new JTextField();           // Small area where Data is Written
        Border Fborder = BorderFactory.createLineBorder(Color.YELLOW, 5);        
        field.setBorder(Fborder);
        field.setColumns(20);
       
// field.setBackground(Color.orange);  
       
        btn1 = new JButton("ADD");
        btn2 = new JButton("Clear");
        
        c.add(area);
        c.add(field);
        
        c.add(btn1);
        c.add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
     public void actionPerformed(ActionEvent e)
     {
         JButton btn = (JButton)e.getSource();
         
     if(btn==btn1)      // For first button
     {
         
        s1 = field.getText();      
        area.append(s1+"\n");           // for setting data to textarea we use append
        
       
     }
    
     if(btn==btn2)      // for clear button
     {
         area.setText(null);
         field.setText(null);
     }
     
     
     }
    
}

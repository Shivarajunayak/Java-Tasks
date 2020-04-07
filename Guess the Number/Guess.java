//package guessdriver;
import com.sun.org.apache.xml.internal.utils.Trie;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Guess extends JFrame implements ActionListener 
{
    JFrame frame;
    Container con;
    JPanel panel1,panel2,panel3;
    JTextField field,lab2;
    JLabel hint,lab;
    JButton btn1,btn2;
    Random ran;
    int check,r;
    int x;
    Guess()
    {
        check=10;       // 10 lives 
        lab2 = new JTextField();
        ran = new Random();
        r = ran.nextInt(100);
        frame = new JFrame();
        con = frame.getContentPane();        
        con.setLayout(new GridLayout(3,1));
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        /************** For Panel 1 ****************/
        
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBorder(BorderFactory.createTitledBorder("Your Guesses"));
        field = new JTextField();
        field.setColumns(10);
        panel1.add(field);
        
        /***********************************************/
        /***************** For Panel 2 *****************/
        
        lab = new JLabel("Let's Play HiLo");
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBorder(BorderFactory.createTitledBorder("Hint"));
        panel2.add(lab);
        
        
        /***********************************************/
        /***************** For Panel 3 *****************/
  /**************    The 4th panel that has been assigned to panel3 South  ********************/        
        panel3 = new JPanel();
        JPanel p4 = new JPanel();            
        panel3.setLayout(new BorderLayout());
        
        btn1 = new JButton("Enter");
        btn2 = new JButton("Cancel");
        p4.add(btn1);
        p4.add(btn2);
        panel3.add(p4,BorderLayout.SOUTH);
        /***********************************************/    
        
        /******************* Add these Panels to Container *********************/
        
        con.add(panel1);
        con.add(panel2);
        con.add(panel3);
        
        /******************* Registered buttons with ActionListener *********************/
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        /******************* Frame set Visible & Exit Button *********************/        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent a)
    {
       String m = field.getText();
       x=Integer.parseInt(m);
      if (a.getSource().equals(btn1))
      {
          check--;
          if(x==r)
          {
              lab.setText("CONGRATS!!!");
          
              
          }
          else if(x>r)
          {
              lab.setText("GREATER");
          
              
          }
          else if(x<r)
          {
              lab.setText("LESSER");
          
              
          }
          if(check==0)
          {
              btn1.setEnabled(false);
          }
          else
          {
              btn1.setEnabled(true);
          }
          
          
      }
      if (a.getSource().equals(btn2))
      {
          check=10;
          
          
      }
      
        
        
    }
    
    
}

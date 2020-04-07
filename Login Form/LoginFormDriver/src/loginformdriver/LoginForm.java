package loginformdriver;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame 
{
    JFrame frame;
    JPanel panel;
    JLabel lab1,lab2,picLab;
    JCheckBox box;
    JButton btn1,btn2;
    JTextField Tfield;
    JPasswordField Pfield;
    String s1,s2,s3,s4;
    int password;
    char pa[];
    ImageIcon img;
    
    
    
    LoginForm()
    {
        
        frame = new JFrame("Login Forum");
        
        panel = new JPanel();
        
        lab1 = new JLabel("User Name :");
        lab2 = new JLabel("Password :");
      
        box = new JCheckBox();
        btn1 = new JButton("Login");
        btn2 = new JButton("Reset");
        img = new ImageIcon("ims.jpg");
        picLab = new JLabel(img);
        
        
        Tfield = new JTextField();
        Tfield.setColumns(5);
        Pfield = new JPasswordField();
        Pfield.setColumns(6);
        
        
        frame.add(panel);
       
        panel.add(picLab);
        panel.add(lab1);
        panel.add(Tfield);
        panel.add(lab2);
        panel.add(Pfield);
        
        panel.add(box);
         
        panel.add(btn1);
        panel.add(btn2);
        
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
      
        
     /************** For Color & Border ***********************/

        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
        panel.setBackground(Color.white);
       // panel.setForeground(Color.red);
         //lab1.setFont(new Font("Helvetica", Font.BOLD, 18));

     /*********************************************************/
         
     
     
     /*********************** For ItemListener ***********************/
     
         box.addItemListener(new ItemListener() 
        {
            @Override
            public void itemStateChanged(ItemEvent e) {
         if (e.getStateChange() == ItemEvent.SELECTED) 
        {
            Pfield.setEchoChar((char) 0);
           
        } else
        {
            Pfield.setEchoChar('*');
        }
            }
        });
         
    /********************************************************************/
    
    /***************************** For Button 1 *************************/
    
       btn1.addActionListener(new ActionListener() 
       {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if(ae.getSource()==btn1)
              {
                  
                FileReader fr = null;
                BufferedReader br = null;
    
    try
    {
        fr = new FileReader("loginInfo.txt");
	br = new BufferedReader(fr);
	
        s1 = br.readLine();
	s4 = br.readLine();     // for Password
        
                  
                  if(Tfield.getText().equals(s1) && Pfield.getPassword().equals(s4) )
                  {
                      JOptionPane.showMessageDialog(null, "Login Successfully");
     
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "Please Enter Correct info");
                  }
     
                     fr.close();
                     br.close();
    }
                 catch(IOException i)
    {
                    i.printStackTrace();
    }
                  
              }          
            }
       });
       
    /*************************************************************/   
   /************************** 2nd Button **********************/    
       
       btn2.addActionListener(new ActionListener() 
       {
            @Override
            public void actionPerformed(ActionEvent a) 
            {
             
              if(a.getSource()==btn2)
              {
              Tfield.setText("");
              Pfield.setText("");
              }
            }
        }                   );
    }
   
}

import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample extends JFrame implements ActionListener
{  
JTextField tf;
JButton b;
ButtonExample()
{
 	tf=new JTextField();  
    	tf.setBounds(50,50, 150,20);  
    	b=new JButton("Click Here");  
    	b.setBounds(50,100,95,30);  
    	b.addActionListener(this);
  	add(b);
	add(tf);  	
}
public static void main(String[] args)
 {  
   ButtonExample f=new ButtonExample(); 
   
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}

public void actionPerformed(ActionEvent e)
{  
            tf.setText("Welcome to DIT");  
   } 
 
}

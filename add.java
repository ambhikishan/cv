import java.awt.event.*;  
import javax.swing.*;    
public class add extends JFrame implements ActionListener
{  
JLabel l1,l2,l3;
JTextField t1, t2,t3;
JButton b1, b2;
add()
{
	l1=new JLabel("First Number");
	l2=new JLabel("Second Number");
	l3=new JLabel("Result Number");
 	t1=new JTextField();  
 	t2=new JTextField(); 
	t3=new JTextField(); 
	l1.setBounds(50,50,150,20);
    	t1.setBounds(150,50, 150,20);  
	l2.setBounds(50,100,150,20);
    	t2.setBounds(150,100, 150,20);  
	l3.setBounds(50,150,150,20);
    	t3.setBounds(150,150, 150,20);  
    	b1=new JButton("Sum");  
	b2=new JButton("clear");    
    	b1.setBounds(100,200,95,30);  
    	b1.addActionListener(this);
	b2.setBounds(200,200,95,30);  
    	b2.addActionListener(this);
  	add(b1);
	add(b2);	
	add(t1);
	add(t2);
	add(t3);
	add(l1);
add(l2);
add(l3);
  	
}
public static void main(String[] args)
 {  
   add f=new add(); 
   
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}

public void actionPerformed(ActionEvent e)
{  
		if(e.getSource()==b1)
		{
	            int a=Integer.parseInt(t1.getText());  
		    int b=Integer.parseInt(t2.getText()); 
		int c=a+b;
		t3.setText(Integer.toString(c));
		}  
		if(e.getSource()==b2)
		{	

			t2.setText(" ");
			t1.setText(" ");
			t3.setText(" ");
		}
   } 
 
}  

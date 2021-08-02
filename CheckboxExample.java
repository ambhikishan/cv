import java.awt.*;  
import java.awt.event.*;  
public class CheckboxExample extends Frame implements ItemListener
{  
	Label l1;
	Checkbox c1, c2;
     CheckboxExample(){  
	l1= new Label();          
        l1.setAlignment(Label.CENTER);  
        l1.setSize(400,100);  
        c1 = new Checkbox("C++");  
        c1.setBounds(100,100, 50,50);  
        c2 = new Checkbox("Java");  
        c2.setBounds(100,150, 50,50);  
        add(c1); 
	add(c2); 
	add(l1);  
        c1.addItemListener(this);
	c2.addItemListener(this);

	}
public void itemStateChanged(ItemEvent e) 
{               
	if(e.getSource()==c1 && e.getStateChange()==1)  // tick
	{
		         l1.setText("C++ Checkbox: checked");

	}
	
	if(e.getSource()==c2 && e.getStateChange()==1)
		 l1.setText("Java Checkbox: checked");	  
}  
          
         
         

public static void main(String args[])  
{  
    CheckboxExample  f = new CheckboxExample(); 
	f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
}  
}  
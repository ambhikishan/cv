import java.awt.*;  
import java.awt.event.*;  
public class CheckboxExample1 extends Frame implements ItemListener
{  
	Label l1;
	Label l2;
	Checkbox c1, c2;
     CheckboxExample1(){  
	l1= new Label("Test");          
        l1.setAlignment(Label.CENTER);  
        l1.setBounds(50, 10,200,100);  
	l2= new Label("Test1");          
        l2.setAlignment(Label.CENTER);  
        l2.setBounds(50, 50,200,200);
        c1 = new Checkbox("C++");  
        c1.setBounds(100,200, 50,50);  
        c2 = new Checkbox("Java");  
        c2.setBounds(100,250, 50,50);  
        add(c1); 
	add(c2); 
	add(l1);
	add(l2);
        c1.addItemListener(this);
	c2.addItemListener(this);

	}
public void itemStateChanged(ItemEvent e) 
{               
	if(e.getSource()==c1 && e.getStateChange()==1)  
	{
		         l1.setText("C++ Checkbox: checked");

	}
	
	if(e.getSource()==c2 && e.getStateChange()==1)
	{
		 l2.setText("Java Checkbox: checked");
	}
		  
}  
          
         
         

public static void main(String args[])  
{  
    CheckboxExample1  f = new CheckboxExample1(); 
	f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
}  
}  
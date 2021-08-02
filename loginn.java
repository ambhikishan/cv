import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginn{
	JLabel l1, l2;
        TextField t1, t2;
        JFrame f;
public void setComponents(){

	    f = new JFrame("Welcome To SAP Protal");
            l1 = new JLabel("username");
            l2 = new JLabel("Password");
            JButton b = new JButton("Log In");
            t1=new TextField();
            t2=new TextField();
            f.setSize(500, 500);
            f.setVisible(true);
            f.setLayout(null);
            l1.setBounds(100, 100, 70, 40);
            t1.setBounds(200, 100, 150, 40);
            l2.setBounds(100, 160, 70, 40);
            t2.setBounds(200, 160, 70, 40);
            b.setBounds(235, 220, 80, 50);
            f.add(b);
            f.add(l1);
            f.add(l2);
            f.add(t1);
            f.add(t2);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

    public static void main(String[] args) {
        
	loginn L=new loginn();
	L.setComponents();

            

    }
}
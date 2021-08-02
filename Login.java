import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login  implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JTextField t2;
    JFrame f;
    JButton b,c;
    public void setComponents(){

        f = new JFrame("Welcome To SAP Protal");
        l1 = new JLabel("User Name");
        l2 = new JLabel("Password");
       b = new JButton("Log In");
       c=new JButton("clear");
        t1=new JTextField();
        t2=new JTextField();
        t1.setText("admin");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        l1.setBounds(100, 100, 70, 20);
        t1.setBounds(200, 100, 170, 25);
        l2.setBounds(100, 160, 70, 20);
        t2.setBounds(200, 160, 170, 25);
        b.setBounds(235, 220, 80, 50);
        c.setBounds(350,220,60,50);
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(c);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        b.addActionListener(this);
        c.addActionListener(new clear());

    }

        public void actionPerformed(ActionEvent e){
            JOptionPane jp=new JOptionPane();



            String s= t1.getText();

            String s2=t2.getText();

           if (e.getSource()==b) {
               if (s.equalsIgnoreCase("dit") && s2.equalsIgnoreCase("123"))
                   JOptionPane.showMessageDialog(f, "Correct Login ");
               else
                   JOptionPane.showMessageDialog(f, "Incorrect username or Password","Try Again" , JOptionPane.WARNING_MESSAGE);
           }
        }


    public static void main(String[] args) {

        Login L=new Login();
        L.setComponents();



    }
    class clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            if(e1.getSource()==c){
                t1.setText(null);
                t2.setText(null);
            }
        }
    }
}





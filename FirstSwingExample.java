import javax.swing.*;  
public class FirstSwingExample {  
public static void main(String[] args) {  

}JFrame f=new JFrame("GUI Programming");
    JButton b=new JButton("Click");
b.setBounds(130,140,100,100);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.add(b);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        }
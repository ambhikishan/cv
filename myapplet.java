import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/* <applet code="myapplet" width="500" height="400"> </applet>*/
public class myapplet extends Applet {
Label l1,l2,l3;
Button b1;
TextField t1,t2;
    public void init(){
    l1=new Label("First Number");
        l2=new Label("Second Number");
        l3=new Label();
        b1=new Button("Add");
        t1=new TextField();
        t2=new TextField();

        setLayout(null);
        l1.setBounds(50,50,100,20);
        l2.setBounds(50,100,100,20);
        t1.setBounds(150,50,100,30);
        t2.setBounds(150,100,100,30);
        b1.setBounds(200,150,50,20);
        l3.setBounds(50,200,200,20);

        add(l3);
        add(l1);
        add(l2);
        add(b1);
        add(t1);
        add(t2);

        b1.addActionListener(new MyHandler());


    }
    public class MyHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int a,b,s;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            s=a+b;
            l3.setText("sum:"+s);

        }
    }
}
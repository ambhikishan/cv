import javax.swing.*;
import java.awt.event.*;
public class ja extends JFrame{
    ja(String s){
        super(s);
    }
    public void j(){
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        ja k=new ja("GUI PROGRAMS");
        k.j();

    }


}
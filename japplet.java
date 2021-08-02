import java.applet.Applet.*;
import java.awt.*;


public class japplet extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("Welcome"50,50);
        g.drawLine(20,30,20,300);
        g.drawRect(70,100,30,30);
        g.filiRect(170,100,30,30);
        g.drawOval(70,200,30,30);

    }
    /*

     */
}
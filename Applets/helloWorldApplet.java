import java.applet.*;
import java.awt.*;
public class helloWorldApplet extends Applet{
    public void init(){
        setBackground(Color.ORANGE);
    }
    public void paint(Graphics g){
        g.drawString("Hello World", 20, 80);
        showStatus("Testing Applet");
    }

}
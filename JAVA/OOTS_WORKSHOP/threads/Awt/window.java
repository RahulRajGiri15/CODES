package threads.Awt;
import java.awt.*;
import java.awt.event.*;

public class window extends Frame {
    window(){
        setSize(600,400);
        setVisible(true);
        setTitle("Window");
    }
public void paint (Graphics g){
    g.setColor(Color.black);
    g.drawLine(40,40, 40, 40);
    g.drawRect(140, 40, 40, 40);
}
    
    

    public static void main(String[] args) {
        window mf = new window();
    }
    
}

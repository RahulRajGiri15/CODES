import java.applet.*;
import java.awt.*;

public class Smiley extends Applet {
    public void paint(Graphics g) {
        // Draw face
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);
        
        // Draw eyes
        g.setColor(Color.black);
        g.fillOval(100, 100, 40, 40);
        g.fillOval(180, 100, 40, 40);
        
        // Draw mouth
        g.fillArc(100, 120, 120, 100, 0, -180);
    }
}
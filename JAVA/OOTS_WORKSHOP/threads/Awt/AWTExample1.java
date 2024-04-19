package threads.Awt;
import java.awt.*;
public class AWTExample1 extends Frame{
    AWTExample1(){
    Button b =new Button("Click Me Rahul !!");
    b.setBounds(30,100,80,30);
    add(b);
    setSize(300,300);
    //Color myColor = new Color(255, 0, 0);
    //setForeground(b ,"red");
    //setBackground("red");
    setTitle("This is out basic AWT example");
    setVisible(true);}

    public static void main(String[] args) {
        

    
    AWTExample1 f =new AWTExample1();
        }
    }


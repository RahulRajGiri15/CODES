import java.awt.*;  
import javax.swing.*;  
public class FlowDemo1{  
FlowDemo1(){
JFrame frame1=new JFrame();  
JButton box1=new JButton("1");  
JButton box2=new JButton("2");  
JButton box3=new JButton("3");  
JButton box4=new JButton("4");  
JButton box5=new JButton("5");  
JButton box6=new JButton("6"); 
JButton box7=new JButton("7"); 
JButton box8=new JButton("8"); 
JButton box9=new JButton("9"); 
JButton box10=new JButton("10");
frame1.add(box1);
frame1.add(box2);
frame1.add(box3);
frame1.add(box4);
frame1.add(box5);  
frame1.add(box6);
frame1.add(box7);
frame1.add(box8);
frame1.add(box9);
frame1.add(box10);
frame1.setLayout(new FlowLayout(FlowLayout.LEFT));  
frame1.setSize(300,300);  
frame1.setVisible(true);  
}  
public static void main(String[] args) {  
    new FlowDemo1();  
}  }

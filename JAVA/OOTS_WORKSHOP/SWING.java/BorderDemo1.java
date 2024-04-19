//package SWING.java;

import java.awt.*;  
import javax.swing.*;  
public class BorderDemo1{  
BorderDemo1() {  
    JFrame f=new JFrame();  
    JButton box1=new JButton("**NORTH**");;  
    JButton box2=new JButton("**SOUTH**");;  
    JButton box3=new JButton("**EAST**");;  
JButton box4=new JButton("**WEST**");;  
JButton box5=new JButton("**CENTER**");;  
f.add(box1,BorderLayout.NORTH);  
f.add(box2,BorderLayout.SOUTH);  
f.add(box3,BorderLayout.EAST);  
f.add(box4,BorderLayout.WEST);  
f.add(box5,BorderLayout.CENTER);  
f.setSize(400,400);
f.setVisible(true);   }  
public static void main(String[] args) {  
    new BorderDemo1(); 
} 
} 

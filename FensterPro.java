import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Image.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
class FensterPro implements ActionListener {
  Fenster f, f2, f3;  
  JButton b1, b2, b3;
  FensterPanel p;
  public static void main(String[] args){  
    FensterPro a = new FensterPro();
    a.haupt();
  }
   
  public void haupt() {
    f = new Fenster("Das Fenster Programm");
    f2 = new Fenster("This is a Picture");
    p = new FensterPanel(f2);
    f2.add(p);
    b1 = new JButton("Picture");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    f.setBounds(300,300,300,300);
    f.setLayout(null);
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    f2.setBounds(600,300,270,300);
    f2.pack();
    f2.setBounds(600,300,225,225);
    f2.setLayout(null);
    f2.repaint();
    b1.setBounds(20,20,250,35);
    b1.addActionListener(this); 
    f.add(b1);
    b1.setVisible(true);
    f.setVisible(true);   
  }
                                                 
  public void actionPerformed(ActionEvent e) {
    f2.setVisible(true);
    f2.repaint();  
  }
}
    
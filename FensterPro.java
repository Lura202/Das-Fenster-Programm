import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
class FensterPro implements ActionListener {
  Fenster f, f2, f3;  
  JButton b1, b2, b3; 
  public static void main(String[] args){  
    FensterPro a = new FensterPro();
    a.haupt();
  }
   
  public void haupt() {
    f = new Fenster("Das Fenster Programm");
    f2 = new Fenster("This is a Picture");
    f3 = new Fenster("This is a Gif");
    b1 = new JButton("Picture");
    b2 = new JButton("Want More ?");
    b3 = new JButton("Gif");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    f.setBounds(300,300,300,300);
    f.setLayout(null);
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    f2.setBounds(600,300,270,300);
    f2.setLayout(null);
    f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    f3.setBounds(900,300,350,350);
    f3.setLayout(null);
    b1.setBounds(20,20,250,35);
    b2.setBounds(20,100,250,35);
    b3.setBounds(20,180,250,35);
    b1.addActionListener(this); 
    b2.addActionListener(this);
    b3.addActionListener(this);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    b1.setVisible(true);
    b2.setVisible(true);
    b3.setVisible(false);
    f.setVisible(true);   
  }
                                                 
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      f2.setVisible(true);  
      JLabel label = new JLabel();
      ImageIcon icon = new ImageIcon("picture1.jpg"); 
      label.setIcon(icon);
      f2.add(label);
      label.setBounds(10,-10,280,280);
      label.setVisible(true);
    } // end of if
    else{
      if (e.getSource() == b2) {
        b3.setVisible(true);
      } // end of if
      else {
        f3.setVisible(true);
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("gif1.gif"); 
        label.setIcon(icon);
        f3.add(label);
        label.setBounds(5,0,340,325);
        label.setVisible(true);
      } // end of if-else
    } 
  }
}
    
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
class FensterPro implements ActionListener {
  Fenster f;  
  JButton b1; 
  JButton b2;
  public static void main(String[] args){  
    FensterPro a = new FensterPro();
    a.haupt();
  }
   
  public void haupt() {
    f = new Fenster("Das Fenster Programm");
    b1 = new JButton("Press Me");
    b2 = new JButton("Press Me 2");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    f.setBounds(300,300,300,300);
    f.setLayout(null);
    b1.setBounds(20,20,250,35);
    b2.setBounds(20,100,250,35);
    b1.addActionListener(this); 
    b2.addActionListener(this);
    f.add(b1);
    f.add(b2);
    b1.setVisible(true);
    b2.setVisible(true);
    f.setVisible(true);   
  }
                                                 
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      b1.setVisible(false);  
    } // end of if
    else{
      b2.setVisible(false);
      } 
  }
}
    
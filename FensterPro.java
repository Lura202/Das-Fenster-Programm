import javax.swing.*;
import java.awt.Color;
import java.awt.Event;
class FensterPro {
  Fenster f;   
  public static void main(String[] args){  
    FensterPro a = new FensterPro();
    a.haupt();
  }
   
  public void haupt() {
    f = new Fenster("Das Fenster Programm");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setBounds(300,300,300,300);
  }
}
    
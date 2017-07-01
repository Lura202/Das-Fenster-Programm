import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.*;
import java.awt.*;
class FensterPanel extends JPanel {
  BufferedImage img;
  Fenster f;
  FensterPanel p;
  public FensterPanel(Fenster pf) {
    try {
      img = ImageIO.read(new File("picture1.jpg"));
      f = pf;
    } 
    catch (Exception e) {
      
    }                                        
  }
  
  protected void paintComponent(Graphics g) { 
    super.paintComponent(g);
    g.drawImage(img.getScaledInstance(f.getWidth(), f.getHeight(), Image. SCALE_SMOOTH), 0, 0, this);
    this.setBounds(0,0, f.getWidth(), f.getHeight());
    this.repaint();
  }
}
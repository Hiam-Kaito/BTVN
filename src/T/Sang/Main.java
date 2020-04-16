package T.Sang;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.awt.*;
    
public class Main extends JFrame {
   public Main() {
      getContentPane().setLayout(new FlowLayout());
  
      final JLabel label = new JLabel("Move your mouse over this JLabel!");
      label.setOpaque(true);
      getContentPane().add(label); 
  
      label.addMouseMotionListener(new MouseMotionAdapter() {
         public void mouseMoved(MouseEvent me) {
            System.out.println("Mouse is being moved over JLabel");
         }
      });
  
      label.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent evt) {
            Color c = label.getBackground();
            label.setBackground(label.getForeground());
            label.setForeground(c);
         }
  
         public final void mouseExited(MouseEvent evt) {
            Color c = label.getBackground();
            label.setBackground(label.getForeground());
            label.setForeground(c);           
         }
          
         public final void mouseClicked(MouseEvent evt) {
            System.err.println("Mouse has been clicked on JLabel");
         }
      });
  
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent event) {
            System.exit(0);  
         }     
      });
  
      setSize(300, 200);
   }
  
   public static void main(String[] args) {
      (new Main()).show();
   }
}
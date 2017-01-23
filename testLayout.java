/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnawt;
import java.awt.*;

/**
 * Testing Layouts
 * @author Catalin Mazilu
 */
public class testLayout {
    
     public static void main ( String args []) {
         
         Frame f = new Frame("Grid Layout");
         
         //f.setLayout (new GridLayout (3, 2));
         
         //f.setLayout(new FlowLayout());
         
         f.setLayout(new BorderLayout());
         
         Button b1 = new Button (" Button 1");
         Button b2 = new Button ("2");
         Button b3 = new Button (" Button 3");
         Button b4 = new Button ("Long - Named Button 4");
         Button b5 = new Button (" Button 5");
         
         f.add(b1, BorderLayout.PAGE_START); f.add (b2, BorderLayout.CENTER); f. add(b3,  BorderLayout.PAGE_END); f.add(b4,  BorderLayout.LINE_START); f.add(b5, BorderLayout.LINE_END);
         
         //resizes the windows
         f.pack (); 
        // f.setVisible(true);
     
         
         MyFrame text = new MyFrame("Testare");
         text.setVisible(true);
     }
    
}

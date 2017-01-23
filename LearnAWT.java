/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnawt;
import java.awt.*;

/**
 * Used for learning AWT Gui
 * @author Catalin Mazliu
 */
public class LearnAWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         //creates a frame
        Frame myFrame = new Frame("First Window");
        
        
        //setting layout
        myFrame.setLayout(new FlowLayout());
        
        //create two buttons
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");
        
        //adding the buttons to form
        myFrame.add(b1);
        myFrame.add(b2);
        
        
        //showing the window
        myFrame.setVisible(true);
        
    }
}

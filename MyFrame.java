package learnawt;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*; 
import java.awt.event.*;


/**
 * First Listener to a button
 * @author Catalin Mazilu
 */




public class MyFrame extends Frame {
    
    /**
     * Constructor
     * @param title of the windows
     */
    public MyFrame(String title){
        super(title);
        
        setLayout(new FlowLayout());
        setSize(300,300);
        Button b1 = new Button ("Click");
        add(b1);
        MyFrameListener listener = new MyFrameListener(this);
        b1.addActionListener(listener);
        
        
        
    }

}
class MyFrameListener implements ActionListener {
    MyFrame myFrame;
    public MyFrameListener(MyFrame frame){
        this.myFrame = frame;
    }
    
    public void actionPerformed(ActionEvent e){
        myFrame.setTitle("You've pressed the button!" + e.getActionCommand());
    }
}





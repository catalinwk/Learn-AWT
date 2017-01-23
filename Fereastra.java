      /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learnawt;

/**
 *
 * @author HP
 */
import java . awt .*;
import java . awt. event .*;


class FereastraMea extends Frame implements ActionListener {
    Button ok = new Button ("OK");
    Button exit = new Button (" Exit ");
    int n=0;
    
    public FereastraMea ( String titlu ) {
        super ( titlu );
        setLayout (new FlowLayout ());
        setSize (200 , 100) ;
        add (ok);
        add ( exit );
        ok. addActionListener ( this );
        exit . addActionListener ( this );
        // Ambele butoane sunt ascultate in clasa Fereastra
        // deci ascultatorul este instanta curenta : this
    }
    
    // Metoda interfetei ActionListener
    public void actionPerformed ( ActionEvent e) {
        if (e. getSource () == exit )
        System . exit (0); // Terminam aplicatia
        
        if (e. getSource () == ok) {
        n ++;
        this . setTitle ("Ati apasat OK de " + n + " ori");
        }
    }
}

public class Fereastra {
    public static void main ( String args []) {
        FereastraMea f = new FereastraMea (" Test Event ");
        f. show ();
    }
}
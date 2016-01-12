
package moneyflow;

import javax.swing.JFrame;

/**
 *
 * @author JinHwan
 */
public class MoneyFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MoneyFlow_GUI frame = new MoneyFlow_GUI();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

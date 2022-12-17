package Picture;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Picture extends JFrame {
    private JLabel x;
    public Picture(String arg){
        this.setSize(500, 500);
        x = new JLabel("", new ImageIcon(getClass().getResource(arg)), SwingConstants.CENTER);
        getContentPane().add(x);
    }
}

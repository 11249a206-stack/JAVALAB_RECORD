
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloApplet {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Applet");
        JLabel label = new JLabel("Hello Applet",
                                  SwingConstants.CENTER);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

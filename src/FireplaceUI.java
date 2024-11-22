import javax.swing.*;
import java.awt.*;

public class FireplaceUI {

    public FireplaceUI() {
        JFrame frame = new JFrame("Fireplace");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 269);
        frame.setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon("resources/fireplace.gif");

        // Check if the image is loaded correctly
        if (img.getImageLoadStatus() == MediaTracker.ERRORED) {
            System.out.println("Error: Image not found or could not be loaded.");
        }

        JLabel label = new JLabel("", img, JLabel.CENTER);
        frame.add(label);
        frame.revalidate();
        frame.repaint();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FireplaceUI();
    }
}
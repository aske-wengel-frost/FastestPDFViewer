import javax.swing.*;

public class ViewFrame{

    public static void main(String[] args){

        // Create window, set window-size and title.
        JFrame frame = new JFrame("Fastest PDF viewer");
        frame.setSize(600, 600);

        //Load and display sample image.
        ImageIcon sampleImage = new ImageIcon("./src/image_content/sample_image.jpg");
        frame.add(new JLabel(sampleImage));
        frame.pack();                   // Ensures that the window is adjusted to the correct size (size of the image).
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
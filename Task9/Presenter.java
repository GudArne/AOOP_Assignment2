package Task9;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Presenter {    
    public void showText(String text) {
        PresenterWindow.getTextArea().append(text);

    }
    public abstract void eastButtonPressed();
    public abstract void westButtonPressed();


    // Return a JLabel with the image in the given filename
    public Component createCenterComponent(String file) {
        ImageIcon icon = new ImageIcon("Task9/Images/shrek.png");
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setPreferredSize(new Dimension(550, 400));
        return imageLabel;
    }

    
}

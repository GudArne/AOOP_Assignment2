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
    
}

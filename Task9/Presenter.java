package Task9;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Presenter {
    
    public abstract void eastButtonPressed();
    public abstract void westButtonPressed();
    public abstract ArrayList<String> getText();


    public void showText(String text) {
        PresenterWindow.getTextArea().append(text);

    }

    public void addText(String text){
        getText().add(text);
    }
    
}

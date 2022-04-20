package Task9;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public abstract class Presenter {
    
    public abstract void eastButtonPressed();
    public abstract void westButtonPressed();
    public abstract void northButtonPressed();
    public abstract void southButtonPressed();
    public abstract ArrayList<String> getText();
    public abstract void addText(String text);
    public abstract JTextArea getTextArea();
    public abstract Container getPanel();
    public abstract GridBagConstraints textStyle();


    public void updateText(int index) {

        getTextArea().setText(getText().get(index));

    }

    
}

package Task9;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public abstract class ImagePresenter extends Presenter {

    ArrayList<String> imgArr = new ArrayList<>();
    int imgIndex = 0;
    JLabel imgLabel;

    public abstract Container getPanel();
    public abstract GridBagConstraints imgStyle();

    public void showImage(){
        if(getImage() != null) // Remove previous image
            getPanel().remove(getImage());

        ImageIcon icon = new ImageIcon(imgArr.get(imgIndex));
        imgLabel = new JLabel(icon);
        imgLabel.setPreferredSize(new Dimension(550, 400));

        getPanel().add(imgLabel, imgStyle());
    }
    public void addImage(String filename){
        imgArr.add(filename);
    }
    public Component getImage(){
        return imgLabel;
    }
}

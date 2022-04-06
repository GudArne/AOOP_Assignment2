package Task9;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class PresenterWindow extends ImagePresenter implements ActionListener {

	private static JTextArea jta;
    private JFrame frame;
    private static JPanel panel;
    private final Dimension dimension = new Dimension(550, 400);
    JButton leftBtn;
    JButton rightBtn;
    
    ArrayList<String> textArr = new ArrayList<>();

	public PresenterWindow(){
        frame = new JFrame();
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        panel.setSize(600, 600);

		jta = new JTextArea(10, 10);

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;

        addImage("Task9/Images/shrek.png");
        addImage("Task9/Images/hh.png");
        addImage("Task9/Images/example.png");
        addImage("Task9/Images/cat.jpeg");
        addText("This is text for slide 1");
        addText("This is text for slide 2");
        addText("This is text for slide 3");
        addText("This is text for slide 4");

        showImage();

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.VERTICAL;
        leftBtn = new JButton("Left");
        panel.add(leftBtn, c);
        leftBtn.addActionListener(this);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        rightBtn = new JButton("Right");
        panel.add(rightBtn, c);
        rightBtn.addActionListener(this);


        panel.add(jta,textStyle());
        updateText(imgIndex);

        frame.setSize(600,600);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JTextArea getTextArea() {
		return jta;
	}

    @Override
    public void eastButtonPressed() {
        if(imgIndex < imgArr.size()-1){
            jta.setText("Next slide\n");
            imgIndex++;
            showImage();
            updateText(imgIndex);
        }
    }

    @Override
    public void westButtonPressed() {
        if(imgIndex > 0) {
            jta.setText("Previous slide\n");
            imgIndex--;
            showImage();
            updateText(imgIndex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == leftBtn){
            westButtonPressed();
        }
        else if(e.getSource() == rightBtn){
            eastButtonPressed();
        }
    }

    @Override
    public Container getPanel() {
        return panel;
    }
    @Override
    public GridBagConstraints imgStyle(){
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        return c;
    }

    @Override
    public void addText(String text){
        getText().add(text);
    }

    @Override
    public ArrayList<String> getText() {
        return textArr;
    }

    @Override
    public GridBagConstraints textStyle() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        return c;
    }
}
package Task9;
import javax.swing.*;
import java.awt.*;

public class PresenterWindow extends Presenter {

	private static JTextArea jta;
    private JFrame frame;
    private final Dimension dimension = new Dimension(550, 400);


	public PresenterWindow(){
        frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        panel.setSize(600, 600);

		jta = new JTextArea(10, 10);
		jta.append("This is some example text for this presentation.\n");

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        panel.add(createCenterComponent("Task9/Images/shrek.png"), c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.VERTICAL;
        panel.add(new JButton("Left"), c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        panel.add(new JButton("Right"), c);

        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        panel.add(jta,c);

        frame.setSize(600,600);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static JTextArea getTextArea() {
		return jta;
	}

    @Override
    public void eastButtonPressed() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void westButtonPressed() {
        // TODO Auto-generated method stub
        
    }

}
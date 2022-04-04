package Task9;
import javax.swing.*;
import java.awt.*;

public class PresenterWindow extends JFrame {

	private JTextArea jta;
    private JFrame frame;
    private final Dimension dimension = new Dimension(550, 400);


	public PresenterWindow(){
        frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setSize(600, 600);

		jta = new JTextArea(10, 10);
		jta.append("This is some example text for this presentation.\n");

        ImageIcon icon = new ImageIcon("Task9/shrek.png");
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setPreferredSize(dimension);
        panel.add(imageLabel, BorderLayout.SOUTH);

        frame.add(new JButton("Left"), BorderLayout.SOUTH);
        frame.add(new JButton("Right"), BorderLayout.SOUTH);

        panel.add(jta, BorderLayout.NORTH);
        frame.setSize(600,600);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JTextArea getTextArea() {
		return jta;
	}

}
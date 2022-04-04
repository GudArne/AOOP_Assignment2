package Task1.gui;

import javax.swing.*;
import java.awt.*;

public class TestButton {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Test Button");
		
		// f.setLayout(new FlowLayout());

		f.add(b, BorderLayout.NORTH);
		f.add(new JButton("Hej"), BorderLayout.CENTER);
		f.add(new JButton("Wojciech"), BorderLayout.SOUTH);
		f.add(new JButton("and"), BorderLayout.EAST);
		f.add(new JButton("friends"), BorderLayout.WEST);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
	}

}

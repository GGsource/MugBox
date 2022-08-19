package src.main.java;

import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
	public void initialize() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		setTitle("MugBox Project");
		setSize(500, 600);
		setMinimumSize(new Dimension(300, 400));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Make it so closing window ends process
		setVisible(true); //Show the window
	}
}
import java.awt.Color;

import javax.swing.JFrame;

public class GFrame extends JFrame {

	GPanel panel;
	
	GFrame() {
		panel = new GPanel();
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Pong");
		this.setBackground(Color.black);
	}
}

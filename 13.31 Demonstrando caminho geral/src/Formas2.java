import java.awt.Color;

import javax.swing.JFrame;

public class Formas2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Desenhando formas 2D.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Formas2JPanel formas = new Formas2JPanel();
		frame.add(formas);
		frame.setBackground(Color.WHITE);
		frame.setSize(315, 330);
		frame.setVisible(true);

	}

}

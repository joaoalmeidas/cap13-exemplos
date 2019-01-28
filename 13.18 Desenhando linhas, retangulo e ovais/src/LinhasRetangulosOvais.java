import java.awt.Color;

import javax.swing.JFrame;

public class LinhasRetangulosOvais {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Desenhando linhas, retangulos e ovais.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LinhasRetangulosOvaisJPanel panel = new LinhasRetangulosOvaisJPanel();
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		frame.setSize(400, 210);
		frame.setVisible(true);
		
	}

}

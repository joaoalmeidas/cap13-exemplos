import javax.swing.JFrame;

public class Formas {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FormasJPanel formas = new FormasJPanel();
		frame.add(formas);
		frame.setSize(425, 200);
		frame.setVisible(true);
		

	}

}

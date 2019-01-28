import javax.swing.JFrame;

public class DesenhoPoligonos {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PoligonosJPanel panel = new PoligonosJPanel();
		frame.add(panel);
		frame.setSize(280, 270);
		frame.setVisible(true);
	}

}

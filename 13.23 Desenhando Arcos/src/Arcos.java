import javax.swing.JFrame;

public class Arcos {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArcosJPanel arcos = new ArcosJPanel();
		frame.add(arcos);
		frame.setSize(300, 210);
		frame.setVisible(true);
		
	}

}

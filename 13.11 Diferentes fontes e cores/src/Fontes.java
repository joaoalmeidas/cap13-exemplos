import javax.swing.JFrame;

public class Fontes {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Usando fontes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FontesJPanel fonte = new FontesJPanel();
		frame.add(fonte);
		frame.setSize(420, 150);
		frame.setVisible(true);
		
	}

}

import javax.swing.JFrame;

public class CoresTeste {

	public static void main(String[] args) {


		JFrame frame = new JFrame("Usando cores");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CorJPanel corpanel = new CorJPanel();
		frame.add(corpanel);
		frame.setSize(400, 180);
		frame.setVisible(true);
		
	}

}

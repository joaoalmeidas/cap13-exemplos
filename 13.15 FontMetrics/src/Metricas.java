import javax.swing.JFrame;

public class Metricas {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Demonstrando as métricas das fontes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MetricasJPanel metricas = new MetricasJPanel();
		frame.add(metricas);
		frame.setSize(510, 240);
		frame.setVisible(true);
		
	}

}

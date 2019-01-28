import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MetricasJPanel extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setFont(new Font("SansSerif", Font.BOLD, 12));
		FontMetrics metricas = g.getFontMetrics();
		g.drawString("Fonte atual: " +g.getFont(), 10, 30);
		g.drawString("Ascendente: " + metricas.getAscent(), 10, 45);
		g.drawString("Descendente: " + metricas.getDescent(), 10, 60);
		g.drawString("Altura: " + metricas.getHeight(), 10, 75);
		g.drawString("Ponta: " + metricas.getLeading(), 10, 90);
		
		Font fonte = new Font("Serif", Font.ITALIC, 14);
		metricas = g.getFontMetrics(fonte);
		g.setFont(fonte);
		g.drawString("Fonte atual: " +g.getFont(), 10, 120);
		g.drawString("Ascendente: " + metricas.getAscent(), 10, 135);
		g.drawString("Descendente: " + metricas.getDescent(), 10, 150);
		g.drawString("Altura: " + metricas.getHeight(), 10, 165);
		g.drawString("Ponta: " + metricas.getLeading(), 10, 180);
		
	}

}

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CorJPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(15, 25, 100, 20);
		g.drawString("RGB atual: " +g.getColor(), 130, 40);
		
		g.setColor(new Color(0.50f, 0.75f, 0.0f));
		g.fillRect(15, 50, 100, 20);
		g.drawString("RGB atual: " +g.getColor(), 130, 65);
		
		g.setColor(Color.BLUE);
		g.fillRect(15, 75, 100, 20);
		g.drawString("RGB atual: " +g.getColor(), 130, 90);
		
		Color cor = Color.MAGENTA;
		g.setColor(cor);
		g.fillRect(15, 100, 100, 20);
		g.drawString("RGB atual: " +cor.getRed()+ ", " +cor.getGreen()+ ", " +cor.getBlue(), 130, 115);
		
	}

	
	
}

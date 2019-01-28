import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FontesJPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setFont(new Font("Serif", Font.BOLD, 12));
		g.drawString("Serif 12 negrito ", 20, 30);
		
		g.setFont(new Font("Monospaced", Font.ITALIC, 24));
		g.drawString("Serif 12 itálico ", 20, 50);
		
		g.setFont(new Font("SansSerif", Font.PLAIN, 14));
		g.drawString("Serif 12 normal ", 20, 70);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
		g.drawString(g.getFont().getName()+ " " +g.getFont().getSize()+ " negrito itálico.", 20, 90);
	}
	
	
	
}

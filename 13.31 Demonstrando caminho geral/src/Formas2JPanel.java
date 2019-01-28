import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Formas2JPanel extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		SecureRandom random = new SecureRandom();
		
		int[] pontosX = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
		int[] pontosY = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
		
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath estrela = new GeneralPath();
		
		estrela.moveTo(pontosX[0], pontosY[0]);
		
		for(int cont = 1; cont < pontosX.length; cont++) {
			
			estrela.lineTo(pontosX[cont], pontosY[cont]);
			
		}
		
		estrela.closePath();
		
		g2d.translate(150, 150);
		
		for(int cont = 1; cont <= 20; cont++) {
			
			g2d.rotate(Math.PI/ 10.0);
			
			g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
			
			g2d.fill(estrela);
			
		}
	}
	
}

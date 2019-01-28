import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class PoligonosJPanel extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			int[] posicoesX = {20, 40, 50, 30, 20, 25};
			int[] posicoesY = {50, 50, 60, 80, 80, 60};
			Polygon poligono1 = new Polygon(posicoesX, posicoesY, 6);
			g.drawPolygon(poligono1);
			
			int[] posicoesX2 = {70, 90, 100, 80, 70, 65, 60};
			int[] posicoesY2 = {100, 100, 110, 110, 130, 110, 90};
			g.drawPolyline(posicoesX2, posicoesY2, 7);
			
			int[] posicoesX3 = {120, 140, 150, 190};
			int[] posicoesY3 = {40, 70, 80, 60};
			g.fillPolygon(posicoesX3, posicoesY3, 4);
			
			Polygon poligono2 = new Polygon();
			poligono2.addPoint(165,  135);
			poligono2.addPoint(175,  150);
			poligono2.addPoint(270, 200);
			poligono2.addPoint(200,  220);
			poligono2.addPoint(130, 180);
			g.fillPolygon(poligono2);
			
		}
	
}

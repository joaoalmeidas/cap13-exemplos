import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MostraCoresParaJFrame extends JFrame{
	
	private final JButton mudaCorBotao;
	private Color cor = Color.LIGHT_GRAY;
	private final JPanel corJPanel;
	
	public MostraCoresParaJFrame() {
		
		super("Usando JColorChooser");
		
		corJPanel = new JPanel();
		corJPanel.setBackground(cor);
		
		mudaCorBotao = new JButton("Muda cor");
		mudaCorBotao.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						cor = JColorChooser.showDialog(MostraCoresParaJFrame.this, "Excolha uma cor", cor);
						
						if(cor == null) {
							
							cor = Color.LIGHT_GRAY;
							
						}
						
						corJPanel.setBackground(cor);
						
					}
					
					
				}
		);
		
		add(corJPanel, BorderLayout.CENTER);
		add(mudaCorBotao, BorderLayout.SOUTH);
		
		setSize(400, 130);
		setVisible(true);
		
	}

}

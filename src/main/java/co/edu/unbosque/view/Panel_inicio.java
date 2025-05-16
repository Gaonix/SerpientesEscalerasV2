package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Panel_inicio extends JFrame {
	public Panel_inicio() {
		setSize(600,600);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Serpientes y Escaleras");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		add(Fondo());
		
		
	}
	public JPanel Fondo() {
		JPanel p= new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		return p;
	
	}
}

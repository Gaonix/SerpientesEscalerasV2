package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import co.edu.unbosque.controller.Controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Panel_inicio extends JFrame {
	private JPanel Menu, juego, tablero;
	private Controller c;
	private JLabel letrero;
	private int [][] arreglo= new int[5][5];
	public Panel_inicio(Controller controller) {

		this.c = controller;
		setSize(600, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Serpientes y Escaleras");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		PanelMenu();
		PanelJuego();
		
	}

	public void agregar(JPanel destino) {
		super.add(destino);
	}

	public void cambioPaneles(JPanel origen, JPanel destino) {
		origen.setVisible(false);
		destino.setVisible(true);
	}

	public void PanelMenu() {
		Menu = new JPanel();
		getMenu().setBackground(Color.darkGray);
		getMenu().setVisible(true);
		JButton btInicio = new JButton("INICIO");
		btInicio.addActionListener(c);
		getMenu().add(btInicio);
		super.add(Menu);
	}

	public void PanelJuego() {
		juego = new JPanel();
		juego.setBackground(Color.darkGray);
		
		getJuego().setLayout(null);
		letrero= new JLabel("Nivel Facil");
		letrero.setFont(new Font("Arial",Font.BOLD,20	));
		letrero.setForeground(Color.white);
		letrero.setBounds(250, 30, 200, 50);
		generarTablero();
		JButton btInicio = new JButton("JUGAR");
		
		JButton btsiguiente= new JButton("->");
		btsiguiente.setBounds(525, 250, 50,50);
		btsiguiente.setFont(new Font("Arial",Font.BOLD,17	));
		btsiguiente.addActionListener(c);
		JButton btnanterior= new JButton("<-");
		btnanterior.setBounds(25, 250, 50,50);
		btnanterior.setFont(new Font("Arial",Font.BOLD,17	));
		
		btnanterior.addActionListener(c);
		btInicio.addActionListener(c);
		btInicio.setBounds(200, 500,200, 40);
		
		getJuego().add(btInicio);
		getJuego().add(btsiguiente);
		getJuego().add(btnanterior);
		getJuego().add(letrero);
		getTablero().setBounds(100,80,400,400);
		getJuego().add(getTablero());
		

		super.add(Menu);
	}

	public void generarTablero() {

		if(arreglo!=null) {
			tablero = new JPanel();
			tablero.setLayout(new GridLayout(arreglo[0].length, arreglo.length));
			for (int i = 0; i < arreglo.length; i++) {
				for (int j = 0; j < arreglo[0].length; j++) {
					JPanel a = new JPanel();
					a.setBorder(new LineBorder(Color.black));
					a.setBackground(Color.green);
					tablero.add(a);
				}
		}
		}

	}

	public JPanel getMenu() {
		return Menu;
	}

	public void setMenu(JPanel menu) {
		Menu = menu;
	}

	public JPanel getJuego() {
		return juego;
	}

	public void setJuego(JPanel juego) {
		this.juego = juego;
	}

	public JPanel getTablero() {
		return tablero;
	}

	public void setTablero(JPanel tablero) {
		this.tablero = tablero;
	}

	public Controller getC() {
		return c;
	}

	public void setC(Controller c) {
		this.c = c;
	}

	public JLabel getLetrero() {
		return letrero;
	}

	public void setLetrero(JLabel letrero) {
		this.letrero = letrero;
	}

	public int[][] getArreglo() {
		return arreglo;
	}

	public void setArreglo(int[][] arreglo) {
		this.arreglo = arreglo;
	}

}

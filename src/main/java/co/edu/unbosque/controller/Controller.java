package co.edu.unbosque.controller;

import co.edu.unbosque.view.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Controller implements ActionListener {
	private Panel_inicio Panel;
	public Controller() {
		Panel= new Panel_inicio(this);



		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("INICIO")) {
		System.out.println("hioad");
		Panel.agregar(Panel.getJuego());
		Panel.cambioPaneles(Panel.getMenu(), Panel.getJuego());
		Panel.setArreglo(new int[5][5]);
		}
		
		if(e.getActionCommand().equalsIgnoreCase("ESTADISTICAS")) {
			System.out.println("EStadisticas");
		}
		if(e.getActionCommand().equalsIgnoreCase("->")) {
			siguienteNivel();
		}
		if(e.getActionCommand().equalsIgnoreCase("<-")) {
			anteriorNivel();
		}
		
		
	}
	public void siguienteNivel() {
		if(Panel.getLetrero().getText().equalsIgnoreCase("Nivel Facil")) {
			visualizacionTablero("Nivel Medio", 8);
		return;
		}
		if(Panel.getLetrero().getText().equalsIgnoreCase("Nivel Medio")) {
			visualizacionTablero("Nivel Dificil", 10);

		}else {
			JOptionPane.showMessageDialog(Panel, "No existe mas dificultad");
		}
			}
	public void anteriorNivel() {
		if(Panel.getLetrero().getText().equalsIgnoreCase("Nivel Dificil")) {
			visualizacionTablero("Nivel Medio", 8);
		return;
		}
		if(Panel.getLetrero().getText().equalsIgnoreCase("Nivel Medio")){
			visualizacionTablero("Nivel Facil", 5);
		}
		else {
			JOptionPane.showMessageDialog(Panel, "No existe mas dificultad");
		}
	}
	public void visualizacionTablero(String destino,int num) {
		Panel.getLetrero().setText(destino);;
		Panel.setArreglo(new int[num][num]);
		Panel.getJuego().remove(Panel.getTablero());
		Panel.generarTablero();
		Panel.getJuego().add(Panel.getTablero());
		Panel.getTablero().setBounds(100,80,400,400);
//		System.out.println(Panel.getArreglo().length +""+Panel.getArreglo()[0].length);
		
	}
}

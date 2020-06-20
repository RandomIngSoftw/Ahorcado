package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

public class VistaJuegoRelax extends JFrame implements Vista, Observador{

	private JPanel contentPane;
	private Controlador controller;
//	private Sujeto sujeto;
	
//	public VistaJuegoRelax(Sujeto s) {
//			s.agregarObservador(this);
	public VistaJuegoRelax() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJuegoRelax = new JLabel("Juego Relax");
		lblJuegoRelax.setBounds(10, 11, 88, 14);
		contentPane.add(lblJuegoRelax);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
		
	}

}

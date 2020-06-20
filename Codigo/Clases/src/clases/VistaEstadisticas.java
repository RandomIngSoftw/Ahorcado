package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaEstadisticas extends JFrame implements Vista, Observador{

	private JPanel contentPane;
	private static Controlador controller;
//	private Sujeto sujeto;
	
//	public VistaEstadisticas(Sujeto s) {
//			s.agregarObservador(this);
	public VistaEstadisticas() {
		
		controller = (Controlador) new ControladorDeEstadisiticas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstadisticas = new JLabel("Estadisticas");
		lblEstadisticas.setBounds(120, 25, 75, 14);
		contentPane.add(lblEstadisticas);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cerrarVentana();
			}
		});
		btnCerrar.setBounds(104, 239, 91, 23);
		contentPane.add(btnCerrar);
		
		JList list = new JList();
		list.setBounds(29, 53, 241, 175);
		contentPane.add(list);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
		
	}
}

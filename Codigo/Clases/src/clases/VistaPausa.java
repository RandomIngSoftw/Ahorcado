package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPausa extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	
	public VistaPausa() {
		controlador = (Controlador) new ControladorTop10();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu Principal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.cerrarVentana();
			}
		});
		btnNewButton.setBounds(10, 74, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Siguiente Nivel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.siguienteNivel();
			}
			
		});
		btnNewButton_1.setBounds(156, 74, 120, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("FELICIDADES");
		lblNewLabel.setBounds(105, 11, 84, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHasPasadoDe = new JLabel("Has pasado de nivel");
		lblHasPasadoDe.setBounds(94, 36, 125, 14);
		contentPane.add(lblHasPasadoDe);
	}
}

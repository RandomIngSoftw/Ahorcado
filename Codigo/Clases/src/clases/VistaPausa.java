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

public class VistaPausa extends JFrame implements Vista{

	private JPanel contentPane;
	private Controlador controlador;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblHasPasadoDe;
	
	public VistaPausa() {
		setTitle("Pausa");
		
		controlador = (Controlador) new ControladorPausa();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		btnNewButton = new JButton("Menu Principal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.cerrarVentana();
			}
		});
		btnNewButton.setBounds(10, 74, 120, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Siguiente Palabra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.siguienteNivel();
			}
			
		});
		btnNewButton_1.setBounds(156, 74, 136, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("\u00A1\u00A1 FELICIDADES !!");
		lblNewLabel.setBounds(82, 11, 118, 14);
		contentPane.add(lblNewLabel);
		
		lblHasPasadoDe = new JLabel("Has adivinado la palabra");
		lblHasPasadoDe.setBounds(82, 36, 164, 14);
		contentPane.add(lblHasPasadoDe);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
	}
	
}

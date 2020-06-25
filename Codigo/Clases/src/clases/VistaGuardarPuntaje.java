package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class VistaGuardarPuntaje extends JFrame implements Vista {

	private JPanel contentPane;
	private Controlador controlador;
	private JTextField nombre;

	/**
	 * Create the frame.
	 */
	public VistaGuardarPuntaje() {
		setTitle("Puntaje Alto");
		
		controlador = (Controlador) new ControladorGuardarPuntaje();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("DEJA TU MARCA GRABADA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 267, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAgregarTitulo = new JLabel("EN LA PARED DE LOS DIOSES ");
		lblAgregarTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAgregarTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarTitulo.setBounds(10, 36, 279, 23);
		contentPane.add(lblAgregarTitulo);
		
		JButton btnAscender = new JButton("ASCENDER");
		btnAscender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ascender(nombre.getText());
			}
		});
		btnAscender.setBounds(95, 150, 109, 23);
		contentPane.add(btnAscender);
		
		nombre = new JTextField();
		nombre.setBounds(86, 115, 130, 23);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Y GARANTIZA TU INMORTALIDAD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 70, 279, 23);
		contentPane.add(lblNewLabel_1);
	}


	@Override
	public void hacerVisible(boolean b) {
		// TODO Auto-generated method stub
		setVisible(b);
	}
}

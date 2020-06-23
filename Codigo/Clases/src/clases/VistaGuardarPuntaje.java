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

public class VistaGuardarPuntaje extends JFrame implements Vista {

	private JPanel contentPane;
	private Controlador controlador;
	private JTextField nombre;

	/**
	 * Create the frame.
	 */
	public VistaGuardarPuntaje() {
		
		controlador = (Controlador) new ControladorGuardarPuntaje();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 226, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEJA TU MARCA GRABADA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 11, 164, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAgregarTitulo = new JLabel("EN LA PARED DE LOS DIOSES ");
		lblAgregarTitulo.setBounds(34, 36, 170, 14);
		contentPane.add(lblAgregarTitulo);
		
		JButton btnAscender = new JButton("ASCENDER");
		btnAscender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ascender(nombre.getText());
			}
		});
		btnAscender.setBounds(44, 131, 109, 23);
		contentPane.add(btnAscender);
		
		nombre = new JTextField();
		nombre.setBounds(34, 89, 130, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Y GARANTIZA TU INMORTALIDAD");
		lblNewLabel_1.setBounds(24, 61, 164, 14);
		contentPane.add(lblNewLabel_1);
	}


	@Override
	public void hacerVisible(boolean b) {
		// TODO Auto-generated method stub
		setVisible(b);
	}
}

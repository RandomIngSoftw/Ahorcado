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

public class VistaGuardarPuntaje extends JFrame implements Vista {

	private JPanel contentPane;
	private Controlador controlador;

	/**
	 * Create the frame.
	 */
	public VistaGuardarPuntaje() {
		
		controlador = (Controlador) new ControladorGuardarPuntaje();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DEJA TU MARCA GRABADA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 28, 164, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAgregarTitulo = new JLabel("EN LA PARED DE LOS DIOSES Y GARANTIZA TU INMORTALIDAD");
		lblAgregarTitulo.setBounds(33, 53, 308, 14);
		contentPane.add(lblAgregarTitulo);
		
		JButton btnAscender = new JButton("ASCENDER");
		btnAscender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ascender();
			}
		});
		btnAscender.setBounds(155, 102, 91, 23);
		contentPane.add(btnAscender);
	}


	@Override
	public void hacerVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}

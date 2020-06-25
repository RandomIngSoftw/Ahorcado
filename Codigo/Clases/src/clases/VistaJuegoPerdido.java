package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class VistaJuegoPerdido extends JFrame implements Vista{

	private JPanel contentPane;
	private Controlador controlador;
	
	public VistaJuegoPerdido() {
		setTitle("Juego Perdido");
		
		controlador = (Controlador) new ControladorJuegoPerdido();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 227, 179);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblLoSiento = new JLabel("\u00A1\u00A1 LO SIENTO !!");
		lblLoSiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoSiento.setBounds(10, 24, 199, 14);
		contentPane.add(lblLoSiento);
		
		JLabel lblElJuegoTermin = new JLabel("EL JUEGO TERMIN\u00D3");
		lblElJuegoTermin.setHorizontalAlignment(SwingConstants.CENTER);
		lblElJuegoTermin.setBounds(10, 49, 199, 14);
		contentPane.add(lblElJuegoTermin);
		
		JButton btnIrMenuPrincipal = new JButton("Ir a Menu Principal");
		btnIrMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ir a menu principal
				controlador.cerrarVentana();
			}
		});
		btnIrMenuPrincipal.setBounds(36, 94, 155, 23);
		contentPane.add(btnIrMenuPrincipal);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
	}
}

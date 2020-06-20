package clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuPrincipal extends JFrame implements Vista {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ControladorMenuPrincipal controlador;
	
	public VistaMenuPrincipal() {
		
		controlador = new ControladorMenuPrincipal();
		
		setTitle("Ahorcado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 182, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJuegoNormal = new JButton("Juego Normal");
		btnJuegoNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// iniciar juego Normal
				controlador.juegoNormal();
			}
		});
		btnJuegoNormal.setBounds(23, 61, 121, 23);
		contentPane.add(btnJuegoNormal);
		
		JButton btnJuegoRelax = new JButton("Juego Relax");
		btnJuegoRelax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// iniciar juego Relax
				controlador.juegoRelax();
				//
			}
		});
		btnJuegoRelax.setBounds(23, 115, 121, 23);
		contentPane.add(btnJuegoRelax);
		
		JButton btnVerTop = new JButton("Ver Top 10");
		btnVerTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ver top 10
				controlador.verTop10();
			}
		});
		btnVerTop.setBounds(23, 169, 121, 23);
		contentPane.add(btnVerTop);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Salir
				controlador.salir();
			}
		});
		btnSalir.setBounds(23, 228, 121, 23);
		contentPane.add(btnSalir);
		
		JLabel lblMenuPrincipal = new JLabel("Menu Principal");
		lblMenuPrincipal.setBounds(45, 25, 110, 14);
		contentPane.add(lblMenuPrincipal);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
		
	}

}

package clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuPrincipal extends JFrame implements Vista {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnJuegoNormal;
	private JButton btnJuegoRelax;
	private JButton btnVerTop;
	private JButton btnSalir;
	private JLabel lblMenuPrincipal;
	private ControladorMenuPrincipal controlador;
	
	public VistaMenuPrincipal() {
		
		controlador = new ControladorMenuPrincipal();
		
		setTitle("Ahorcado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 211, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		btnJuegoNormal = new JButton("Juego Normal");
		btnJuegoNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// iniciar juego Normal
				controlador.juegoNormal();
			}
		});
		btnJuegoNormal.setBounds(34, 62, 121, 23);
		contentPane.add(btnJuegoNormal);
		
		btnJuegoRelax = new JButton("Juego Relax");
		btnJuegoRelax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.juegoRelax();
				//
			}
		});
		btnJuegoRelax.setBounds(34, 116, 121, 23);
		contentPane.add(btnJuegoRelax);
		
		btnVerTop = new JButton("Ver Top 10");
		btnVerTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.verTop10();
			}
		});
		btnVerTop.setBounds(34, 178, 121, 23);
		contentPane.add(btnVerTop);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.salir();
			}
		});
		btnSalir.setBounds(34, 232, 121, 23);
		contentPane.add(btnSalir);
		
		lblMenuPrincipal = new JLabel("Menu Principal");
		lblMenuPrincipal.setBounds(52, 26, 110, 14);
		contentPane.add(lblMenuPrincipal);
		
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
		
	}

}

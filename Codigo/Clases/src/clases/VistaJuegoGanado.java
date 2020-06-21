package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaJuegoGanado extends JFrame implements Vista{

	private JPanel contentPane;
	private Controlador controlador;
	
	public VistaJuegoGanado() {
		
		controlador = (Controlador) new ControladorJuegoGanado();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 204, 131);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFelicidades = new JLabel("\u00A1\u00A1 FELICIDADES !!");
		lblFelicidades.setBounds(52, 11, 97, 14);
		contentPane.add(lblFelicidades);
		
		JLabel lblHasLogradoTerminar = new JLabel("HAS LOGRADO TERMINAR EL JUEGO");
		lblHasLogradoTerminar.setBounds(10, 41, 212, 14);
		contentPane.add(lblHasLogradoTerminar);
		
		JButton btnIrAMenu = new JButton("Ir a Menu Principal");
		btnIrAMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cerrarVentana();
			}
		});
		btnIrAMenu.setBounds(32, 70, 136, 23);
		contentPane.add(btnIrAMenu);
	}

	@Override
	public void hacerVisible(boolean b) {
		// TODO Auto-generated method stub
		setVisible(b);
	}

}

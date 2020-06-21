package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaJuegoRelax extends JFrame implements Vista, Observador{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Controlador controlador;
	private ImageIcon imagen[] ;
	private JLabel imagen_label;
	private JLabel lblPalabra;
	private JLabel lblLetrasErroneas;
	private JLabel lblNivel;
	private JLabel lblJuegoNormal;
	private List list_nivel;
	private List list_palabra;
	private List list_letra_Erronea;
	
	private Sujeto sujeto;
	
	public void cargarImagenes() {
		
		imagen[0] = new ImageIcon(getClass().getResource("im1.jpg"));
		imagen[1] = new ImageIcon(getClass().getResource("im2.jpg"));
		imagen[2] = new ImageIcon(getClass().getResource("im3.jpg"));
		imagen[3] = new ImageIcon(getClass().getResource("im4.jpg"));
		imagen[4] = new ImageIcon(getClass().getResource("im5.jpg"));
		imagen[5] = new ImageIcon(getClass().getResource("im6.jpg"));
		
	}
	
	public VistaJuegoRelax(Sujeto sujeto) {
		imagen = new ImageIcon[6];
		cargarImagenes();

		this.sujeto = sujeto;
		sujeto.suscribirObservador(this);
		
		controlador = (Controlador)new ControladorJuegoRelax();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVerEstadisticas = new JButton("Ver Estadisticas");
		btnVerEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.verEstadisticas();
			}
		});
		btnVerEstadisticas.setBounds(27, 227, 142, 23);
		contentPane.add(btnVerEstadisticas);
		
		imagen_label = new JLabel("figura");
		imagen_label.setBounds(211, 11, imagen[0].getIconWidth(), imagen[0].getIconHeight());
		imagen_label.setIcon(imagen[0]);
		contentPane.add(imagen_label);
		
		lblNivel = new JLabel("Nivel");
		lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivel.setBounds(139, 137, 46, 14);
		contentPane.add(lblNivel);
		
		list_nivel = new List();
		list_nivel.setBounds(133, 167, 52, 23);
		contentPane.add(list_nivel);
		
		lblPalabra = new JLabel("Palabra");
		lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabra.setBounds(10, 87, 46, 14);
		contentPane.add(lblPalabra);
		
		list_palabra = new List();
		list_palabra.setBounds(69, 87, 100, 23);
		contentPane.add(list_palabra);
		
		lblLetrasErroneas = new JLabel("Letras Erroneas");
		lblLetrasErroneas.setHorizontalAlignment(SwingConstants.LEFT);
		lblLetrasErroneas.setBounds(10, 137, 124, 14);
		contentPane.add(lblLetrasErroneas);
		
		list_letra_Erronea = new List();
		list_letra_Erronea.setBounds(10, 167, 100, 43);
		contentPane.add(list_letra_Erronea);
		
		lblJuegoNormal = new JLabel("Juego Relax");
		lblJuegoNormal.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuegoNormal.setBounds(45, 32, 89, 14);
		contentPane.add(lblJuegoNormal);
		
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
		
	}

	@Override
	public void actualizar(int puntaje, int vida, int nivel, String tiempo, String palabra) {
		
	}
	
	public void setPalabra() {
		
	}
	
	public void setLetraIngresada() {
		
	}
	
	public void setNivel() {
		
	}
	
	public void setImagen() {
		
	}
}


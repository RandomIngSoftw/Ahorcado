package clases;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaJuegoNormal extends JFrame implements Vista, Observador{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ImageIcon imagen[] ;
	private static Controlador controlador;
	private Sujeto sujeto;
	private JLabel imagen_label;
	private JLabel lblNivel;
	private JLabel lblTiempo;
	private JLabel lblPalabra;
	private JLabel lblLetras;
	private JLabel lblJuegoNormal;
	private List list_nivel;
	private List list_Palabra;
	private List list_LetraErronea;
	private List list_tiempo;
	
	public VistaJuegoNormal(Sujeto sujeto) {
		imagen = new ImageIcon[6];
		cargarImagenes();
		
		this.sujeto = sujeto;
		sujeto.suscribirObservador(this);
		
		controlador = (Controlador)new ControladorJuegoNormal();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnVerEstadisticas = new JButton("Ver Estadisticas");
		btnVerEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.verEstadisticas();
			}
		});
		btnVerEstadisticas.setBounds(290, 270, 142, 23);
		contentPane.add(btnVerEstadisticas);
		
		imagen_label = new JLabel("figura");
		imagen_label.setBounds(211, 11, imagen[5].getIconWidth(), imagen[5].getIconHeight());
		imagen_label.setIcon(imagen[5]);
		contentPane.add(imagen_label);
		
		lblNivel = new JLabel("Nivel");
		lblNivel.setBounds(145, 234, 46, 14);
		contentPane.add(lblNivel);
		
		lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(10, 95, 46, 14);
		contentPane.add(lblTiempo);
		
		list_nivel = new List();
		list_nivel.setBounds(139, 254, 52, 23);
		contentPane.add(list_nivel);
		
		lblPalabra = new JLabel("Palabra");
		lblPalabra.setBounds(10, 143, 46, 14);
		contentPane.add(lblPalabra);
		
		list_Palabra = new List();
		list_Palabra.setBounds(62, 134, 100, 23);
		contentPane.add(list_Palabra);
		
		lblLetras = new JLabel("Letras Ingresadas");
		lblLetras.setBounds(10, 215, 124, 14);
		contentPane.add(lblLetras);
		
		list_LetraErronea = new List();
		list_LetraErronea.setBounds(10, 234, 100, 43);
		contentPane.add(list_LetraErronea);
		
		lblJuegoNormal = new JLabel("Juego Normal");
		lblJuegoNormal.setBounds(45, 32, 89, 14);
		contentPane.add(lblJuegoNormal);
		
		list_tiempo = new List();
		list_tiempo.setBounds(62, 86, 100, 23);
		contentPane.add(list_tiempo);
		
	}
	
	public void cargarImagenes() {
		
		imagen[0] = new ImageIcon(getClass().getResource("im6.jpg"));
		imagen[1] = new ImageIcon(getClass().getResource("im5.jpg"));
		imagen[2] = new ImageIcon(getClass().getResource("im4.jpg"));
		imagen[3] = new ImageIcon(getClass().getResource("im3.jpg"));
		imagen[4] = new ImageIcon(getClass().getResource("im2.jpg"));
		imagen[5] = new ImageIcon(getClass().getResource("im1.jpg"));
		
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);		
	}
	
	public void setTiempo(String tiempo) {
		list_tiempo.remove(0);
		list_tiempo.add(tiempo);
	}
	
	public void setPalabra(String palabra) {
		list_Palabra.remove(0);
		list_Palabra.add(palabra);
	}
	
	public void setLetraErronea(String letra) {
		String letras = list_LetraErronea.toString();
		letras.concat(letra);
		list_LetraErronea.add(letras);
	}
	
	public void setNivel(int nivel) {
		list_nivel.remove(0);
		list_nivel.add(""+nivel);
	}
	
	public void setVida(int vida) {
		contentPane.remove(imagen_label);
		imagen_label.setBounds(211, 11, imagen[vida].getIconWidth(), imagen[vida].getIconHeight());
		imagen_label.setIcon(imagen[vida]);
		contentPane.add(imagen_label);
	}

	@Override
	public void actualizar(int puntaje, int vida, int nivel, String tiempo, String palabra) {
		// TODO Auto-generated method stub
		
	}
	
}


package clases;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class VistaJuegoNormal extends JFrame implements Vista, Observador, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ImageIcon imagen[] ;
	private static Controlador controlador;
	private Sujeto sujeto;
	private JLabel imagen_label;
	private JLabel lblNivel;
	private JLabel lblPalabra;
	private JLabel lblLetras;
	private JLabel lblPuntaje; 
	private JButton btnIniciar;
	private JButton btnVerEstadisticas;
	private List list_nivel;
	private List list_Palabra;
	private List list_LetraErronea;
	private List list_tiempo;
	private List list_puntaje;
	private int i = 0;
	private JLabel lblTiempo;
	
	public VistaJuegoNormal(Sujeto sujeto) {
		setTitle("Juego Normal");
		imagen = new ImageIcon[6];
		cargarImagenes();
		
		this.sujeto = sujeto;
		sujeto.suscribirObservador(this);
		
		controlador = (Controlador)new ControladorJuegoNormal();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 489, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		btnVerEstadisticas = new JButton("Ver Estadisticas");
		btnVerEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					controlador.verEstadisticas();
			}
		});
		btnVerEstadisticas.setBounds(265, 270, 142, 23);
		contentPane.add(btnVerEstadisticas);
		
		imagen_label = new JLabel("figura");
		imagen_label.setBounds(211, 11, imagen[5].getIconWidth(), imagen[5].getIconHeight());
		imagen_label.setIcon(imagen[5]);
		contentPane.add(imagen_label);
		
		lblNivel = new JLabel("Nivel");
		lblNivel.setBounds(17, 210, 46, 14);
		contentPane.add(lblNivel);
		
		list_nivel = new List();
		list_nivel.setBounds(83, 210, 52, 23);
		contentPane.add(list_nivel);
		list_nivel.add("#####");
		
		lblPalabra = new JLabel("Palabra");
		lblPalabra.setBounds(17, 45, 46, 14);
		contentPane.add(lblPalabra);
		
		list_Palabra = new List();
		list_Palabra.setBounds(17, 65, 164, 23);
		contentPane.add(list_Palabra);
		list_Palabra.add("# # # # # #");
		
		lblLetras = new JLabel("Letras Erroneas");
		lblLetras.setBounds(17, 107, 124, 14);
		contentPane.add(lblLetras);
		
		list_LetraErronea = new List();
		list_LetraErronea.setBounds(17, 127, 164, 23);
		contentPane.add(list_LetraErronea);
		list_LetraErronea.add("empty");
		
		list_tiempo = new List();
		list_tiempo.setBounds(83, 170, 52, 23);
		contentPane.add(list_tiempo);
		list_tiempo.add("####");
		
		list_puntaje = new List();
		list_puntaje.setBounds(83, 252, 52, 23);
		contentPane.add(list_puntaje);
		list_puntaje.add("####");
		
		lblPuntaje = new JLabel("Puntaje");
		lblPuntaje.setBounds(17, 252, 46, 14);
		contentPane.add(lblPuntaje);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i == 0) {
					controlador.iniciar();
					i++;
				}
			}
		});
		btnIniciar.setBounds(44, 11, 91, 23);
		contentPane.add(btnIniciar);
		
		lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(17, 170, 46, 14);
		contentPane.add(lblTiempo);
		btnIniciar.addKeyListener(this);
		
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
	
	public void setTiempo(int tiempo) {
		list_tiempo.remove(0);
		list_tiempo.add("" + tiempo);
	}
	
	public void setPalabra(TreeMap<Integer, String> letrasAdivinadas) {
		String linea = "";
		for(int i = 0; i < letrasAdivinadas.size(); i++) {
			linea += letrasAdivinadas.get(i);
			linea += " ";
		}
		list_Palabra.remove(0);
		list_Palabra.add(linea);
	}
	
	public void setLetraErronea(ArrayList<String> letrasErroneas) {
		String linea = ""; 
		for(int i=0; i < letrasErroneas.size(); i++) {
			linea  += letrasErroneas.get(i);
		}
		list_LetraErronea.remove(0) ;
		list_LetraErronea.add(linea);
	}
	
	public void setNivel(int nivel) {
		list_nivel.removeAll();
		list_nivel.add(""+nivel);
	}
	
	public void setVida(int vida) {
		imagen_label.setIcon(imagen[vida]);
	}

	private void setPuntaje(int puntaje) {
		list_puntaje.remove(0);
		list_puntaje.add("" + puntaje);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {
		controlador.teclaPresionada(Character.toString(e.getKeyChar()));
	}

	@Override
	public void actualizar(int nivel, int puntaje, int vidas, ArrayList<String> letrasErroneas, int tiempo,
			TreeMap<Integer, String> letrasAdivinadas, int palabrasAdivinadas) {
		setNivel(nivel);
		setPuntaje(puntaje);
		setTiempo(tiempo);
		setLetraErronea(letrasErroneas);
		setVida(vidas);
		setPalabra(letrasAdivinadas);
	}

}
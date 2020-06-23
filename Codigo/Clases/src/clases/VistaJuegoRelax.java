package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.sun.java_cup.internal.runtime.Scanner;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VistaJuegoRelax extends JFrame implements Vista, Observador, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Controlador controlador;
	private ImageIcon imagen[] ;
	private JLabel lblPalabra;
	private JLabel lblLetrasErroneas;
	private JLabel lblNivel;
	private JLabel lblPuntaje;
	private List list_nivel;
	private List list_palabra;
	private List list_letra_Erronea;
	private List list_puntaje;
	private JButton btnVerEstadisticas;
	private JButton btnInciar;
	private int i = 0;
	private Sujeto sujeto;
	private JButton btnImagen;
	
	public void cargarImagenes() {
		
		imagen[0] = new ImageIcon(getClass().getResource("im6.jpg"));
		imagen[1] = new ImageIcon(getClass().getResource("im5.jpg"));
		imagen[2] = new ImageIcon(getClass().getResource("im4.jpg"));
		imagen[3] = new ImageIcon(getClass().getResource("im3.jpg"));
		imagen[4] = new ImageIcon(getClass().getResource("im2.jpg"));
		imagen[5] = new ImageIcon(getClass().getResource("im1.jpg"));
		
	}
	
	public VistaJuegoRelax(Sujeto sujeto) {
		setTitle("Juego Relax");
		imagen = new ImageIcon[6];
		cargarImagenes();

		this.sujeto = sujeto;
		sujeto.suscribirObservador(this);
		
		controlador = (Controlador)new ControladorJuegoRelax();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 320);
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
		btnVerEstadisticas.setBounds(30, 242, 142, 23);
		contentPane.add(btnVerEstadisticas);
		
		lblNivel = new JLabel("Nivel");
		lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivel.setBounds(20, 158, 46, 14);
		contentPane.add(lblNivel);
		
		list_nivel = new List();
		list_nivel.setBounds(72, 158, 52, 23);
		contentPane.add(list_nivel);
		list_nivel.add("####");
		
		lblPalabra = new JLabel("Palabra");
		lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabra.setBounds(20, 45, 46, 14);
		contentPane.add(lblPalabra);
		
		list_palabra = new List();
		list_palabra.setBounds(20, 65, 155, 23);
		contentPane.add(list_palabra);
		list_palabra.add("# # # # # ");
		
		lblLetrasErroneas = new JLabel("Letras Erroneas");
		lblLetrasErroneas.setHorizontalAlignment(SwingConstants.LEFT);
		lblLetrasErroneas.setBounds(20, 101, 124, 14);
		contentPane.add(lblLetrasErroneas);
		
		list_letra_Erronea = new List();
		list_letra_Erronea.setBounds(20, 121, 155, 23);
		contentPane.add(list_letra_Erronea);
		list_letra_Erronea.add("empty");
		
		lblPuntaje = new JLabel("Puntaje");
		lblPuntaje.setBounds(20, 201, 46, 14);
		contentPane.add(lblPuntaje);
		
		list_puntaje = new List();
		list_puntaje.setBounds(72, 201, 52, 23);
		contentPane.add(list_puntaje);
		list_puntaje.add("####");
		
		btnInciar = new JButton("Iniciar");
		btnInciar.addKeyListener(this);
		btnInciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i == 0) {
					controlador.iniciar();
					i++;
				}
			}
		});
		btnInciar.setBounds(33, 11, 91, 23);
		contentPane.add(btnInciar);
		
		btnImagen = new JButton("imagen");
		btnImagen.setBounds(285, 121, 91, 23);
		contentPane.add(btnImagen);
		btnImagen.setBounds(211, 11, imagen[5].getIconWidth(), imagen[5].getIconHeight());
		btnImagen.setIcon(imagen[5]);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);		
	}
	
	public void setPalabra(TreeMap<Integer, String> letrasAdivinadas) {
		String linea = "";
		for(int i = 0; i < letrasAdivinadas.size(); i++) {
			linea += letrasAdivinadas.get(i);
			linea += " ";
		}
		list_palabra.remove(0);
		list_palabra.add(linea);
	}
	
	public void setLetraErronea(ArrayList<String> letrasErroneas) {
		String linea = ""; 
		for(int i=0; i < letrasErroneas.size(); i++) {
			linea  += letrasErroneas.get(i);
		}
		list_letra_Erronea.remove(0) ;
		list_letra_Erronea.add(linea);
	}
	
	public void setNivel(int nivel) {
		list_nivel.removeAll();
		list_nivel.add("" + nivel);
	}
	
	public void setVida(int vida) {
		btnImagen.setIcon(imagen[vida]);
	}

	private void setPuntaje(int puntaje) {
		list_puntaje.remove(0);
		list_puntaje.add("" + puntaje);
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	 public void keyReleased(KeyEvent e) {
	 }
	 
	 @Override
	 public void keyTyped(KeyEvent e) {
		 controlador.teclaPresionada(Character.toString(e.getKeyChar()));
	 }

	@Override
	public void actualizar(int nivel, int puntaje, int vidas, ArrayList<String> letrasErroneas, int tiempo,
			TreeMap<Integer, String> letrasAdivinadas, int palabrasAdivinadas) {
		setNivel(nivel);
		setPuntaje(puntaje);
		setVida(vidas);
		setLetraErronea(letrasErroneas);
		setPalabra(letrasAdivinadas);
	}
}


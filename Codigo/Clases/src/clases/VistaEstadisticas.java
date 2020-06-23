package clases;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class VistaEstadisticas extends JFrame implements Vista, Observador, KeyListener{

	private JPanel contentPane;
	private static Controlador controlador;
	private Sujeto sujeto;
	private List list_estadisticas;
	private JLabel lblEstadisticas;
	private JButton btnCerrar;
	private String encabezado = "Nivel  -  Vida  -  Tiempo  -  Palabras  -  Puntaje";
	
	public VistaEstadisticas(Sujeto sujeto) {
		setTitle("Estadisticas");
//		observador
		this.sujeto = sujeto;
		this.sujeto.suscribirObservador(this);
		
//		controlador
		controlador = (Controlador) new ControladorDeEstadisiticas();
		
//		vista
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEstadisticas = new JLabel("Estadisticas");
		lblEstadisticas.setBounds(120, 25, 75, 14);
		contentPane.add(lblEstadisticas);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					controlador.cerrarVentana();
			}
		});
		btnCerrar.setBounds(129, 141, 91, 23);
		contentPane.add(btnCerrar);
		
		list_estadisticas = new List();
		list_estadisticas.setBounds(29, 53, 283, 69);
		setEncabezado();
		contentPane.add(list_estadisticas);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
		
	}
	
	private void setEncabezado() {
		list_estadisticas.add(encabezado);
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
		String linea = "" + nivel + "       -       " +vidas + "       -       " + tiempo + "       -       " + 
				palabrasAdivinadas + "       -       " + puntaje ;
		list_estadisticas.removeAll();
		list_estadisticas.add(encabezado);
		list_estadisticas.add(linea);

	}
}

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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ImageIcon imagen[] ;
	private static Controlador controlador;
//	private Sujeto sujeto;
	
//	public VistaJuegoNormal(Sujeto s) {
//			s.agregarObservador(this);
	public void cargarImagenes() {
		
		imagen[0] = new ImageIcon(getClass().getResource("im1.jpg"));
		imagen[1] = new ImageIcon(getClass().getResource("im2.jpg"));
		imagen[2] = new ImageIcon(getClass().getResource("im3.jpg"));
		imagen[3] = new ImageIcon(getClass().getResource("im4.jpg"));
		imagen[4] = new ImageIcon(getClass().getResource("im5.jpg"));
		imagen[5] = new ImageIcon(getClass().getResource("im6.jpg"));
		
	}
	
	public VistaJuegoNormal() {
		imagen = new ImageIcon[6];
		cargarImagenes();
		
		controlador = (Controlador)new ControladorJuegoNormal();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
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
		btnVerEstadisticas.setBounds(290, 270, 142, 23);
		contentPane.add(btnVerEstadisticas);
		
		JLabel imagen_label = new JLabel("figura");
		imagen_label.setBounds(211, 11, imagen[0].getIconWidth(), imagen[0].getIconHeight());
		imagen_label.setIcon(imagen[0]);
		contentPane.add(imagen_label);
		
		JLabel lblNivel = new JLabel("Nivel");
		lblNivel.setBounds(145, 234, 46, 14);
		contentPane.add(lblNivel);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(10, 95, 46, 14);
		contentPane.add(lblTiempo);
		
		List list_1 = new List();
		list_1.setBounds(139, 254, 52, 23);
		contentPane.add(list_1);
		
		JLabel lblPalabra = new JLabel("Palabra");
		lblPalabra.setBounds(10, 143, 46, 14);
		contentPane.add(lblPalabra);
		
		List list_2 = new List();
		list_2.setBounds(62, 134, 100, 23);
		contentPane.add(list_2);
		
		JLabel lblLetras = new JLabel("Letras Ingresadas");
		lblLetras.setBounds(10, 215, 124, 14);
		contentPane.add(lblLetras);
		
		List list_2_1 = new List();
		list_2_1.setBounds(10, 234, 100, 43);
		contentPane.add(list_2_1);
		
		JLabel lblJuegoNormal = new JLabel("Juego Normal");
		lblJuegoNormal.setBounds(45, 32, 89, 14);
		contentPane.add(lblJuegoNormal);
		
		List list_2_2 = new List();
		list_2_2.setBounds(62, 86, 100, 23);
		contentPane.add(list_2_2);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);		
	}
	
	public void setTiempo() {
		
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

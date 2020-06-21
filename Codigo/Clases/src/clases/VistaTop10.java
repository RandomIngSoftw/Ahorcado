package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaTop10 extends JFrame implements Vista{

	private JPanel contentPane;
	private Controlador controlador; 
	
	public VistaTop10() {
		
		controlador = (Controlador) new ControladorTop10();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTop = new JLabel("Top 10");
		lblTop.setBounds(103, 11, 46, 14);
		contentPane.add(lblTop);
		
		JList list = new JList();
		list.setBounds(10, 36, 216, 226);
		contentPane.add(list);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// cierra
				controlador.cerrarVentana();
			}
		});
		btnCerrar.setBounds(82, 283, 91, 23);
		contentPane.add(btnCerrar);
	}

	@Override
	public void hacerVisible(boolean b) {
		// TODO Auto-generated method stub
		setVisible(b);
	}
	
}

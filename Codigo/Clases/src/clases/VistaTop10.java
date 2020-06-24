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
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import java.awt.List;

public class VistaTop10 extends JFrame implements Vista{

	private JPanel contentPane;
	private Controlador controlador; 
	private JLabel lblTop;
	private JButton btnCerrar;
	private List list;
	
	public VistaTop10() {
		setTitle("Top 10");
		
		controlador = (Controlador) new ControladorTop10();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTop = new JLabel("Top 10");
		lblTop.setBounds(103, 11, 46, 14);
		contentPane.add(lblTop);
		
		btnCerrar = new JButton("Ir Menu Principal");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cerrarVentana();
			}
		});
		btnCerrar.setBounds(41, 283, 146, 23);
		contentPane.add(btnCerrar);
		
		list = new List();
		list.setBounds(10, 31, 216, 246);
		contentPane.add(list);
	}

	@Override
	public void hacerVisible(boolean b) {
		setVisible(b);
	}
	
	public void setTop10(TreeMap<Integer, String> map) {
		if(map.size() != 0) {
			String orden[] = new String[map.size()];
			int i = map.size();
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				if(i != 0) orden[--i] = ""+ entry.getKey() + "   "+ entry.getValue();
//				i--;
			}
			for(int j=0; j<10; j++) {
				if(j < orden.length) list.add(orden[j]);
			}
		}
	}
}

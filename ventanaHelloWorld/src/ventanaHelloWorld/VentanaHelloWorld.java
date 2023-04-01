package ventanaHelloWorld;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

/**
 * Esta Clase es una aplicacion de ventana
 * @author Ariel Sempertegui Soliz
 * @version 1.0
 * @category Swing
 */
public class VentanaHelloWorld {

	private JFrame mi_ventana;
	private JTextField txtF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaHelloWorld window = new VentanaHelloWorld();
					window.mi_ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaHelloWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mi_ventana = new JFrame();
		mi_ventana.getContentPane().setBackground(Color.GREEN);
		mi_ventana.setTitle("Hola Mundo");
		mi_ventana.setBounds(100, 100, 396, 276);
		mi_ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mi_ventana.getContentPane().setLayout(null);
		
		JLabel lblHolaMundo = new JLabel("");
		lblHolaMundo.setFont(new Font("Courier New", Font.BOLD, 13));
		lblHolaMundo.setBounds(27, 34, 83, 14);
		mi_ventana.getContentPane().add(lblHolaMundo);
		
		JButton btnIncrementar = new JButton("Haz Click!");
		btnIncrementar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtF.setText("Escribe Aquí!");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIncrementar.setEnabled(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnIncrementar.setEnabled(true);
			}
		});
		btnIncrementar.setBounds(180, 52, 117, 50);
		mi_ventana.getContentPane().add(btnIncrementar);
		
		txtF = new JTextField();
		txtF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mi_ventana.getContentPane().setBackground(Color.RED);
				txtF.setEnabled(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mi_ventana.getContentPane().setBackground(Color.BLUE);
				txtF.setEnabled(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				txtF.setText("Dale al Botón!");
			}
		});
		txtF.setBounds(72, 117, 93, 26);
		mi_ventana.getContentPane().add(txtF);
		txtF.setColumns(10);
	}
	// Fin del Programa
}

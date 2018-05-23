package Arbol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class emp extends JFrame {

	private static Persona persona;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	

	public static Persona getPersona() {
		return persona;
	}

	public static void setPersona(Persona persona) {
		emp.persona = persona;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emp frame = new emp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public emp() {
		lock lock2 = new lock();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(200, 45, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 80, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 115, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(35, 48, 56, 16);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(35, 83, 56, 16);
		contentPane.add(lblEdad);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento");
		lblFechaNacimiento.setBounds(35, 118, 107, 16);
		contentPane.add(lblFechaNacimiento);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Persona dank  = new Persona(textField.getText(), Integer.parseInt(textField_1.getText()), textField_2.getText());
				setPersona(dank);
				Nodo dankus = new NodoIndividual(dank);
				setPersona(dank);
				String info[]=new String[3];  //creates an array to store  variable values. You can increase the size when needed
				info[0]=textField.getText(); //put jTextField1's value in the array.
				info[1]=textField_1.getText(); //put jTextField1's value in the array.
				info[2]=textField_2.getText(); //put jTextField1's value in the array.
				synchronized (lock2) {
					lock2.notify();	
				}
				setVisible(false); // hiding this form
			}
		});
		btnAgregar.setBounds(131, 179, 97, 25);
		contentPane.add(btnAgregar);
	}

}

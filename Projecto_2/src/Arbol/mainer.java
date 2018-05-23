package Arbol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class mainer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainer frame = new mainer();
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
	public mainer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Pictures\\png.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidoAlVisualizador = new JLabel("Bienvenido a FAMILISIS");
		lblBienvenidoAlVisualizador.setFont(new Font("Lucida Sans", Font.BOLD, 39));
		lblBienvenidoAlVisualizador.setBounds(12, 13, 597, 47);
		contentPane.add(lblBienvenidoAlVisualizador);
		
		JLabel lblParaComenzarInserte = new JLabel("Para comenzar, inserte los datos del pariente mas antiguo que conozca");
		lblParaComenzarInserte.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblParaComenzarInserte.setBounds(22, 73, 466, 16);
		contentPane.add(lblParaComenzarInserte);
		
		textField = new JTextField();
		textField.setBounds(221, 102, 213, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 131, 213, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 160, 213, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty()|| textField_1.getText().isEmpty() || textField_2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
				} else {
					String edad = textField_1.getText();
					if (isNumeric(edad)) {
						int edadd = Integer.parseInt(edad);
						Persona dankus  = new Persona(textField.getText(), edadd , textField_2.getText());
						Nodo dankuss = new NodoIndividual(dankus);
						Arbol ultimate = new Arbol(dankuss);
						s dank = new s(dankuss, ultimate);
						dank.setVisible(true);
						dispose();
						System.out.println(textField_2.getText());
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Por favor ingrese una edad valida"); 
					}
			
				}
			}
		});
		btnAceptar.setBounds(494, 231, 97, 25);
		contentPane.add(btnAceptar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNombre.setBounds(12, 105, 56, 16);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblEdad.setBounds(12, 134, 56, 16);
		contentPane.add(lblEdad);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblFechaDeNacimiento.setBounds(12, 163, 173, 16);
		contentPane.add(lblFechaDeNacimiento);
		
		
	}

	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
}

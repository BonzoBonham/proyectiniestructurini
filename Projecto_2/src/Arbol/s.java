package Arbol;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class s extends JFrame {

	public static String texto;
	private JPanel contentPane;
	public static int cont = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		DefaultMutableTreeNode hey;
		Arbol hoe;
			public void run() {
				try {
					s frame = new s(hey, hoe);
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
	public s(DefaultMutableTreeNode hey, Arbol hoe){
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\hp\\Pictures\\png.png"));){
		lock lock = new lock();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblVisualizadorArbolFamiliar = new JLabel("FAMILISIS");
		lblVisualizadorArbolFamiliar.setFont(new Font("Lucida Sans", Font.BOLD, 51));
		lblVisualizadorArbolFamiliar.setBounds(155, 22, 360, 70);
		contentPane.add(lblVisualizadorArbolFamiliar);

		JTree tree = new JTree(hey);
		tree.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		tree.setBounds(12, 142, 368, 328);
		contentPane.add(tree);

		JButton btnAgregarFamiliar = new JButton("Agregar Hijo");
		btnAgregarFamiliar.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		btnAgregarFamiliar.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent arg0) {
				String nombre, fechanac;
				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				if (path != null) {
					int edad;
					nombre = JOptionPane.showInputDialog("Inserte el nombre");
					String edadd = JOptionPane.showInputDialog("Inserte la edad");
					if (isNumeric(edadd)) {
						edad = Integer.parseInt(edadd);
						fechanac = JOptionPane.showInputDialog("Inserte la fecha de nacimiento");
						DefaultMutableTreeNode node =  (DefaultMutableTreeNode) path.getLastPathComponent();
						Persona dank  = new Persona(nombre, edad, fechanac);
						Nodo dankus = new NodoIndividual(dank);
						DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(dankus);
						DefaultMutableTreeNode dink = new DefaultMutableTreeNode("lmao");
						model.insertNodeInto(dankus, node, node.getChildCount());
					} else {
						JOptionPane.showMessageDialog(null, "Error: Edad no valida. Vuelva a intentarlo"); 
					}
				}else {
					JOptionPane.showMessageDialog(null, "Por favor seleccione un nodo y vuelvalo a intentar");
				}
			}
		});

		btnAgregarFamiliar.setBounds(392, 142, 180, 35);
		contentPane.add(btnAgregarFamiliar);

		JButton btnCambiarCentro = new JButton("Eliminar Nodo");
		btnCambiarCentro.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		btnCambiarCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

				TreePath[] paths = tree.getSelectionPaths();
				if (paths != null) {
					for (TreePath path : paths) {
						DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
						if (node.getParent() != null) {
							model.removeNodeFromParent(node);
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Por favor seleccione un nodo y vuelvalo a intentar");
				}
			}
		});

		btnCambiarCentro.setBounds(392, 190, 180, 35);
		contentPane.add(btnCambiarCentro);

		JButton btnAgregarConyugue = new JButton("Agregar Conyugue");
		btnAgregarConyugue.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		btnAgregarConyugue.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent arg0) {
				String nombre;

				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				if (path != null) {
					nombre = JOptionPane.showInputDialog("Inserte el nombre");
					NodoIndividual node =  (NodoIndividual) path.getLastPathComponent();
					Persona persona = (Persona)node.getInfo();
					persona.setConyugue(nombre);
				}else { 
					JOptionPane.showMessageDialog(null, "Por favor seleccione un nodo y vuelvalo a intentar");
				}



				/*String nombre;
				nombre = JOptionPane.showInputDialog("Inserte el nombre");
				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				DefaultMutableTreeNode node =  (DefaultMutableTreeNode) path.getLastPathComponent();
				NodoIndividual nodote = (NodoIndividual) node;
				Nodo nodito = (Nodo) node;
				nodito.setInfo(nodito.getInfo().toString() + nombre);
				String informa = (String)nodito.getInfo();
				NodoPareja pareja = new NodoPareja(informa, nodote);
				 */
			}
		});
		btnAgregarConyugue.setBounds(392, 238, 180, 35);
		contentPane.add(btnAgregarConyugue);

		JButton btnMostrarInformacion = new JButton("Mostrar Informacion");
		btnMostrarInformacion.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		btnMostrarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				if (path != null) {
					NodoIndividual node =  (NodoIndividual) path.getLastPathComponent();
					System.out.println(node.getInfo());
					Persona persona = (Persona)node.getInfo();
					JOptionPane.showMessageDialog(null, "Nombre: " + persona.getNombre() + 
							//"\nFecha de nacimiento: " + persona.getFechanacimiento() + 
							"\nEdad: " + persona.getEdad() + 
							"\nEsta vivo: " + persona.isVivo() +
							"\nEsposo/a: " + persona.getConyugue() + 
							"\nFecha de muerte: " + persona.getFechamuerte());

				} else { 
					JOptionPane.showMessageDialog(null, "Por favor seleccione un nodo y vuelvalo a intentar");
				}
			}
		});
		btnMostrarInformacion.setBounds(392, 286, 180, 35);
		contentPane.add(btnMostrarInformacion);

		JComboBox lacomboBox = new JComboBox();

		lacomboBox.addItem("Nombre");
		lacomboBox.addItem("Edad");
		lacomboBox.addItem("Esta fallecido");
		lacomboBox.addItem("Fecha fallecimiento");

		//String selecti= (String)(lacomboBox.getSelectedItem());
		lacomboBox.setBounds(392, 400, 180, 22);
		contentPane.add(lacomboBox);

		JLabel lblModificar = new JLabel("Modificar...");
		lblModificar.setBounds(392, 371, 78, 16);
		contentPane.add(lblModificar);

		JButton btnModificarInformacion = new JButton("Aceptar");
		btnModificarInformacion.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		btnModificarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecti= (String)(lacomboBox.getSelectedItem());
				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				if (path != null) {
					NodoIndividual node =  (NodoIndividual) path.getLastPathComponent();

					Persona dunk;
					String modif;
					int modifi;
					boolean modifa;
					switch (selecti) {
					case "Nombre": 
						modif = JOptionPane.showInputDialog("Inserte el nuevo nombre");
						dunk = (Persona)node.getInfo();
						dunk.setNombre(modif);
						node.setInfo(dunk);
						break;
					case "Edad": 
						modif = JOptionPane.showInputDialog("Inserte la nueva edad");
						if (isNumeric(modif)) {
						modifi = Integer.parseInt(modif);
						dunk = (Persona)node.getInfo();
						dunk.setEdad(modifi);
						node.setInfo(dunk);
						} else {
							JOptionPane.showMessageDialog(null, "Error: Edad no valida. Vuelva a intentarlo");
						}
						break;
					case "Esta fallecido": 
						modifa = Boolean.parseBoolean(JOptionPane.showInputDialog("Inserte true/false"));
						dunk = (Persona)node.getInfo();
						dunk.setVivo(modifa);
						node.setInfo(dunk);
						break;
					case "Fecha fallecimiento": 
						modif = JOptionPane.showInputDialog("Inserte la nueva fecha de fallecimiento");
						dunk = (Persona)node.getInfo();
						dunk.setFechamuerte(modif);
						node.setInfo(dunk);
						break;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Por favor seleccione un nodo y vuelvalo a intentar");
				}
			}

		});
		btnModificarInformacion.setBounds(392, 435, 180, 35);
		contentPane.add(btnModificarInformacion);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hp\\Pictures\\png.png"));
		lblNewLabel.setBounds(12, 13, 116, 116);
		contentPane.add(lblNewLabel);

		JLabel lblVisualizadorDerbol = new JLabel("Visualizador de \u00E1rbol geneal\u00F3gico");
		lblVisualizadorDerbol.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		lblVisualizadorDerbol.setBounds(155, 102, 340, 27);
		contentPane.add(lblVisualizadorDerbol);



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

class lock {

	private boolean dank;
	public lock() {
		this.dank = true;
	} 
}
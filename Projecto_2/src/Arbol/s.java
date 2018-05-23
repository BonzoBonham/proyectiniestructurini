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
		lock lock = new lock();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblVisualizadorArbolFamiliar = new JLabel("Visualizador Arbol Familiar");
		lblVisualizadorArbolFamiliar.setFont(new Font("Lucida Sans", Font.BOLD, 17));
		lblVisualizadorArbolFamiliar.setBounds(12, 13, 270, 29);
		contentPane.add(lblVisualizadorArbolFamiliar);

		JTree tree = new JTree(hey);
		tree.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		tree.setBounds(12, 55, 368, 428);
		contentPane.add(tree);

		JButton btnAgregarFamiliar = new JButton("Agregar Hijo");
		btnAgregarFamiliar.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent arg0) {
				String nombre, fechanac;
				int edad;
				nombre = JOptionPane.showInputDialog("Inserte el nombre");
				edad = Integer.parseInt(JOptionPane.showInputDialog("Inserte la edad"));
				fechanac = JOptionPane.showInputDialog("Inserte la fecha de nacimiento");
				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				DefaultMutableTreeNode node =  (DefaultMutableTreeNode) path.getLastPathComponent();
				Persona dank  = new Persona(nombre, edad, fechanac);
				Nodo dankus = new NodoIndividual(dank);
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(dankus);
				DefaultMutableTreeNode dink = new DefaultMutableTreeNode("lmao");
				model.insertNodeInto(dankus, node, node.getChildCount());
			}
		});

		btnAgregarFamiliar.setBounds(407, 51, 149, 25);
		contentPane.add(btnAgregarFamiliar);

		JButton btnCambiarCentro = new JButton("Eliminar Nodo");
		btnCambiarCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

				TreePath[] paths = tree.getSelectionPaths();
				for (TreePath path : paths) {
					DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
					if (node.getParent() != null) {
						model.removeNodeFromParent(node);
					}
				}
			}
		});

		btnCambiarCentro.setBounds(407, 89, 149, 25);
		contentPane.add(btnCambiarCentro);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(407, 297, 149, 22);
		comboBox.addItem("Abuelos");
		comboBox.addItem("Primos");
		comboBox.addItem("Tios");
		comboBox.addItem("Hermanos");
		contentPane.add(comboBox);

		JLabel lblMostrarPorRelacion = new JLabel("Mostrar por relaci\u00F3n...");
		lblMostrarPorRelacion.setBounds(407, 268, 129, 16);
		contentPane.add(lblMostrarPorRelacion);

		JLabel lblOrganizarPor = new JLabel("Organizar por....");
		lblOrganizarPor.setBounds(407, 400, 129, 16);
		contentPane.add(lblOrganizarPor);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(407, 429, 149, 22);
		contentPane.add(comboBox_1);

		JButton btnAgregarConyugue = new JButton("Agregar Conyugue");
		btnAgregarConyugue.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent arg0) {
				String nombre;
				nombre = JOptionPane.showInputDialog("Inserte el nombre");
				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				NodoIndividual node =  (NodoIndividual) path.getLastPathComponent();
				Persona persona = (Persona)node.getInfo();
				persona.setConyugue(nombre);
	
				
			
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
		btnAgregarConyugue.setBounds(407, 127, 149, 25);
		contentPane.add(btnAgregarConyugue);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nodo node = (Nodo) tree.getLastSelectedPathComponent();
				String selected = (String)comboBox.getSelectedItem();
				switch (selected) {
	            case "Primos": 
	            	JOptionPane.showMessageDialog(null, hoe.getPrimos(node).toString());
	            case "Tios":
	            case "Hermanos":
	            case "Abuelos":
	                  
	          
	        }
			}
		});
		btnAceptar.setBounds(407, 332, 97, 25);
		contentPane.add(btnAceptar);
		
		JButton btnMostrarInformacion = new JButton("Mostrar Informacion");
		btnMostrarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				TreePath path = tree.getSelectionPath();
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				tree.setSelectionRow(2);
				NodoIndividual node =  (NodoIndividual) path.getLastPathComponent();
				System.out.println(node.getInfo());
				Persona persona = (Persona)node.getInfo();
				JOptionPane.showMessageDialog(null, "Nombre: " + persona.getNombre() + 
													//"\nFecha de nacimiento: " + persona.getFechanacimiento() + 
													"\nEdad: " + persona.getEdad() + 
													"\nEsta vivo: " + persona.isVivo() +
													"\nEspos@: " + persona.getConyugue());
			}
		});
		btnMostrarInformacion.setBounds(407, 165, 149, 25);
		contentPane.add(btnMostrarInformacion);

	}


	/*public s(){
	lock lock = new lock();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 602, 543);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblVisualizadorArbolFamiliar = new JLabel("Visualizador Arbol Familiar");
	lblVisualizadorArbolFamiliar.setFont(new Font("Lucida Sans", Font.BOLD, 17));
	lblVisualizadorArbolFamiliar.setBounds(12, 13, 270, 29);
	contentPane.add(lblVisualizadorArbolFamiliar);

	JTree tree = new JTree();
	tree.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
	tree.setBounds(12, 55, 368, 428);
	contentPane.add(tree);

	JButton btnAgregarFamiliar = new JButton("Agregar Hijo");
	btnAgregarFamiliar.addActionListener(new ActionListener() {
		public void  actionPerformed(ActionEvent arg0) {

			emp upale = new emp();
			upale.setVisible(true);	
			upale.setWorking(true);
		    TreePath path = tree.getSelectionPath();

		    DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
		    tree.setSelectionRow(2);
		    DefaultMutableTreeNode node =  (DefaultMutableTreeNode) path.getLastPathComponent();
		    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(upale.getPersona());
		    DefaultMutableTreeNode dank = new DefaultMutableTreeNode("daml");
		    model.insertNodeInto(newNode, node, node.getChildCount());



		}
	});

	btnAgregarFamiliar.setBounds(407, 51, 139, 25);
	contentPane.add(btnAgregarFamiliar);

	JButton btnCambiarCentro = new JButton("Eliminar Nodo");
	btnCambiarCentro.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
            DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

            TreePath[] paths = tree.getSelectionPaths();
            for (TreePath path : paths) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
                if (node.getParent() != null) {
                    model.removeNodeFromParent(node);
                }
            }
        }
	});
	btnCambiarCentro.setBounds(407, 89, 139, 25);
	contentPane.add(btnCambiarCentro);

	JComboBox comboBox = new JComboBox();
	JOptionPane n=new JOptionPane();
	comboBox.addItem("Hermanos");
	comboBox.addItem("Primos");
	comboBox.addItem("Tios");
	comboBox.addItem("Abuelos");
	comboBox.setBounds(407, 297, 139, 22);
	contentPane.add(comboBox);

	JLabel lblMostrarPorRelacion = new JLabel("Mostrar por relaci\u00F3n...");
	lblMostrarPorRelacion.setBounds(407, 268, 129, 16);
	contentPane.add(lblMostrarPorRelacion);

	JLabel lblOrganizarPor = new JLabel("Organizar por....");
	lblOrganizarPor.setBounds(407, 400, 129, 16);
	contentPane.add(lblOrganizarPor);

	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setBounds(407, 429, 139, 22);
	contentPane.add(comboBox_1);

	JButton btnAgregarConyugue = new JButton("Agregar Conyugue");
	btnAgregarConyugue.addActionListener(new ActionListener() {
		public void  actionPerformed(ActionEvent arg0) {

			emp upale = new emp();
			upale.setVisible(true);	
			upale.setWorking(true);
		    TreePath path = tree.getSelectionPath();

		    DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
		    tree.setSelectionRow(2);
		    DefaultMutableTreeNode node =  (DefaultMutableTreeNode) path.getLastPathComponent();
		    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(upale.getPersona());
		    DefaultMutableTreeNode dank = new DefaultMutableTreeNode("daml");
		    model.insertNodeInto(newNode, node, node.getChildCount());


		}
	});
	btnAgregarConyugue.setBounds(407, 127, 139, 25);
	contentPane.add(btnAgregarConyugue);

	JButton btnAceptar = new JButton("Aceptar");
	btnAceptar.setBounds(407, 332, 97, 25);
	contentPane.add(btnAceptar);

	JButton btnNewButton = new JButton("Mostrar Informacion");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

		}
	});
	btnNewButton.setBounds(407, 165, 139, 25);
	contentPane.add(btnNewButton);



}
	 */

}

class lock {

	private boolean dank;
	public lock() {
		this.dank = true;
	} 
}
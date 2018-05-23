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
			public void run() {
				try {
					s frame = new s();
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
	public s(DefaultMutableTreeNode hey){
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
				JTextField field1 = new JTextField();
				JTextField field2 = new JTextField();
				JTextField field3 = new JTextField();
				Object[] fields = {
						"Nombre ", field1, 
						"Edad ", field2,
						"Fecha Nacimiento ", field3
				};
				JOptionPane.showConfirmDialog(null, fields, "hi", JOptionPane.OK_CANCEL_OPTION);
				/*emp upale = new emp();
				upale.setVisible(true);	
				upale.setWorking(true);
			    TreePath path = tree.getSelectionPath();
			
			    DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
			    tree.setSelectionRow(2);
			    DefaultMutableTreeNode node =  (DefaultMutableTreeNode) path.getLastPathComponent();
			    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(upale.getPersona());
			    DefaultMutableTreeNode dank = new DefaultMutableTreeNode("daml");
			    model.insertNodeInto(newNode, node, node.getChildCount());
			    */
				
			 
				
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
		comboBox.setBounds(407, 297, 139, 22);
		contentPane.add(comboBox);
		
		JLabel lblMostrarPorRelacion = new JLabel("Mostrar por relaci\u00F3n...");
		lblMostrarPorRelacion.setBounds(407, 268, 129, 16);
		contentPane.add(lblMostrarPorRelacion);
		
		JLabel lblOrganizarPor = new JLabel("Organizar por....");
		lblOrganizarPor.setBounds(407, 332, 129, 16);
		contentPane.add(lblOrganizarPor);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(407, 361, 139, 22);
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
		
	
		
	}
	
	private void createNodes(Nodo top) {
	    Nodo centro = null;
	    Nodo nodito = null;
	    
	    centro = new Nodo("hola");
	    top = centro;
	    
	    //original Tutorial
	    nodito = new Nodo("hola");
	   
//	    centro.setHermanos(new Nodo("holi"));
	    
	    /*//Tutorial Continued
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Java Tutorial Continued: The Rest of the JDK",
	        "tutorialcont.html"));
	    category.add(book);
	    
	    //Swing Tutorial
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Swing Tutorial: A Guide to Constructing GUIs",
	        "swingtutorial.html"));
	    category.add(book);

	    //...add more books for programmers...

	    category = new DefaultMutableTreeNode("Books for Java Implementers");
	    top.add(category);

	    //VM
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Java Virtual Machine Specification",
	         "vm.html"));
	    category.add(book);

	    //Language Spec
	    book = new DefaultMutableTreeNode(new BookInfo
	        ("The Java Language Specification",
	         "jls.html"));
	    category.add(book);
	    */
	}

public s(){
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
	comboBox.setBounds(407, 297, 139, 22);
	contentPane.add(comboBox);
	
	JLabel lblMostrarPorRelacion = new JLabel("Mostrar por relaci\u00F3n...");
	lblMostrarPorRelacion.setBounds(407, 268, 129, 16);
	contentPane.add(lblMostrarPorRelacion);
	
	JLabel lblOrganizarPor = new JLabel("Organizar por....");
	lblOrganizarPor.setBounds(407, 332, 129, 16);
	contentPane.add(lblOrganizarPor);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setBounds(407, 361, 139, 22);
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
	

	
}


}

class lock {
	
	private boolean dank;
	public lock() {
		this.dank = true;
	} 
}
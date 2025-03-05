import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Canvas;

public class PrimerDiseno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimerDiseno frame = new PrimerDiseno();
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
	public PrimerDiseno() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Label label = new Label("Registro de usuarios");
		label.setFont(new Font("Dialog", Font.PLAIN, 18));
		label.setForeground(new Color(255, 0, 0));
		label.setBackground(new Color(255, 215, 0));
		contentPane.add(label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 10, 10));
		panel.setBackground(new Color(255, 215, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setHorizontalAlignment(JLabel.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_5.add(lblNewLabel);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setBackground(new Color(152, 251, 152));
		
		textField = new JTextField();
		panel_6.add(textField);
		textField.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_7);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido paterno");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_7.add(lblNewLabel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_8);
		
		textField_1 = new JTextField();
		panel_8.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_9);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido materno");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_9.add(lblNewLabel_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_10);
		
		textField_2 = new JTextField();
		panel_10.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_11);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_11.add(lblNewLabel_3);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_12);
		
		textField_3 = new JTextField();
		panel_12.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_13);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_13.add(lblNewLabel_4);
		
		JPanel panel_14 = new JPanel();
		panel_1.add(panel_14);
		panel_14.setBackground(new Color(152, 251, 152));
		panel_14.setLayout(new GridLayout(2, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(152, 251, 152));
		panel_14.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(152, 251, 152));
		panel_14.add(rdbtnNewRadioButton_1);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(152, 251, 152));
		panel_1.add(panel_15);
		
		JLabel lblNewLabel_5 = new JLabel("Nacionalidad");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_15.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBackground(new Color(152, 251, 152));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Peru", "Mexico", "Argentina", "Venezuela"}));
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 182, 193));
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel(new ImageIcon("C:\\Users\\danid\\git\\PROGRAMACION-4-IDS-TM\\Actividad1\\imagenes\\5087607 (2).png"));
		lblNewLabel_6.setBounds(55, 10, 163, 175);
		panel_2.add(lblNewLabel_6);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 182, 193));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(55, 191, 200, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setBackground(new Color(255, 182, 193));
		chckbxMostrarFechaDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxMostrarFechaDe.setBounds(55, 214, 217, 21);
		panel_2.add(chckbxMostrarFechaDe);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(255, 69, 0));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Datos opcionales");
		lblNewLabel_7.setBackground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(lblNewLabel_7, BorderLayout.NORTH);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 182, 193));
		panel_3.add(panel_16, BorderLayout.CENTER);
		panel_16.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Descripción");
		lblNewLabel_8.setBounds(28, 24, 95, 71);
		lblNewLabel_8.setBackground(new Color(255, 182, 193));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setOpaque(true);
		panel_16.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Preferencias");
		lblNewLabel_9.setBounds(160, 29, 95, 60);
		lblNewLabel_9.setBackground(new Color(255, 182, 193));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setOpaque(true);
		panel_16.add(lblNewLabel_9);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 98, 113, 98);
		TitledBorder titulo = new TitledBorder(BorderFactory.createLineBorder(new Color(0,0,0),2),"Ingresa");
		textArea.setBorder(titulo);
		panel_16.add(textArea);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"Deporte", "Musica", "Leer", "Otros"}));
		comboBox_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_2_1.setBounds(149, 99, 107, 98);
		panel_16.add(comboBox_2_1);
		
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setBackground(new Color(152, 251, 152));
		panel_4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\danid\\git\\PROGRAMACION-4-IDS-TM\\Actividad1\\imagenes\\cerrar-sesion.png"));
		btnNewButton_2.setBackground(new Color(255, 250, 250));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(76, 161, 128, 50);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Guardar");
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\danid\\git\\PROGRAMACION-4-IDS-TM\\Actividad1\\imagenes\\guardar-el-archivo.png"));
		btnNewButton_2_1.setBackground(new Color(255, 250, 250));
		btnNewButton_2_1.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1.setBounds(76, 101, 128, 50);
		panel_4.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Nuevo");
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\danid\\git\\PROGRAMACION-4-IDS-TM\\Actividad1\\imagenes\\registro (1).png"));
		btnNewButton_2_2.setBackground(new Color(255, 250, 250));
		btnNewButton_2_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2_2.setBounds(76, 41, 128, 50);
		panel_4.add(btnNewButton_2_2);
	}
}

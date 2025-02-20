
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
public class Ventana extends JFrame {

	Font etiquetas = new Font("Arial", Font.PLAIN,20);
	public Ventana (String title) {
		
		//this.setTitle("Login");
		this.setTitle("Registro");
		this.setVisible(true);
		this.setSize(800, 500);
		
		this.setResizable(false);
		this.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		//this.add(this.login());
		//this.add(this.registro());)
		
		this.add(this.tabla());
		this.repaint();
		//this.add(this.rightSide());
		this.repaint();
		
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(600,600));
		
		
	}
	
	public JPanel tabla() {
		
		JPanel panel = new JPanel();
		panel.setLocation(0,0);
		panel.setOpaque(true);
		panel.setSize(800,500);
		panel.setBackground(new Color(235, 235, 235));
		panel.setVisible(true);
		panel.setLayout(null);
		this.add(panel);
		
		
		JLabel widget = new JLabel();
		widget.setSize(160, 130);
		widget.setLocation(70, 40);
		widget.setBackground(Color.LIGHT_GRAY);
		widget.setOpaque(true);
		widget.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.blue));
		widget.setFont(etiquetas);
		panel.add(widget);
		
		JLabel etiqueta1 = new JLabel("Total de usuarios");
		etiqueta1.setSize(100, 50);
		etiqueta1.setLocation(20, 13);
		etiqueta1.setBackground(Color.LIGHT_GRAY);
		etiqueta1.setOpaque(true);
		//etiqueta1.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.blue));
		widget.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("80");
		etiqueta2.setSize(100, 50);
		etiqueta2.setLocation(20, 80);
		etiqueta2.setBackground(Color.LIGHT_GRAY);
		etiqueta2.setOpaque(true);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.blue));
		etiqueta2.setFont(etiquetas);
		widget.add(etiqueta2);
		
		JButton exportar = new JButton("Exportar");
		exportar.setBounds(700, 100, 80, 45);
		exportar.setHorizontalAlignment(JLabel.CENTER);
		exportar.setBackground(new Color(15, 62, 234));
		Font fuente2 = new Font("arial", 40, 12);
		exportar.setFont(fuente2); 
		exportar.setForeground(Color.WHITE);
		panel.add(exportar);
		
		JButton añadir = new JButton("Añadir");
		añadir.setBounds(610, 100, 80, 45);
		añadir.setHorizontalAlignment(JLabel.CENTER);
		añadir.setBackground(new Color(15, 62, 234));
		Font fuente3 = new Font("arial", 40, 12);
		añadir.setFont(fuente3); 
		añadir.setForeground(Color.WHITE);
		panel.add(añadir);

		String [] columNames= {"First name", "Last name", "Game","Age", "Vegetarian"};
		
		Object[][] data = {
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
				{"Kathy", "smith","fubo",1995,true},
		};
		JTable table = new JTable(data,columNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(700, 200);
		scrollPane.setLocation(30, 190);
		
		panel.add(scrollPane);
		return panel;
		
	}
	
	/*public JPanel rightSide() {
		JPanel rightSide = new JPanel();
	
		rightSide.setLocation(400,0);
		rightSide.setOpaque(true);
		rightSide.setBackground(Color.RED);
		rightSide.setSize(400,600);
		rightSide.setBackground(new Color(15, 62, 234));
		rightSide.setVisible(true);
		JLabel label = new JLabel();
		label.setSize(400, 460);
		label.setHorizontalAlignment(JLabel.CENTER);
		ImageIcon imagen = new ImageIcon("imagenes/login.png");
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icono);
		rightSide.add(label);
		this.add(rightSide);
		
		
		return rightSide;
		
	}
	
	public JPanel login() {
		
		JPanel login = new JPanel();
		login.setLocation(0,0);
		login.setOpaque(true);
		login.setSize(400,600);
		login.setBackground(new Color(235, 235, 235));
		login.setVisible(true);
		login.setLayout(null);
		this.add(login);
		
		JLabel etiqueta1 = new JLabel("Inicia sesión");
		etiqueta1.setSize(245, 50);
		etiqueta1.setLocation(70, 40);
		etiqueta1.setBackground(new Color(235, 235, 235));
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.blue));
		etiqueta1.setFont(etiquetas);
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Correo electrónico");
		etiqueta2.setBounds(80, 120, 180, 30);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setBounds(80, 150, 230, 30);
		email.setBackground(new Color(255, 255, 255));
		email.setOpaque(true);
		email.setFont(etiquetas);
		login.add(email);
		login.revalidate();
		
		JLabel etiqueta3 = new JLabel("Contraseña");
		etiqueta3.setBounds(80, 190, 120, 30);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		login.add(etiqueta3);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(80, 220, 230, 30);
		password.setBackground(new Color(255, 255, 255));
		password.setOpaque(true);
		password.setFont(etiquetas);
		login.add(password);
		login.revalidate();
		
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setBounds(80,250, 99,20);
		recordar.setBackground(new Color(235, 235, 235));
		recordar.setVisible(true);
		login.add(recordar);
		
		JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
		olvidar.setBounds(184,246, 150,30);
		Font fuente1 = new Font("Arial", Font.ITALIC, 12);
        olvidar.setFont(fuente1); 
		olvidar.setBackground(new Color(235, 235, 235));
		olvidar.setOpaque(true);
		olvidar.setFont(fuente1);
		olvidar.setForeground(new Color(0,154,182));
		login.add(olvidar);
		login.revalidate();
		
		JButton access = new JButton("Acceder");
		access.setBounds(80, 290, 230, 45);
		access.setHorizontalAlignment(JLabel.CENTER);
		access.setBackground(new Color(15, 62, 234));
		Font fuente2 = new Font("arial", 40, 20);
        access.setFont(fuente2); 
        access.setForeground(Color.WHITE);
		login.add(access);
		
		JButton createAcc = new JButton("Crea una cuenta");
		createAcc.setBounds(80, 340, 230, 45);
		createAcc.setFont(etiquetas);
		createAcc.setHorizontalAlignment(JLabel.CENTER);
		login.add(createAcc);
		return login;
		
	}*/
	
	public JPanel rightSide() {
	JPanel rightSide = new JPanel();

	rightSide.setLocation(400,0);
	rightSide.setOpaque(true);
	rightSide.setBackground(Color.RED);
	rightSide.setSize(400,600);
	rightSide.setBackground(new Color(15, 62, 234));
	rightSide.setVisible(true);
	JLabel label = new JLabel();
	label.setSize(400, 460);
	label.setHorizontalAlignment(JLabel.CENTER);
	ImageIcon imagen = new ImageIcon("imagenes/registrp5.jpg");
	Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
	label.setIcon(icono);
	rightSide.add(label);
	this.add(rightSide);
	
	
	return rightSide;
	
}

	public JPanel registro() {
		
		JPanel registro = new JPanel();
		registro.setLocation(0,0);
		registro.setOpaque(true);
		registro.setSize(400,600);
		registro.setBackground(new Color(235, 235, 235));
		registro.setVisible(true);
		registro.setLayout(null);
		this.add(registro);
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setSize(245, 30);
		etiqueta1.setLocation(70, 20);
		etiqueta1.setBackground(new Color(235, 235, 235));
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.blue));
		etiqueta1.setFont(etiquetas);
		registro.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Nombre de usuario");
		etiqueta2.setBounds(95, 60, 180, 30);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		registro.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setBounds(15, 90, 370, 30);
		email.setBackground(new Color(255, 255, 255));
		email.setOpaque(true);
		email.setFont(etiquetas);
		registro.add(email);
		registro.revalidate();
		
		JLabel etiqueta3 = new JLabel("Cuentanos sobre ti");
		etiqueta3.setBounds(95, 120, 180, 30);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		registro.add(etiqueta3);
		
		JTextArea biografia = new JTextArea();
		biografia.setBounds(15, 150, 370, 70);
		biografia.setBackground(new Color(255, 255, 255));
		biografia.setOpaque(true);
		biografia.setFont(etiquetas);
		biografia.setBorder(BorderFactory.createLineBorder(Color.black));
		registro.add(biografia);
		registro.revalidate();
		
		JLabel etiqueta4 = new JLabel("Preferencias");
		etiqueta4.setBounds(95, 225, 180, 30);
		etiqueta4.setFont(etiquetas);
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		registro.add(etiqueta4);
		
		JCheckBox recordar = new JCheckBox("Dulce");
		recordar.setBounds(18,255, 99,20);
		recordar.setBackground(new Color(235, 235, 235));
		recordar.setVisible(true);
		registro.add(recordar);
		
		JCheckBox salado = new JCheckBox("Salado");
		salado.setBounds(150,255, 99,20);
		salado.setBackground(new Color(235, 235, 235));
		salado.setVisible(true);
		registro.add(salado);
		
		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setBounds(300,255, 99,20);
		saludable.setBackground(new Color(235, 235, 235));
		saludable.setVisible(true);
		registro.add(saludable);
		
		JLabel etiqueta5 = new JLabel("Terminos");
		etiqueta5.setBounds(95, 270, 180, 30);
		etiqueta5.setFont(etiquetas);
		etiqueta5.setHorizontalAlignment(JLabel.CENTER);
		registro.add(etiqueta5);

		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton aceptar = new JRadioButton("Acepto los términos",true);
		aceptar.setBounds(18,300,140,20);
		registro.add(aceptar);
		
		JRadioButton aceptar2 = new JRadioButton("No acepto los términos");
		aceptar2.setBounds(210,300,180,20);
		registro.add(aceptar2);
		
		terminos.add(aceptar);
		terminos.add(aceptar2);
		
		String [] colonias = {"Los Olivos", "Miramar", "Santa Fe","Pedregal"};
		JComboBox colonia = new JComboBox(colonias);
		colonia.setBounds(18,340,370,30);
		colonia.setBackground(new Color(255, 255, 255));
		colonia.setVisible(true);
		registro.add(colonia);
		
		JButton access = new JButton("Crear cuenta");
		access.setBounds(80, 390, 230, 45);
		access.setHorizontalAlignment(JLabel.CENTER);
		access.setBackground(new Color(15, 62, 234));
		Font fuente2 = new Font("arial", 40, 20);
		access.setFont(fuente2); 
		access.setForeground(Color.WHITE);
		registro.add(access);
		/*JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
		olvidar.setBounds(184,246, 150,30);
		Font fuente1 = new Font("Arial", Font.ITALIC, 12);
	    olvidar.setFont(fuente1); 
		olvidar.setBackground(new Color(235, 235, 235));
		olvidar.setOpaque(true);
		olvidar.setFont(fuente1);
		olvidar.setForeground(new Color(0,154,182));
		registro.add(olvidar);
		registro.revalidate();
		*/
		
		
		/* createAcc = new JButton("Crea una cuenta");
		createAcc.setBounds(80, 450, 230, 45);
		createAcc.setFont(etiquetas);
		createAcc.setHorizontalAlignment(JLabel.CENTER);
		registro.add(createAcc); */
		return registro; 
		
	}

}

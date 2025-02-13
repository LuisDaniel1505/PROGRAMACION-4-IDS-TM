
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.Icon;
public class Ventana extends JFrame {

	Font etiquetas = new Font("Arial", Font.PLAIN,20);
	public Ventana (String title) {
		
		this.setTitle("Login");
		this.setVisible(true);
		this.setSize(800, 500);
		
		this.setResizable(false);
		this.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		this.add(this.login());
		this.repaint();
		
		this.add(this.rightSide());
		this.repaint();
		
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(600,600));
		
		
	}
	
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
		
	}
}

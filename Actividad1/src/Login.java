import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class Login extends JFrame {

    Font etiquetas = new Font("Ginebra", Font.PLAIN, 20);

    public Login(String title) {
        super(title);
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        JPanel loginPanel = login();
        loginPanel.setBounds(0, 0, 400, 500);
        this.add(loginPanel);

        JMenuBar barra = new JMenuBar();
        JMenu menu1 = new JMenu("Archivo");
        JMenu menu2 = new JMenu("Ayuda");
        
        JMenuItem op_new = new JMenuItem("Nuevo");
        JMenuItem op_open = new JMenuItem("Abrir");
        JMenuItem op_save = new JMenuItem("Guardar");
        JMenuItem op_close = new JMenuItem("Cerrar");
        
        menu1.add(op_new);
        menu1.add(op_save);
        menu1.add(op_open);
        menu1.add(op_close);
        
        JRadioButtonMenuItem op_help = new JRadioButtonMenuItem("Necesitas ayuda? ");
        JCheckBoxMenuItem op_suport = new JCheckBoxMenuItem("Soporte tecnico");
        
        menu2.add(op_help);
        menu2.add(op_suport);
        
        barra.add(menu1);
        barra.add(menu2);
        
        this.setJMenuBar(barra);
        
        this.setVisible(true);
        
    }

    public JPanel login() {
        JPanel login = new JPanel(null);
        login.setBackground(new Color(43, 39, 56));

        JLabel etiqueta1 = new JLabel("Inicia sesión");
        etiqueta1.setBounds(60, 40, 245, 50);
        etiqueta1.setBackground(new Color(43, 39, 56));
        etiqueta1.setOpaque(true);
        etiqueta1.setHorizontalAlignment(JLabel.CENTER);
        Font etiquetaInicio = new Font("Ginebra", Font.PLAIN, 40);
        etiqueta1.setFont(etiquetaInicio);
        etiqueta1.setForeground(Color.WHITE);
        login.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("Correo electrónico");
        etiqueta2.setBounds(90, 120, 180, 30);
        etiqueta2.setFont(etiquetas);
        etiqueta2.setForeground(Color.WHITE);
        etiqueta2.setHorizontalAlignment(JLabel.CENTER);
        login.add(etiqueta2);
        
       	JLabel etiqueta5 = new JLabel();
        ImageIcon imagen4 = new ImageIcon("imagenes/user2.png");
        etiqueta5.setIcon(imagen4);
        etiqueta5.setBounds(270, 150, 30, 30);
        etiqueta5.setBackground(new Color(59, 53, 79));
        Image img2 = imagen4.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etiqueta5.setIcon(new ImageIcon(img2));
        etiqueta5.setOpaque(true);
        login.add(etiqueta5);
        
        JTextField email = new JTextField(null);
        email.setBounds(40, 150, 270, 30);
        email.setBackground(new Color(59, 53, 79));
        email.setFont(etiquetas);
        email.setForeground(Color.WHITE );
        login.add(email);
        login.revalidate();

        JLabel etiqueta4 = new JLabel("Contraseña");
        etiqueta4.setBounds(115, 190, 120, 30);
        etiqueta4.setFont(etiquetas);
        etiqueta4.setForeground(Color.WHITE);
        etiqueta4.setHorizontalAlignment(JLabel.CENTER);
        login.add(etiqueta4);
        
        JLabel etiqueta3 = new JLabel();
        ImageIcon imagen3 = new ImageIcon("imagenes/eye.png");
        etiqueta3.setIcon(imagen3);
        etiqueta3.setBounds(270, 220, 30, 30);
        etiqueta3.setBackground(new Color(59, 53, 79));
        Image img = imagen3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        etiqueta3.setIcon(new ImageIcon(img));
        etiqueta3.setOpaque(true);
        login.add(etiqueta3);
        
        JPasswordField password = new JPasswordField (15);
        password.setBounds(40, 220, 270, 30);
        password.setBackground(new Color(59, 53, 79));
        password.setFont(etiquetas);
        login.add(password);
        login.revalidate();
        
        JCheckBox recordar = new JCheckBox("Recordarme");
        recordar.setBounds(40, 250, 99, 20);
        recordar.setBackground(new Color(43, 39, 56));
        recordar.setForeground(Color.WHITE);
        recordar.setVisible(true);
        login.add(recordar);

        JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
        olvidar.setBounds(184, 246, 150, 30);
        Font fuente1 = new Font("Ginebra", Font.ITALIC, 12);
        olvidar.setFont(fuente1);
        olvidar.setBackground(new Color(43, 39, 56));
        olvidar.setOpaque(true);
        olvidar.setForeground(new Color(0, 154, 182));
        login.add(olvidar);
        login.revalidate();

        BotonRedondeado access = new BotonRedondeado("Acceder");
        access.setBounds(40, 310, 270, 35);
        access.setHorizontalAlignment(JLabel.CENTER);
        access.setBackground(new Color(111, 85, 182));
        Font fuente2 = new Font("Ginebra", 40, 20);
        access.setFont(fuente2);
        access.setForeground(Color.WHITE);
        login.add(access);

        JLabel cuenta = new JLabel("¿Aun no tiene cuenta?");
        cuenta.setBounds(40, 398, 250, 30);
        Font fuente5 = new Font("Ginebra", Font.ITALIC, 12);
        cuenta.setFont(fuente5);
        cuenta.setBackground(new Color(43, 39, 56));
        cuenta.setOpaque(true);
        cuenta.setForeground(new Color(0, 154, 182));
        login.add(cuenta);
        login.revalidate();
        
        BotonRedondeado createAcc = new BotonRedondeado("Crea una cuenta");
        createAcc.setBounds(40, 360, 270, 35);
        createAcc.setFont(etiquetas);
        createAcc.setHorizontalAlignment(JLabel.CENTER);
        login.add(createAcc);
        
        createAcc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					manager();
				}
			});
        
        access.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

					if(email.getText().equals("")) {
						email.setBorder(BorderFactory.createLineBorder(Color.red));
					}else {
						email.setBorder(BorderFactory.createLineBorder(Color.green));
					}
					System.out.println(email.getText());
				}
			});
        
        access.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String passText = new String(password.getPassword());
                
               
                if (passText.equals("")) {
                    password.setBorder(BorderFactory.createLineBorder(Color.red));  
                } else {
                    password.setBorder(BorderFactory.createLineBorder(Color.green));  
                }
            }
        });
        
     // Datos para validar
        String correoC = "dani@gmail.com";
        String passwordC = "hola1234";

        access.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correo = email.getText();
                String passText = new String(password.getPassword());

                if (correo.equals(correoC) && passText.equals(passwordC)) {
                	
                    JOptionPane.showMessageDialog(null, "Bienvenido", "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println(passText);
            }
        });
        
        

        return login;
    }
    
    public void manager() {
    	this.removeAll();
    	//this.setContentPane();
    	this.repaint();
    	
    }
}


        
    
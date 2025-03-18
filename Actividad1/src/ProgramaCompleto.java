import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;

public class ProgramaCompleto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 Font etiquetas = new Font("Ginebra", Font.PLAIN, 20);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaCompleto frame = new ProgramaCompleto();
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
	public ProgramaCompleto() {
		 super();
	        this.setSize(390, 500);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        getContentPane().setLayout(null);  
	        this.setResizable(false);
	        //---------------------------Añadir las clases una por una para poder editarlas con el Window Builder---------------------------
	        //this.add(this.registro());
	        this.add(login());
	        //this.add(this.tabla());
	        //this.add(this.alta());
	        //this.add(this.crear());
	        //----------------------------------------------------------------------------------
	        
	        this.setVisible(true);
	        JMenuBar barra = new JMenuBar();
	        JMenu menu2 = new JMenu("Ayuda");
	        JMenu menu3 = new JMenu("Cuenta");
	        
	        JMenu menu4 = new JMenu("Usuarios");
	        
	        JMenuItem op_new = new JMenuItem("Nuevo");
	        JMenuItem op_open = new JMenuItem("Abrir");
	        JMenuItem op_save = new JMenuItem("Guardar");
	        JMenuItem op_close = new JMenuItem("Cerrar");
	        JMenuItem op_login = new JMenuItem("Acceder");
	        JMenuItem op_registro = new JMenuItem("Registrarse");
	        
	        JMenuItem op_consultar = new JMenuItem("Consulta");
	        JMenuItem op_alta = new JMenuItem("Alta");
	        JMenuItem op_baja = new JMenuItem("Baja");
	        
	        JMenuItem op_crear = new JMenuItem("¿Cómo crear un usuario?");
	        JMenuItem op_acceder = new JMenuItem("¿Cómo acceder al sistema?");
	        JMenuItem op_olvidar = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
	        
	        op_registro.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Register");
					}
				});
	        op_login.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Login");
					}
				});
	        op_consultar.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Consulta");
					}
				});
	        op_alta.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Alta");
					}
				});
	        op_baja.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Baja");
					}
				});
	        op_crear.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Crear");
					}
				});
	        op_acceder.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Acceder");
					}
				});
	        op_olvidar.addActionListener(new ActionListener() {
	    		
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Olvidar");
					}
				});

	        menu4.add(op_consultar);
	        menu4.add(op_alta);
	        menu4.add(op_baja);
	        
	        menu3.add(op_login);
	        menu3.add(op_registro);
	        JRadioButtonMenuItem op_help = new JRadioButtonMenuItem("Necesitas ayuda? ");
	        JCheckBoxMenuItem op_suport = new JCheckBoxMenuItem("Soporte tecnico");

	        menu2.add(op_crear);
	        menu2.add(op_acceder);
	        menu2.add(op_olvidar);
	        
	        barra.add(menu3);
	        barra.add(menu4);
	        barra.add(menu2);
	        
	        this.setJMenuBar(barra);
	}
	public JPanel registro() {
		
		JPanel registro = new JPanel();
		registro.setLocation(0,0);
		registro.setOpaque(true);
		registro.setSize(400,600);
		registro.setBackground(new Color(235, 235, 235));
		registro.setVisible(true);
		registro.setLayout(null);
		getContentPane().add(registro);
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setSize(245, 30);
		etiqueta1.setLocation(70, 20);
		etiqueta1.setBackground(new Color(235, 235, 235));
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
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
		
		JButton acceso = new JButton("Crear cuenta");
		acceso.setBounds(80, 390, 230, 45);
		acceso.setHorizontalAlignment(JLabel.CENTER);
		acceso.setBackground(new Color(15, 62, 234));
		Font fuente2 = new Font("arial", 40, 20);
		acceso.setFont(fuente2); 
		acceso.setForeground(Color.WHITE);
		registro.add(acceso);
		
		JButton acceso2 = new JButton("Regresar");
		acceso2.setBounds(80, 440, 230, 45);
		acceso2.setHorizontalAlignment(JLabel.CENTER);
		acceso2.setBackground(new Color(15, 62, 234));
		Font fuente3 = new Font("arial", 40, 20);
		acceso2.setFont(fuente3); 
		acceso2.setForeground(Color.WHITE);
		registro.add(acceso2);
		
		acceso2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					manager("Login");
				}
			});
	
		registro.revalidate();
        
		acceso.addActionListener(new ActionListener() {

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
		 
		
		acceso.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

					if(biografia.getText().equals("")) {
						biografia.setBorder(BorderFactory.createLineBorder(Color.red));
					}else {
						biografia.setBorder(BorderFactory.createLineBorder(Color.green));
					}
					System.out.println(biografia.getText());
				}
			});
		
		
		return registro;
		
		
		
	}
		public JPanel login() {
		    JPanel login = new JPanel(null);
		    login.setBackground(new Color(43, 39, 56));
		    login.setBounds(0, 0, 400, 539);
		
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
						manager("Register");
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
		public JPanel tabla() {
		    JPanel panel = new JPanel();
		    panel.setLocation(0,0);
		    panel.setOpaque(true);
		    panel.setSize(800,500);
		    panel.setBackground(new Color(247,248,250)); 
		    panel.setVisible(true);
		    panel.setLayout(null);
		    getContentPane().add(panel);

		    Font tituloFont = new Font("Arial", Font.BOLD, 18);
		    Font menuFont = new Font("Arial", Font.BOLD, 14);
		    Font regularFont = new Font("Arial", Font.PLAIN, 13);

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

		    JTable table = new JTable(data, columNames);
		    table.setGridColor(new Color(230, 230, 230));
		    table.setRowHeight(25);
		    table.setFont(regularFont);
		    table.getTableHeader().setFont(menuFont);
		    table.getTableHeader().setBackground(new Color(240, 240, 240));
		    
		    JScrollPane scrollPane = new JScrollPane(table);
		    scrollPane.setBounds(161, 200, 610, 250);
		    scrollPane.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		    panel.add(scrollPane);

		    JPanel panel_3 = new JPanel();
		    panel_3.setBackground(new Color(26,36,61));
		    panel_3.setBounds(0, 0, 130, 500);
		    panel.add(panel_3);
		    panel_3.setLayout(null);

		    JLabel titulo = new JLabel("USUARIOS");
		    titulo.setFont(new Font("Arial", Font.BOLD, 16));
		    titulo.setForeground(Color.WHITE);
		    titulo.setHorizontalAlignment(JLabel.CENTER);
		    titulo.setBounds(0, 20, 130, 30);
		    panel_3.add(titulo);

		    JPanel separador = new JPanel();
		    separador.setBackground(new Color(60, 75, 110));
		    separador.setBounds(20, 55, 90, 2);
		    panel_3.add(separador);

		    JLabel lblNewLabel = new JLabel("Dar de alta");
		    lblNewLabel.setFont(menuFont);
		    lblNewLabel.setForeground(new Color(255, 255, 255));
		    lblNewLabel.setBounds(20, 80, 100, 30);
		    panel_3.add(lblNewLabel);

		    lblNewLabel.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Alta");
		        }
		        
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            lblNewLabel.setForeground(new Color(120, 190, 255));
		        }
		        
		        @Override
		        public void mouseExited(MouseEvent e) {
		            lblNewLabel.setForeground(Color.WHITE);
		        }
		    });

		    JLabel lblNewLabel_1 = new JLabel("Dar de baja");
		    lblNewLabel_1.setFont(menuFont);
		    lblNewLabel_1.setForeground(new Color(255, 255, 255));
		    lblNewLabel_1.setBounds(20, 120, 100, 30);
		    panel_3.add(lblNewLabel_1);

		    lblNewLabel_1.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Baja");
		        }
		        
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            lblNewLabel_1.setForeground(new Color(120, 190, 255));
		        }
		        
		        @Override
		        public void mouseExited(MouseEvent e) {
		            lblNewLabel_1.setForeground(Color.WHITE);
		        }
		    });

		    JLabel consulta = new JLabel("Consulta");
		    consulta.setFont(menuFont);
		    consulta.setForeground(new Color(120, 190, 255));
		    consulta.setBounds(20, 160, 100, 30);
		    panel_3.add(consulta);

		    JLabel lblNewLabel_3 = new JLabel("Configuración");
		    lblNewLabel_3.setFont(menuFont);
		    lblNewLabel_3.setForeground(new Color(255, 255, 255));
		    lblNewLabel_3.setBounds(20, 200, 110, 30);
		    panel_3.add(lblNewLabel_3);

		    JLabel lblNewLabel_4 = new JLabel("Ayuda");
		    lblNewLabel_4.setFont(menuFont);
		    lblNewLabel_4.setForeground(new Color(255, 255, 255));
		    lblNewLabel_4.setBounds(20, 240, 110, 30);
		    panel_3.add(lblNewLabel_4);

		    JPanel panel_1 = new JPanel();
		    panel_1.setBackground(new Color(26, 36, 61));
		    panel_1.setBounds(130, 0, 670, 70);
		    panel.add(panel_1);
		    panel_1.setLayout(null);

		    JLabel titulo2 = new JLabel("Consulta de Usuarios");
		    titulo2.setForeground(Color.WHITE);
		    titulo2.setFont(tituloFont);
		    titulo2.setBounds(30, 20, 200, 30);
		    panel_1.add(titulo2);

		    JPanel buscar = new JPanel();
		    buscar.setBackground(new Color(240, 240, 240));
		    buscar.setBounds(161, 100, 610, 70);
		    buscar.setLayout(null);
		    panel.add(buscar);
		    
		    JLabel busqueda = new JLabel("Buscar usuario:");
		    busqueda.setFont(menuFont);
		    busqueda.setBounds(20, 20, 120, 30);
		    buscar.add(busqueda);
		    
		    JTextField textoBuscar = new JTextField();
		    textoBuscar.setBounds(140, 20, 280, 30);
		    textoBuscar.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		    buscar.add(textoBuscar);
		    
		    JButton botonBuscar = new JButton("Buscar");
		    botonBuscar.setBounds(440, 20, 100, 30);
		    botonBuscar.setBackground(new Color(26, 36, 61));
		    botonBuscar.setForeground(Color.WHITE);
		    botonBuscar.setFocusPainted(false);
		    buscar.add(botonBuscar);

		    JPanel totalUsuarios = new JPanel();
		    totalUsuarios.setBackground(new Color(240, 240, 240));
		    totalUsuarios.setBounds(161, 460, 610, 30);
		    totalUsuarios.setLayout(null);
		    panel.add(totalUsuarios);
		    
		    JLabel total = new JLabel("Total de usuarios: 11");
		    total.setFont(regularFont);
		    total.setBounds(20, 5, 150, 20);
		    totalUsuarios.add(total);
		    
		    return panel;
		}
			
		public JPanel alta() {
		    JPanel panel = new JPanel();
		    panel.setBounds(0,0,800,500);
		    panel.setOpaque(true);
		    panel.setBackground(new Color(247,248,250)); 
		    panel.setVisible(true);
		    panel.setLayout(null);
		    getContentPane().add(panel);

		    Font fuente1 = new Font("Arial", Font.BOLD, 18);
		    Font fuente2 = new Font("Arial", Font.BOLD, 14);
		    Font fuente3 = new Font("Arial", Font.PLAIN, 14);

		    JPanel panel_3 = new JPanel();
		    panel_3.setBackground(new Color(26,36,61));
		    panel_3.setBounds(0, 0, 130, 500);
		    panel.add(panel_3);
		    panel_3.setLayout(null);

		    JLabel titulo = new JLabel("USUARIOS");
		    titulo.setFont(new Font("Arial", Font.BOLD, 16));
		    titulo.setForeground(Color.WHITE);
		    titulo.setHorizontalAlignment(JLabel.CENTER);
		    titulo.setBounds(0, 20, 130, 30);
		    panel_3.add(titulo);

		    JPanel separador = new JPanel();
		    separador.setBackground(new Color(60, 75, 110));
		    separador.setBounds(20, 55, 90, 2);
		    panel_3.add(separador);

		    JLabel alta = new JLabel("Dar de alta");
		    alta.setFont(fuente2);
		    alta.setForeground(new Color(120, 190, 255)); 
		    alta.setBounds(20, 80, 100, 30);
		    panel_3.add(alta);

		    alta.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Alta");
		        }
		    });

		    JLabel baja = new JLabel("Dar de baja");
		    baja.setFont(fuente2);
		    baja.setForeground(new Color(255, 255, 255));
		    baja.setBounds(20, 120, 100, 30);
		    panel_3.add(baja);

		    baja.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Baja");
		        }
		        
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            baja.setForeground(new Color(120, 190, 255));
		        }
		        
		        @Override
		        public void mouseExited(MouseEvent e) {
		            baja.setForeground(Color.WHITE);
		        }
		    });

		    JLabel consulta = new JLabel("Consulta");
		    consulta.setFont(fuente2);
		    consulta.setForeground(new Color(255, 255, 255));
		    consulta.setBounds(20, 160, 100, 30);
		    panel_3.add(consulta);
		    
		    consulta.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Consulta");
		        }
		        
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            consulta.setForeground(new Color(120, 190, 255));
		        }
		        
		        @Override
		        public void mouseExited(MouseEvent e) {
		            consulta.setForeground(Color.WHITE);
		        }
		    });

		    JLabel configuracion = new JLabel("Configuración");
		    configuracion.setFont(fuente2);
		    configuracion.setForeground(new Color(255, 255, 255));
		    configuracion.setBounds(20, 200, 110, 30);
		    panel_3.add(configuracion);

		    JLabel ayuda = new JLabel("Ayuda");
		    ayuda.setFont(fuente2);
		    ayuda.setForeground(new Color(255, 255, 255));
		    ayuda.setBounds(20, 240, 110, 30);
		    panel_3.add(ayuda);

		    JPanel panel_1 = new JPanel();
		    panel_1.setBackground(new Color(26, 36, 61));
		    panel_1.setBounds(130, 0, 670, 70);
		    panel.add(panel_1);
		    panel_1.setLayout(null);

		    JLabel titulo2 = new JLabel("Registro de Nuevo Usuario");
		    titulo2.setForeground(Color.WHITE);
		    titulo2.setFont(fuente1);
		    titulo2.setBounds(30, 20, 250, 30);
		    panel_1.add(titulo2);

		    JPanel formulario = new JPanel();
		    formulario.setBackground(new Color(255, 255, 255));
		    formulario.setBounds(161, 100, 610, 340);
		    formulario.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
		    formulario.setLayout(null);
		    panel.add(formulario);

		    JLabel datos = new JLabel("Datos Personales");
		    datos.setFont(new Font("Arial", Font.BOLD, 16));
		    datos.setForeground(new Color(26, 36, 61));
		    datos.setBounds(20, 15, 150, 25);
		    formulario.add(datos);
		    
		    JPanel separador2 = new JPanel();
		    separador2.setBackground(new Color(220, 220, 220));
		    separador2.setBounds(20, 45, 570, 1);
		    formulario.add(separador2);
		    
		    JLabel nombre = new JLabel("Nombre:");
		    nombre.setFont(fuente2);
		    nombre.setBounds(20, 60, 100, 25);
		    formulario.add(nombre);
		    
		    JTextField textoNombre = new JTextField();
		    textoNombre.setBounds(130, 60, 200, 30);
		    textoNombre.setFont(fuente3);
		    textoNombre.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		    formulario.add(textoNombre);
		    
		    JLabel apellido = new JLabel("Apellido:");
		    apellido.setFont(fuente2);
		    apellido.setBounds(20, 100, 100, 25);
		    formulario.add(apellido);
		    
		    JTextField textoApellido = new JTextField();
		    textoApellido.setBounds(130, 100, 200, 30);
		    textoApellido.setFont(fuente3);
		    textoApellido.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		    formulario.add(textoApellido);
		    
		    JLabel edad = new JLabel("Edad:");
		    edad.setFont(fuente2);
		    edad.setBounds(20, 140, 100, 25);
		    formulario.add(edad);
		    
		    JTextField textoEdad = new JTextField();
		    textoEdad.setBounds(130, 140, 100, 30);
		    textoEdad.setFont(fuente3);
		    textoEdad.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		    formulario.add(textoEdad);
	
		    JLabel preferencias = new JLabel("Preferencias");
		    preferencias.setFont(new Font("Arial", Font.BOLD, 16));
		    preferencias.setForeground(new Color(26, 36, 61));
		    preferencias.setBounds(20, 185, 150, 25);
		    formulario.add(preferencias);
		    
		    JPanel separador3 = new JPanel();
		    separador3.setBackground(new Color(220, 220, 220));
		    separador3.setBounds(20, 215, 570, 1);
		    formulario.add(separador3);
		    
		    JLabel juego = new JLabel("Juego favorito:");
		    juego.setFont(fuente2);
		    juego.setBounds(20, 230, 110, 25);
		    formulario.add(juego);
		    
		    JTextField textoJuego = new JTextField();
		    textoJuego.setBounds(130, 230, 200, 30);
		    textoJuego.setFont(fuente3);
		    textoJuego.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		    formulario.add(textoJuego);
		    
		    JCheckBox vegetariano = new JCheckBox("Vegetariano");
		    vegetariano.setFont(fuente2);
		    vegetariano.setBackground(Color.WHITE);
		    vegetariano.setBounds(20, 270, 150, 30);
		    formulario.add(vegetariano);

		    JPanel botonesPanel = new JPanel();
		    botonesPanel.setBackground(new Color(240, 240, 240));
		    botonesPanel.setBounds(161, 450, 610, 40);
		    botonesPanel.setLayout(null);
		    panel.add(botonesPanel);
		    
		    JButton cancelar = new JButton("Cancelar");
		    cancelar.setBounds(390, 5, 100, 30);
		    cancelar.setBackground(new Color(220, 220, 220));
		    cancelar.setForeground(new Color(60, 60, 60));
		    cancelar.setFocusPainted(false);
		    cancelar.setFont(fuente2);
		    botonesPanel.add(cancelar);
		    
		    JButton guardar = new JButton("Guardar");
		    guardar.setBounds(500, 5, 100, 30);
		    guardar.setBackground(new Color(26, 36, 61));
		    guardar.setForeground(Color.WHITE);
		    guardar.setFocusPainted(false);
		    guardar.setFont(fuente2);
		    botonesPanel.add(guardar);
		    
		    return panel;
		}
		public JPanel baja() {
		    JPanel panel = new JPanel();
		    panel.setLocation(0,0);
		    panel.setOpaque(true);
		    panel.setSize(800,500);
		    panel.setBackground(new Color(247,248,250)); 
		    panel.setVisible(true);
		    panel.setLayout(null);
		    getContentPane().add(panel);

		    Font fuente1 = new Font("Arial", Font.BOLD, 18);
		    Font fuente2 = new Font("Arial", Font.BOLD, 14);
		    Font fuente3 = new Font("Arial", Font.PLAIN, 14);

		    // Panel lateral (menú)
		    JPanel panel_3 = new JPanel();
		    panel_3.setBackground(new Color(26,36,61));
		    panel_3.setBounds(0, 0, 130, 500);
		    panel.add(panel_3);
		    panel_3.setLayout(null);

		    JLabel titulo = new JLabel("USUARIOS");
		    titulo.setFont(new Font("Arial", Font.BOLD, 16));
		    titulo.setForeground(Color.WHITE);
		    titulo.setHorizontalAlignment(JLabel.CENTER);
		    titulo.setBounds(0, 20, 130, 30);
		    panel_3.add(titulo);

		    JPanel separador = new JPanel();
		    separador.setBackground(new Color(60, 75, 110));
		    separador.setBounds(20, 55, 90, 2);
		    panel_3.add(separador);

		    JLabel alta = new JLabel("Dar de alta");
		    alta.setFont(fuente2);
		    alta.setForeground(new Color(255, 255, 255));
		    alta.setBounds(20, 80, 100, 30);
		    panel_3.add(alta);

		    alta.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Alta");
		        }
		        
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            alta.setForeground(new Color(120, 190, 255));
		        }
		        
		        @Override
		        public void mouseExited(MouseEvent e) {
		            alta.setForeground(Color.WHITE);
		        }
		    });

		    JLabel baja = new JLabel("Dar de baja");
		    baja.setFont(fuente2);
		    baja.setForeground(new Color(120, 190, 255));
		    baja.setBounds(20, 120, 100, 30);
		    panel_3.add(baja);

		    baja.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Baja");
		        }
		    });

		    JLabel consulta = new JLabel("Consulta");
		    consulta.setFont(fuente2);
		    consulta.setForeground(new Color(255, 255, 255));
		    consulta.setBounds(20, 160, 100, 30);
		    panel_3.add(consulta);
		    
		    consulta.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            manager("Consulta");
		        }
		        
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            consulta.setForeground(new Color(120, 190, 255));
		        }
		        
		        @Override
		        public void mouseExited(MouseEvent e) {
		            consulta.setForeground(Color.WHITE);
		        }
		    });

		    JLabel configuracion = new JLabel("Configuración");
		    configuracion.setFont(fuente2);
		    configuracion.setForeground(new Color(255, 255, 255));
		    configuracion.setBounds(20, 200, 110, 30);
		    panel_3.add(configuracion);

		    JLabel ayuda = new JLabel("Ayuda");
		    ayuda.setFont(fuente2);
		    ayuda.setForeground(new Color(255, 255, 255));
		    ayuda.setBounds(20, 240, 110, 30);
		    panel_3.add(ayuda);

		    JPanel panel_1 = new JPanel();
		    panel_1.setBackground(new Color(26, 36, 61));
		    panel_1.setBounds(130, 0, 670, 70);
		    panel.add(panel_1);
		    panel_1.setLayout(null);

		    JLabel titulo2 = new JLabel("Baja de Usuario");
		    titulo2.setForeground(Color.WHITE);
		    titulo2.setFont(fuente1);
		    titulo2.setBounds(30, 20, 250, 30);
		    panel_1.add(titulo2);

		    JPanel buscar = new JPanel();
		    buscar.setBackground(new Color(255, 255, 255));
		    buscar.setBounds(161, 100, 610, 100);
		    buscar.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
		    buscar.setLayout(null);
		    panel.add(buscar);
		    
		    JLabel buscarUsuario = new JLabel("Buscar Usuario");
		    buscarUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		    buscarUsuario.setForeground(new Color(26, 36, 61));
		    buscarUsuario.setBounds(20, 15, 150, 25);
		    buscar.add(buscarUsuario);
		    
		    JPanel separador2 = new JPanel();
		    separador2.setBackground(new Color(220, 220, 220));
		    separador2.setBounds(20, 45, 570, 1);
		    buscar.add(separador2);
		    
		    JTextField textoBuscar = new JTextField();
		    textoBuscar.setBounds(20, 55, 450, 30);
		    textoBuscar.setFont(fuente3);
		    textoBuscar.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		    buscar.add(textoBuscar);
		    
		    JButton botonBuscar = new JButton("Buscar");
		    botonBuscar.setBounds(490, 55, 100, 30);
		    botonBuscar.setBackground(new Color(26, 36, 61));
		    botonBuscar.setForeground(Color.WHITE);
		    botonBuscar.setFocusPainted(false);
		    botonBuscar.setFont(fuente2);
		    buscar.add(botonBuscar);

		    JPanel informacion = new JPanel();
		    informacion.setBackground(new Color(255, 255, 255));
		    informacion.setBounds(161, 210, 610, 230);
		    informacion.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
		    informacion.setLayout(null);
		    panel.add(informacion);
		    
		    JLabel infoUsuario = new JLabel("Información del Usuario");
		    infoUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		    infoUsuario.setForeground(new Color(26, 36, 61));
		    infoUsuario.setBounds(20, 15, 200, 25);
		    informacion.add(infoUsuario);
		    
		    JPanel separador3 = new JPanel();
		    separador3.setBackground(new Color(220, 220, 220));
		    separador3.setBounds(20, 45, 570, 1);
		    informacion.add(separador3);

		    JLabel nombre = new JLabel("Nombre:");
		    nombre.setFont(fuente2);
		    nombre.setBounds(20, 60, 100, 25);
		    informacion.add(nombre);
		    
		    JLabel nombre2 = new JLabel("Kathy");
		    nombre2.setFont(fuente3);
		    nombre2.setBounds(120, 60, 200, 25);
		    informacion.add(nombre2);
		    
		    JLabel apellido = new JLabel("Apellido:");
		    apellido.setFont(fuente2);
		    apellido.setBounds(20, 90, 100, 25);
		    informacion.add(apellido);
		    
		    JLabel apellido2 = new JLabel("Smith");
		    apellido2.setFont(fuente3);
		    apellido2.setBounds(120, 90, 200, 25);
		    informacion.add(apellido2);
		    
		    JLabel edad = new JLabel("Edad:");
		    edad.setFont(fuente2);
		    edad.setBounds(20, 120, 100, 25);
		    informacion.add(edad);
		    
		    JLabel edad2 = new JLabel("29");
		    edad2.setFont(fuente3);
		    edad2.setBounds(120, 120, 100, 25);
		    informacion.add(edad2);
		    
		    JLabel juego = new JLabel("Juego favorito:");
		    juego.setFont(fuente2);
		    juego.setBounds(20, 150, 110, 25);
		    informacion.add(juego);
		    
		    JLabel juego2 = new JLabel("Fubo");
		    juego2.setFont(fuente3);
		    juego2.setBounds(130, 150, 200, 25);
		    informacion.add(juego2);
		    
		    JLabel vegetariano = new JLabel("Vegetariano:");
		    vegetariano.setFont(fuente2);
		    vegetariano.setBounds(20, 180, 100, 25);
		    informacion.add(vegetariano);
		    
		    JLabel vegetariano2 = new JLabel("Sí");
		    vegetariano2.setFont(fuente3);
		    vegetariano2.setBounds(120, 180, 50, 25);
		    informacion.add(vegetariano2);
		    
		    JPanel botonesPanel = new JPanel();
		    botonesPanel.setBackground(new Color(240, 240, 240));
		    botonesPanel.setBounds(161, 450, 610, 40);
		    botonesPanel.setLayout(null);
		    panel.add(botonesPanel);
		    
		    JButton cancelar = new JButton("Cancelar");
		    cancelar.setBounds(390, 5, 100, 30);
		    cancelar.setBackground(new Color(220, 220, 220));
		    cancelar.setForeground(new Color(60, 60, 60));
		    cancelar.setFocusPainted(false);
		    cancelar.setFont(fuente2);
		    botonesPanel.add(cancelar);
		    
		    JButton eliminar = new JButton("Eliminar");
		    eliminar.setBounds(500, 5, 100, 30);
		    eliminar.setBackground(new Color(220, 60, 60));
		    eliminar.setForeground(Color.WHITE);
		    eliminar.setFocusPainted(false);
		    eliminar.setFont(fuente2);
		    botonesPanel.add(eliminar);
		    
		    return panel;
		}
		public JPanel acceder() {
		    JPanel acceder = new JPanel(null);
		    acceder.setBackground(new Color(80, 80, 80));
		    acceder.setBounds(0, 0, 420, 550);

		    JLabel titulo = new JLabel("Ayuda para acceder a la cuenta");
		    titulo.setBounds(60, 40, 280, 50);
		    titulo.setBackground(new Color(43, 39, 56));
		    titulo.setOpaque(true);
		    titulo.setHorizontalAlignment(JLabel.CENTER);
		    Font fuente = new Font("Ginebra", Font.PLAIN, 20);
		    titulo.setFont(fuente);
		    titulo.setForeground(Color.WHITE);
		    acceder.add(titulo);

		    JLabel titulo2 = new JLabel("Siga las siguientes instrucciones:");
		    titulo2.setBounds(60, 100, 280, 30);
		    titulo2.setFont(new Font("Ginebra", Font.BOLD, 16));
		    titulo2.setForeground(Color.WHITE);
		    acceder.add(titulo2);

		    JPanel instruccion = new JPanel(null);
		    instruccion.setBounds(60, 140, 280, 200);
		    instruccion.setBackground(new Color(60, 60, 60));
		    instruccion.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100), 2));
		    acceder.add(instruccion);

		    JLabel etiqueta = new JLabel("1. Ingrese su nombre de usuario");
		    etiqueta.setBounds(20, 15, 240, 25);
		    etiqueta.setForeground(Color.WHITE);
		    instruccion.add(etiqueta);
		    
		    JLabel etiqueta2 = new JLabel("2. Ingrese su contraseña");
		    etiqueta2.setBounds(20, 45, 240, 25);
		    etiqueta2.setForeground(Color.WHITE);
		    instruccion.add(etiqueta2);
		    
		    JLabel etiqueta3 = new JLabel("3. Haga clic en el botón 'Acceder'");
		    etiqueta3.setBounds(20, 75, 240, 25);
		    etiqueta3.setForeground(Color.WHITE);
		    instruccion.add(etiqueta3);
		    
		    JLabel etiqueta4 = new JLabel("4. Si olvidó su contraseña, haga");
		    etiqueta4.setBounds(20, 105, 240, 25);
		    etiqueta4.setForeground(Color.WHITE);
		    instruccion.add(etiqueta4);
		    
		    JLabel etiqueta5 = new JLabel("   clic en 'Recuperar contraseña'");
		    etiqueta5.setBounds(20, 130, 240, 25);
		    etiqueta5.setForeground(Color.WHITE);
		    instruccion.add(etiqueta5);

		    JButton botonLogin = new JButton("Acceder");
		    botonLogin.setBounds(150, 355, 100, 30);
		    botonLogin.setBackground(new Color(43, 39, 56));
		    botonLogin.setForeground(Color.WHITE);
		    botonLogin.setFocusPainted(false);
		    acceder.add(botonLogin);
		    
		    botonLogin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						manager("Login");
					}
				});
		    return acceder;
		}
		public JPanel crear() {
		    
		    JPanel crear = new JPanel();
		    crear.setLocation(0,0);
		    crear.setOpaque(true);
		    crear.setSize(400,577);
		    crear.setBackground(new Color(240, 248, 255)); 
		    crear.setVisible(true);
		   	crear.setLayout(null);

		    JLabel etiqueta1 = new JLabel("Ayuda para Crear Usuario");
		    etiqueta1.setSize(245, 30);
		    etiqueta1.setLocation(70, 20);
		    etiqueta1.setBackground(new Color(70, 130, 180)); 
		    etiqueta1.setOpaque(true);
		    etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		    Font etiquetas = new Font("arial", Font.BOLD, 16);
		    etiqueta1.setFont(etiquetas);
		    etiqueta1.setForeground(Color.WHITE);
		    crear.add(etiqueta1);

		    JLabel etiqueta2 = new JLabel("Nombre de usuario");
		    etiqueta2.setBounds(95, 60, 180, 30);
		    etiqueta2.setFont(etiquetas);
		    etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta2.setForeground(new Color(25, 25, 112)); 
		    crear.add(etiqueta2);
		    
		    JPanel usuario = new JPanel(null);
		    usuario.setBounds(15, 90, 370, 70);
		    usuario.setBackground(new Color(230, 240, 250));
		    usuario.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    crear.add(usuario);
		    
		    JLabel etiqueta3 = new JLabel("Debe tener al menos 5 caracteres");
		    etiqueta3.setBounds(10, 5, 350, 24);
		    etiqueta3.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta3.setForeground(new Color(25, 25, 112));
		    usuario.add(etiqueta3);
		    
		    JLabel etiqueta4 = new JLabel("No debe contener espacios");
		    etiqueta4.setForeground(new Color(25, 25, 112));
		    etiqueta4.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta4.setBounds(10, 23, 350, 24);
		    usuario.add(etiqueta4);
		    
		    JLabel etiqueta5 = new JLabel("Puede usar letras, números y guiones");
		    etiqueta5.setForeground(new Color(25, 25, 112));
		    etiqueta5.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta5.setBounds(10, 40, 350, 24);
		    usuario.add(etiqueta5);
		    
		    JLabel etiqueta6 = new JLabel("Información personal");
		    etiqueta6.setBounds(95, 170, 180, 30);
		    etiqueta6.setFont(etiquetas);
		    etiqueta6.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta6.setForeground(new Color(25, 25, 112));
		    crear.add(etiqueta6);
		    
		    JPanel biografia = new JPanel(null);
		    biografia.setBounds(15, 200, 370, 70);
		    biografia.setBackground(new Color(230, 240, 250));
		    biografia.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    crear.add(biografia);
		    
		    JLabel etiqueta7 = new JLabel("Cuéntanos sobre tus intereses\r\n");
		    etiqueta7.setBounds(10, 5, 350, 23);
		    etiqueta7.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta7.setForeground(new Color(25, 25, 112));
		    biografia.add(etiqueta7);
		    
		    JLabel etiqueta7_1 = new JLabel("Información relevante para tu perfil \r\n");
		    etiqueta7_1.setForeground(new Color(25, 25, 112));
		    etiqueta7_1.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta7_1.setBounds(10, 24, 350, 23);
		    biografia.add(etiqueta7_1);
		    
		    JLabel etiqueta7_2 = new JLabel("Máximo 200 caracteres");
		    etiqueta7_2.setForeground(new Color(25, 25, 112));
		    etiqueta7_2.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta7_2.setBounds(10, 43, 350, 23);
		    biografia.add(etiqueta7_2);
		    
		    JLabel etiqueta8 = new JLabel("Preferencias");
		    etiqueta8.setBounds(95, 280, 180, 30);
		    etiqueta8.setFont(etiquetas);
		    etiqueta8.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta8.setForeground(new Color(25, 25, 112));
		    crear.add(etiqueta8);
		    
		    JPanel preferencias = new JPanel(null);
		    preferencias.setBounds(15, 310, 370, 70);
		    preferencias.setBackground(new Color(230, 240, 250));
		    preferencias.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    crear.add(preferencias);
		    
		    JLabel etiqueta9 = new JLabel(" Selecciona tus categorías favoritas\r\n");
		    etiqueta9.setBounds(10, 5, 350, 22);
		    etiqueta9.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta9.setForeground(new Color(25, 25, 112));
		    preferencias.add(etiqueta9);
		    
		    JLabel etiqueta9_1 = new JLabel(" Puedes marcar múltiples opciones\r\n");
		    etiqueta9_1.setForeground(new Color(25, 25, 112));
		    etiqueta9_1.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta9_1.setBounds(10, 23, 350, 22);
		    preferencias.add(etiqueta9_1);
		    
		    JLabel etiqueta9_2 = new JLabel(" Esto nos ayuda a personalizar tu experiencia");
		    etiqueta9_2.setForeground(new Color(25, 25, 112));
		    etiqueta9_2.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta9_2.setBounds(10, 43, 350, 22);
		    preferencias.add(etiqueta9_2);
		    
		    // Sección de términos
		    JLabel etiqueta10 = new JLabel("Términos y condiciones");
		    etiqueta10.setBounds(83, 391, 215, 30);
		    etiqueta10.setFont(etiquetas);
		    etiqueta10.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta10.setForeground(new Color(25, 25, 112));
		    crear.add(etiqueta10);
		    
		    JPanel terminos = new JPanel(null);
		    terminos.setBounds(15, 420, 370, 70);
		    terminos.setBackground(new Color(230, 240, 250));
		    terminos.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    crear.add(terminos);
		    
		    JLabel etiqueta11 = new JLabel(" Debes aceptar los términos para registrarte\r\n");
		    etiqueta11.setBounds(10, 5, 350, 33);
		    etiqueta11.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta11.setForeground(new Color(25, 25, 112));
		    terminos.add(etiqueta11);
		    
		    JLabel etiqueta12 = new JLabel(" Lee cuidadosamente antes de aceptar");
		    etiqueta12.setForeground(new Color(25, 25, 112));
		    etiqueta12.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta12.setBounds(10, 26, 350, 33);
		    terminos.add(etiqueta12);
		    
		    JButton regresar = new JButton("Volver al registro");
		    regresar.setBounds(80, 505, 230, 40);
		    regresar.setHorizontalAlignment(JLabel.CENTER);
		    regresar.setBackground(new Color(176, 196, 222)); 
		    Font fuente3 = new Font("arial", Font.BOLD, 16);
		    regresar.setFont(fuente3); 
		    regresar.setForeground(new Color(25, 25, 112));
		    crear.add(regresar);

		    regresar.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	manager("Register");
		        }
		    });
		    
		    crear.revalidate();
		    
		    return crear;
		}
		public JPanel olvidar() {
		    
		    JPanel olvidar = new JPanel();
		    olvidar.setLocation(0,0);
		    olvidar.setOpaque(true);
		    olvidar.setSize(400,577);
		    olvidar.setBackground(new Color(240, 248, 255)); 
		    olvidar.setVisible(true);
		    olvidar.setLayout(null);

		    JLabel etiqueta1 = new JLabel("Ayuda para Recuperar Contraseña");
		    etiqueta1.setBounds(50, 20,290, 30);
		    etiqueta1.setBackground(new Color(70, 130, 180)); 
		    etiqueta1.setOpaque(true);
		    etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		    Font etiquetas = new Font("arial", Font.BOLD, 16);
		    etiqueta1.setFont(etiquetas);
		    etiqueta1.setForeground(Color.WHITE);
		    olvidar.add(etiqueta1);

		    JLabel etiqueta2 = new JLabel("Correo electrónico");
		    etiqueta2.setBounds(95, 60, 180, 30);
		    etiqueta2.setFont(etiquetas);
		    etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta2.setForeground(new Color(25, 25, 112)); 
		    olvidar.add(etiqueta2);
		    
		    JPanel correo = new JPanel(null);
		    correo.setBounds(15, 90, 370, 70);
		    correo.setBackground(new Color(230, 240, 250));
		    correo.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    olvidar.add(correo);
		    
		    JLabel etiqueta3 = new JLabel("Ingresa el correo asociado a tu cuenta");
		    etiqueta3.setBounds(10, 5, 350, 24);
		    etiqueta3.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta3.setForeground(new Color(25, 25, 112));
		    correo.add(etiqueta3);
		    
		    JLabel etiqueta4 = new JLabel("Verifica que sea el correo principal");
		    etiqueta4.setForeground(new Color(25, 25, 112));
		    etiqueta4.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta4.setBounds(10, 23, 350, 24);
		    correo.add(etiqueta4);
		    
		    JLabel etiqueta5 = new JLabel("Recibirás un enlace de recuperación");
		    etiqueta5.setForeground(new Color(25, 25, 112));
		    etiqueta5.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta5.setBounds(10, 40, 350, 24);
		    correo.add(etiqueta5);

		    JLabel etiqueta6 = new JLabel("Verificación de identidad");
		    etiqueta6.setBounds(95, 170, 190, 30);
		    etiqueta6.setFont(etiquetas);
		    etiqueta6.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta6.setForeground(new Color(25, 25, 112));
		    olvidar.add(etiqueta6);
		    
		    JPanel verificacion = new JPanel(null);
		    verificacion.setBounds(15, 200, 370, 70);
		    verificacion.setBackground(new Color(230, 240, 250));
		    verificacion.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    olvidar.add(verificacion);
		    
		    JLabel etiqueta7 = new JLabel("Se te pedirá responder preguntas de seguridad");
		    etiqueta7.setBounds(10, 5, 350, 23);
		    etiqueta7.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta7.setForeground(new Color(25, 25, 112));
		    verificacion.add(etiqueta7);
		    
		    JLabel etiqueta7_1 = new JLabel("También necesitarás acceso a tu correo");
		    etiqueta7_1.setForeground(new Color(25, 25, 112));
		    etiqueta7_1.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta7_1.setBounds(10, 24, 350, 23);
		    verificacion.add(etiqueta7_1);
		    
		    JLabel etiqueta7_2 = new JLabel("Este proceso es por tu seguridad");
		    etiqueta7_2.setForeground(new Color(25, 25, 112));
		    etiqueta7_2.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta7_2.setBounds(10, 43, 350, 23);
		    verificacion.add(etiqueta7_2);
		    
		    JLabel etiqueta8 = new JLabel("Nueva contraseña");
		    etiqueta8.setBounds(95, 280, 180, 30);
		    etiqueta8.setFont(etiquetas);
		    etiqueta8.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta8.setForeground(new Color(25, 25, 112));
		    olvidar.add(etiqueta8);
		    
		    JPanel password = new JPanel(null);
		    password.setBounds(15, 310, 370, 70);
		    password.setBackground(new Color(230, 240, 250));
		    password.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    olvidar.add(password);
		    
		    JLabel etiqueta9 = new JLabel(" Crea una contraseña segura");
		    etiqueta9.setBounds(10, 5, 350, 22);
		    etiqueta9.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta9.setForeground(new Color(25, 25, 112));
		    password.add(etiqueta9);
		    
		    JLabel etiqueta9_1 = new JLabel(" Usa al menos 8 caracteres");
		    etiqueta9_1.setForeground(new Color(25, 25, 112));
		    etiqueta9_1.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta9_1.setBounds(10, 23, 350, 22);
		    password.add(etiqueta9_1);
		    
		    JLabel etiqueta9_2 = new JLabel(" Combina letras, números y símbolos");
		    etiqueta9_2.setForeground(new Color(25, 25, 112));
		    etiqueta9_2.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta9_2.setBounds(10, 43, 350, 22);
		    password.add(etiqueta9_2);

		    JLabel etiqueta10 = new JLabel("Recomendaciones");
		    etiqueta10.setBounds(83, 391, 215, 30);
		    etiqueta10.setFont(etiquetas);
		    etiqueta10.setHorizontalAlignment(JLabel.CENTER);
		    etiqueta10.setForeground(new Color(25, 25, 112));
		    olvidar.add(etiqueta10);
		    
		    JPanel recomendaciones = new JPanel(null);
		    recomendaciones.setBounds(15, 420, 370, 70);
		    recomendaciones.setBackground(new Color(230, 240, 250));
		    recomendaciones.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 1));
		    olvidar.add(recomendaciones);
		    
		    JLabel etiqueta11 = new JLabel(" No uses la misma contraseña en otros sitios");
		    etiqueta11.setBounds(10, 5, 350, 33);
		    etiqueta11.setFont(new Font("arial", Font.PLAIN, 14));
		    etiqueta11.setForeground(new Color(25, 25, 112));
		    recomendaciones.add(etiqueta11);
		    
		    JLabel etiqueta12 = new JLabel(" Cambia periódicamente tu contraseña");
		    etiqueta12.setForeground(new Color(25, 25, 112));
		    etiqueta12.setFont(new Font("Arial", Font.PLAIN, 14));
		    etiqueta12.setBounds(10, 26, 350, 33);
		    recomendaciones.add(etiqueta12);

		    JButton regresar = new JButton("Volver al inicio");
		    regresar.setBounds(80, 505, 230, 40);
		    regresar.setHorizontalAlignment(JLabel.CENTER);
		    regresar.setBackground(new Color(176, 196, 222)); 
		    Font fuente3 = new Font("arial", Font.BOLD, 16);
		    regresar.setFont(fuente3); 
		    regresar.setForeground(new Color(25, 25, 112));
		    olvidar.add(regresar);

		    regresar.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            manager("Login");
		        }
		    });
		    
		    olvidar.revalidate();
		    
		    return olvidar;
		}
		
		
		public void manager(String target) {
			this.getContentPane().removeAll();
			if(target.equals("Register")) {
				getContentPane().add(this.registro());
				this.setSize(420, 600);
		        this.setLocationRelativeTo(null);
			}
			if(target.equals("Login")) {
				getContentPane().add(this.login());
				this.setSize(390, 500);
		        this.setLocationRelativeTo(null);
			}
			if(target.equals("Consulta")) {
				getContentPane().add(this.tabla());
				this.setSize(800,560);
				this.setLocationRelativeTo(null);
			}
			if(target.equals("Alta")) {
				getContentPane().add(this.alta());
				this.setSize(800, 560);
		        this.setLocationRelativeTo(null);
			}
			if(target.equals("Baja")) {
				getContentPane().add(this.baja());
				this.setSize(800, 560);
		        this.setLocationRelativeTo(null);
			}
			if(target.equals("Acceder")) {
				getContentPane().add(this.acceder());
				this.setSize(420, 480);
		        this.setLocationRelativeTo(null);
			}
			if(target.equals("Olvidar")) {
				getContentPane().add(this.olvidar());
				this.setSize(410, 640);
		        this.setLocationRelativeTo(null);
			}
			if(target.equals("Crear")) {
				getContentPane().add(this.crear());
				this.setSize(410, 640);
		        this.setLocationRelativeTo(null);
			}
			
			this.repaint();
			this.revalidate();
			
		}
}

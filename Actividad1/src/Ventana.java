import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

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

    Font etiquetas = new Font("Ginebra", Font.PLAIN, 20);

    public Ventana(String title) {
        super(title);
        this.setSize(800, 520);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);  
        JPanel leftPanel = leftSide();
        JPanel loginPanel = login();

        leftPanel.setLocation(0, 0);
        leftPanel.setSize(400, 500);

        loginPanel.setLocation(400, 0);
        loginPanel.setSize(400, 500);

        this.setResizable(false);
        this.add(leftPanel);
        this.add(loginPanel);
        //this.add(this.registro());
        //this.add(this.tabla());
        this.setVisible(true);

        this.setMinimumSize(new Dimension(400, 400));
        this.setMaximumSize(new Dimension(600, 600));
        
        
    }

    public JPanel leftSide() {
        JPanel leftSide = new JPanel(null);
        leftSide.setBackground(new Color(43, 39, 56));

        ImageIcon imagen = new ImageIcon("imagenes/desierto3.jpg");
        Image imgEscalada = imagen.getImage().getScaledInstance(360, 460, Image.SCALE_SMOOTH);
        imagenRedondeada redondeado = new imagenRedondeada(imgEscalada, 20, 20);
        redondeado.setBounds(10, 10, 360, 460);

        leftSide.add(redondeado);
        return leftSide;
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
        
        CampoTextoConPlaceholder email = new CampoTextoConPlaceholder(15);
        email.setPlaceholder("Ingresa tu email");
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
        
        CampoContraseñaConPlaceholder password = new CampoContraseñaConPlaceholder (15);
        password.setPlaceholder("Ingresa tu contraseña");
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

        BotonRedondeado createAcc = new BotonRedondeado("Crea una cuenta");
        createAcc.setBounds(40, 360, 270, 35);
        createAcc.setFont(etiquetas);
        createAcc.setHorizontalAlignment(JLabel.CENTER);
        login.add(createAcc);

        return login;
    }


    class imagenRedondeada extends JPanel {
        private Image image;
        private int arcWidth;
        private int arcHeight;

        public imagenRedondeada(Image image, int arcWidth, int arcHeight) {
            this.image = image;
            this.arcWidth = arcWidth;
            this.arcHeight = arcHeight;
            setOpaque(false); 
        }
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                RoundRectangle2D roundRect = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
                g2.setClip(roundRect);
                g2.drawImage(image, 0, 0, getWidth(), getHeight(), this);

                g2.dispose();
            }
        }
    }

	class BotonRedondeado extends JButton {
	    private boolean hover = false;
	
	    public BotonRedondeado(String text) {
	        super(text);
	        setContentAreaFilled(false);
	        setFocusPainted(false);
	        setBorderPainted(false);
	
	        addMouseListener(new MouseAdapter() {
	
	            public void mouseEntered(MouseEvent e) {
	                hover = true;
	                repaint();
	            }
	
	            public void mouseExited(MouseEvent e) {
	                hover = false;
	                repaint();
	            }
	        });
	    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color base = getBackground();
        if (hover) {
            base = base.brighter();
        }
        g2.setColor(base);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
        super.paintComponent(g);
        g2.dispose();
    }
}
	
    /*
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
	*/
	/*
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
		JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
		olvidar.setBounds(184,246, 150,30);
		Font fuente1 = new Font("Arial", Font.ITALIC, 12);
	    olvidar.setFont(fuente1); 
		olvidar.setBackground(new Color(235, 235, 235));
		olvidar.setOpaque(true);
		olvidar.setFont(fuente1);
		olvidar.setForeground(new Color(0,154,182));
		registro.add(olvidar);
		registro.revalidate();
		
		
		
		createAcc = new JButton("Crea una cuenta");
		createAcc.setBounds(80, 450, 230, 45);
		createAcc.setFont(etiquetas);
		createAcc.setHorizontalAlignment(JLabel.CENTER);
		registro.add(createAcc); 
		return registro; 
		
	}*/




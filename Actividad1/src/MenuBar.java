import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;

public class MenuBar extends JFrame {

    Font etiquetas = new Font("Ginebra", Font.PLAIN, 20);

    public MenuBar(String title) {
        super(title);
        this.setSize(800, 540);
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
        this.repaint();
        this.revalidate();
        
        
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
        
        /*
       	JLabel etiqueta5 = new JLabel();
        //ImageIcon imagen4 = new ImageIcon("imagenes/user2.png");
        //etiqueta5.setIcon(imagen4);
        etiqueta5.setBounds(270, 150, 30, 30);
        etiqueta5.setBackground(new Color(59, 53, 79));
        //Image img2 = imagen4.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        //etiqueta5.setIcon(new ImageIcon(img2));
        etiqueta5.setOpaque(true);
        login.add(etiqueta5);
        */
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
        //ImageIcon imagen3 = new ImageIcon("imagenes/eye.png");
        //etiqueta3.setIcon(imagen3);
        etiqueta3.setBounds(270, 220, 30, 30);
        etiqueta3.setBackground(new Color(59, 53, 79));
       // Image img = imagen3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        //etiqueta3.setIcon(new ImageIcon(img));
        etiqueta3.setOpaque(true);
        login.add(etiqueta3);
        
        JPasswordField password = new JPasswordField (15);
        //password.setPlaceholder("Ingresa tu contraseña");
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
        
        access.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					System.out.println("Hola");
					if(email.getText().equals("")) {
						email.setBorder(BorderFactory.createLineBorder(Color.red));
					}else {
						email.setBorder(BorderFactory.createLineBorder(Color.green));
					}
					System.out.println(email.getText());
				}
			});

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

	
    

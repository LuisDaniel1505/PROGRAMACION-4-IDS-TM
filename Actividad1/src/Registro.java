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

public class Registro extends JFrame {

    Font etiquetas = new Font("Ginebra", Font.PLAIN, 20);

    public Registro(String title) {
        super(title);
        this.setSize(420, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);  
        this.setResizable(false);
        this.add(this.registro());
        this.setVisible(true);
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
		
		JButton acceso = new JButton("Crear cuenta");
		acceso.setBounds(80, 390, 230, 45);
		acceso.setHorizontalAlignment(JLabel.CENTER);
		acceso.setBackground(new Color(15, 62, 234));
		Font fuente2 = new Font("arial", 40, 20);
		acceso.setFont(fuente2); 
		acceso.setForeground(Color.WHITE);
		registro.add(acceso);
	
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
}

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Font fuente = new Font("arial", 40, 20);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setResizable(false);
		this.setTitle("Calculadora");
		this.setVisible(true);
		this.setSize(305, 550);
		getContentPane().setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		getContentPane().add(this.calculator());
		this.repaint();
		
		getContentPane().add(this.numeros());
		this.repaint();
		
		
	}
	public JPanel calculator() {
        JPanel principal = new JPanel();
        principal.setLocation(0, 0);
        principal.setOpaque(true);
        principal.setSize(300, 270);
        principal.setBackground(new Color(21, 20, 52));
        principal.setVisible(true);
        principal.setLayout(null);
        getContentPane().add(principal);
        
        JLabel pantalla = new JLabel("1,234,567");
		pantalla.setBounds(50, 100, 230, 50);
		pantalla.setBackground(new Color(21, 20, 52));
		pantalla.setOpaque(true);
		Font fuente2 = new Font("Consolas", Font.BOLD, 40);
		pantalla.setFont(fuente2);
		pantalla.setHorizontalAlignment(JLabel.RIGHT);
		pantalla.setForeground(Color.WHITE);
		principal.add(pantalla);
		principal.revalidate();
        
        BotonRedondeado borrar = new BotonRedondeado("CE");
		borrar.setBounds(212, 155, 80, 60);
		borrar.setHorizontalAlignment(JLabel.CENTER);
		borrar.setBackground(new Color(21, 20, 52));
		borrar.setFont(fuente); 
		borrar.setForeground(Color.WHITE);
		principal.add(borrar);
		
		
		return principal;	
	}
	
	public JPanel numeros() {
        JPanel numeros = new JPanel();
        numeros.setLocation(0,270);
        numeros.setOpaque(true);
        numeros.setBackground(new Color(21, 20, 52));
        numeros.setSize(295, 275);
        numeros.setVisible(true);
        numeros.setLayout(null);
        getContentPane().add(numeros);
        
        numeros.setLayout (new GridLayout(5,5,5,5));
		numeros.add(new JButton("7"));
		numeros.add(new JButton("8"));
		numeros.add(new JButton("9"));
		numeros.add(new JButton("/"));
		numeros.add(new JButton("4"));
		numeros.add(new JButton("5"));
		numeros.add(new JButton("6"));
		numeros.add(new JButton("-"));
		numeros.add(new JButton("1"));
		numeros.add(new JButton("2"));
		numeros.add(new JButton("3"));
		numeros.add(new JButton("x"));
		numeros.add(new JButton("."));
		numeros.add(new JButton("0"));
		numeros.add(new JButton("="));
		numeros.add(new JButton("+"));
		
		return numeros;	
	}

}

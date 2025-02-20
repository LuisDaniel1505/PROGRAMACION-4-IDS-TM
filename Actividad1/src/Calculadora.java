import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Calculadora extends JFrame{
	
	Font fuente = new Font("arial", 40, 20);
	public Calculadora (String title) {
		
		this.setTitle("Calculadora");
		this.setVisible(true);
		this.setSize(305, 550);
		
		this.setResizable(false);
		this.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		this.add(this.calculator());
		this.repaint();
		
		
	}
	
	public JPanel calculator() {
        JPanel principal = new JPanel();
        principal.setLocation(0, 0);
        principal.setOpaque(true);
        principal.setSize(300, 550);
        principal.setBackground(new Color(21, 20, 52));
        principal.setVisible(true);
        principal.setLayout(null);
        this.add(principal);
        
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

        String[][] caracteres = {
            {"7", "8", "9", "/"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "x"},
            {".", "0", "=", "+"}
        };

        int inicioX = 10;
        int inicioY = 225;
        int ancho = 60;
        int alto = 60;
        int distancia = 10;

        for (int fila = 0; fila < caracteres.length; fila++) {
            for (int columnas = 0; columnas < caracteres[fila].length; columnas++) {
                String texto = caracteres[fila][columnas];
                BotonRedondeado boton = new BotonRedondeado(texto);


                boton.setBounds(inicioX + (columnas * (ancho + distancia)), inicioY + (fila * (alto + distancia)), ancho, alto);
                boton.setHorizontalAlignment(JLabel.CENTER);

                if ((texto.charAt(0) >= '0' && texto.charAt(0) <= '9') || texto.equals(".")) {
                    boton.setBackground(new Color(43, 40, 69)); 
                } else {
                    boton.setBackground(new Color(254, 47, 166)); 
                }

                boton.setFont(fuente);
                boton.setForeground(Color.WHITE);
                principal.add(boton);
            }
        }

        return principal;
    }

	
	class BotonRedondeado extends JButton {
	    public BotonRedondeado(String text) {
	        super(text);
	        setContentAreaFilled(false);
	        setFocusPainted(false);
	        setBorderPainted(false);
	    }

	    public void paintComponent(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g.create();
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2.setColor(getBackground());
	        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
	        super.paintComponent(g);
	        g2.dispose();
	    }
	}
}

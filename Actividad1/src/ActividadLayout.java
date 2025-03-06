import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActividadLayout extends JFrame{
    
    Font fuente = new Font("Consolas", Font.BOLD, 20);
    
    public ActividadLayout(String title) {
    	
    	this.setTitle("Calculadora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null); 
        //this.add(top(), BorderLayout.NORTH);
        //this.add(calculadora(), BorderLayout.CENTER);
        //this.add(numeros(), BorderLayout.SOUTH);
        
        this.repaint();
        this.setVisible(true);
        setIconImage(getIconImage());
      
    }
    @Override
    public void paint(Graphics g) {
		super.paint(g); 
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.red);
		g2.drawRect(100, 100, 100, 100);
		g2.fillRect(200, 200, 200, 200);
		
		g2.setColor(Color.gray);
		g2.fillRoundRect(400, 80, 80, 80, 20, 20);
		
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(100, 100, 900, 500);
		
		g2.setColor(Color.black);
		g2.drawOval(10,20,90,90);
		g2.fillOval(10,20,95,95);
		
		g2.drawArc(160, 300, 190, 190, 0, -180);
		g2.fillArc(160, 300, 190, 190, 0, 180);
		
		g2.setFont(fuente);
		g2.drawString("Hola xdxdxdxdxdxdxdxd", 15, 250);
		
		int[] xs = {100,100,400};
		int[] ys = {100,200,400};
		
		g2.drawPolygon(xs,ys,3);
		
		int[] xs2 = {650,200,400};
		int[] ys2 = {650,400,400};
		
		g2.drawPolygon(xs2,ys2,3);
		
		g2.fillPolygon(xs2,ys2,3);
		
	}
    /*
    public Image getIconImage() {
    	   Image retValue = Toolkit.getDefaultToolkit().
    	         getImage(ClassLoader.getSystemResource("eye.png"));

    	   return retValue;
    	}
    
    public JPanel top() {
        JPanel principal = new JPanel();
        principal.setBackground(Color.WHITE);
        
        JLabel textoN = new JLabel("Interés");
        textoN.setFont(new Font("Consolas", Font.BOLD, 35));
        textoN.setForeground(Color.red);
        principal.add(textoN);
        
        return principal;
    }
    
    public JPanel calculadora() {
        JPanel calculadora = new JPanel(new GridLayout(5, 2, 10, 10)); 
        calculadora.setBackground(Color.GREEN);
        
        JLabel vacio = new JLabel();
        JLabel titulo = new JLabel("Calcular interés ");
        titulo.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        JLabel capital = new JLabel("Capital:");
        capital.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        JTextField textoCapital = new JTextField();
        JLabel tiempo = new JLabel("Tiempo:");
        tiempo.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        JTextField textoTiempo = new JTextField();
        JLabel tasa = new JLabel("Tasa Interés:");
        tasa.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        JTextField textoTasa = new JTextField();
        JButton calcular = new JButton("Calcular");
        JButton cancelar = new JButton("Cancelar");
        
        calculadora.add(titulo);
        calculadora.add(vacio);
        calculadora.add(capital);
        calculadora.add(textoCapital);
        calculadora.add(tiempo);
        calculadora.add(textoTiempo);
        calculadora.add(tasa);
        calculadora.add(textoTasa);
        calculadora.add(calcular);
        calculadora.add(cancelar);
        
        return calculadora;
    }
    
    public JPanel numeros() {
        JPanel numeros = new JPanel(new GridLayout(2, 2, 10, 10)); 
        numeros.setBackground(Color.PINK);
        
        JLabel interes = new JLabel("Interés:");
        interes.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        JTextField textoInteres = new JTextField();
        JLabel monto = new JLabel("Monto:");
        monto.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        JTextField textoMonto = new JTextField();
        
        numeros.add(interes);
        numeros.add(textoInteres);
        numeros.add(monto);
        numeros.add(textoMonto);
        
        return numeros;
    }
    */
    
}
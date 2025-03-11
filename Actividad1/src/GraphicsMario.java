import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GraphicsMario extends JFrame{
	 public GraphicsMario(String title) {
	        this.setTitle("Mario ");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(1000, 600);
	        this.setResizable(false);
	        this.setLocationRelativeTo(null); 
	        this.getContentPane().setBackground(new Color(162, 240, 255)); 
	        this.repaint();
	        this.setVisible(true);
	    }
	 
	 @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        
	        Graphics2D g2 = (Graphics2D) g;
	        
	        //Sombra Cuadro azul
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(320, 240, 187, 278, 10, 10);
	        
	        //Cuadro azul 
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(288, 217, 189, 300, 10, 10);
	        
	        g2.setColor(new Color(0, 146, 231));
	        g2.fillRoundRect(290, 218, 187, 298, 10, 10);
	        
	        g2.setColor(new Color(113, 194, 255));
	        g2.fillRoundRect(290, 218, 180, 290, 10, 10);
	        
	        //Sombra Cuadro rosa
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(210, 369, 187, 150, 10, 10);
	        
	        //cuadro rosa
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(178, 336, 189, 180, 10, 10);
	        
	        g2.setColor(new Color(236, 145, 114));
	        g2.fillRoundRect(180, 337, 187, 178, 10, 10);
	        
	        g2.setColor(new Color(255, 192, 181));
	        g2.fillRoundRect(180, 337, 180, 170, 10, 10);
	        
	        //cuadro verde
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(850, 336, 189, 180, 10, 10);
	        
	        g2.setColor(new Color(10, 95, 31));
	        g2.fillRoundRect(850, 337, 187, 178, 10, 10);
	        
	        g2.setColor(new Color(0, 221, 91));
	        g2.fillRoundRect(850, 337, 180, 170, 10, 10);
	        
	        //Circulos cuadro rosa 1
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(190,347,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(190,347,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(190, 365, 210, 350);
	        
	        //Circulos cuadro rosa 2
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(340,347,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(340,347,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(340, 365, 360, 350);
	        
	        //Circulos cuadro rosa 3
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(190,487,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(190,487,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(190, 505, 210, 490);
	        
	        //Circulos cuadro rosa 4
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(340,487,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(340,487,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(340, 505, 360, 490);
	        
	        //Circulos cuadro azul 1
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(300,227,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(300,227,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(300, 245, 320, 230);
	        
	        //Circulos cuadro azul 2
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(450,227,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(450,227,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(450, 245, 470, 230);
	        
	        //Circulos cuadro azul 3
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(450,487,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(450,487,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(450, 505, 470, 490);
	        
	        //Circulos cuadro verde 1
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(860,347,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(860,347,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(860, 365, 880, 350);
	        
	        //Circulos cuadro verde 2
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(5));
	        g2.drawOval(860,487,20,20);
	        
	        g2.setColor(new Color(225,225,225));
	        g2.fillOval(860,487,20,20);
	        
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(2));
	        g2.drawLine(860, 505, 880, 490);
	        
	        //Planta 
	        BufferedImage imagen;
	        try {
	        	imagen = ImageIO.read(new File("imagenes/plantaC.png"));
	        	
	        	g2.drawImage(imagen,630,255,60,100,null,null);
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }
	        
	        //Fireball
	        BufferedImage imagen3;
	        try {
	        	imagen3 = ImageIO.read(new File("imagenes/fireball.png"));
	        	
	        	g2.drawImage(imagen3,530,360,40,40,null,null);
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }
	        
	        BufferedImage imagen4;
	        try {
	        	imagen4 = ImageIO.read(new File("imagenes/bush2.png"));
	        	
	        	g2.drawImage(imagen4,65,420,100,100,null,null);
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }
	        
	        //tubo verde parte inferior
	        g2.setColor(new Color(0,229,85));
	        g2.fillRect(600, 404, 124, 120);
	        
	        //Lineas de textura 1
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(604, 404,604,600);
	        
	        //Lineas de textura 2
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(616, 404,616,600);
	        
	        //Lineas de textura 3
	        g2.setStroke(new BasicStroke(12));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(632, 404,632,600);
	        
	        //Lineas de textura 4
	        g2.setStroke(new BasicStroke(38));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(660, 406,660,600);
	        
	        //Lineas de textura 5
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(0,29,0));
	        g2.drawLine(692, 404,692, 600);
	        
	        //Lineas de textura 6
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(0,29,0));
	        g2.drawLine(714, 404,714, 600);
	        
	        //Lineas de textura 7
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(40,83,52));
	        g2.drawLine(713, 404,713, 600);
	        
	        //Lineas de textura 8
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(40,83,52));
	        g2.drawLine(690, 404,690, 600);
	        
	        //Lineas de textura 9
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(40,83,52));
	        g2.drawLine(698, 404,698, 600);
	        
	        //Lineas de textura 10
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(702, 404,702, 600);

	        //tubo verde parte inferior
	        g2.setStroke(new BasicStroke(3));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRect(600, 404, 124, 120);
	        
	        //tubo verde parte superior
	        g2.setColor(new Color(0,229,85));
	        g2.fillRect(595, 352, 135, 50);
	        
	        //Lineas de textura 1
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(600, 354,600,400);
	        
	        //Lineas de textura 2
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(612, 354,612,400);
	        
	        //Lineas de textura 3
	        g2.setStroke(new BasicStroke(12));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(630, 357,630,398);
	        
	        //Lineas de textura 4
	        g2.setStroke(new BasicStroke(42));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(660, 372,660,383);
	        
	        //Lineas de textura 5
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(0,29,0));
	        g2.drawLine(695, 362,695, 394);
	        
	        //Lineas de textura 6
	        g2.setStroke(new BasicStroke(22));
	        g2.setColor(new Color(0,29,0));
	        g2.drawLine(720, 364,720, 392);
	        
	        //Lineas de textura 7
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(40,83,52));
	        g2.drawLine(723, 353,723, 401);
	        
	        //Lineas de textura 8
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(40,83,52));
	        g2.drawLine(690, 353,690, 401);
	        
	        //Lineas de textura 9
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(40,83,52));
	        g2.drawLine(698, 353,698, 401);
	        
	        //Lineas de textura 10
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(0,138,0));
	        g2.drawLine(706, 353,706, 401);

	        //tubo verde parte superior
	        g2.setStroke(new BasicStroke(3));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRect(595, 352, 135, 50);
	        
	        //cubo 1
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRect(150, 50, 60, 60);
	        g2.setColor(new Color(255,135,82));
	        g2.fillRect(150, 50, 60, 60);
	        //puntos arriba
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(154,54,154,54);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(204,54,204,54);
	        //puntos abajo
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(154,104,154,104);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(204,104,204,104);
	        
	        //cubo 2
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRect(216, 50, 60, 60);
	        g2.setColor(new Color(255,135,82));
	        g2.fillRect(216, 50, 60, 60);
	        //puntos arriba
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(220,54,220,54);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(270,54,270,54);
	        //puntos abajo
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(220,104,220,104);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(270,104,270,104);
	        
	        //cubo 3
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRect(50, 170, 60, 60);
	        g2.setColor(new Color(255,135,82));
	        g2.fillRect(50, 170, 60, 60);
	        //puntos arriba
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(54,174,54,174);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(104,174,104,174);
	        //puntos abajo
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(54,224,54,224);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(104,224,104,224);
	        
	        //cubo 4
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRect(850, 170, 60, 60);
	        g2.setColor(new Color(255,135,82));
	        g2.fillRect(850, 170, 60, 60);
	        //puntos arriba
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(854,174,854,174);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(904,174,904,174);
	        //puntos abajo
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(854,224,854,224);
	        g2.setColor(new Color(0,0,0));
	        g2.setStroke(new BasicStroke(3));
	        g2.drawLine(904,224,904,224);
	        
	        
	        //Suelo
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0, 0, 0));
	        g2.drawRoundRect(50, 520, 1000, 520, 10, 10);
	        
	        g2.setColor(new Color(255, 196, 181));
	        g2.fillRoundRect(50, 520, 1000, 520, 10, 10);
	           
	        //suelo
	        g2.setColor(new Color(255, 151, 102));
	        g2.fillRect(50, 540, 1000, 520);
	        
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(95, 40, 24));
	        g2.drawLine(53, 540, 1000, 540);
	  
	        //Mario 
	        BufferedImage imagen2;
	        try {
	        	imagen2 = ImageIO.read(new File("imagenes/mario.png"));
	        	
	        	g2.drawImage(imagen2,447,420,50,100,null,null);
	        }catch(IOException e2) {
	        	e2.printStackTrace();
	        }
	 }

}

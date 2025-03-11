import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GraphicsMario2 extends JFrame{
	 public GraphicsMario2(String title) {
	        this.setTitle("Mario ");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(1000, 600);
	        this.setResizable(false);
	        this.setLocationRelativeTo(null); 
	        this.getContentPane().setBackground(new Color(6, 101, 192)); 
	        this.repaint();
	        this.setVisible(true);
	    }
	 
	 @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        
	        Graphics2D g2 = (Graphics2D) g;
	        
	        //nube
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(710, 178, 170, 45, 100, 100);
	        g2.setColor(new Color(255,255,255));
	        g2.fillRoundRect(710, 170, 170, 45, 100, 100);
	        //nube
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(776, 128, 170, 45, 100, 100);
	        g2.setColor(new Color(255,255,255));
	        g2.fillRoundRect(776, 120, 170, 45, 100, 100);
	        
	        //nube
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(270, 390, 170, 45, 100, 100);
	        g2.setColor(new Color(255,255,255));
	        g2.fillRoundRect(270, 382, 170, 45, 100, 100);
	        
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(140, 445, 250, 45, 100, 100);
	        g2.setColor(new Color(255,255,255));
	        g2.fillRoundRect(140, 437, 250, 45, 100, 100);
	            	        
	        //Sombra pilar blanco  
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(420,160,170,900,190,190);
	        //Pilar blanco	  
	        g2.setColor(new Color(198,227,231));
	        g2.fillRoundRect(405,160,170,900,190,190);
	        
	        //Sombra pilar blanco
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(605,70,170,900,190,190);
	        //Pilar blanco
	        g2.setColor(new Color(198,227,231));
	        g2.fillRoundRect(590,70,170,900,190,190);
	        
	        //Sombra pilar blanco
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(35,160,170,900,190,190);
	        //Pilar blanco
	        g2.setColor(new Color(198,227,231));
	        g2.fillRoundRect(20,160,170,900,190,190);
	        
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(-130, 268, 250, 45, 100, 100);
	        g2.setColor(new Color(255,255,255));
	        g2.fillRoundRect(-130, 260, 250, 45, 100, 100);
	      //-----------------------------------------------------------	        
	       
	        //Sombra pilar azul
	        g2.setColor(new Color(18,81,117));
	        g2.fillRoundRect(-115,365,290,900,290,290);
	        //Pilar azul
	        g2.setStroke(new BasicStroke(4));
	        g2.setColor(new Color(18,81,117));
	        g2.drawRoundRect(-130,365,290,900,290,290);
	        g2.setColor(new Color(118,178,215));
	        g2.fillRoundRect(-130,365,290,900,290,290);
	        
	        //Sombra pilar azul
	        g2.setColor(new Color(18,81,117));
	        g2.fillRoundRect(420,365,250,900,290,290);
	        //Pilar azul	     
	        g2.setStroke(new BasicStroke(4));
	        g2.setColor(new Color(18,81,117));
	        g2.drawRoundRect(405,365,250,900,290,290);
	        g2.setColor(new Color(118,178,215));
	        g2.fillRoundRect(405,365,250,900,290,290);
	        
	        //nube
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(570, 336, 170, 45, 100, 100);
	        g2.setColor(new Color(255,255,255));
	        g2.fillRoundRect(570, 328, 170, 45, 100, 100);
	        
	        //Sombra pilar azul
	        g2.setColor(new Color(18,81,117));
	        g2.fillRoundRect(685,230,250,900,290,290);
	        //Pilar azul
	        g2.setStroke(new BasicStroke(4));
	        g2.setColor(new Color(18,81,117));
	        g2.drawRoundRect(670,230,250,900,290,290);
	        g2.setColor(new Color(118,178,215));
	        g2.fillRoundRect(670,230,250,900,290,290);
	        
	        //nube
	        g2.setColor(new Color(149,193,199));
	        g2.fillRoundRect(210, 286, 250, 45, 100, 100);
	        g2.setColor(new Color(255,255,255));
	        g2.fillRoundRect(210, 278, 250, 45, 100, 100);
	        
	        g2.fillOval(440, 325, 25, 35);
	        
	      //----------------------------------------------------------
	        //tubo verde parte inferior
	        g2.setColor(new Color(120,60,210));
	        g2.fillRoundRect(437, 404, 124, 120,15,15);
	        
	        //Lineas de textura 1
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(441, 404, 441, 600);
	        
	        //Lineas de textura 2
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(453, 404, 453, 600);
	        
	        //Lineas de textura 3
	        g2.setStroke(new BasicStroke(12));
	        g2.setColor(new Color(255,255,255));
	        g2.drawLine(469, 404, 469, 600);
	        
	        //Lineas de textura 4
	        g2.setStroke(new BasicStroke(38));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(497, 406, 497, 600);
	        
	        //Lineas de textura 5
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(529, 404, 529, 600);
	        
	        //Lineas de textura 6
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(551, 404, 551, 600);
	        
	        //Lineas de textura 7
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(550, 404, 550, 600);
	        
	        //Lineas de textura 8
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(527, 404, 527, 600);
	        
	        //Lineas de textura 9
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(535, 404, 535, 600);
	        
	        //Lineas de textura 10
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(539, 404, 539, 600);

	        //tubo verde parte inferior
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(437, 404, 124, 120,15,15);
	        
	        //tubo verde parte superior
	        g2.setColor(new Color(120,60,210));
	        g2.fillRoundRect(432, 352, 135, 50,15,15);
	        
	        //Lineas de textura 1
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(437, 354, 437, 400);
	        
	        //Lineas de textura 2
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(449, 354, 449, 400);
	        
	        //Lineas de textura 3
	        g2.setStroke(new BasicStroke(12));
	        g2.setColor(new Color(255,255,255));
	        g2.drawLine(467, 357, 467, 398);
	        
	        //Lineas de textura 4
	        g2.setStroke(new BasicStroke(42));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(497, 372, 497, 383);
	        
	        //Lineas de textura 5
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(532, 362, 532, 394);
	        
	        //Lineas de textura 6
	        g2.setStroke(new BasicStroke(22));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(557, 364, 557, 392);
	        
	        //Lineas de textura 7
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(560, 353, 560, 401);
	        
	        //Lineas de textura 8
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(527, 353, 527, 401);
	        
	        //Lineas de textura 9
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(535, 353, 535, 401);
	        
	        //Lineas de textura 10
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(543, 353, 543, 401);

	        //tubo verde parte superior
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(432, 352, 135, 50,15,15);
	        
	        // tubo 2
	        
	      //tubo verde parte inferior
	        g2.setColor(new Color(120,60,210));
	        g2.fillRoundRect(955, 470, 124, 120,15,15);

	        //Lineas de textura 1
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(959, 470, 959, 666);

	        //Lineas de textura 2
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(971, 470, 971, 666);

	        //Lineas de textura 3
	        g2.setStroke(new BasicStroke(12));
	        g2.setColor(new Color(255,255,255));
	        g2.drawLine(987, 470, 987, 666);

	        //Lineas de textura 4
	        g2.setStroke(new BasicStroke(38));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(1015, 472, 1015, 666);

	        //Lineas de textura 5
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(1047, 470, 1047, 666);

	        //Lineas de textura 6
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(1069, 470, 1069, 666);

	        //Lineas de textura 7
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(1068, 470, 1068, 666);

	        //Lineas de textura 8
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(1045, 470, 1045, 666);

	        //Lineas de textura 9
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(1053, 470, 1053, 666);

	        //Lineas de textura 10
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(1057, 470, 1057, 666);

	        //tubo verde parte inferior
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(955, 470, 124, 120,15,15);

	        //tubo verde parte superior
	        g2.setColor(new Color(120,60,210));
	        g2.fillRoundRect(950, 418, 135, 50,15,15);

	        //Lineas de textura 1
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(955, 420, 955, 466);

	        //Lineas de textura 2
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(967, 420, 967, 466);

	        //Lineas de textura 3
	        g2.setStroke(new BasicStroke(12));
	        g2.setColor(new Color(255,255,255));
	        g2.drawLine(985, 423, 985, 464);

	        //Lineas de textura 4
	        g2.setStroke(new BasicStroke(42));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(1015, 438, 1015, 449);

	        //Lineas de textura 5
	        g2.setStroke(new BasicStroke(18));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(1050, 428, 1050, 460);

	        //Lineas de textura 6
	        g2.setStroke(new BasicStroke(22));
	        g2.setColor(new Color(50,0,120));
	        g2.drawLine(1075, 430, 1075, 458);

	        //Lineas de textura 7
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(1078, 419, 1078, 467);

	        //Lineas de textura 8
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(1045, 419, 1045, 467);

	        //Lineas de textura 9
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(80,60,170));
	        g2.drawLine(1053, 419, 1053, 467);

	        //Lineas de textura 10
	        g2.setStroke(new BasicStroke(5));
	        g2.setColor(new Color(70,40,180));
	        g2.drawLine(1061, 419, 1061, 467);

	        //tubo verde parte superior
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(950, 418, 135, 50,15,15);
	        
	        BufferedImage imagen3;
	        try {
	        	imagen3 = ImageIO.read(new File("imagenes/plantaP.png"));
	        	
	        	g2.drawImage(imagen3,465,260,70,70,null,null);
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }

	      //-----------------------------------------------------------
	      //detalles montañas 
	        g2.setColor(Color.WHITE);
	        g2.fillOval(100, 220, 25, 35);
	        g2.fillOval(100, 310, 25, 35);
	        g2.fillOval(40, 330, 25, 35);
	        g2.fillOval(510, 220, 25, 35);
	        g2.fillOval(440, 245, 25, 35);
	        g2.fillOval(615, 220, 25, 35);
	        g2.fillOval(695, 120, 25, 35);
	        g2.fillOval(720, 280, 25, 35);
	        g2.fillOval(810, 400, 25, 35);
	      //-----------------------------------------------------------
	        //cubos derecha
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(885, 474, 50, 40, 17, 17);
	        g2.setColor(new Color(115,112,113));
	        g2.fillRoundRect(885, 474, 50, 40, 17, 17);

	        g2.setColor(new Color(198,197,204));
	        g2.fillRoundRect(885, 474, 45, 35, 17, 17);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(885, 430, 50, 40, 17, 17);
	        g2.setColor(new Color(115,112,113));
	        g2.fillRoundRect(885, 430, 50, 40, 17, 17);

	        g2.setColor(new Color(198,197,204));
	        g2.fillRoundRect(885, 430, 45, 35, 17, 17);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(885, 385, 50, 40, 17, 17);
	        g2.setColor(new Color(115,112,113));
	        g2.fillRoundRect(885, 385, 50, 40, 17, 17);
	        
	        g2.setColor(new Color(198,197,204));
	        g2.fillRoundRect(885, 385, 45, 35, 17, 17);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(885, 340, 50, 40, 17, 17);
	        g2.setColor(new Color(115,112,113));
	        g2.fillRoundRect(885, 340, 50, 40, 17, 17);
	        
	        g2.setColor(new Color(198,197,204));
	        g2.fillRoundRect(885, 340, 45, 35, 17, 17);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(0,0,0));
	        g2.drawRoundRect(940, 340, 50, 40, 17, 17);
	        g2.setColor(new Color(221,159,62));
	        g2.fillRoundRect(940, 340, 50, 40, 17, 17);
	        
	        g2.setColor(new Color(255,213,46));
	        g2.fillRoundRect(940, 340, 45, 35, 17, 17);
	        
	        g2.setStroke(new BasicStroke(4));
	        g2.setColor(new Color(0,0,0));
	        g2.drawLine(955, 350, 955, 359);
	        
	        g2.setStroke(new BasicStroke(4));
	        g2.setColor(new Color(0,0,0));
	        g2.drawLine(975, 350, 975, 359);
	        
	        //Mario
	        BufferedImage imagen2;
	        try {
	        	imagen2 = ImageIO.read(new File("imagenes/marioW.png"));
	        	
	        	g2.drawImage(imagen2,360,448,60,70,null,null);
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }

	      //-----------------------------------------------------------
	        //Suelo
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0, 0, 0));
	        g2.drawRect(0, 520, 1000, 520);
	        
	        g2.setColor(new Color(24,178,42));
	        g2.fillRect(0, 520, 1000, 520);
	           
	        //suelo
	        g2.setColor(new Color(255, 151, 102));
	        g2.fillRect(0, 540, 1000, 520);
	        
	        g2.setStroke(new BasicStroke(4));
	        g2.setColor(new Color(0,0,0));
	        g2.drawLine(0, 520, 1000, 520);  
	        
	        g2.setStroke(new BasicStroke(3));
	        g2.setColor(new Color(0,0,0));
	        g2.drawLine(0, 540, 1000, 540);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(18,130,60));
	        g2.drawLine(0, 536, 1000, 536);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(133,101,30));
	        g2.drawLine(0, 544, 1000, 544);
	        //Suelo
	        g2.setStroke(new BasicStroke(7));
	        g2.setColor(new Color(0, 0, 0));
	        g2.drawRect(0, 520, 1000, 520);
	        
	        g2.setColor(new Color(24,178,42));
	        g2.fillRect(0, 520, 1000, 520);
	           
	        //suelo
	        g2.setColor(new Color(255, 151, 102));
	        g2.fillRect(0, 540, 1000, 520);
	        
	        g2.setStroke(new BasicStroke(4));
	        g2.setColor(new Color(0,0,0));
	        g2.drawLine(0, 520, 1000, 520);  
	        
	        g2.setStroke(new BasicStroke(3));
	        g2.setColor(new Color(0,0,0));
	        g2.drawLine(0, 540, 1000, 540);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(18,130,60));
	        g2.drawLine(0, 536, 1000, 536);
	        
	        g2.setStroke(new BasicStroke(6));
	        g2.setColor(new Color(133,101,30));
	        g2.drawLine(0, 544, 1000, 544);

	        
	 }
}
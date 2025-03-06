import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class GraphicsCasa extends JFrame {
    
    public GraphicsCasa(String title) {
        this.setTitle("Casa");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null); 
        this.getContentPane().setBackground(new Color(117, 213, 255)); 
        this.repaint();
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(new Color(50, 150, 50));
        g2.fillRect(0, 450, 800, 150);

        g2.setColor(new Color(255, 204, 102));
        g2.fillRect(100, 350, 600, 15); 
        g2.fillRect(100, 410, 600, 15);
        
        g2.fillRect(100, 320, 20, 130);
        g2.fillRect(140, 320, 20, 130);
        g2.fillRect(180, 320, 20, 130);
        g2.fillRect(220, 320, 20, 130);
        g2.fillRect(260, 320, 20, 130);
        g2.fillRect(300, 320, 20, 130);
        g2.fillRect(340, 320, 20, 130);
        g2.fillRect(380, 320, 20, 130);
        g2.fillRect(420, 320, 20, 130);
        g2.fillRect(460, 320, 20, 130);
        g2.fillRect(500, 320, 20, 130);
        g2.fillRect(540, 320, 20, 130);
        g2.fillRect(580, 320, 20, 130);
        g2.fillRect(620, 320, 20, 130);
        g2.fillRect(660, 320, 20, 130);
        g2.fillRect(700, 320, 20, 130);
        
        int[] xs1 = {100, 110, 120};
        int[] ys1 = {330, 315, 330};
        g2.fillPolygon(xs1, ys1, 3);
        
        int[] xs2 = {140, 150, 160};
        int[] ys2 = {330, 315, 330};
        g2.fillPolygon(xs2, ys2, 3);
        
        int[] xs3 = {180, 190, 200};
        int[] ys3 = {330, 315, 330};
        g2.fillPolygon(xs3, ys3, 3);
        
        int[] xs4 = {220, 230, 240};
        int[] ys4 = {330, 315, 330};
        g2.fillPolygon(xs4, ys4, 3);
        
        int[] xs5 = {260, 270, 280};
        int[] ys5 = {330, 315, 330};
        g2.fillPolygon(xs5, ys5, 3);
        
        int[] xs6 = {300, 310, 320};
        int[] ys6 = {330, 315, 330};
        g2.fillPolygon(xs6, ys6, 3);
        
        int[] xs7 = {340, 350, 360};
        int[] ys7 = {330, 315, 330};
        g2.fillPolygon(xs7, ys7, 3);
        
        int[] xs8 = {380, 390, 400};
        int[] ys8 = {330, 315, 330};
        g2.fillPolygon(xs8, ys8, 3);
        
        int[] xs9 = {420, 430, 440};
        int[] ys9 = {330, 315, 330};
        g2.fillPolygon(xs9, ys9, 3);
        
        int[] xs10 = {460, 470, 480};
        int[] ys10 = {330, 315, 330};
        g2.fillPolygon(xs10, ys10, 3);
        
        int[] xs11 = {500, 510, 520};
        int[] ys11 = {330, 315, 330};
        g2.fillPolygon(xs11, ys11, 3);
        
        int[] xs12 = {540, 550, 560};
        int[] ys12 = {330, 315, 330};
        g2.fillPolygon(xs12, ys12, 3);
        
        int[] xs13 = {580, 590, 600};
        int[] ys13 = {330, 315, 330};
        g2.fillPolygon(xs13, ys13, 3);
        
        int[] xs14 = {620, 630, 640};
        int[] ys14 = {330, 315, 330};
        g2.fillPolygon(xs14, ys14, 3);
        
        int[] xs15 = {660, 670, 680};
        int[] ys15 = {330, 315, 330};
        g2.fillPolygon(xs15, ys15, 3);
        
        int[] xs16 = {700, 710, 720};
        int[] ys16 = {330, 315, 330};
        g2.fillPolygon(xs16, ys16, 3);

        g2.setColor(new Color(102, 102, 102));
        g2.fillRect(500, 145, 30, 70);
        g2.setColor(new Color(153, 153, 153));
        g2.fillRect(495, 140, 40, 10);
        
        g2.setColor(new Color(204, 153, 102));
        g2.fillRect(250, 250, 300, 200);
        
        g2.setColor(new Color(153, 0, 0)); 
        int[] xs17 = {200, 400, 600};
        int[] ys17 = {250, 150, 250};
        g2.fillPolygon(xs17, ys17, 3);

        g2.setColor(new Color(102, 51, 0)); 
        g2.fillRect(350, 350, 60, 100);

        g2.setColor(Color.WHITE);
        g2.fillOval(395, 400, 10, 10);

        g2.setColor(Color.WHITE); 
        g2.fillRect(450, 300, 80, 60);

        g2.setColor(new Color(153, 0, 0)); 
        g2.setStroke(new BasicStroke(3));
        g2.drawRect(450, 300, 80, 60);
        g2.drawLine(490, 300, 490, 360); 
        g2.drawLine(450, 330, 530, 330); 

        g2.setColor(new Color(102, 51, 0));
        g2.fillRect(445, 360, 90, 10);

        g2.setColor(Color.YELLOW);
        g2.fillOval(650, 80, 60, 60);

        g2.setStroke(new BasicStroke(3));
        g2.drawLine(650, 110, 620, 110);
        g2.drawLine(710, 110, 740, 110);
        g2.drawLine(680, 80, 680, 50); 
        g2.drawLine(680, 140, 680, 170); 
        g2.drawLine(655, 85, 635, 65);   
        g2.drawLine(705, 85, 725, 65);   
        g2.drawLine(655, 135, 635, 155);
        g2.drawLine(705, 135, 725, 155);
        
        g2.setColor(new Color(101, 67, 33));
        g2.fillRect(120, 350, 20, 100);

        g2.setColor(new Color(0, 100, 0));
        g2.fillOval(80, 270, 100, 100);
        g2.setColor(new Color(34, 139, 34));
        g2.fillOval(90, 230, 80, 90);
        g2.setColor(new Color(0, 128, 0));
        g2.fillOval(70, 250, 120, 80);
        
        g2.setColor(new Color(101, 67, 33));
        g2.fillRect(690, 320, 20, 130);

        g2.setColor(new Color(0, 100, 0));
        g2.fillOval(650, 240, 100, 100);
        g2.setColor(new Color(34, 139, 34));
        g2.fillOval(660, 200, 80, 90);
        g2.setColor(new Color(0, 128, 0));
        g2.fillOval(640, 220, 120, 80);

        g2.setColor(new Color(0, 100, 0));
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(180, 470, 180, 420);
        g2.drawLine(195, 470, 195, 425);
        g2.drawLine(210, 470, 210, 415);
        
        g2.setColor(new Color(255, 0, 0)); 
        g2.fillOval(175, 410, 10, 10);
        g2.setColor(new Color(255, 255, 0)); 
        g2.fillOval(190, 415, 10, 10);
        g2.setColor(new Color(255, 105, 180));
        g2.fillOval(205, 405, 10, 10);

        g2.setColor(new Color(0, 100, 0));
        g2.drawLine(600, 470, 600, 440);
        g2.drawLine(615, 470, 615, 445);
        g2.drawLine(630, 470, 630, 435);
        
        g2.setColor(new Color(255, 0, 0));
        g2.fillOval(595, 430, 10, 10);
        g2.setColor(new Color(255, 255, 0)); 
        g2.fillOval(610, 435, 10, 10);
        g2.setColor(new Color(255, 105, 180)); 
        g2.fillOval(625, 425, 10, 10);

        g2.setColor(new Color(255, 255, 255));
        g2.fillOval(100, 100, 60, 40);
        g2.fillOval(120, 90, 70, 50);
        g2.fillOval(140, 100, 60, 40);
        
        g2.fillOval(400, 80, 60, 40);
        g2.fillOval(420, 70, 70, 50);
        g2.fillOval(440, 80, 60, 40);
    }
    
}
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class EventoTeclado extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PaintPanel panel_2;
	private Player player;
	private ArrayList<Player> obstaculos = new ArrayList<Player>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventoTeclado frame = new EventoTeclado();
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
	public EventoTeclado() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		player = new Player(200,200,25,25, Color.gray);
		obstaculos.add(new Player(150,350,120,30, Color.red));
		obstaculos.add(new Player(150,120,120,30, Color.yellow));
		obstaculos.add(new Player(40,120,50,160, Color.blue));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 426, 51);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("0:00");
		panel_1.add(lblNewLabel);
		
		panel_2 = new PaintPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(5, 55, 426, 464);
		contentPane.add(panel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 539, 426, 43);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Presiona \"R\" para reiniciar");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel_1);
		
		panel_2.addKeyListener(this);
		panel_2.setFocusable(true); //Se modificó el foco para que sea solo el panel_2 en vez de todo el frame
		
	}
	
	class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.WHITE);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.green);
            g2.fillRect(player.x, player.y, player.w, player.h);
            
            g2.setColor(Color.red);
            g2.fillRect(150, 350, 120, 30);
            
            for (Player pared : obstaculos) {
            	g2.setColor(pared.c);
            	g2.fillRect(pared.x, pared.y, pared.w-5, pared.h-5);
            }
        }
    }
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	    int movimiento = 5;
	    int futuraX = player.x;
	    int futuraY = player.y;

	    if (e.getKeyCode() == 87 && player.y - movimiento >= 0) { 
	        futuraY -= movimiento;
	    } 
	    if (e.getKeyCode() == 83 && player.y + player.h + movimiento <= panel_2.getHeight()) { 
	        futuraY += movimiento;
	    }
	    if (e.getKeyCode() == 65 && player.x - movimiento >= 0) { 
	        futuraX -= movimiento;
	    }
	    if (e.getKeyCode() == 68 && player.x + player.w + movimiento <= panel_2.getWidth()) {
	        futuraX += movimiento;
	    }

	    boolean colisiona = false;
	    for (Player pared : obstaculos) {
	        if (new Player(futuraX, futuraY, player.w, player.h, player.c).colision(pared)) {
	            colisiona = true;
	        }
	    }
	    if (!colisiona) {
	        player.x = futuraX;
	        player.y = futuraY;
	    }
	    if(colisiona) {
	    	System.out.println("Hubo una colision");
	    }

	    
	    if (e.getKeyCode() == 82) {
	    	player.x=200;
	    	player.y=200;
	    	panel_2.requestFocusInWindow();
	    	panel_2.repaint();
	    }
	    panel_2.repaint();
	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	class Player {
		int x, y, w, h;
		Color c = Color.black;
		
		public Player(int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
		}
		public Boolean colision(Player target) {
			
			return this.x < target.x + target.w &&
	                 this.x + this.w > target.x &&
	                 this.y < target.y + target.h &&
	                 this.y + this.h > target.y;
		}
	}
}

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class EventoTeclado extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PaintPanel panel_2;
	private Player player;
	Timer timer, timer2;
	private int lastpress=0;
	JLabel lblNewLabel;
	private int decimas = 0;
	private int segundos = 0;
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
		
		lblNewLabel = new JLabel("0:0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		panel_2 = new PaintPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(5, 55, 426, 464);
		contentPane.add(panel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 520, 426, 62);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.x=200;
		    	player.y=200;
		    	panel_2.requestFocusInWindow();
		    	panel_2.repaint();
		    	lastpress=0;
		    	timer.stop();
		    	timer2.stop();
		    	lblNewLabel.setText("0:0");
		    	segundos=0;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(btnNewButton);
		
		panel_2.addKeyListener(this);
		panel_2.setFocusable(true); //Se modificó el foco para que sea solo el panel_2 en vez de todo el frame
		
		ActionListener taskPerformer = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        decimas++;
		        if (decimas >= 10) {
		            segundos++;
		            decimas = 0;
		        }
		        String tiempo = String.format("%02d:%d", segundos, decimas);
		        lblNewLabel.setText(tiempo);
		    }
		};
		timer = new Timer(100, taskPerformer); 
		
		ActionListener movimiento = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				update();
				panel_2.repaint();
			}
		};
		timer2 = new Timer(4,movimiento);
		
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
            	g2.fillRect(pared.x, pared.y, pared.w, pared.h);
            }
        }
    }
	
	@Override
	public void keyTyped(KeyEvent e) {

		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		timer.start();
	    timer2.start();
	    lastpress = e.getKeyCode();
	    update();
	    panel_2.repaint();
	}
	
	public void update() {
		int movimiento = 2; 
        int futuraX = player.x;
        int futuraY = player.y;

        if (lastpress == 87 && player.y - movimiento >= 0) { 
            futuraY -= movimiento;
        } else if (lastpress == 83 && player.y + player.h + movimiento <= panel_2.getHeight()) {  
            futuraY += movimiento;
        } else if (lastpress == 65 && player.x - movimiento >= 0) {  
            futuraX -= movimiento;
        } else if (lastpress == 68 && player.x + player.w + movimiento <= panel_2.getWidth()) { 
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
        } else {
            lastpress = 0;
            timer2.stop();
        }
	}

	
	@Override
	public void keyReleased(KeyEvent e) {

		
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

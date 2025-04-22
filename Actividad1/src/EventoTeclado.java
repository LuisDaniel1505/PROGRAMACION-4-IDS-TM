import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class EventoTeclado extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L; 
	private JPanel contentPane; 
	private PaintPanel panel_2; 
	private Player player; 
	private Player meta;
	Timer timer, timer2; 
	private int lastpress=0; 
	JLabel lblNewLabel; 
	private int decimas = 0; 
	private int segundos = 0; 
	private boolean nivel1Activo = true;
	private ArrayList<Player> obstaculos = new ArrayList<Player>(); 

    private int grosor = 15;
    private int[][] laberinto1 = {
    	    {1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,1,0,0,1,1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,1},
    	    {1,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1},
    	    {1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,0,0,1},
    	    {1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1},
    	    {1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1},
    	    {1,1,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,0,0,1,1,1,1,1,1,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
    	    {1,0,0,1,0,0,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,1,0,0,1,0,0,1,1,1,1},
    	    {1,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,1,1,1,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
    	    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
    	    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    	};

    private int[][] laberinto2 = {
    	    {1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    	    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,1,1,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,1,1,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,1,1,0,0,1,0,0,1,1,1,1,0,0,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,1,1,1,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
    	    {1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1},
    	    {1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,1,1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,0,0,1},
    	    {1,0,0,1,1,1,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1},
    	    {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
    	    {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
    	    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    	};

    private int[][] laberintoActual;

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
        setBounds(100, 100, 578, 694);
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        playSound("ligamx.wav");
        player = new Player(20, 0, 20, 20, "maquina.png");
        meta = new Player(540, 495, 15, 30, "porteria.png");
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.LIGHT_GRAY);
        panel_1.setBounds(5, 5, 565, 51);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        lblNewLabel = new JLabel("0:0");
        lblNewLabel.setBounds(289, 10, 73, 25);
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 32));
        panel_1.add(lblNewLabel);
        
        JLabel lblTiempo = new JLabel("Tiempo: ");
        lblTiempo.setForeground(Color.BLACK);
        lblTiempo.setFont(new Font("Rockwell", Font.PLAIN, 32));
        lblTiempo.setBounds(146, 2, 154, 41);
        panel_1.add(lblTiempo);

        panel_2 = new PaintPanel();
        panel_2.setBackground(new Color(220, 220, 220));
        panel_2.setBounds(5, 55, 559, 539);
        contentPane.add(panel_2);

        JPanel panel = new JPanel();
        panel.setForeground(Color.WHITE);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(5, 598, 565, 59);
        contentPane.add(panel);

        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.setFont(new Font("Rockwell", Font.PLAIN, 28));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	timer.stop();
                timer2.stop();
                decimas = segundos = 0;
                lblNewLabel.setText("00:0");
                player.x = 20;
                player.y = 0;
                lastpress = 0;
                cargarNivel();
                panel_2.requestFocusInWindow();
                panel_2.repaint();
            }
        });
        panel.add(btnNewButton);
        
        JButton btnCambiarNivel = new JButton("Nivel 2");
        btnCambiarNivel.setFont(new Font("Rockwell", Font.PLAIN, 24));
        btnCambiarNivel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nivel1Activo) {
                    cambiarNivel(laberinto2);
                    btnCambiarNivel.setText("Nivel 1");
                } else {
                    cambiarNivel(laberinto1);
                    btnCambiarNivel.setText("Nivel 2");
                }
                nivel1Activo = !nivel1Activo;
            }
        });
        panel.add(btnCambiarNivel);

        panel_2.addKeyListener(this);
        panel_2.setFocusable(true);

        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                decimas++;
                if (decimas >= 10) {
                    segundos++;
                    decimas = 0;
                }
                lblNewLabel.setText(String.format("%02d:%d", segundos, decimas));
            }
        });

        timer2 = new Timer(4, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                update();
                panel_2.repaint();
            }
        });
        laberintoActual = laberinto1; 
        cargarNivel();
    }
	private void cambiarNivel(int[][] nuevaMatriz) {
        timer.stop();
        timer2.stop();
        decimas = segundos = 0;
        lblNewLabel.setText("00:0");
        player.x = 20;
        player.y = 0;
        lastpress = 0;
        laberintoActual = nuevaMatriz;
        cargarNivel();
        panel_2.requestFocusInWindow();
        panel_2.repaint();

    }
	private void cargarNivel() {
	    obstaculos.clear();
	    int[][] nivel = laberintoActual; 
	    for (int i = 0; i < nivel.length; i++) {
	        for (int j = 0; j < nivel[i].length; j++) {
	            if (nivel[i][j] == 1) {
	                int x = j * grosor;
	                int y = i * grosor;
	                obstaculos.add(new Player(x, y, grosor, grosor, "brick.jpg"));
	            }
	        }
	    }
	}

    class PaintPanel extends JPanel {
    	Image fondo;
        public PaintPanel() { 
        	 fondo = new ImageIcon(getClass().getResource("campo.jpg")).getImage(); 
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(fondo, 0, 0, 555, getHeight(), null);

            g2.drawImage(meta.imagen,meta.x, meta.y, meta.w, meta.h,null);
            
            g2.drawImage(player.imagen, player.x, player.y, player.w, player.h, null);
            for (Player pared : obstaculos) {
                g2.setColor(pared.c);
                g2.drawImage(pared.imagen,pared.x, pared.y, pared.w, pared.h,null);
            }
        }
    }
    //creditos: https://stackoverflow.com/questions/26305/how-can-i-play-sound-in-java
    public static synchronized void playSound(final String url) {
    	  new Thread(new Runnable() {
    	    public void run() {
    	      try {
    	        Clip clip = AudioSystem.getClip();
    	        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
    	          Main.class.getResourceAsStream("" + url));
    	        clip.open(inputStream);
    	        clip.start(); 
    	      } catch (Exception e) {
    	        System.err.println(e.getMessage());
    	      }
    	    }
    	  }).start();
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
        
        if (player.colision(meta)) {
            timer.stop();
            timer2.stop();
            playSound("siu.wav");
            ImageIcon iconoVictoria = new ImageIcon(getClass().getResource("siu.gif"));
            JOptionPane.showMessageDialog(this, "¡Felicidades, has completado el laberinto!\nTiempo: " + lblNewLabel.getText(),"SIUUUUUUU",JOptionPane.INFORMATION_MESSAGE,                         
            	    iconoVictoria);
            cambiarNivel(laberinto2);
        }
	}

	
	@Override
	public void keyReleased(KeyEvent e) {

		
	}
	
	class Player {
		int x, y, w, h;
		Color c = Color.black;
		Image imagen;
		
		public Player(int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
		}
		public Player(int x, int y, int w, int h, String rutaImagen) {
	        this.x = x; this.y = y;
	        this.w = w; this.h = h;
	        this.c = null;
	        ImageIcon icon = new ImageIcon(getClass().getResource(rutaImagen));
	        this.imagen = icon.getImage();
	    }
		public Boolean colision(Player target) {
			
			return this.x < target.x + target.w &&
	                 this.x + this.w > target.x &&
	                 this.y < target.y + target.h &&
	                 this.y + this.h > target.y;
		}
	}
}

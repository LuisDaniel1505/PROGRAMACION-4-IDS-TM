import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventoTeclado extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PaintPanel panel_2;
	private int x=200, y=200;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

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
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				 x=200;
				 y=200;
				 panel_2.requestFocusInWindow();
				 panel_2.repaint();
			}
		});
		panel.add(btnNewButton);
		
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
            g2.fillRect(x, y, 30, 30);
            
        }
    }
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	    int alturaCubo = 30;
	    int anchoCubo = 30;
	    int movimiento = 5;

	    if (e.getKeyCode() == 87 && y - movimiento >= 0) { 
	        y -= 5;
	    }
	    if (e.getKeyCode() == 83 && y + alturaCubo + movimiento <= panel_2.getHeight()) { 
	        y += 5;
	    }
	    if (e.getKeyCode() == 65 && x - movimiento >= 0) { 
	        x -= 5;
	    }
	    if (e.getKeyCode() == 68 && x + anchoCubo + movimiento <= panel_2.getWidth()) {
	        x += 5;
	    }

	    panel_2.repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class JuegoGato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 Boolean turno = true;
	 JButton btnNewButton;
	 JButton btnNewButton_1;
	 JButton btnNewButton_2;
	 JButton btnNewButton_3;
	 JButton btnNewButton_4;
	 JButton btnNewButton_5;
	 JButton btnNewButton_6;
	 JButton btnNewButton_7;
	 JButton btnNewButton_8;
	 JButton reiniciar;
	 int puntajeX;
	 int puntajeO;
	 JLabel marcadorX;
	 JLabel marcadorO;
	 private JPanel panel;
	 private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoGato frame = new JuegoGato();
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
	public JuegoGato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBounds(5, 53, 576, 395);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(-12, 447, 598, 56);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		reiniciar = new JButton("Reiniciar Tablero");
		reiniciar.setBounds(210, 5, 200, 40);
		    reiniciar.setFont(new Font("Arial", Font.BOLD, 16));
		    panel_1.add(reiniciar);
		    reiniciar.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            reiniciarTablero();
		        }
		    });
		
		btnNewButton = new JButton("");
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton.setText(player);
				btnNewButton.setDisabledIcon(null);
				verificar();
			}
		});
		
		btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_1.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_1.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_1.setText(player);
				btnNewButton_1.setDisabledIcon(null);
				verificar();
			}
		});
		
		btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_2.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_2.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_2.setText(player);
				btnNewButton_2.setDisabledIcon(null);
				verificar();

			}
		});
		
		btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_3.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_3.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_3.setText(player);
				btnNewButton_3.setDisabledIcon(null);
				verificar();
			}
		});
		
		btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_4.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_4.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_4.setText(player);
				btnNewButton_4.setDisabledIcon(null);
				verificar();
			}
		});
		
		btnNewButton_5 = new JButton("");
		panel.add(btnNewButton_5);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_5.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_5.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_5.setText(player);
				btnNewButton_5.setDisabledIcon(null);
				verificar();
			}
		});
		
		btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_6.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_6.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_6.setText(player);
				btnNewButton_6.setDisabledIcon(null);
				verificar();
			}
		});
		
		btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_7.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_7.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_7.setText(player);
				btnNewButton_7.setDisabledIcon(null);
				verificar();
			}
		});
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 192, 203));
		panel_2.setBounds(5, 10, 576, 45);
		contentPane.add(panel_2);

		marcadorX = new JLabel("Jugador X: 0");
	    marcadorX.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_2.add(marcadorX);

	    marcadorO = new JLabel("Jugador O: 0");
	    marcadorO.setFont(new Font("Tahoma", Font.BOLD, 14));
	    panel_2.add(marcadorO);
	
	    btnNewButton_8 = new JButton("");
	    panel.add(btnNewButton_8);
	    btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 0));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
					btnNewButton_8.setIcon(new ImageIcon("imagenes/goku.png"));
				}else {
					turno=true;
					player=("O");
					btnNewButton_8.setIcon(new ImageIcon("imagenes/vegeta1.png"));
				}
				btnNewButton_8.setText(player);
				btnNewButton_8.setDisabledIcon(null);
				verificar();
			}
		});
	}
	//Verificaciones
	public void verificar() {
	    if (!btnNewButton.getText().equals("") &&
	        btnNewButton.getText().equals(btnNewButton_1.getText()) &&
	        btnNewButton_1.getText().equals(btnNewButton_2.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton.getText());
	        actualizarMarcador(btnNewButton.getText());
	        quitarBotones();

	    }
	    if (!btnNewButton_3.getText().equals("") &&
	        btnNewButton_3.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_5.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_3.getText());
	        actualizarMarcador(btnNewButton_3.getText());
	        quitarBotones();

	    }
	    if (!btnNewButton_6.getText().equals("") &&
	        btnNewButton_6.getText().equals(btnNewButton_7.getText()) &&
	        btnNewButton_7.getText().equals(btnNewButton_8.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_6.getText());
	        actualizarMarcador(btnNewButton_6.getText());
	        quitarBotones();

	    }
	    
	    if (!btnNewButton.getText().equals("") &&
	        btnNewButton.getText().equals(btnNewButton_3.getText()) &&
	        btnNewButton_3.getText().equals(btnNewButton_6.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton.getText());
	        actualizarMarcador(btnNewButton.getText());
	        quitarBotones();

	    }
	    if (!btnNewButton_1.getText().equals("") &&
	        btnNewButton_1.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_7.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_1.getText());
	        actualizarMarcador(btnNewButton_1.getText());
	        quitarBotones();

	    }
	    if (!btnNewButton_2.getText().equals("") &&
	        btnNewButton_2.getText().equals(btnNewButton_5.getText()) &&
	        btnNewButton_5.getText().equals(btnNewButton_8.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_2.getText());
	        actualizarMarcador(btnNewButton_2.getText());
	        quitarBotones();

	    }
	    
	    if (!btnNewButton.getText().equals("") &&
	        btnNewButton.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_8.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton.getText());
	        actualizarMarcador(btnNewButton.getText());
	        quitarBotones();

	    }
	    if (!btnNewButton_2.getText().equals("") &&
	        btnNewButton_2.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_6.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_2.getText());
	        actualizarMarcador(btnNewButton_2.getText());
	        quitarBotones();
	    }
	    if (!btnNewButton.getText().isEmpty() &&
	        !btnNewButton_1.getText().isEmpty() &&
	        !btnNewButton_2.getText().isEmpty() &&
	        !btnNewButton_3.getText().isEmpty() &&
            !btnNewButton_4.getText().isEmpty() &&
	        !btnNewButton_5.getText().isEmpty() &&
	        !btnNewButton_6.getText().isEmpty() &&
	        !btnNewButton_7.getText().isEmpty() &&
	        !btnNewButton_8.getText().isEmpty()) {
	            
	            JOptionPane.showMessageDialog(this, "No hay más movimientos posibles.");
	            reiniciarTablero(); 
	        }
	    
	}
	private void quitarBotones() {
		btnNewButton.setEnabled(false);
	    btnNewButton_1.setEnabled(false);
	    btnNewButton_2.setEnabled(false);
	    btnNewButton_3.setEnabled(false);
	    btnNewButton_4.setEnabled(false);
	    btnNewButton_5.setEnabled(false);
	    btnNewButton_6.setEnabled(false);
	    btnNewButton_7.setEnabled(false);
	    btnNewButton_8.setEnabled(false);
	}
	private void reiniciarTablero() {
	    btnNewButton.setText("");
	    btnNewButton.setEnabled(true);
	    btnNewButton.setIcon(null);

	    btnNewButton_1.setText("");
	    btnNewButton_1.setEnabled(true);
	    btnNewButton_1.setIcon(null);

	    btnNewButton_2.setText("");
	    btnNewButton_2.setEnabled(true);
	    btnNewButton_2.setIcon(null);

	    btnNewButton_3.setText("");
	    btnNewButton_3.setEnabled(true);
	    btnNewButton_3.setIcon(null);

	    btnNewButton_4.setText("");
	    btnNewButton_4.setEnabled(true);
	    btnNewButton_4.setIcon(null);

	    btnNewButton_5.setText("");
	    btnNewButton_5.setEnabled(true);
	    btnNewButton_5.setIcon(null);

	    btnNewButton_6.setText("");
	    btnNewButton_6.setEnabled(true);
	    btnNewButton_6.setIcon(null);

	    btnNewButton_7.setText("");
	    btnNewButton_7.setEnabled(true);
	    btnNewButton_7.setIcon(null);

	    btnNewButton_8.setText("");
	    btnNewButton_8.setEnabled(true);
	    btnNewButton_8.setIcon(null);

	    turno = true;
	}
	
	private void actualizarMarcador(String ganador) {
	    if (ganador.equals("X")) {
	        puntajeX++;
	        marcadorX.setText("Jugador X: " + puntajeX);
	    } else if (ganador.equals("O")) {
	        puntajeO++;
	        marcadorO.setText("Jugador O: " + puntajeO);
	    }
	}
}

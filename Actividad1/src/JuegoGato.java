import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

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

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		

		btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
				}else {
					turno=true;
					player=("O");
				}
				btnNewButton.setText(player);
				btnNewButton.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player="X";
				}else {
					turno=true;
					player="O";
				}
				btnNewButton_1.setText(player);
				btnNewButton_1.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player="X";
				}else {
					turno=true;
					player="O";
				}
				btnNewButton_2.setText(player);
				btnNewButton_2.setEnabled(false);
				verificar();

			}
		});
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
				}else {
					turno=true;
					player=("O");
				}
				btnNewButton_3.setText(player);
				btnNewButton_3.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
				}else {
					turno=true;
					player=("O");
				}
				btnNewButton_4.setText(player);
				btnNewButton_4.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
				}else {
					turno=true;
					player=("O");
				}
				btnNewButton_5.setText(player);
				btnNewButton_5.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
				}else {
					turno=true;
					player=("O");
				}
				btnNewButton_6.setText(player);
				btnNewButton_6.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_6);	
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
				}else {
					turno=true;
					player=("O");
				}
				btnNewButton_7.setText(player);
				btnNewButton_7.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player=("X");
				}else {
					turno=true;
					player=("O");
				}
				btnNewButton_8.setText(player);
				btnNewButton_8.setEnabled(false);
				verificar();
			}
		});
		contentPane.add(btnNewButton_8);
	}
	public void verificar() {
	    if (!btnNewButton.getText().equals("") &&
	        btnNewButton.getText().equals(btnNewButton_1.getText()) &&
	        btnNewButton_1.getText().equals(btnNewButton_2.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton.getText());
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
	    if (!btnNewButton_3.getText().equals("") &&
	        btnNewButton_3.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_5.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_3.getText());
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
	    if (!btnNewButton_6.getText().equals("") &&
	        btnNewButton_6.getText().equals(btnNewButton_7.getText()) &&
	        btnNewButton_7.getText().equals(btnNewButton_8.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_6.getText());
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
	    
	    if (!btnNewButton.getText().equals("") &&
	        btnNewButton.getText().equals(btnNewButton_3.getText()) &&
	        btnNewButton_3.getText().equals(btnNewButton_6.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton.getText());
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
	    if (!btnNewButton_1.getText().equals("") &&
	        btnNewButton_1.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_7.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_1.getText());
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
	    if (!btnNewButton_2.getText().equals("") &&
	        btnNewButton_2.getText().equals(btnNewButton_5.getText()) &&
	        btnNewButton_5.getText().equals(btnNewButton_8.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_2.getText());
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
	    
	    if (!btnNewButton.getText().equals("") &&
	        btnNewButton.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_8.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton.getText());
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
	    if (!btnNewButton_2.getText().equals("") &&
	        btnNewButton_2.getText().equals(btnNewButton_4.getText()) &&
	        btnNewButton_4.getText().equals(btnNewButton_6.getText())) {
	        JOptionPane.showMessageDialog(this, "Ganador: " + btnNewButton_2.getText());
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
	    
	    
	}

}

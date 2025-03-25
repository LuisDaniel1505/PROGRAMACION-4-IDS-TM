import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;

public class Puzzle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle frame = new Puzzle();
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
	public Puzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane.setBackground(new Color(87,64,124));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(29, 258, 384, 342);
		panel.setBackground(new Color(87,64,124));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		Image icon = new ImageIcon("Puzzle15/1.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon = new ImageIcon(icon);
		JButton btnNewButton = new JButton(usuarioIcon);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		panel.add(btnNewButton);
		
		Image icon2 = new ImageIcon("Puzzle15/2.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon2 = new ImageIcon(icon2);
		JButton btnNewButton_1 = new JButton(usuarioIcon2);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFocusPainted(false);
		panel.add(btnNewButton_1);
		
		Image icon3 = new ImageIcon("Puzzle15/3.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon3 = new ImageIcon(icon3);
		JButton btnNewButton_2 = new JButton(usuarioIcon3);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setFocusPainted(false);
		panel.add(btnNewButton_2);
		
		Image icon4 = new ImageIcon("Puzzle15/4.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon4 = new ImageIcon(icon4);
		JButton btnNewButton_3 = new JButton(usuarioIcon4);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setFocusPainted(false);
		panel.add(btnNewButton_3);
		
		Image icon5 = new ImageIcon("Puzzle15/5.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon5 = new ImageIcon(icon5);
		JButton btnNewButton_4 = new JButton(usuarioIcon5);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setFocusPainted(false);
		panel.add(btnNewButton_4);
		
		Image icon6 = new ImageIcon("Puzzle15/6.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon6 = new ImageIcon(icon6);
		JButton btnNewButton_5 = new JButton(usuarioIcon6);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setFocusPainted(false);
		panel.add(btnNewButton_5);
		
		Image icon7 = new ImageIcon("Puzzle15/7.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon7 = new ImageIcon(icon7);
		JButton btnNewButton_6 = new JButton(usuarioIcon7);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setFocusPainted(false);
		panel.add(btnNewButton_6);
		
		Image icon8 = new ImageIcon("Puzzle15/8.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon8 = new ImageIcon(icon8);
		JButton btnNewButton_7 = new JButton(usuarioIcon8);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setFocusPainted(false);
		panel.add(btnNewButton_7);
		
		Image icon9 = new ImageIcon("Puzzle15/9.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon9 = new ImageIcon(icon9);
		JButton btnNewButton_8 = new JButton(usuarioIcon9);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setFocusPainted(false);
		panel.add(btnNewButton_8);
		
		Image icon10 = new ImageIcon("Puzzle15/10.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon10 = new ImageIcon(icon10);
		JButton btnNewButton_9 = new JButton(usuarioIcon10);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setFocusPainted(false);
		panel.add(btnNewButton_9);
		
		Image icon11 = new ImageIcon("Puzzle15/11.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon11 = new ImageIcon(icon11);
		JButton btnNewButton_10 = new JButton(usuarioIcon11);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setFocusPainted(false);
		panel.add(btnNewButton_10);
		
		Image icon12 = new ImageIcon("Puzzle15/12.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon12 = new ImageIcon(icon12);
		JButton btnNewButton_11 = new JButton(usuarioIcon12);
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setContentAreaFilled(false);
		btnNewButton_11.setFocusPainted(false);
		panel.add(btnNewButton_11);
		
		Image icon13 = new ImageIcon("Puzzle15/13.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon13 = new ImageIcon(icon13);
		JButton btnNewButton_12 = new JButton(usuarioIcon13);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setContentAreaFilled(false);
		btnNewButton_12.setFocusPainted(false);
		panel.add(btnNewButton_12);
		
		Image icon14 = new ImageIcon("Puzzle15/14.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon14 = new ImageIcon(icon14);
		JButton btnNewButton_13 = new JButton(usuarioIcon14);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setContentAreaFilled(false);
		btnNewButton_13.setFocusPainted(false);
		panel.add(btnNewButton_13);
		
		Image icon15 = new ImageIcon("Puzzle15/15.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon15 = new ImageIcon(icon15);
		JButton btnNewButton_14 = new JButton(usuarioIcon15);
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setContentAreaFilled(false);
		btnNewButton_14.setFocusPainted(false);
		panel.add(btnNewButton_14);

		Image icon0 = new ImageIcon("Puzzle15/0.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon0 = new ImageIcon(icon0);
		JButton btnNewButton_15 = new JButton(usuarioIcon0);
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setContentAreaFilled(false);
		btnNewButton_15.setFocusPainted(false);
		panel.add(btnNewButton_15);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 426, 253);
		panel_1.setBackground(new Color(87,64,124));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Puzzle\r\n");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 90));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(66, 81, 309, 106);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("15");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Maiandra GD", Font.PLAIN, 99));
		lblNewLabel_1.setBounds(157, 0, 108, 131);
		panel_1.add(lblNewLabel_1);
		
		Image iconR = new ImageIcon("Puzzle15/reiniciar.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
		ImageIcon usuarioIconR = new ImageIcon(iconR);
		JButton btnNewButton_16 = new JButton(usuarioIconR);
		btnNewButton_16.setBounds(0, 185, 161, 57);
		btnNewButton_16.setBorderPainted(false);
		btnNewButton_16.setContentAreaFilled(false);
		btnNewButton_16.setFocusPainted(false);
		panel_1.add(btnNewButton_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 601, 426, 60);
		panel_2.setBackground(new Color(87,64,124));
		contentPane.add(panel_2);
	}
}

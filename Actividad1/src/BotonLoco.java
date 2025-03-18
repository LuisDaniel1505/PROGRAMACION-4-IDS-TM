import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotonLoco extends JFrame{
	
	private Random rand = new Random(); 
	
	public BotonLoco (String title) {
	this.setTitle("Calculadora");
	this.setVisible(true);
	this.setSize(400, 550);
	
	this.setResizable(false);
	this.setLayout(null);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setLocationRelativeTo(null);
	
	this.add(this.botonLoco());
	this.repaint();
	
	//this.add(this.numeros());
	this.repaint();
	}
	
	public JPanel botonLoco() {
		
		JPanel registro = new JPanel();
		registro.setLocation(0,0);
		registro.setOpaque(true);
		registro.setSize(400,600);
		registro.setBackground(new Color(235, 235, 235));
		registro.setVisible(true);
		registro.setLayout(null);
		getContentPane().add(registro);
		
		JButton acceso2 = new JButton("Click aqui");
		acceso2.setSize(150, 40);
		acceso2.setLocation(40,100);
		acceso2.setHorizontalAlignment(JLabel.CENTER);
		acceso2.setBackground(new Color(15, 62, 234));
		Font fuente3 = new Font("arial", 40, 20);
		acceso2.setFont(fuente3); 
		acceso2.setForeground(Color.WHITE);
		registro.add(acceso2);
		
		acceso2.addActionListener(new ActionListener() {
    		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton random = new JButton("Click aquí");
                
                int width = 50 + rand.nextInt(100);  
                int height = 30 + rand.nextInt(50);  
                int x = rand.nextInt(250);          
                int y = rand.nextInt(400);
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                
                Color randomColor = new Color(r, g, b);
                
                random.setSize(width, height);
                random.setLocation(x, y);
                random.setHorizontalAlignment(JLabel.CENTER);
                random.setBackground(new Color(r, g, b));
                random.setFont(new Font("Arial", Font.BOLD, 14)); 
                random.setForeground(Color.WHITE);

                random.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Color: " + randomColor.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
                    }
                });

                registro.add(random);
                registro.revalidate();
                registro.repaint();
                registro.add(random);
                registro.revalidate();
                registro.repaint();
				}
			});
		
		return registro;

		
	}
}

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Ventana extends JFrame {

	public Ventana (String title) {
		
		this.setTitle("Login");
		this.setVisible(true);
		this.setSize(500, 500);
		
		this.setResizable(false);
		this.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(100, 100);
		etiqueta1.setLocation(20, 40);
		etiqueta1.setBackground(Color.GREEN);
		
		this.add(etiqueta1);
		
	}
}

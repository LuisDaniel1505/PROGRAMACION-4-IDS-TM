import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Paint extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Paint frame = new Paint();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Paint() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(245, 245, 220));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelHerramientas = new JPanel();
        panelHerramientas.setBounds(5, 6, 200, 650);
        panelHerramientas.setBorder(BorderFactory.createTitledBorder("Herramientas"));
        panelHerramientas.setLayout(new GridLayout(0, 1, 5, 5));

        JLabel lblHerramientasDibujo = new JLabel("Herramientas de Dibujo:");
        panelHerramientas.add(lblHerramientasDibujo);

        JButton btnPincel = new JButton("Pincel");
        panelHerramientas.add(btnPincel);

        JButton btnBrocha = new JButton("Brocha");
        panelHerramientas.add(btnBrocha);

        JButton btnLapiz = new JButton("Lápiz");
        panelHerramientas.add(btnLapiz);

        JButton btnBorrador = new JButton("Borrador");
        panelHerramientas.add(btnBorrador);

        JButton btnLineaRecta = new JButton("Línea Recta");
        panelHerramientas.add(btnLineaRecta);

        JButton btnLineaManoAlzada = new JButton("Línea a Mano Alzada");
        panelHerramientas.add(btnLineaManoAlzada);

        JLabel lblFormas = new JLabel("Formas Geométricas:");
        panelHerramientas.add(lblFormas);

        JButton btnRectangulo = new JButton("Rectángulo");
        panelHerramientas.add(btnRectangulo);

        JButton btnCirculo = new JButton("Círculo");
        panelHerramientas.add(btnCirculo);

        JButton btnOvalo = new JButton("Óvalo");
        panelHerramientas.add(btnOvalo);

        JButton btnTriangulo = new JButton("Triángulo");
        panelHerramientas.add(btnTriangulo);

        JButton btnLinea = new JButton("Línea");
        panelHerramientas.add(btnLinea);

        JButton btnPoligono = new JButton("Polígono");
        panelHerramientas.add(btnPoligono);

        JLabel grozorTrazo = new JLabel("Grosor de Trazo:");
        panelHerramientas.add(grozorTrazo);

        JSlider grozor = new JSlider(1, 50, 10);
        grozor.setMajorTickSpacing(10);
        panelHerramientas.add(grozor);

        JButton btnLimpiar = new JButton("Limpiar Lienzo");
        btnLimpiar.setBackground(Color.RED);
        btnLimpiar.setForeground(Color.WHITE);
        panelHerramientas.add(btnLimpiar);

        contentPane.add(panelHerramientas);

        JPanel panelColores = new JPanel();
        panelColores.setBounds(210, 6, 770, 100);
        panelColores.setBorder(BorderFactory.createTitledBorder("Paleta de Colores"));
        panelColores.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JButton btnNegro = new JButton();
        btnNegro.setBackground(Color.BLACK);
        btnNegro.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnNegro);

        JButton btnBlanco = new JButton();
        btnBlanco.setBackground(Color.WHITE);
        btnBlanco.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnBlanco);

        JButton btnRojo = new JButton();
        btnRojo.setBackground(Color.RED);
        btnRojo.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnRojo);

        JButton btnVerde = new JButton();
        btnVerde.setBackground(Color.GREEN);
        btnVerde.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnVerde);

        JButton btnAzul = new JButton();
        btnAzul.setBackground(Color.BLUE);
        btnAzul.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnAzul);

        JButton btnAmarillo = new JButton();
        btnAmarillo.setBackground(Color.YELLOW);
        btnAmarillo.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnAmarillo);

        JButton btnNaranja = new JButton();
        btnNaranja.setBackground(Color.ORANGE);
        btnNaranja.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnNaranja);

        JButton btnRosa = new JButton();
        btnRosa.setBackground(Color.PINK);
        btnRosa.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnRosa);

        JButton btnCian = new JButton();
        btnCian.setBackground(Color.CYAN);
        btnCian.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnCian);

        JButton btnMagenta = new JButton();
        btnMagenta.setBackground(Color.MAGENTA);
        btnMagenta.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnMagenta);

        JButton btnGrisOscuro = new JButton();
        btnGrisOscuro.setBackground(Color.DARK_GRAY);
        btnGrisOscuro.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnGrisOscuro);

        JButton btnGrisClaro = new JButton();
        btnGrisClaro.setBackground(Color.LIGHT_GRAY);
        btnGrisClaro.setPreferredSize(new Dimension(40, 40));
        panelColores.add(btnGrisClaro);

        JButton btnColorPersonalizado = new JButton("Color Personalizado");
        btnColorPersonalizado.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JColorChooser colorChooser = new JColorChooser();
                int resultado = JOptionPane.showConfirmDialog(null, colorChooser, "Selecciona un color", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        	}
        });
        panelColores.add(btnColorPersonalizado);
        contentPane.add(panelColores);

        JPanel panelDibujo = new JPanel();
        panelDibujo.setBounds(210, 110, 770, 540);
        panelDibujo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panelDibujo.setBackground(Color.WHITE);
        contentPane.add(panelDibujo);
    }
}
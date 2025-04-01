import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Paint extends JFrame implements MouseListener, MouseMotionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private PaintPanel panelDibujo;

    private ArrayList<Point> puntos = new ArrayList<Point>();
    private List<List<Point>> ListaDePuntos = new ArrayList<>();
    private List<Color> listaColores = new ArrayList<>();
    private List<Integer> listaGrosor = new ArrayList<>();

    private int grosorActual = 10;
    private Color colorActual = Color.BLACK;
    
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
        
        JLabel grosorTrazo = new JLabel("Grosor de Trazo:");
        panelHerramientas.add(grosorTrazo);
        
        JSlider grosor = new JSlider(1, 50, 10);
        grosor.setMajorTickSpacing(10);
        grosor.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                grosorActual = grosor.getValue();
                panelDibujo.repaint();
            }
        });
        panelHerramientas.add(grosor);
        
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
        btnNegro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnNegro.getBackground();
            }
        });
        panelColores.add(btnNegro);
        
        JButton btnBlanco = new JButton();
        btnBlanco.setBackground(Color.WHITE);
        btnBlanco.setPreferredSize(new Dimension(40, 40));
        btnBlanco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnBlanco.getBackground();
            }
        });
        panelColores.add(btnBlanco);
        
        JButton btnRojo = new JButton();
        btnRojo.setBackground(Color.RED);
        btnRojo.setPreferredSize(new Dimension(40, 40));
        btnRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnRojo.getBackground();
            }
        });
        panelColores.add(btnRojo);
        
        JButton btnVerde = new JButton();
        btnVerde.setBackground(Color.GREEN);
        btnVerde.setPreferredSize(new Dimension(40, 40));
        btnVerde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnVerde.getBackground();
            }
        });
        panelColores.add(btnVerde);
        
        JButton btnAzul = new JButton();
        btnAzul.setBackground(Color.BLUE);
        btnAzul.setPreferredSize(new Dimension(40, 40));
        btnAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnAzul.getBackground();
            }
        });
        panelColores.add(btnAzul);
        
        JButton btnAmarillo = new JButton();
        btnAmarillo.setBackground(Color.YELLOW);
        btnAmarillo.setPreferredSize(new Dimension(40, 40));
        btnAmarillo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnAmarillo.getBackground();
            }
        });
        panelColores.add(btnAmarillo);
        
        JButton btnNaranja = new JButton();
        btnNaranja.setBackground(Color.ORANGE);
        btnNaranja.setPreferredSize(new Dimension(40, 40));
        btnNaranja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnNaranja.getBackground();
            }
        });
        panelColores.add(btnNaranja);
        
        JButton btnRosa = new JButton();
        btnRosa.setBackground(Color.PINK);
        btnRosa.setPreferredSize(new Dimension(40, 40));
        btnRosa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnRosa.getBackground();
            }
        });
        panelColores.add(btnRosa);
        
        JButton btnCian = new JButton();
        btnCian.setBackground(Color.CYAN);
        btnCian.setPreferredSize(new Dimension(40, 40));
        btnCian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnCian.getBackground();
            }
        });
        panelColores.add(btnCian);
        
        JButton btnMagenta = new JButton();
        btnMagenta.setBackground(Color.MAGENTA);
        btnMagenta.setPreferredSize(new Dimension(40, 40));
        btnMagenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnMagenta.getBackground();
            }
        });
        panelColores.add(btnMagenta);
        
        JButton btnGrisOscuro = new JButton();
        btnGrisOscuro.setBackground(Color.DARK_GRAY);
        btnGrisOscuro.setPreferredSize(new Dimension(40, 40));
        btnGrisOscuro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnGrisOscuro.getBackground();
            }
        });
        panelColores.add(btnGrisOscuro);
        
        JButton btnGrisClaro = new JButton();
        btnGrisClaro.setBackground(Color.LIGHT_GRAY);
        btnGrisClaro.setPreferredSize(new Dimension(40, 40));
        btnGrisClaro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnGrisClaro.getBackground();
            }
        });
        panelColores.add(btnGrisClaro);
        
        JButton btnColorPersonalizado = new JButton("Color Personalizado");
        btnColorPersonalizado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JColorChooser colorChooser = new JColorChooser();
                int resultado = JOptionPane.showConfirmDialog(null, colorChooser, "Selecciona un color", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (resultado == JOptionPane.OK_OPTION) {
                    colorActual = colorChooser.getColor();
                }
            }
        });
        panelColores.add(btnColorPersonalizado);
        contentPane.add(panelColores);
        
        panelDibujo = new PaintPanel();
        panelDibujo.setBounds(210, 110, 770, 540);
        panelDibujo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panelDibujo.setBackground(Color.WHITE);
        contentPane.add(panelDibujo);
        panelDibujo.addMouseMotionListener(this);
        panelDibujo.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {

    }
    
    @Override
    public void mousePressed(MouseEvent e) {

    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        ArrayList<Point> trazoActual = (ArrayList<Point>) puntos.clone();
        ListaDePuntos.add(trazoActual);
        listaColores.add(colorActual);   
        listaGrosor.add(grosorActual); 
        puntos.clear();
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    
    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        puntos.add(e.getPoint());
        panelDibujo.repaint();
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {

    }
    
    class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.WHITE);
        }
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            
            int aux = 0;
            for (Iterator<List<Point>> iterator = ListaDePuntos.iterator(); iterator.hasNext();) {
                List<Point> trazo = iterator.next();
                if (trazo.size() > 1) {
                    g2.setColor(listaColores.get(aux));            
                    g2.setStroke(new BasicStroke(listaGrosor.get(aux)));
                    for (int i = 1; i < trazo.size(); i++) {
                        Point p1 = trazo.get(i - 1);
                        Point p2 = trazo.get(i);
                        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
                aux++;
            }

            if (puntos.size() > 1) {
                g2.setColor(colorActual);
                g2.setStroke(new BasicStroke(grosorActual));
                for (int i = 1; i < puntos.size(); i++) {
                    Point p1 = puntos.get(i - 1);
                    Point p2 = puntos.get(i);
                    g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }
    }
}

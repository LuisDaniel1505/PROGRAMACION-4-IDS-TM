import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class Paint extends JFrame implements MouseListener, MouseMotionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private PaintPanel panelDibujo;
    public static Color colorActual = Color.BLACK;
    public static int grosorActual = 10;
    private int tool = 1;
    private int xInicio, yInicio, xFin, yFin;
    

    private ArrayList<MyPoint> puntos = new ArrayList<MyPoint>();
    private ArrayList<Figura> figuras = new ArrayList<Figura>();
    private List<List<MyPoint>> ListaDePuntos = new ArrayList<>();

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
        btnPincel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tool = 1;
            }
        });

        JButton btnBrocha = new JButton("Brocha");
        panelHerramientas.add(btnBrocha);

        JButton btnLapiz = new JButton("Lápiz");
        panelHerramientas.add(btnLapiz);

        JButton btnBorrador = new JButton("Borrador");
        panelHerramientas.add(btnBorrador);
        btnBorrador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = Color.WHITE;
            }
        });

        JButton btnLineaRecta = new JButton("Línea Recta");
        panelHerramientas.add(btnLineaRecta);

        JButton btnLineaManoAlzada = new JButton("Línea a Mano Alzada");
        panelHerramientas.add(btnLineaManoAlzada);

        JLabel lblFormas = new JLabel("Formas Geométricas:");
        panelHerramientas.add(lblFormas);

        JButton btnRectangulo = new JButton("Rectángulo");
        panelHerramientas.add(btnRectangulo);
        btnRectangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tool = 2;
            }
        });

        JButton btnCirculo = new JButton("Círculo");
        panelHerramientas.add(btnCirculo);
        btnCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tool = 3;
            }
        });

        JButton btnOvalo = new JButton("Óvalo");
        panelHerramientas.add(btnOvalo);

        JButton btnTriangulo = new JButton("Triángulo");
        panelHerramientas.add(btnTriangulo);

        JButton btnLinea = new JButton("Línea");
        panelHerramientas.add(btnLinea);    
        btnLinea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tool = 6;
            }
        });

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
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	panelDibujo.removeAll();
            	puntos.clear();
            	figuras.clear();
            	ListaDePuntos.clear();
                panelDibujo.revalidate();
                panelDibujo.repaint();
            }
        });
        panelHerramientas.add(btnLimpiar);

        contentPane.add(panelHerramientas);

        JPanel panelColores = new JPanel();
        panelColores.setBounds(210, 6, 770, 100);
        panelColores.setBorder(BorderFactory.createTitledBorder("Paleta de Colores"));

        JButton btnNegro = new JButton();
        btnNegro.setBounds(16, 31, 33, 32);
        btnNegro.setBackground(Color.BLACK);
        btnNegro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               colorActual = btnNegro.getBackground();
            }
        });
        panelColores.setLayout(null);
        panelColores.add(btnNegro);

        JButton btnBlanco = new JButton();
        btnBlanco.setBounds(59, 31, 33, 32);
        btnBlanco.setBackground(Color.WHITE);
        btnBlanco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnBlanco.getBackground();
            }
        });
        panelColores.add(btnBlanco);

        JButton btnRojo = new JButton();
        btnRojo.setBounds(102, 31, 33, 32);
        btnRojo.setBackground(Color.RED);
        btnRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnRojo.getBackground();
            }
        });
        panelColores.add(btnRojo);

        JButton btnVerde = new JButton();
        btnVerde.setBounds(145, 31, 33, 32);
        btnVerde.setBackground(Color.GREEN);
        btnVerde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnVerde.getBackground();
            }
        });
        panelColores.add(btnVerde);

        JButton btnAzul = new JButton();
        btnAzul.setBounds(188, 31, 33, 32);
        btnAzul.setBackground(Color.BLUE);
        btnAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnAzul.getBackground();
            }
        });
        panelColores.add(btnAzul);

        JButton btnAmarillo = new JButton();
        btnAmarillo.setBounds(231, 31, 33, 32);
        btnAmarillo.setBackground(Color.YELLOW);
        btnAmarillo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnAmarillo.getBackground();
            }
        });
        panelColores.add(btnAmarillo);

        JButton btnNaranja = new JButton();
        btnNaranja.setBounds(274, 31, 33, 32);
        btnNaranja.setBackground(Color.ORANGE);
        btnNaranja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnNaranja.getBackground();
            }
        });
        panelColores.add(btnNaranja);

        JButton btnRosa = new JButton();
        btnRosa.setBounds(317, 31, 33, 32);
        btnRosa.setBackground(Color.PINK);
        btnRosa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnRosa.getBackground();
            }
        });
        panelColores.add(btnRosa);

        JButton btnCian = new JButton();
        btnCian.setBounds(360, 31, 33, 32);
        btnCian.setBackground(Color.CYAN);
        btnCian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnCian.getBackground();
            }
        });
        panelColores.add(btnCian);

        JButton btnMagenta = new JButton();
        btnMagenta.setBounds(403, 31, 33, 32);
        btnMagenta.setBackground(Color.MAGENTA);
        btnMagenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnMagenta.getBackground();
            }
        });
        panelColores.add(btnMagenta);

        JButton btnGrisOscuro = new JButton();
        btnGrisOscuro.setBounds(446, 31, 33, 32);
        btnGrisOscuro.setBackground(Color.DARK_GRAY);
        btnGrisOscuro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnGrisOscuro.getBackground();
            }
        });
        panelColores.add(btnGrisOscuro);

        JButton btnGrisClaro = new JButton();
        btnGrisClaro.setBounds(489, 31, 33, 32);
        btnGrisClaro.setBackground(Color.LIGHT_GRAY);
        btnGrisClaro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorActual = btnGrisClaro.getBackground();
            }
        });
        panelColores.add(btnGrisClaro);

        JButton btnColorPersonalizado = new JButton("Color Personalizado");
        btnColorPersonalizado.setBounds(532, 31, 158, 32);
        btnColorPersonalizado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JColorChooser colorChooser = new JColorChooser();
                int resultado = JOptionPane.showConfirmDialog(null, colorChooser, "Selecciona un color", JOptionPane.OK_CANCEL_OPTION);
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
            String tipoFigura = "";
            if (tool == 2) {
                tipoFigura = "Rectangulo";
            } else if (tool == 3) {
                tipoFigura = "Circulo";
            }
            
            Figura f = new Figura(e.getX(), e.getY(), 80, 80, colorActual, grosorActual, tipoFigura);
            figuras.add(f);
            panelDibujo.repaint();
        }
    
    @Override
    public void mousePressed(MouseEvent e) {
    	if (tool == 6) {
            xInicio = e.getX();
            yInicio = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ArrayList<MyPoint> trazoActual = new ArrayList<>(puntos);
        ListaDePuntos.add(trazoActual);
        puntos.clear();
        if (tool == 6) {
            xFin = e.getX();
            yFin = e.getY();
            figuras.add(new Figura(xInicio, yInicio, xFin, yFin, colorActual, grosorActual, "Linea"));
            panelDibujo.repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {  
    	
    }

    @Override
    public void mouseExited(MouseEvent e) { 
    	
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (tool == 1) {
            puntos.add(new MyPoint(e.getX(), e.getY(), colorActual, grosorActual));
            panelDibujo.repaint();
        }
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

            for (int i = 0; i < ListaDePuntos.size(); i++) {
                List<MyPoint> trazo = ListaDePuntos.get(i); 
                if (trazo.size() > 1) {
                    for (int j = 1; j < trazo.size(); j++) {
                        MyPoint p1 = trazo.get(j - 1);
                        MyPoint p2 = trazo.get(j);
                        g2.setColor(p1.color);
                        g2.setStroke(new BasicStroke(p1.grosor));
                        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
            }

            if (puntos.size() > 1) {
                for (int i = 1; i < puntos.size(); i++) {
                    MyPoint p1 = puntos.get(i - 1);
                    MyPoint p2 = puntos.get(i);
                    g2.setColor(p1.color);
                    g2.setStroke(new BasicStroke(p1.grosor));
                    g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }

            for (int i = 0; i < figuras.size(); i++) {
                Figura f = figuras.get(i);
                g2.setColor(f.color);
                g2.setStroke(new BasicStroke(f.grosor));

                if (f.tipo.equals("Rectangulo")) {
                    g2.drawRect(f.x, f.y, f.w, f.h);
                } else if (f.tipo.equals("Circulo")) {
                    g2.drawOval(f.x, f.y, f.w, f.h);
                }
                if (f.tipo.equals("Linea")) {
                    g2.drawLine(f.x, f.y, f.w, f.h); 
                }
            }

        }
    }

    class Figura {
        public int x, y, w, h;
        public Color color;
        public int grosor;
        public String tipo;  

        public Figura(int x, int y, int w, int h, Color color, int grosor, String tipo) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.color = color;
            this.grosor = grosor;
            this.tipo = tipo;  
        }
    }


    class MyPoint {
        public int x, y;
        public Color color;
        public int grosor;

        public MyPoint(int x, int y, Color color, int grosor) {
            this.x = x;
            this.y = y;
            this.color = color;
            this.grosor = grosor;
        }
    }
}

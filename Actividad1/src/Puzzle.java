import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;


public class Puzzle extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panel;
    private JButton[] botones = new JButton[16];
    
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
        
        panel = new JPanel();
        panel.setBounds(26, 201, 384, 342);
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
        botones[0] = btnNewButton;
        
        Image icon2 = new ImageIcon("Puzzle15/2.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon2 = new ImageIcon(icon2);
        JButton btnNewButton_1 = new JButton(usuarioIcon2);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setContentAreaFilled(false);
        btnNewButton_1.setFocusPainted(false);
        panel.add(btnNewButton_1);
        botones[1] = btnNewButton_1;
        
        Image icon3 = new ImageIcon("Puzzle15/3.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon3 = new ImageIcon(icon3);
        JButton btnNewButton_2 = new JButton(usuarioIcon3);
        btnNewButton_2.setBorderPainted(false);
        btnNewButton_2.setContentAreaFilled(false);
        btnNewButton_2.setFocusPainted(false);
        panel.add(btnNewButton_2);
        botones[2] = btnNewButton_2;
        
        Image icon4 = new ImageIcon("Puzzle15/4.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon4 = new ImageIcon(icon4);
        JButton btnNewButton_3 = new JButton(usuarioIcon4);
        btnNewButton_3.setBorderPainted(false);
        btnNewButton_3.setContentAreaFilled(false);
        btnNewButton_3.setFocusPainted(false);
        panel.add(btnNewButton_3);
        botones[3] = btnNewButton_3;
        
        Image icon5 = new ImageIcon("Puzzle15/5.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon5 = new ImageIcon(icon5);
        JButton btnNewButton_4 = new JButton(usuarioIcon5);
        btnNewButton_4.setBorderPainted(false);
        btnNewButton_4.setContentAreaFilled(false);
        btnNewButton_4.setFocusPainted(false);
        panel.add(btnNewButton_4);
        botones[4] = btnNewButton_4;
        
        Image icon6 = new ImageIcon("Puzzle15/6.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon6 = new ImageIcon(icon6);
        JButton btnNewButton_5 = new JButton(usuarioIcon6);
        btnNewButton_5.setBorderPainted(false);
        btnNewButton_5.setContentAreaFilled(false);
        btnNewButton_5.setFocusPainted(false);
        panel.add(btnNewButton_5);
        botones[5] = btnNewButton_5;
        
        Image icon7 = new ImageIcon("Puzzle15/7.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon7 = new ImageIcon(icon7);
        JButton btnNewButton_6 = new JButton(usuarioIcon7);
        btnNewButton_6.setBorderPainted(false);
        btnNewButton_6.setContentAreaFilled(false);
        btnNewButton_6.setFocusPainted(false);
        panel.add(btnNewButton_6);
        botones[6] = btnNewButton_6;
        
        Image icon8 = new ImageIcon("Puzzle15/8.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon8 = new ImageIcon(icon8);
        JButton btnNewButton_7 = new JButton(usuarioIcon8);
        btnNewButton_7.setBorderPainted(false);
        btnNewButton_7.setContentAreaFilled(false);
        btnNewButton_7.setFocusPainted(false);
        panel.add(btnNewButton_7);
        botones[7] = btnNewButton_7;
        
        Image icon9 = new ImageIcon("Puzzle15/9.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon9 = new ImageIcon(icon9);
        JButton btnNewButton_8 = new JButton(usuarioIcon9);
        btnNewButton_8.setBorderPainted(false);
        btnNewButton_8.setContentAreaFilled(false);
        btnNewButton_8.setFocusPainted(false);
        panel.add(btnNewButton_8);
        botones[8] = btnNewButton_8;
        
        Image icon10 = new ImageIcon("Puzzle15/10.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon10 = new ImageIcon(icon10);
        JButton btnNewButton_9 = new JButton(usuarioIcon10);
        btnNewButton_9.setBorderPainted(false);
        btnNewButton_9.setContentAreaFilled(false);
        btnNewButton_9.setFocusPainted(false);
        panel.add(btnNewButton_9);
        botones[9] = btnNewButton_9;
        
        Image icon11 = new ImageIcon("Puzzle15/11.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon11 = new ImageIcon(icon11);
        JButton btnNewButton_10 = new JButton(usuarioIcon11);
        btnNewButton_10.setBorderPainted(false);
        btnNewButton_10.setContentAreaFilled(false);
        btnNewButton_10.setFocusPainted(false);
        panel.add(btnNewButton_10);
        botones[10] = btnNewButton_10;
        
        Image icon12 = new ImageIcon("Puzzle15/12.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon12 = new ImageIcon(icon12);
        JButton btnNewButton_11 = new JButton(usuarioIcon12);
        btnNewButton_11.setBorderPainted(false);
        btnNewButton_11.setContentAreaFilled(false);
        btnNewButton_11.setFocusPainted(false);
        panel.add(btnNewButton_11);
        botones[11] = btnNewButton_11;
        
        Image icon13 = new ImageIcon("Puzzle15/13.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon13 = new ImageIcon(icon13);
        JButton btnNewButton_12 = new JButton(usuarioIcon13);
        btnNewButton_12.setBorderPainted(false);
        btnNewButton_12.setContentAreaFilled(false);
        btnNewButton_12.setFocusPainted(false);
        panel.add(btnNewButton_12);
        botones[12] = btnNewButton_12;
        
        Image icon14 = new ImageIcon("Puzzle15/14.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon14 = new ImageIcon(icon14);
        JButton btnNewButton_13 = new JButton(usuarioIcon14);
        btnNewButton_13.setBorderPainted(false);
        btnNewButton_13.setContentAreaFilled(false);
        btnNewButton_13.setFocusPainted(false);
        panel.add(btnNewButton_13);
        botones[13] = btnNewButton_13;
        
        Image icon15 = new ImageIcon("Puzzle15/15.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon15 = new ImageIcon(icon15);
        JButton btnNewButton_14 = new JButton(usuarioIcon15);
        btnNewButton_14.setBorderPainted(false);
        btnNewButton_14.setContentAreaFilled(false);
        btnNewButton_14.setFocusPainted(false);
        panel.add(btnNewButton_14);
        botones[14] = btnNewButton_14;

        Image icon0 = new ImageIcon("Puzzle15/0.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIcon0 = new ImageIcon(icon0);
        JButton btnNewButton_15 = new JButton(usuarioIcon0);
        btnNewButton_15.setBorderPainted(false);
        btnNewButton_15.setContentAreaFilled(false);
        btnNewButton_15.setFocusPainted(false);
        panel.add(btnNewButton_15);
        botones[15] = btnNewButton_15;
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(5, 5, 426, 197);
        panel_1.setBackground(new Color(87,64,124));
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Puzzle");
        lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 70));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(145, 22, 309, 106);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("15");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Maiandra GD", Font.PLAIN, 70));
        lblNewLabel_1.setBounds(60, 32, 108, 86);
        panel_1.add(lblNewLabel_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(5, 543, 426, 118);
        panel_2.setBackground(new Color(87,64,124));
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        Cronometro cronometro = new Cronometro();
        cronometro.setBounds(41, 0, 342, 118);
        panel_2.add(cronometro);
        
        Image iconR = new ImageIcon("Puzzle15/reiniciar.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        ImageIcon usuarioIconR = new ImageIcon(iconR);
        JButton btnNewButton_16 = new JButton(usuarioIconR);
        btnNewButton_16.setBounds(-6, 129, 161, 57);
        btnNewButton_16.setBorderPainted(false);
        btnNewButton_16.setContentAreaFilled(false);
        btnNewButton_16.setFocusPainted(false);
        panel_1.add(btnNewButton_16);
        btnNewButton_16.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		barajarTablero();
        		cronometro.reiniciarCronometro();
        	}
        });
 
        
        
        
        botones[0].putClientProperty("id", "1");
        botones[1].putClientProperty("id", "2");
        botones[2].putClientProperty("id", "3");
        botones[3].putClientProperty("id", "4");
        botones[4].putClientProperty("id", "5");
        botones[5].putClientProperty("id", "6");
        botones[6].putClientProperty("id", "7");
        botones[7].putClientProperty("id", "8");
        botones[8].putClientProperty("id", "9");
        botones[9].putClientProperty("id", "10");
        botones[10].putClientProperty("id", "11");
        botones[11].putClientProperty("id", "12");
        botones[12].putClientProperty("id", "13");
        botones[13].putClientProperty("id", "14");
        botones[14].putClientProperty("id", "15");
        botones[15].putClientProperty("id", "0"); 

        for (int i = 0; i < botones.length; i++) {
            botones[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int posBoton = 0;
                    while (posBoton < botones.length && botones[posBoton] != e.getSource()) {
                        posBoton++;
                    }
                    moverBoton(posBoton);
                }
            });
        }
        barajarTablero();
    }
    
    private void barajarTablero() {
        Random random = new Random();
        for (int i = 0; i < botones.length; i++) {
            int j = random.nextInt(botones.length);
            JButton aux = botones[i];
            botones[i] = botones[j];
            botones[j] = aux;
        }
        panel.removeAll();
        for (int i = 0; i < botones.length; i++) {
            panel.add(botones[i]);
        }
        panel.revalidate();
        panel.repaint();
    }

    private void moverBoton(int movimiento) {
        if (movimiento >= 0) {
            int fila = movimiento / 4;
            int columna = movimiento % 4;

            if (columna > 0 && botones[movimiento - 1].getClientProperty("id").equals("0")) {
                intercambiar(movimiento, movimiento - 1);
            } else if (columna < 3 && botones[movimiento + 1].getClientProperty("id").equals("0")) {
                intercambiar(movimiento, movimiento + 1);
            } else if (fila > 0 && botones[movimiento - 4].getClientProperty("id").equals("0")) {
                intercambiar(movimiento, movimiento - 4);
            } else if (fila < 3 && botones[movimiento + 4].getClientProperty("id").equals("0")) {
                intercambiar(movimiento, movimiento + 4);
            }
        }
    }


    
    private void intercambiar(int i, int j) {
        JButton aux = botones[i];
        botones[i] = botones[j];
        botones[j] = aux;
        panel.removeAll();
        for (int k = 0; k < botones.length; k++) {
            panel.add(botones[k]);
        }
        panel.revalidate();
        ganador();
        panel.repaint();
    }
    private void ganador() {
        boolean gano = true;
        for (int i = 0; i < 15; i++) {
            if (!botones[i].getClientProperty("id").equals(String.valueOf(i + 1))) {
                gano = false;
            }
        }
        if (gano && botones[15].getClientProperty("id").equals("0")) {
            JOptionPane.showMessageDialog(null, "¡Ganaste!");
        }
    }

    public void pausar(){
    	for (int k = 0; k < botones.length; k++) {
            botones[k].setEnabled(false);
        }

    }
    public void reanudar() {
    	for (int k = 0; k < botones.length; k++) {
            botones[k].setEnabled(true);
        }
    }
    //Clase para cronometro creditos: https://gist.github.com/jujogracu/3069429
    public class Cronometro extends JPanel implements Runnable, ActionListener {
        private JLabel tiempo;
        private Thread hilo;
        private boolean cronometroActivo;
        private boolean pausar;

        private int minutos = 0, segundos = 0, milesimas = 0;

        public Cronometro() {
            setLayout(null);
            setBackground(new Color(87,64,124));
            setBounds(10, 10, 300, 100); 

            tiempo = new JLabel("00:00:000");
            tiempo.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            tiempo.setForeground(Color.WHITE);
            tiempo.setBounds(110, 10, 440, 50);
            add(tiempo);
 
            Image iconI = new ImageIcon("Puzzle15/iniciar.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
            ImageIcon usuarioIconI = new ImageIcon(iconI);
            JButton btnIniciar = new JButton(usuarioIconI);
            btnIniciar.setBounds(10, 60, 161, 57);
            btnIniciar.setBorderPainted(false);
            btnIniciar.setContentAreaFilled(false);
            btnIniciar.setFocusPainted(false);
            btnIniciar.addActionListener(this);
            btnIniciar.putClientProperty("id", "Iniciar");
            add(btnIniciar);

            Image iconD = new ImageIcon("Puzzle15/detener.png").getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
            ImageIcon usuarioIconD = new ImageIcon(iconD);
            JButton btnDetener = new JButton(usuarioIconD);
            btnDetener.setBounds(180, 60, 161, 57);
            btnDetener.setBorderPainted(false);
            btnDetener.setContentAreaFilled(false);
            btnDetener.setFocusPainted(false);
            btnDetener.addActionListener(this);
            btnDetener.putClientProperty("id", "Detener");
            add(btnDetener);
        }

        public void run() {
            cronometroActivo = true;
            try {
                while (cronometroActivo) {
                    if (!pausar) {
                        Thread.sleep(4);
                        milesimas += 4;
                        if (milesimas >= 1000) {
                            milesimas = 0;
                            segundos++;
                            if (segundos >= 60) {
                                segundos = 0;
                                minutos++;
                            }
                        }
                        String min = (minutos < 10) ? "0" + minutos : String.valueOf(minutos);
                        String seg = (segundos < 10) ? "0" + segundos : String.valueOf(segundos);
                        String mil;
                        if (milesimas < 10)
                            mil = "00" + milesimas;
                        else if (milesimas < 100)
                            mil = "0" + milesimas;
                        else
                            mil = String.valueOf(milesimas);
                        
                        tiempo.setText(min + ":" + seg + ":" + mil);
                    } else {
                        Thread.sleep(10);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Error en el cronómetro: " + e.getMessage());
            }
        }

        public void actionPerformed(ActionEvent evt) {
            JButton btn = (JButton) evt.getSource();
            String command = (String) btn.getClientProperty("id");
            switch (command) {
                case "Iniciar":
                    iniciarCronometro();
                    break;
                case "Reiniciar":
                    reiniciarCronometro();
                    break;
                case "Detener":
                    pararCronometro();
                    break;
            }
        }


        public void iniciarCronometro() {
            if (hilo == null || !hilo.isAlive()) {
                pausar = false;
                cronometroActivo = true;
                hilo = new Thread(this);
                hilo.start();
            } else {
                pausar = false;
                reanudar();

            }
        }

        public void pararCronometro() {
            pausar = true;
            pausar();
            
        }

        public void reiniciarCronometro() {
            cronometroActivo = false;
            pausar = false;
            hilo = null;
            minutos = 0;
            segundos = 0;
            milesimas = 0;
            tiempo.setText("00:00:000");
            reanudar();
        }
    }
}



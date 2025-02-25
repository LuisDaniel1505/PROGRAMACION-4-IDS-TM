import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CampoTextoConPlaceholder extends JTextField {
    private String placeholder;

    public CampoTextoConPlaceholder(int columns) {
        super(columns);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        addFocusListener(new FocusAdapter() {
     
            public void focusGained(FocusEvent e) {
                repaint();
            }
     
            public void focusLost(FocusEvent e) {
                repaint();
            }
        });
    }
    
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        repaint();
    }
    
    public String getPlaceholder() {
        return placeholder;
    }
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 7, 7);

        super.paintComponent(g2);
        
        if (placeholder != null && getText().isEmpty() && !isFocusOwner()) {
        	g2.setColor(new Color(128, 128, 128, 128));
            Insets insets = getInsets();
            FontMetrics fm = g2.getFontMetrics(getFont());
            int paddingLeft = insets.left;
            int paddingTop = insets.top + fm.getAscent();
            g2.drawString(placeholder, paddingLeft, paddingTop);
        }
        g2.dispose();
    }
}

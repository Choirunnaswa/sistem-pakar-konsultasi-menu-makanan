package pengguna;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop-Putri
 */
import java.awt.*;
import javax.swing.*;

public class RoundedPanel extends JPanel {
    private int cornerRadius = 30; // besar lengkungan (ubah sesuai selera)

    public RoundedPanel() {
        super();
        setOpaque(false); // biar background transparan di luar lengkungan
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;

        // Biar halus
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Warna background panel
        graphics.setColor(getBackground());

        // Gambar bentuk kotak dengan sudut melengkung
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

        // (Opsional) Gambar garis pinggir (border halus)
        graphics.setColor(new Color(200, 200, 200));
        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
    }

    // Setter untuk ubah radius
    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint();
    }
}

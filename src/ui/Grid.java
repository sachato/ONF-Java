package ui;
import java.awt.*;
import javax.swing.*;

public class Grid extends JPanel{
	public Grid() {
        setSize(1000, 300);
        setVisible(true);
    }

    // draw grid
    public void paint(Graphics g) {
        for (int x = 0; x <= 900; x += 10)
            for (int y = 0; y <= 270; y += 10)
                g.drawRect(x, y, 10, 10);
    }
}

package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class opdracht45 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(50, 50, 50, 50, 360, 360);
    }
}

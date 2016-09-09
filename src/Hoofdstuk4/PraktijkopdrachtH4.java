package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class PraktijkopdrachtH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20, 40, 265, 40);
        g.drawString("Lijn", 125,55);

        g.drawRect(20, 75, 250, 110);
        g.drawString("Rechthoek", 110, 200);

        g.setColor(Color.magenta);
        g.fillRect(285, 75, 250, 110);
        g.setColor(Color.black);
        g.drawOval(285, 75, 250, 110);
        g.drawString("Gevulde rechthoek met ovaal", 300, 200);

        g.drawOval(545, 75, 250, 110);
        g.setColor(Color.magenta);
        g.fillArc(545, 75, 250, 110, 360, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 580, 200);

        g.drawRoundRect(20, 210, 250, 110, 30, 30);
        g.drawString("Ageronde Rechthoek", 90, 340);

        g.setColor(Color.magenta);
        g.fillOval(285, 210, 250, 110);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 360, 340);

        g.drawArc(600, 210, 120, 120, 360, 360);
        g.drawString("Cirkel", 645, 350);


    }

}
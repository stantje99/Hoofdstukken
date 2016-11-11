package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 11-11-2016.
 */
public class Praktijkopdracht13 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        haha(g, 15);

    }

    void haha(Graphics g, int vul) {
        int x = 75;
        int y = x;
        int stam = 115;
        int stam2 = 175;
        int groot = 10;

        for (int teller = 0; teller < groot; teller++) {


            g.setColor(Color.green);
            g.fillOval(x, y, 100, 100);
            g.setColor(Color.black);
            g.drawOval(x, y, 100, 100);

            g.setColor(new Color(60, 60, 0));
            g.fillRect(stam, stam2, 20, 100);
            stam += 120;
            x += 120;
        }



    }
}

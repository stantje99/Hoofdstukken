package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 3-11-2016.
 */
public class Opdracht124 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int waarde = 0;
        int y = 20;
        int x = y;

        while(waarde <= 10) {
            y+=20;
            g.drawString("" + waarde, x, y);
            waarde++;
        }
    }
}

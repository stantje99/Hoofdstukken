package Hoofdstuk11;

/**
 * Created by Gebruiker on 25-10-2016.
 */

import java.applet.Applet;
import java.awt.*;

public class opdracht111 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x, 50, x, 300);
        }
    }
}

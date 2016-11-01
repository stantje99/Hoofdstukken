package Hoofdstuk11;

/**
 * Created by Gebruiker on 26-10-2016.
 */

import java.applet.Applet;
import java.awt.*;

public class opdracht112 extends Applet {

    public void init() {}

    public void paint (Graphics g) {
        int teller = 20;
        int y = 0;

        while(teller >= 10 ) {
            y += 20;
            g.drawString("" + teller, 200, y);
            teller--;
        }





    }

}

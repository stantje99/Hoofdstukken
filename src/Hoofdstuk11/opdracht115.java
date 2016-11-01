package Hoofdstuk11;

/**
 * Created by Gebruiker on 27-10-2016.
 */
import java.applet.Applet;
import java.awt.*;

public class opdracht115 extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {
        int teller = 0;
        int y = 50;
        int x = 50;

        while(teller < 5) {
            y+= 50;
            x+= 50;
            g.drawRect(y, x, 50, 50);
            teller++;
        }
    }
}
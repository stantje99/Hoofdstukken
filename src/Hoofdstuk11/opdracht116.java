package Hoofdstuk11;

/**
 * Created by Gebruiker on 27-10-2016.
 */
import java.applet.Applet;
import java.awt.*;

public class opdracht116 extends Applet {

    public void init() {

    }

    public void paint (Graphics g) {
        int x = 20;
        int y = 20;
        int teller = 0;
        int width = 70;

        while (teller < 5) {
            width-=10;
            y+= 5;
            x+= 5;
            g.drawArc(x, y, width, width, 360, 360);
            teller++;

        }
    }
}

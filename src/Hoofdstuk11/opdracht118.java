package Hoofdstuk11;

/**
 * Created by Gebruiker on 27-10-2016.
 */
import java.applet.Applet;
import java.awt.*;

public class opdracht118 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 10;
        int teller = 0;
        int width = 500;

        while(teller < 101) {
            width-=5;
            y+=5;
            g.drawArc(x, y, width, width, 360, 360);
            teller++;
        }

    }
}

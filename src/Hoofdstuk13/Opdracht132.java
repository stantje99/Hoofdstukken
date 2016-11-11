package Hoofdstuk13;

/**
 * Created by Gebruiker on 10-11-2016.
 */

import java.awt.*;
import java.applet.*;

public class Opdracht132 extends Applet {

    public void paint(Graphics g) {

        driehoek(g,100,200,200,460,400,300);
    }

    void driehoek ( Graphics g, int x, int y, int xx, int yy, int xxx, int yyy) {

        g.drawLine(x,y,xx,yy);
        g.drawLine(xx,yy,xxx,yyy);
        g.drawLine(xxx,yyy,x,y);

    }
}

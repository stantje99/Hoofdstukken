package Hoofdstuk13;

/**
 * Created by Gebruiker on 11-11-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht133 extends Applet {
    int x = 100;
    int y = 100;


    public void init() {
    }

    public void paint(Graphics g) {
        baksteen(g,75,50);
    }

    void baksteen ( Graphics g, int x2, int y2) {

        x += x2;
        g.setColor(Color.orange);
        g.fillRect(x,y,x2,y2);
        g.setColor(Color.red);
        g.drawRect(x,y,x2,y2);
        x += x2;
        g.setColor(Color.orange);
        g.fillRect(x,y,x2,y2);
        g.setColor(Color.red);
        g.drawRect(x,y,x2,y2);
        x += x2;
        g.setColor(Color.orange);
        g.fillRect(x,y,x2,y2);
        g.setColor(Color.red);
        g.drawRect(x,y,x2,y2);
        x += x2;
        g.setColor(Color.orange);
        g.fillRect(x,y,x2,y2);
        g.setColor(Color.red);
        g.drawRect(x,y,x2,y2);
        x += x2;
        g.setColor(Color.orange);
        g.fillRect(x,y,x2,y2);
        g.setColor(Color.red);
        g.drawRect(x,y,x2,y2);
        x += x2;
        g.setColor(Color.orange);
        g.fillRect(x,y,x2,y2);
        g.setColor(Color.red);
        g.drawRect(x,y,x2,y2);



        }
    }


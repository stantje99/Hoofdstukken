package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class opdracht62 extends Applet {

    int sec;
    int uur;
    int min;
    int jaren;



    public void init() {
        sec = 60;
        min = 60;
        uur = 24;
        jaren = 365;

    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + sec * min, 20, 20);
        g.drawString("seconden in een dag: " + (sec * min) * uur, 20, 40);
        g.drawString("seconden in een jaar: " + (sec * min) * jaren, 20, 60);

    }
}

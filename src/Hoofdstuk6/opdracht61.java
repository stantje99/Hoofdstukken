package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class opdracht61 extends Applet {
    double aantal;
    double winst;
    double uitkomst;


    public void init() {
        aantal = 4;
        winst = 113;
        uitkomst = winst / aantal;

    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 40);
        g.drawString("Jeanette: " + uitkomst, 20, 60);
        g.drawString("Ik:" + uitkomst, 20, 80);
    }
}
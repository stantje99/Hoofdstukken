package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class opdracht63 extends Applet {

    int pos;
    int pos2;
    int antwoord;




    public void init() {
        pos = 20;
        pos2 = 40;
        antwoord = pos - pos2;


    }

    public void paint(Graphics g) {
        g.drawString("antwoord:" + antwoord , 20, 20);


    }
}

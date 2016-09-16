package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class praktijkopdrachth6 extends Applet {

    double c1;
    double c2;
    double c3;
    double samen;
    double delen;
    double deel;
    int lol;
    double lol2;




    public void init() {
        c1 = 5.9;
        c2 = 6.3;
        c3 = 6.9;
        delen = 3;
        samen = (c1 + c2 + c3) * 10;
        deel = samen / delen;

        lol = (int) deel;
        lol2 = (double) lol / 10;




    }

    public void paint(Graphics g) {
        g.drawString("antwoord:" + lol2 , 20, 20);


    }
}

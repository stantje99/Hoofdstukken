package Hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class opdracht51 extends Applet {

    // Lijn
    int Lijn = 265;
    int Spacebreedte = 40;
    int Lijn2 = 20;
    int Spacebreedte2 = 40;

    // Rechthoek
    int Rect = 20;
    int Rect2 = 75;
    int Rect3 = 250;
    int Rect4 = 110;

    // Gevulde rechthoek met ovaal
    Color kleur;
    Color kleur2;
    int Fillrect = 285;
    int Fillrect2 = 75;
    int Fillrect3 = 250;
    int Fillrect4 = 110;

    int drawOval = 285;
    int drawOval2 = 75;
    int drawOval3 = 250;
    int drawOval4 = 110;

    // taartpunt met ovaal eromheen
    int ovaal = 545;
    int ovaal2 = 75;
    int ovaal3 = 250;
    int ovaal4 = 110;

    int arc = 545;
    int arc2 = 75;
    int arc3 = 250;
    int arc4 = 110;
    int arc5 = 360;
    int arc6 = 45;

    // round rectangle
    int round = 20;
    int round2 = 210;
    int round3 = 250;
    int round4 = 110;
    int round5 = 30;
    int round6 = 30;

    // filled oval
    int fill = 285;
    int fill2 = 210;
    int fill3 = 250;
    int fill4 = 110;

    // cirkel
    int cirkel = 600;
    int cirkel2 = 210;
    int cirkel3 = 120;
    int cirkel4 = 120;
    int cirkel5 = 360;
    int cirkel6 = 360;



    public void init() {
        kleur = Color.MAGENTA;
        kleur2 = Color.BLACK;

    }

    public void paint(Graphics g) {

        //lijn
        g.drawLine(Lijn2, Spacebreedte2, Lijn, Spacebreedte);

        //Rechthoek
        g.drawRect(Rect, Rect2, Rect3, Rect4);

        // Gevulde rechthoek met ovaal
        g.setColor(kleur);
        g.fillRect(Fillrect, Fillrect2, Fillrect3, Fillrect4);
        g.setColor(kleur2);
        g.drawOval(drawOval, drawOval2, drawOval3, drawOval4);

        // Taartpunt met ovaal eromheen
        g.drawOval(ovaal, ovaal2, ovaal3, ovaal4);
        g.setColor(kleur);
        g.fillArc(arc, arc2, arc3, arc4, arc5, arc6);

        // Ronde rechthoek
        g.setColor(kleur2);
        g.drawRoundRect(round, round2, round3, round4, round5, round6);

        // Gevulde Oval
        g.setColor(kleur);
        g.fillOval(fill, fill2, fill3, fill4);

        // Cirkel
        g.setColor(kleur2);
        g.drawArc(cirkel, cirkel2, cirkel3, cirkel4, cirkel5, cirkel6);

    }

}
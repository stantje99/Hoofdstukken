package Hoofdstuk12;

/**
 * Created by Gebruiker on 2-11-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht121 extends Applet {
    double salaris[];
    int antwoord;

    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;

            antwoord+=salaris[teller];

        }

        antwoord/=10;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
        g.drawString("" + antwoord, 200, 50);

    }
}
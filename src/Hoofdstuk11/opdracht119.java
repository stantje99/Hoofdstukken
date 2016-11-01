package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 31-10-2016.
 */
public class opdracht119 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int breedte = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            }
            x += breedte;
        }

        x = 50;
        y += breedte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);

            }
            x += breedte;
        }

        x = 50;
        y += breedte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            }
            x+= breedte;
        }

        x = 50;
        y += breedte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);

            }
            x += breedte;
        }

        x = 50;
        y += breedte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            }
            x+= breedte;
        }

        x = 50;
        y += breedte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);

            }
            x += breedte;
        }

        x = 50;
        y += breedte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            }
            x+= breedte;
        }
        x = 50;
        y += breedte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, breedte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, breedte);

            }
            x += breedte;
        }


        g.drawRect(50, 50, 400, 400);



    }
}

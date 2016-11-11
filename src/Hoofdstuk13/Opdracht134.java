package Hoofdstuk13;

/**
 * Created by Gebruiker on 11-11-2016.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdracht134 extends Applet {
    Button knop;
    Button knop2;

    Color kleurtje;
    int width;
    int lenght;

    boolean geklikt = false;
    boolean geklikt2 = false;

    public void init() {
        knop = new Button("Bouw een muur");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        knop2 = new Button("Bouw betton blokken");
        KnopListener2 kl2 = new KnopListener2();
        knop.addActionListener(kl2);

        add(knop);
        add(knop2);

    }

    public void paint(Graphics g) {
        tekenmuuren(g, width, lenght, kleurtje);
        tekenmuuren2(g, width, lenght, kleurtje);

    }

    void tekenmuuren(Graphics g, int breed, int lang, Color kleur) {


        if (geklikt) {
            int x = 100;
            int y = 100;

            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
        }
    }

    void tekenmuuren2(Graphics g, int breed, int lang, Color kleur) {


        if (geklikt2) {
            int x = 100;
            int y = 100;

            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
            x += breed;
            g.setColor(kleur);
            g.fillRect(x, y, breed, lang);
            g.setColor(Color.black);
            g.drawRect(x, y, breed, lang);
        }
    }


    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            width = 30;
            lenght = 50;
            kleurtje = Color.GRAY;

            repaint();

            geklikt2 = true;
        }
    }

    class KnopListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            width = 20;
            lenght = 15;
            kleurtje = Color.orange;

            repaint();

            geklikt = true;
        }
    }

}

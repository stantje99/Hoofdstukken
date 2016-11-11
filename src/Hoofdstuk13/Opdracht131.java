package Hoofdstuk13;

/**
 * Created by Gebruiker on 9-11-2016.
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdracht131 extends Applet {
    Button rood;
    Button paars;
    Button grijs;
    Button blauw;
    Button groen;

    boolean geklikt = false;

    Color kleurtje;
    String tekst;


    public void init() {
        rood = new Button("Rood");
        KnopListener kl = new KnopListener();
        rood.addActionListener(kl);

        paars = new Button("Paars");
        KnopListener2 kl2 = new KnopListener2();
        paars.addActionListener(kl2);

        grijs = new Button("Grijs");
        KnopListener3 kl3 = new KnopListener3();
        grijs.addActionListener(kl3);

        blauw = new Button("Blauw");
        KnopListener4 kl4 = new KnopListener4();
        blauw.addActionListener(kl4);

        groen = new Button("Groen");
        KnopListener5 kl5 = new KnopListener5();
        groen.addActionListener(kl5);

        add(rood);
        add(paars);
        add(grijs);
        add(blauw);
        add(groen);

    }

    @Override

    public void paint(Graphics g) {

        if (geklikt) {
            achtergrondkleur(g, tekst, kleurtje);
        }

    }

    void achtergrondkleur(Graphics g, String tekst, Color kleurtje) {

        g.drawString("" + tekst, 50, 50);
        setBackground(kleurtje);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = "rood";
            geklikt = true;
            kleurtje = Color.RED;

            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = "paars";
            geklikt = true;
            kleurtje = Color.MAGENTA;

            repaint();
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = "grijs";
            geklikt = true;
            kleurtje = Color.GRAY;

            repaint();
        }
    }

    class KnopListener4 implements  ActionListener {
        public void  actionPerformed(ActionEvent e) {
            tekst = "blauw";
            geklikt = true;
            kleurtje = Color.BLUE;

            repaint();
        }
    }

    class KnopListener5 implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = "groen";
            geklikt = true;
            kleurtje = Color.GREEN;

            repaint();
        }
    }
}
package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht105 extends Applet {

   TextField tekstveld;
    Button knop;
    double invoer;

    double totaal;
    int aantalCijfers;
    double gemiddelde;

    boolean geklikt;


    public void init () {
        super.init();
        tekstveld = new TextField("", 8);
        add(tekstveld);

        knop = new Button("ok");
        Knoplistener kl = new Knoplistener();
        knop.addActionListener(kl);
        add(knop);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 58;
        int y = 78;

        if(geklikt) {

            if (invoer < 5.5) {
                g.drawString("Het cijfer is onvoldoende", x, y);

            } else {
                g.drawString("Het cijfer is voldoende", x, y);
            }


            g.drawString("Gemiddelde is:" + gemiddelde, x, 98);

            if (gemiddelde >= 5.5) {
                g.drawString("Student is geslaagd", x, 118);
            } else {
                g.drawString("Student is niet geslaagd", x, 118);
            }

        }
    }

    class Knoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            totaal += invoer;
            aantalCijfers++;
            gemiddelde = totaal / aantalCijfers;
            geklikt = true;


            repaint();

        }


    }
}

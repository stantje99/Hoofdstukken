package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gebruiker on 31-10-2016.
 */


public class praktijkopdracht11 extends Applet {
    Button klik;
    TextField textvak;
    Label label;

    double invoer;

    boolean geklikt;



    public void init() {
        super.init();
        klik = new Button("Klik");
        KnopListener kl = new KnopListener();
        klik.addActionListener(kl);
        textvak = new TextField("", 10);
        label = new Label("Voer een getal van 1 tot 10 in");
        add(label);
        add(textvak);
        add(klik);

    }

    public void paint (Graphics g) {
        int teller = 0;
        int uitkomst = 0;
        int stap = 1;


        int y = 20;

        if (geklikt = true) {

            if (invoer == 1) {


                while (teller <= 9) {

                    y += 20;
                    uitkomst = 1 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }
            }

            if(invoer == 2) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 2 * stap;
                    g.drawString("" + uitkomst, 30, y);
                    stap += 1;
                    teller++;

                }
            }

            if(invoer == 3) {
                while (teller <= 9) {

                    y += 20;
                    uitkomst = 3 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }
            }

            if(invoer == 4) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 4 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }

            }

            if(invoer == 5) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 5 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }
            }

            if(invoer == 6) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 6 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;


                }
            }

            if(invoer == 7) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 7 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }
            }

            if(invoer == 8) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 8 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }
            }

            if(invoer == 9) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 9 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }
            }

            if(invoer == 10) {

                while (teller <= 9) {

                    y += 20;
                    uitkomst = 10 * stap;
                    g.drawString("" + uitkomst, 20, y);
                    stap += 1;
                    teller++;

                }
            } else {
                g.drawString("Foutieve invoer", 50, 50);
            }


        }
}

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s = textvak.getText();
            invoer = Double.parseDouble(s);

            geklikt = true;

            repaint();

        }
    }

}

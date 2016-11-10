package Hoofdstuk12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by Gebruiker on 3-11-2016.
 */
public class Opdracht125 extends Applet {
    int getallen[];
    Button knop;
    TextField tekstvak;
    Label label;
    int invoer;
    String lol;
    int tekst;

    public void init() {
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        tekstvak = new TextField("", 10);
        label = new Label("Voer een getal in");

        add(label);
        add(tekstvak);
        add(knop);

        getallen = new int[10];


    }

    public void paint(Graphics g) {
        getallen = new int[10];
        int teller = 0;
        int y = 20;
        int x = y;
        tekst = Integer.parseInt(lol);

        while (teller <= 10) {
            y += 20;
            g.drawString("" + teller, x, y);
            teller++;
        }

        g.drawString("" + tekst, 50, 50);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoer = Integer.parseInt(s);

            switch (invoer) {
                case 1:
                    lol = "1";
                    break;
                case 2:
                    lol = "2";
                    break;
                case 3:
                    lol = "3";
                    break;
                case 4:
                    lol = "4";
                    break;
                case 5:
                    lol = "5";
                    break;
                case 6:
                    lol = "6";
                    break;
                case 7:
                    lol = "7";
                    break;
                case 8:
                    lol = "8";
                    break;
                case 9:
                    lol = "9";
                    break;
                case 10:
                    lol = "10";
                    break;

                default:
                    lol = "Dit getal staat niet in de tabel";
                    break;

            }

            repaint();

        }
    }
}


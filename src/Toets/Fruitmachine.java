package Toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

/**
 * Created by Gebruiker on 16-12-2016.
 */

public class Fruitmachine extends Applet {
    Button speel;
    Button kopen;
    Image fruit;
    int geld = 10;

    boolean geklikt = true;
    int checking[] = new int[3];
    int punten = 0;


    String[] afbeeldingen = {"fruit_1.jpg", "fruit_2.jpg", "fruit_3.jpg", "fruit_4.jpg", "fruit_5.jpg", "fruit_6.jpg",
            "fruit_7.jpg", "fruit_8.jpg", "fruit_9.jpg", "fruit_10.jpg", "fruit_11.jpg", "fruit_12.jpg",
            "fruit_13.jpg", "fruit_14.jpg", "fruit_15.jpg", "fruit_16.jpg", "fruit_17.jpg", "fruit_18.jpg", "fruit_19.jpg", "fruit_20.jpg"};

    public void init() {
        speel = new Button("Speel");
        knopListener2 ko = new knopListener2();
        speel.addActionListener(ko);
        kopen = new Button("Koop 10 kredietpunten");
        knopListener kl = new knopListener();
        kopen.addActionListener(kl);


        add(speel);
        add(kopen);
    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 60;

        if (geklikt) {
            for (int i = 0; i < 3; i++) {
                double a = Math.random();
                int random = (int) (a * 20);
                URL weg = Fruitmachine.class.getResource("/img/");
                fruit = getImage(weg, afbeeldingen[random]);

                checking[i] = random;

                x += 75;
                g.drawImage(fruit, x, y, this);
            }
        }
        g.drawString("krediet: " + geld, 100, 260);
        g.drawString("Gewonnen: " + punten, 100, 290);
    }

    public void GeldMethode() {
        if((checking[0] == checking[1] && checking[1] == checking[2])){
            punten+=16;
        }
        if((checking[0] == checking[1] || checking[1] == checking[2] || checking[0] == checking[2])){
            punten+=4;
        }
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kopen.setEnabled(false);
            geklikt = false;
            if (geld == 0) {
                kopen.setEnabled(true);
                geld += 10;

            } else {
                geld += 0;
                kopen.setEnabled(true);
            }
            repaint();

        }
    }

    class knopListener2 implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            GeldMethode();
            geklikt = true;
            if(geld <= 0) {
                geklikt = false;
            } else {
                geld -= 1;
            }

            repaint();
        }
    }
}


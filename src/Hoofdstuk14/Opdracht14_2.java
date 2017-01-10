package Hoofdstuk14;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Opdracht14_2 extends Applet {

    private int delen;
    Double aa;
    int a;
    String[] kaarten = {"Ruiten ", "Schoppen ","Klaver ","Harten "};
    String[] getallen = {"Twee","Drie","Vier","Vijf","Zes","Zeven","Acht","Negen","Tien","Vrouw","Heer","Boer","Aas"};
    String[] samen;

    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;




    @Override
    public void init() {

        samen = new String[52];
        //  ------------------- Uitgelegd door Niels ----------------------
        int index = 0;
        for (int i = 0; i < kaarten.length; i++) {
            String kaart = kaarten[i];
            for (int j = 0; j < getallen.length; j++) {
                String getal = getallen[j];
                samen[index] = kaart + " " + getal;
                index += 1;
            }
        }
//        aa = Math.random();
//        delen = (int) (aa * 52);

        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        for (int i = 0; i < 13; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();

        }






        // ----------------------------

    }

    private String deelKaart() {
        int random = new Random().nextInt(samen.length);
        String kaart = samen[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[samen.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < samen.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = samen[i];
                hulpindex++;
            }
        }
        samen = hulpLijst;
        return kaart;
    }

    @Override
    public void paint(Graphics g) {
        double aaa = Math.random();
        a = (int)(aaa * samen.length );

        int y = 20;
        for (int i = 0; i < 13; i++) {

            g.drawString(speler1[i], 50, y + 20 * i);
            g.drawString(speler2[i], 250, y + 20 * i);
            g.drawString(speler3[i], 450, y + 20 * i);
            g.drawString(speler4[i], 650, y + 20 * i);

        }
    }


}


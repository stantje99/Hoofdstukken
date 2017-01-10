package Hoofdstuk14;

import java.awt.*;
import java.applet.*;

public class Opdracht14_1 extends Applet {

    private int delen;
    Double aa;
    int a;
    String[] kaarten = {"Ruiten ", "Schoppen ","Klaver ","Harten "};
    String[] getallen = {"Twee","Drie","Vier","Vijf","Zes","Zeven","Acht","Negen","Tien","Vrouw","Heer","Boer","Aas"};
    String[] samen;



    @Override
    public void init() {

        samen = new String[52];
        aa = Math.random();
        delen = (int) (aa * 52);



        //  ------------------- Uitgelegd door Niels ----------------------
        int index = 0;
        for (int i = 0; i < kaarten.length; i++) {
            for (int j = 0; j < kaarten.length; j++) {
                samen[index] = kaarten[i] + getallen[j];
                index += 1;
            }
        }
        // ----------------------------

    }

    @Override
    public void paint(Graphics g) {
        double aaa = Math.random();
        a = (int)(aaa * samen.length );
        g.drawString(samen[a],50,50);
    }


}

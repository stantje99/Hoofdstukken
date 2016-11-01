package Hoofdstuk11;

/**
 * Created by Gebruiker on 26-10-2016.
 */
import java.applet.Applet;
import java.awt.*;

public class opdracht114 extends Applet {

    public void init() {



    }

    @Override
    public void paint(Graphics g) {
        int teller = 0;
        int uitkomst = 0;
        int stap = 1;
        int y = 20;

        while(teller <= 9) {

            y+=20;
            uitkomst = 3 * stap;
            g.drawString("" + uitkomst, 20, y);
            stap +=1;
            teller++;

       }

    }
}
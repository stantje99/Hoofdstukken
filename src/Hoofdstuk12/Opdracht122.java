package Hoofdstuk12;

/**
 * Created by Gebruiker on 2-11-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht122 extends Applet {
    Button knop[];


    public void init() {
        knop = new Button[25];

        for(int teller = 0; teller < knop.length; teller++) {
            knop[teller] = new Button("Knopjeeeee");
            add(knop[teller]);
        }
    }


    public void paint(Graphics g) {

    }
}

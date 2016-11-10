package Hoofdstuk12;

/**
 * Created by Gebruiker on 2-11-2016.
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdracht123 extends Applet {
    TextField textvak[];
    Button knop;
    

        String s[];


    public void init() {
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        textvak = new TextField[5];

        s = new String[5];



        for(int teller = 0; teller < textvak.length; teller++) {
            textvak[teller] = new TextField("", 20);
            add(textvak[teller]);
        }

    }

@Override

    public void paint(Graphics g) {
    int y = 200;
    int teller = 0;
    while(teller < 5) {
        y+=20;
        g.drawString("" + s[teller], 200, y);
        teller++;
    }

    }
class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int teller = 0;
            while(teller < 5) {
                s[teller] = textvak[teller].getText();
                teller++;
            }

            repaint();

        }
    }


}


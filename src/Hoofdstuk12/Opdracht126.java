package Hoofdstuk12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht126 extends Applet {


    private boolean gevonden = false;
    private boolean geklikt = false;
    private int[] getal = {100, 300, 500, 700, 900,500,900,600,500,100,500,1620,8888,1622,1621,100, 300, 500, 700, 900,500,900,600,500,100,500,1620,8888,1622,1621};

    private TextField Text;
    private int hoeveelheid;
    public void init() {


        Text = new TextField("", 10);
        Button ok = new Button("OK");

        ok.addActionListener(new TextListener());
        Text.addActionListener(new TextListener());

        add(Text);
        add(ok);
    }


    public void paint(Graphics g) {

        if (geklikt) {
            if (gevonden) {
                g.drawString("De waarde is " + hoeveelheid + " keer gevonden", 100, 50);
            } else {
                g.drawString("De waarde komt niet voor.", 100, 50);
            }
        }
    }

    private class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            geklikt = true;

            String s = Text.getText();
            int Textin = Integer.parseInt(s);


            int teller = 0;
            hoeveelheid = 0;
            while (teller < getal.length) {
                if (getal[teller] == Textin) {
                    gevonden = true;
                }
                if (getal[teller] == Textin){
                    hoeveelheid +=1;
                }
                teller++;
            }
            repaint();
        }
    }
}
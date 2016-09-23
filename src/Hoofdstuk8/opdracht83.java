package Hoofdstuk8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht83 extends Applet {
    TextField textvak;
    Label label;
    Button knop;
    Button enter;

    double uitkomst;
    double getal;


    public void init() {
        label = new Label("Vul je prijs in");
        textvak = new TextField("", 20);
        knop = new Button("Ok");
        knop.addActionListener( new Knop() );
        add(label);
        add(textvak);
        add(knop);

        textvak.addActionListener( new knop2());

        uitkomst = 0.0;


    }

    public void paint(Graphics g) {
        g.drawString("" + uitkomst, 50, 60);


    }

    class knop2 implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            String s = textvak.getText();
            getal = Double.parseDouble( s );
            uitkomst = getal * 1.21;

            repaint();
        }
    }

    class Knop implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            String s = textvak.getText();
            getal = Double.parseDouble( s );
            uitkomst = getal * 1.21;

            repaint();



        }
    }
}
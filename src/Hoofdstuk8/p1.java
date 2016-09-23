package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class p1 extends Applet {
    Button keer;
    Button delen;
    Button plus;
    Button min;
    TextField textvak;
    TextField textvak2;
    String s;

    double uitkomst;
    double getal;
    double getal2;


    public void init() {
        keer = new Button("*");
        keer.addActionListener(new Knop());

        delen = new Button("/");
        delen.addActionListener(new Knop2());

        plus = new Button("+");
        plus.addActionListener(new Knop3());

        min = new Button("-");
        min.addActionListener(new Knop4());


        textvak2 = new TextField("", 15);
        textvak = new TextField("", 15);


        add(textvak);
        add(textvak2);
        add(keer);
        add(delen);
        add(plus);
        add(min);

        s = "";


    }

    public void paint(Graphics g) {
        g.drawString("" + uitkomst, 50, 60);

    }

    class Knop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = textvak.getText();
            getal = Double.parseDouble(a);

            String b = textvak2.getText();
            getal2 = Double.parseDouble(b);

            uitkomst = getal * getal2;

            repaint();

        }

    }

    class Knop2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String c = textvak.getText();
            getal = Double.parseDouble(c);

            String d = textvak2.getText();
            getal2 = Double.parseDouble(d);

            uitkomst = getal / getal2;

            repaint();


        }

    }

    class Knop3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String i = textvak.getText();
            getal = Double.parseDouble(i);

            String f = textvak2.getText();
            getal2 = Double.parseDouble(f);

            uitkomst = getal + getal2;

            repaint();


        }

    }

    class Knop4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String g = textvak.getText();
            getal = Double.parseDouble(g);

            String h = textvak2.getText();
            getal2 = Double.parseDouble(h);

            uitkomst = getal - getal2;

            repaint();


        }

    }
}

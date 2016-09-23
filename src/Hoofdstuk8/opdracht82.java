package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht82 extends Applet {
    Button Man;
    Button Vrouw;
    Button Jongen;
    Button Meisje;


    int Men;
    int Woman;
    int Boy;
    int Girl;




    public void init() {
        Men = 0;
        Woman = 0;
        Boy = 0;
        Girl = 0;

       Man = new Button("Man");
        Man.addActionListener( new ManKnopListener() );


        Vrouw = new Button("Vrouw");
         Vrouw.addActionListener( new Knop2Listener() );


        Jongen = new Button("Jongen");
         Jongen.addActionListener( new Knop3Listener() );

        Meisje = new Button("Meisje");
         Meisje.addActionListener( new Knop4Listener() );

        add(Man);
        add(Vrouw);
        add(Jongen);
        add(Meisje);




    }


    public void paint(Graphics g) {
        g.drawString("Aantal Mannen:" + Men, 30, 60);
        g.drawString("Aantal Vrouwen:" + Woman, 30, 80);
        g.drawString("Aantal Jongens:" + Boy, 30, 100);
        g.drawString("Aantal Meisjes:" + Girl, 30, 120);


    }

    class ManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          Men = Men + 1;

            repaint();


        }

    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Woman = Woman + 1;

            repaint();


        }

    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Boy = Boy + 1;

            repaint();


        }

    }
    class Knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Girl = Girl + 1;

            repaint();


        }

    }


}

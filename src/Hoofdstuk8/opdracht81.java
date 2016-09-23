package Hoofdstuk8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht81 extends Applet {
    Button knop1;
    Button knop2;
    Label label;
    String s;
    String a;


    TextField invoer;




    public void init() {
        label = new Label("Voer je text in");
        invoer = new TextField("", 20);
        knop1 = new Button("Ok");
        knop1.addActionListener( new KnopListener() );
        add(label);
        add(invoer);
        add(knop1);
        s = "";

        knop2 = new Button("Leeg");
        knop2.addActionListener( new Knop2Listener() );
        add(knop2);
        a = "???";



    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 80);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = invoer.getText();

            repaint();

        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            s = "";

            repaint();
        }
    }
}


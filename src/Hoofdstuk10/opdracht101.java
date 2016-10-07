package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht101 extends Applet {

    TextField invoer;
    Button klik;
    Label label;
    String a;
    double hoogste;
    double text2;

    public void init() {
        invoer = new TextField("", 10);
        klik = new Button("Klik");
        klik.addActionListener(new knop());
        label = new Label("Voer je getal in");


        add(label);
        add(invoer);
        add(klik);


    }

    public void paint(Graphics g) {
        g.drawString("" + hoogste, 20, 50);

    }

    class knop implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            a = invoer.getText();
            text2 = Double.parseDouble( a );
            if ( text2 > hoogste ) {
                hoogste = text2;
            }

            repaint();
            }








        }
    }

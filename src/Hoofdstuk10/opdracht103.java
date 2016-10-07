package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari, Dagen 31";
                    break;
                case 2:
                    tekst = "Februari, Dagen 28 of 29";
                    break;
                case 3:
                    tekst = "Maart, Dagen 31";
                    break;
                case 4:
                    tekst = "April, Dagen 30";
                    break;
                case 5:
                    tekst = "Mei, Dagen 31";
                    break;
                case 6:
                    tekst = "Juni, Dagen 30";
                    break;
                case 7:
                    tekst = "Juli, Dagen 31";
                    break;
                case 8:
                    tekst = "Augustus, Dagen 31";
                    break;
                case 9:
                    tekst = "September, Dagen 30";
                    break;
                case 10:
                    tekst = "Oktober, Dagen 31";
                    break;
                case 11:
                    tekst = "November, Dagen 30";
                    break;
                case 12:
                    tekst = "December, Dagen 31";
                    break;

                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
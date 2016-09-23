package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class p2 extends Applet {


    int linestart = 100;
    int linelength = 500;
    int lineY = linestart + linelength;  //kruispunt
    int stringstart = linestart - 40;
    int zeroline = lineY / 100 * 6;
    int negstringstart = stringstart + 80;
    int lineYname = lineY + 15;


    int kg10 = lineY / 100 * 90;
    int kg20 = lineY / 100 * 80;
    int kg30 = lineY / 100 * 70;
    int kg40 = lineY / 100 * 60;
    int kg50 = lineY / 100 * 50;
    int kg60 = lineY / 100 * 40;
    int kg70 = lineY / 100 * 30;
    int kg80 = lineY / 100 * 20;
    int kg90 = lineY / 100 * 10;
    int kg100 = lineY / 100 * 0;


    int kgvalerie = kg40;
    int kgjeroen = kg100;
    int kghans = kg80;
    Color valCo = Color.red;
    Color jerCO = Color.blue;
    Color haCO = Color.orange;
    Color ZeroCO = Color.black;


    int valname = lineY / 4;
    int jername = lineY / 4 * 2;
    int hanname = lineY / 4 * 3;
    int valend = lineY - kgvalerie;
    int jerend = lineY - kgjeroen;
    int hanend = lineY - kghans;
    int length = lineY / 5;

    Button verander;
    Label val;


    TextField valinvoer;
    TextField jerinvoer;
    TextField haninvoer;

    double derp;
    double derp2;
    double derp3;
;


    public void init() {
        val = new Label("Nieuwe waardes");
        verander = new Button("Submit");
        verander.addActionListener(new knop());
        valinvoer = new TextField("", 10);
        jerinvoer = new TextField("", 10);
        haninvoer = new TextField("", 10);
        add(val);
        add(valinvoer);
        add(jerinvoer);
        add(haninvoer);
        add(verander);




    }

    public void paint(Graphics g) {

        g.drawLine(linestart, zeroline, linestart, lineY);
        g.drawLine(linestart, lineY, lineY, lineY);


        g.drawString("kilogram", negstringstart, zeroline);
        g.drawString("0", stringstart, lineY);
        g.drawString("10", stringstart, kg10);
        g.drawString("20", stringstart, kg20);
        g.drawString("30", stringstart, kg30);
        g.drawString("40", stringstart, kg40);
        g.drawString("50", stringstart, kg50);
        g.drawString("60", stringstart, kg60);
        g.drawString("70", stringstart, kg70);
        g.drawString("80", stringstart, kg80);
        g.drawString("90", stringstart, kg90);
        g.drawString("100", stringstart, kg100);


        g.drawString("valarie", valname, lineYname);
        g.drawString("hans", hanname, lineYname);
        g.drawString("jeroen", jername, lineYname);

        g.setColor(valCo);
        g.fillRect(valname, kgvalerie, length, valend);
        g.setColor(haCO);
        g.fillRect(hanname, kghans, length, hanend);
        g.setColor(jerCO);
        g.fillRect(jername, kgjeroen, length, jerend);
        g.setColor(ZeroCO);
    }

    class knop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = valinvoer.getText();
            derp = Double.parseDouble(a);

            String b = jerinvoer.getText();
            derp2 = Double.parseDouble(b);

            String d = haninvoer.getText();
            derp3 = Double.parseDouble(d);

            kgvalerie = (int) (lineY / 100 * (100 - derp));
            kghans = (int) (lineY / 100 * (100 - derp2));
            kgjeroen = (int) (lineY / 100 * (100 - derp3));

            valend = lineY - kgvalerie;
            jerend = lineY - kgjeroen;
            hanend = lineY - kghans;

            length = lineY / 5;

            repaint();


        }
    }
}

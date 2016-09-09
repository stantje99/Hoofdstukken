package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class opdracht44 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
     g.drawString("Valerie", 100, 630);
        g.drawString("Jeroen", 200, 630);
        g.drawString("Hans", 300, 630);
        g.drawString("Kg", 30, 30);
        g.drawString("10", 10, 580);
        g.drawString("20", 10, 520);
        g.drawString("30", 10, 460);
        g.drawString("40", 10, 400);
        g.drawString("50", 10, 360);
        g.drawString("60", 10, 300);
        g.drawString("70", 10, 240);
        g.drawString("80", 10, 180);
        g.drawString("90", 10, 120);
        g.drawString("100", 10, 60);

        g.fillRect(40, 45, 10, 550);
        g.fillRect(40, 590, 350, 10);

        g.setColor(Color.green);
        g.fillRect(100, 400, 50, 190);

        g.setColor(Color.blue);
        g.fillRect(200, 50, 50, 540);

        g.setColor(Color.red);
        g.fillRect(300, 180, 50, 410);


    }
}
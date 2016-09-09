package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class opdracht47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(30, 30, 200, 200);
        g.drawOval(40, 40, 40, 40);
        g.drawOval(170, 170, 40, 40);
        g.drawOval(40, 170, 40, 40);
        g.drawOval(170, 40, 40, 40);


    }
}
package Hoofdstuk4;


import java.awt.*;
import java.applet.*;

public class opdracht41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);


        g.drawLine(177,361,438,361);
        g.drawLine(177,141,177,361);
        g.drawLine(177,141,438,361);

    }
}
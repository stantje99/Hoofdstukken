package hoofdstuk1;

import java.awt.*;
import java.applet.*;

public class Opdracht22 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Danny", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Metz", 50, 75 );
    }
}


package hoofdstuk1;

//Voorbeeld 2.2

import java.awt.*;
import java.applet.*;

public class Opdracht21 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Danny", 50, 60 );
    }
}

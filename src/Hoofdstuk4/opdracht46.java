package Hoofdstuk4;

import java.applet.*;
import java.awt.*;


/**
 * This applet draws a traffic light.  The user controls the color of
 * the light (red, yellow, green) by clicking one of three buttons.
 * HTML:  <applet code="TrafficLight.class" width=200 height=200></applet>
 */

public class opdracht46 extends Applet
{


        public void paint (Graphics da)
        {
            da.setColor (Color.darkGray);
            da.fillRect (70, 20, 50, 150);
            da.setColor (Color.green);
            da.fillOval (80, 30, 30, 30);
            da.setColor (Color.orange);
            da.fillOval (80, 80, 30, 30);
            da.setColor (Color.red);
            da.fillOval (80, 130, 30, 30);
            da.setColor (Color.darkGray);
            da.fillRect (90, 165, 10, 200);
        }

    }


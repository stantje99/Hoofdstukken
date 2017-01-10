package Hoofdstuk14;

import javax.xml.soap.Text;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdrachth14 extends Applet {

    int computer; /* Zet van de computer */
    int speler; /* Zet van de speler */
    int afbeedingen = 23; /*Aantal afbeeldingen */

    TextField text; /* Zet invoeren */
    Button button; /* Button voor zet */
    Image img; /* De images */
    Boolean beurt = true; /*Wie aan de beurt is*/
    String win; /* De winnaar */

    Boolean beurtt = true;

    public void init() {
        text = new TextField("", 10);
        button = new Button("Klik");

        add(text);
        add(button);

        URL pad = Praktijkopdrachth14.class.getResource("/img/");
        img = getImage(pad, "star.png");

        text.addActionListener(new TextListener());
        button.addActionListener(new TextListener());


    }

    public void paint(Graphics g) {

        if (afbeedingen > 0) {
            int x = 50;
            int y = 50;

            for (int i = 0; i < afbeedingen; i++) {
                g.drawImage(img, x, y, 55, 55, this);

                x += 55;
                if (i % 4 == 3) {
                    x = 50;
                    y += 55;
                }

            }
            g.setColor(Color.red);
            g.drawString("Laatse zet speler " + speler, 400, 50);
            g.drawString("Laatse zet computer " + computer, 400, 90);
            g.setColor(Color.black);

        } else {
            g.drawString(win, 20, 100);
        }
        if (beurt == false) {
            g.setColor(Color.blue);
            g.drawString("Invoer is fout", 400, 200);
            g.setColor(Color.black);

        }

        if (beurtt == true) {
            g.drawString("Jij bent aan de beurt", 400, 150);
        }
    }

    private int set() {
        int take = 0;
        double a;
        int a2;

        a = Math.random();
        a2 = (int) (a * 3 + 1);
        int spelerbeurt;
        spelerbeurt = afbeedingen % 4;

        if (spelerbeurt == 0) {
            take = 3;
        }

        if (spelerbeurt == 1) {
            take = a2;
        }

        if (spelerbeurt == 2) {
            take = 1;
        }

        if (spelerbeurt == 3) {
            take = 2;
        }
        return take;
    }

    public class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String b = text.getText();
            int spelerstap = Integer.parseInt(b);

            beurtt = false;

            if (spelerstap < 4 && spelerstap > 0) {

                speler = spelerstap;
                afbeedingen -= speler;
                afbeedingen -= computer;

                if (afbeedingen < 1) {
                    win = "Je hebt veloren";
                } else {
                    computer = set();
                    afbeedingen -= computer;
                    if (afbeedingen < 0) {
                        win = "Je hebt gewonnen";
                    }
                }
            } else {
                beurt = false;
                
            }
            repaint();
        }
    }
}

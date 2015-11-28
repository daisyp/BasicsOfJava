package praks10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Spiral extends Applet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Graphics g;

    public void paint(Graphics g) {
        this.g = g;
        joonistaTaust();
        //joonistaRing();
        joonistaSpiraal(20);
    }

    /**
     * Katab tausta valgega
     */
    public void joonistaTaust() {
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
    }

    /**
     * Joonistab ringi
     */
    public void joonistaRing() {
        g.setColor(Color.black);
        int keskkohtX = getWidth() / 2;
        int keskkohtY = getHeight() / 2;
        int raadius = 50;

        for (double nurk = 0; nurk <= Math.PI * 2; nurk = nurk + .03) {
            int x = (int) (raadius * Math.cos(nurk));
            int y = (int) (raadius * Math.sin(nurk));
            g.fillRect(keskkohtX + x, keskkohtY + y, 2, 2);
        }
    }

    public void joonistaSpiraal(int ringCount){
        g.setColor(Color.black);
        int keskkohtX = getWidth() / 2;
        int keskkohtY = getHeight() / 2;
        int raadius = 10;

        for (double nurk = 0; nurk <= Math.PI * 2 * ringCount; nurk = nurk + .03) {
            int x = (int) ((raadius + nurk) * Math.cos(nurk));
            int y = (int) ((raadius + nurk) * Math.sin(nurk));
            g.fillOval(keskkohtX + x, keskkohtY + y, 4, 4);
        }
    }
}

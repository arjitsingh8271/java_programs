import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 20, 20);
    }
}

/*
$ javac SimpleApplet.java
$ appletviewer SimpleApplet.java
*/
package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;

public class Main {

    public static void main(String[] args) {

        /*
        Frame f = new Frame("Hello java, this is container");
        Label lbl = new Label("This is component!");

        f.add(lbl);
        f.setSize(300, 100);
        f.setVisible(true);
        */
            LayoutManager layOut = new FlowLayout(FlowLayout.LEFT);
            Frame f = new Frame();
            f.setLayout(layOut);
            for (int i = 1; i < 10; i++) {
                Button b = new Button("Button" + i);
                f.add(b);
            }
            f.setSize(400, 300);
            f.setVisible(true);

    }

}

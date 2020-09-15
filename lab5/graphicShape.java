package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class graphicShape extends JFrame {

    public graphicShape() {
        setLayout(new GridLayout(4,5));
        JPanel[] panel = new JPanel[20];
        for (int i = 0;i < 20;i++) {
            panel[i] = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    int rColor = (int)(Math.random() * 255);
                    int gColor = (int)(Math.random() * 255);
                    int bColor = (int)(Math.random() * 255);
                    int x = (int)(Math.random() * 100);
                    int y = (int)(Math.random() * 100);
                    int width = (int)(Math.random() * (200 - x));
                    int height = (int)(Math.random() * (200 - y));
                    switch ((int)(Math.random() * 3))
                    {
                        case 0: {
                            int radius = (int)(Math.random() * 150);
                            width = (int)(Math.random() * (150 - radius));
                            height = (int)(Math.random() * (150 - radius));
                            Circle circle = new Circle(new Color(rColor, gColor, bColor), width, height, radius);
                            circle.draw(g);
                            break;
                        }
                        case 1: {

                            Rectangle rectangle = new Rectangle(new Color(rColor, gColor, bColor), x, y, width, height);
                            rectangle.draw(g);
                            break;
                        }
                        case 2: {
                            Oval oval = new Oval(new Color(rColor, gColor, bColor), x, y, width, height);
                            oval.draw(g);
                            break;
                        }
                    }
                }
            };
            panel[i].setBorder(BorderFactory.createLineBorder(Color.black));
            add(panel[i]);
        }
        setSize(400, 500);
        setVisible(true);
    }
}



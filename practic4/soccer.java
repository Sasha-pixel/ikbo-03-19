package ru.mirea.practic4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.PrivateKey;

public class soccer extends JFrame {
    private int resultMilan = 0, resultReal = 0;
    private String lastScorer = "N/A";

    public soccer() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JButton  buttonMilan= new JButton("AC Milan");
        JLabel lableScore = new JLabel("Result: " +  resultMilan + " X " + resultReal);
        JLabel lableLast = new JLabel("Last Scorer: " + lastScorer);
        buttonMilan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resultMilan++;
                lableScore.setText("Result: " +  resultMilan + " X " + resultReal);
                lastScorer = "Ac Milan";
                lableLast.setText("Last Scorer: " + lastScorer);
            }
        });
        JButton buttonReal = new JButton("Real Madrid");
        buttonReal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resultReal++;
                lableScore.setText("Result: " +  resultMilan + " X " + resultReal);
                lastScorer = "Real Madrid";
                lableLast.setText("Last Scorer: " + lastScorer);
            }
        });


        panel.add(buttonMilan, BorderLayout.WEST);
        panel.add(buttonReal, BorderLayout.EAST);
        panel.add(new Label("Winner: DRAW"), BorderLayout.NORTH);
        panel.add(lableScore, BorderLayout.CENTER);
        panel.add(lableLast, BorderLayout.SOUTH);

        setSize(800, 600);

        add(panel);
    }
}

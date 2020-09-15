package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class randomNumber extends JFrame {
    private int number, numOfTry = 0;

    public randomNumber() {
        setLayout(new FlowLayout());
        TextField textField = new TextField("Угадайте число, у Вас 3 попытки");
        Button button = new Button("OK");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (numOfTry < 3) {
                    int buf = Integer.parseInt(textField.getText());
                    if (buf == number) {
                        JOptionPane.showMessageDialog(null, "Вы угадали", "Ура",JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                    else if (buf < number) {
                        JOptionPane.showMessageDialog(null, "Вы не угадали, попробуйте число побольше", "Неудача",JOptionPane.INFORMATION_MESSAGE);
                        numOfTry++;
                    }
                    else if (buf > number) {
                        JOptionPane.showMessageDialog(null, "Вы не угадали, попробуйте число поменьше", "Неудача",JOptionPane.INFORMATION_MESSAGE);
                        numOfTry++;
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Попытки закончились", "Приходите ещё",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }
        });
        add(textField);
        add(button);
        number = (int) (Math.random() * 21);
        for (int i = 0;i < 3;i++) {

        }
        setVisible(true);
        setSize(300, 200);
    }
}

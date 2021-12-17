package pr4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Football extends JFrame {
    int milanCnt = 0;
    int madridCnt = 0;
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Результат: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Победитель: DRAW");

    Font fnt1 = new Font("Times new roman",Font.BOLD,20);
    Font fnt2 = new Font("Serif",Font.BOLD,20);

    public Football() {
        setSize(240, 240);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        milan.setFont(fnt1);
        madrid.setFont(fnt1);
        result.setFont(fnt1);
        lastScorer.setFont(fnt1);
        winner.setFont(fnt2);
        milan.setBorderPainted(false);
        milan.setFocusPainted(false);
        milan.setBackground(Color.RED);
        milan.setForeground(Color.BLACK);
        madrid.setBorderPainted(false);
        madrid.setFocusPainted(false);
        madrid.setBackground(Color.WHITE);
        madrid.setForeground(Color.decode("0x03009c"));
        add(milan);
        add(madrid);
        add(result);
        add(lastScorer);
        add(winner);
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanCnt++;
                result.setText("Результат: " + milanCnt + " X " + madridCnt);
                lastScorer.setText("Последним забил: AC Milan");
                if(milanCnt == madridCnt)
                    winner.setText("Победитель: Ничья");
                else if(milanCnt > madridCnt)
                    winner.setText("Победитель: AC Milan");
                else
                    winner.setText("Победитель: Real Madrid");
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridCnt++;
                result.setText("Результат: " + milanCnt + " X " + madridCnt);
                lastScorer.setText("Последним забил: Real Madrid");
                if(milanCnt == madridCnt)
                    winner.setText("Победитель: DRAW");
                else if(milanCnt > madridCnt)
                    winner.setText("Победитель: AC Milan");
                else
                    winner.setText("Победитель: Real Madrid");
            }
        });
    }
    public static void main(String[]args) {
        new Football().setVisible(true);
    }
}
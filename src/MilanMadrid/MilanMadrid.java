package MilanMadrid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanMadrid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MILAN VS MADRID");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 160));

        JButton milan = new JButton("AC MILAN");
        JButton madrid = new JButton("REAL MADRID");

        JLabel result = new JLabel("RESULT: 0 x 0");
        JLabel scorer = new JLabel("LAST SCORER: N/A");
        JButton winner = new JButton("END MATCH");

        panel.add(milan);
        panel.add(madrid);
        panel.add(result);
        panel.add(scorer);
        panel.add(winner);

        final int[] madrid_score = {0};
        final int[] milan_score = {0};
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scorer.setText("LAST SCORER: MILAN");
                milan_score[0]++;
                result.setText(String.format("RESULT: %d x %d", milan_score[0], madrid_score[0]));
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scorer.setText("LAST SCORER: MADRID");
                madrid_score[0]++;
                result.setText(String.format("RESULT: %d x %d", milan_score[0], madrid_score[0]));
            }
        });
        winner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (madrid_score[0] == milan_score[0])
                    JOptionPane.showMessageDialog(frame, "DRAW");
                else
                    JOptionPane.showMessageDialog(frame, madrid_score[0] > milan_score[0] ? "WINNER: REAL MADRID" : "WINNER: AC MILAN");
            }
        });
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

public class Cronometro {
    public static void main(String[] args) {
        int timeDecremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo a ser cronometrado(em segundos, 10min = 600)"));

        int timer;

        timer = timeDecremento;

        JFrame frame = new JFrame("Cronômetro");
        JLabel label = new JLabel();
        label.setFont(new Font("Tahoma", Font.PLAIN, 30));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 150);
        frame.setVisible(true);
       frame.getContentPane().setBackground(Color.CYAN);

        for (;timeDecremento != 0; timeDecremento--){
            label.setText("Tempo cronometrado: " + timer +" segundos");
            try {
                Thread.sleep(1000);
                if (timer == 0){
                    System.exit(0);
                }
            } catch (InterruptedException erro) {
                erro.printStackTrace();
            }
            timer --;
        }
        JOptionPane.showMessageDialog(null, "Cronômetro finalizado!");
        frame.dispose();
    }
}

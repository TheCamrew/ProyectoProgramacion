package code.main;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author a21iagopl
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("SI LEES ESTO RECUERDAME DARLE UN PUÑETAZO A REBECA");
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("JAJA si hay que cambiar esto");

        window.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getClassLoader().getResource("resources/img/player/player_0.png")));

        GameFrame gameFrame = new GameFrame();
        window.add(gameFrame);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gameFrame.startGameThread();

    }
}

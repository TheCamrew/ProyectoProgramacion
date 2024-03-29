package code.main;

import code.map.MapController;
import code.map.MapReader;
import code.database.DbController;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Rebeca Noya y Iago Pena
 */
public class Main {

    public static void main(String[] args) {
        //System.out.println(System.getenv("APPDATA"));

        JFrame window = new JFrame();
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Match It");

        window.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getClassLoader().getResource("resources/img/icon/icon.png")));

        ReferenceController.dbController = new DbController();

        ReferenceController.mapReader = new MapReader();

        ReferenceController.keyHandler = new KeyHandler();
        ReferenceController.gameFrame = new GameFrame();
        ReferenceController.mapController = new MapController();
        ReferenceController.infoController = new InfoController();
        ReferenceController.audioController = new AudioController();

        window.add(ReferenceController.gameFrame);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        ReferenceController.gameFrame.startGameThread();

    }
}

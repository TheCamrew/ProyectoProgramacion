package code.main;

import code.gameObjects.Entity;
import code.transform.Vector2;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author a21iagopl
 */
public class KeyHandler implements KeyListener {

    MapController mp;
    public static Entity player;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    private boolean canPressR, canPressW, canPressS, canPressA, canPressD;

    public KeyHandler(MapController mp) {
        this.mp = mp;
        canPressR = true;
        canPressW = true;
        canPressS = true;
        canPressA = true;
        canPressD = true;
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (mp.isLoading()) {
            return;
        }

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_R && canPressR) {
            System.out.println("xd");
            mp.changeMap();
            canPressR = false;
        } else if (key == KeyEvent.VK_W && canPressW) {
            player.move(new Vector2(0, -1));
            canPressW = false;

        } else if (key == KeyEvent.VK_S && canPressS) {
            player.move(new Vector2(0, 1));
            canPressS = false;

        } else if (key == KeyEvent.VK_A && canPressA) {

            player.move(new Vector2(-1, 0));
            canPressA = false;

        } else if (key == KeyEvent.VK_D && canPressD) {

            player.move(new Vector2(1, 0));
            canPressD = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_R:
                canPressR = true;
                break;
            case KeyEvent.VK_W:
                canPressW = true;
                break;
            case KeyEvent.VK_S:
                canPressS = true;
                break;
            case KeyEvent.VK_A:
                canPressA = true;
                break;
            case KeyEvent.VK_D:
                canPressD = true;
                break;
            default:
                break;
        }
    }

}

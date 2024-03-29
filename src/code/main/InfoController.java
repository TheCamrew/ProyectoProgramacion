package code.main;

import code.gameObjects.GameObject;
import code.gameObjects.GameObjectSprite;
import code.gameObjects.UI;
import code.transform.Vector2;

/**
 *
 * @author Rebeca Noya y Iago Pena
 */
public class InfoController {

    private static GameObject[] infoBar = new GameObject[GameFrame.TILE_SCREEN_SIZE.x];

    private static int level;
    private static int steps;
    private static int stepsCurrentLevel = 1;
    private final int yPos = 0;

    public int getStepsCurrentLevel() {
        return stepsCurrentLevel;
    }

    public InfoController() {
        loadInfo();
    }

    private void loadInfo() {

        infoBar[0] = new UI(new Vector2(0, yPos), GameObjectSprite.LETTL);
        infoBar[1] = new UI(new Vector2(1, yPos), GameObjectSprite.LETTV);
        infoBar[2] = new UI(new Vector2(2, yPos), GameObjectSprite.LETTL);
        infoBar[3] = new UI(new Vector2(3, yPos), GameObjectSprite.LETTSEP);
        updateInfo();
    }

    public void updateInfo() {

        if (level > 99) {
            level = 99;
        } else if (level < 0) {
            level = 0;
        }

        if (level < 10) {
            infoBar[4] = new UI(new Vector2(4, yPos), getNumObject(level));
        } else {
            infoBar[4] = new UI(new Vector2(4, yPos), getNumObject(level / 10));
            infoBar[5] = new UI(new Vector2(5, yPos), getNumObject(level - ((level / 10) * 10)));
        }

        if (steps > 999) {
            steps = 999;

        } else if (steps < 0) {
            steps = 0;
        }

        if (steps < 10) {
            infoBar[infoBar.length - 1] = new UI(new Vector2(infoBar.length - 1, yPos), getNumObject(steps));
        } else if (steps < 100) {
            infoBar[infoBar.length - 2] = new UI(new Vector2(infoBar.length - 2, yPos), getNumObject(steps / 10));
            infoBar[infoBar.length - 1] = new UI(new Vector2(infoBar.length - 1, yPos), getNumObject(steps - ((steps / 10) * 10)));
        } else {
            infoBar[infoBar.length - 3] = new UI(new Vector2(infoBar.length - 3, yPos), getNumObject(steps / 100));
            infoBar[infoBar.length - 2] = new UI(new Vector2(infoBar.length - 2, yPos), getNumObject((steps / 10) - ((steps / 100) * 10)));

            infoBar[infoBar.length - 1] = new UI(new Vector2(infoBar.length - 1, yPos), getNumObject(steps - ((steps / 10) * 10)));
        }

    }

    public void increaseSteps() {
        steps++;
        stepsCurrentLevel++;
    }

    public void increaseLevel() {
        level++;
    }

    public void resetCurrentStepCount() {
        stepsCurrentLevel = 0;
    }

    public static GameObjectSprite getNumObject(int num) {
        switch (num) {
            case 0:
                return GameObjectSprite.NUM0;
            case 1:
                return GameObjectSprite.NUM1;
            case 2:
                return GameObjectSprite.NUM2;
            case 3:
                return GameObjectSprite.NUM3;
            case 4:
                return GameObjectSprite.NUM4;
            case 5:
                return GameObjectSprite.NUM5;
            case 6:
                return GameObjectSprite.NUM6;
            case 7:
                return GameObjectSprite.NUM7;
            case 8:
                return GameObjectSprite.NUM8;
            case 9:
                return GameObjectSprite.NUM9;
            default:
                return null;
        }
    }

    public int getLevel() {
        return level;
    }

    public int getSteps() {
        return steps;
    }

    /**
     * @return the infoBar
     */
    public GameObject[] getInfoBar() {
        return infoBar;
    }
}

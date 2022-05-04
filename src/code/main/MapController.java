package code.main;

import code.gameObjects.*;
import code.transform.Vector2;

/**
 *
 *
 * @author a21rebecanf
 */
public class MapController {

    public static GameObject[][] background = new GameObject[GameFrame.TILE_SCREEN_SIZE.y - 1][GameFrame.TILE_SCREEN_SIZE.x];

    public static GameObject[][] gameObjects = new GameObject[GameFrame.TILE_SCREEN_SIZE.y - 1][GameFrame.TILE_SCREEN_SIZE.x];

    GameFrame gf;

    boolean loading;

    public MapController(GameFrame gf) {
        this.gf = gf;
        loading = true;
        loadMap();
    }

    public boolean isLoading() {
        return loading;
    }

    public void changeMap() {
        loading = true;
        //gf.sleepThread(1000);
        for (int i = 0; i < MapController.gameObjects.length; i++) {
            for (int j = 0; j < MapController.gameObjects[0].length; j++) {

                background[i][j] = null;
                gameObjects[i][j] = null;
                //gf.sleepThread(10);
            }
        }

        //loadMap();
        loading = false;
    }

    private void loadMap() {
        //cargar mapa
        
        for (int i = 0; i < MapController.gameObjects[0].length; i++) {
            for (int j = 0; j < MapController.gameObjects.length; j++) {
                
                background[j][i] = new Entity(new Vector2(i, j), GameObjectType.BOX, 1);
            }
        }
        //borrar esto
        Entity player = new Entity(new Vector2(0, 0), GameObjectType.PLAYER, 1);
        gameObjects[0][0] = player;
        KeyHandler.player = player;
        
        gameObjects[5][5] = new Entity(new Vector2(5, 5), GameObjectType.KEY, 1);
        gameObjects[6][6] = new Entity(new Vector2(6, 6), GameObjectType.KEY, 1);
        loading = false;
    }
}

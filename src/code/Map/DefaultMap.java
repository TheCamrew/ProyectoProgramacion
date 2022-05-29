package code.Map;

import code.gameObjects.GameObject;
import code.gameObjects.GameObjectSprite;
import code.transform.Vector2;

/**
 *
 * @author a21iagopl
 */
public class DefaultMap extends Map {

    public DefaultMap() {
        super(new MapLayer(), new MapLayer());
        background = generateLayer();
    }

    private MapLayer generateLayer() {
        MapLayer out = new MapLayer();

        out.level[4][2] = new GameObject(new Vector2(4, 2), GameObjectSprite.TILEN);
        out.level[5][2] = new GameObject(new Vector2(5, 2), GameObjectSprite.TILEO);

        out.level[7][2] = new GameObject(new Vector2(7, 2), GameObjectSprite.TILEM);
        out.level[8][2] = new GameObject(new Vector2(8, 2), GameObjectSprite.TILEA);
        out.level[9][2] = new GameObject(new Vector2(9, 2), GameObjectSprite.TILEP);
        out.level[10][2] = new GameObject(new Vector2(10, 2), GameObjectSprite.TILES);

        out.level[5][4] = new GameObject(new Vector2(5, 4), GameObjectSprite.TILEF);
        out.level[6][4] = new GameObject(new Vector2(6, 4), GameObjectSprite.TILEO);
        out.level[7][4] = new GameObject(new Vector2(7, 4), GameObjectSprite.TILEU);
        out.level[8][4] = new GameObject(new Vector2(8, 4), GameObjectSprite.TILEN);
        out.level[9][4] = new GameObject(new Vector2(9, 4), GameObjectSprite.TILED);

        return out;
    }
}

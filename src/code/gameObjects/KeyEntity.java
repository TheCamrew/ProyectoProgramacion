package code.gameObjects;

import code.main.ReferenceController;
import code.transform.Vector2;

/**
 *
 * @author a21rebecanf
 */
public class KeyEntity extends Entity {

    public KeyEntity(Vector2 position) {
        super(position, GameObjectType.KEY);
        sep = 1;
    }

    @Override
    protected boolean checkCollision(Vector2 newPosition, Vector2 pos) {
        GameObject temp = ReferenceController.mapController.currentMap.playground.level[newPosition.x][newPosition.y];

        switch (temp.objectType) {
            case BOX:
            case KEY:
                Entity tempEntity = (Entity) temp;
                if (tempEntity.move(pos)) {
                    changePosition(newPosition);
                    return true;
                } else {
                    return false;
                }
            case LOCK:
                openLock(newPosition);
                ReferenceController.audioController.play(3);
                return true;
            default:
                return false;
        }
    }

    protected void openLock(Vector2 newPosition) {
        Vector2 lastPosition = new Vector2(position.x, position.y);
        ReferenceController.mapController.currentMap.playground.level[newPosition.x][newPosition.y] = null;
        ReferenceController.mapController.currentMap.playground.level[lastPosition.x][lastPosition.y] = null;
    }

}

package code.gameObjects;

import static code.gameObjects.GameObject.MAX_FRAME;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Rebeca Noya y Iago Pena
 */
public enum GameObjectSprite {

    PLAYER("player/player"),
    BOX("box/box"),
    FLAG("flag/flag"),
    KEY("key/key"),
    LOCK("lock/lock"),
    WALL("wall/wall"),
    MONSTER("monster/monster"),
    TILE("tiles/tile/tile"),
    TILEW("tiles/tilew/tile_w"),
    TILEA("tiles/tilea/tile_a"),
    TILES("tiles/tiles/tile_s"),
    TILED("tiles/tiled/tile_d"),
    TILER("tiles/tiler/tile_r"),
    TILEF("tiles/tilef/tile_f"),
    TILEM("tiles/tilem/tile_m"),
    TILEN("tiles/tilen/tile_n"),
    TILEO("tiles/tileo/tile_o"),
    TILEP("tiles/tilep/tile_p"),
    TILEU("tiles/tileu/tile_u"),
    TILEC("tiles/tilec/tile_c"),
    TILEE("tiles/tilee/tile_e"),
    TILEL("tiles/tilel/tile_l"),
    TILET("tiles/tilet/tile_t"),
    TILEV("tiles/tilev/tile_v"),
    LETTA("characters/letters/a/a"),
    LETTD("characters/letters/d/d"),
    LETTE("characters/letters/e/e"),
    LETTSEP("characters/letters/sep/sep"),
    LETTL("characters/letters/l/l"),
    LETTS("characters/letters/s/s"),
    LETTV("characters/letters/v/v"),
    LETTW("characters/letters/w/w"),
    NUM0("characters/numbers/0/0"),
    NUM1("characters/numbers/1/1"),
    NUM2("characters/numbers/2/2"),
    NUM3("characters/numbers/3/3"),
    NUM4("characters/numbers/4/4"),
    NUM5("characters/numbers/5/5"),
    NUM6("characters/numbers/6/6"),
    NUM7("characters/numbers/7/7"),
    NUM8("characters/numbers/8/8"),
    NUM9("characters/numbers/9/9");

    GameObjectSprite(String path) {

        loadSprites(path);

    }
    ; 
    
    private BufferedImage[] sprites;

    private void loadSprites(String path) {
        
        sprites = new BufferedImage[MAX_FRAME];

        try {
            sprites[0] = ImageIO.read(getClass().getResourceAsStream("/resources/img/" + path + "_0.png"));
            sprites[1] = ImageIO.read(getClass().getResourceAsStream("/resources/img/" + path + "_1.png"));
            sprites[2] = ImageIO.read(getClass().getResourceAsStream("/resources/img/" + path + "_2.png"));
        } catch (IOException ex) {
            Logger.getLogger(GameObjectSprite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the sprites
     */
    public BufferedImage[] getSprites() {
        return sprites;
    }
}

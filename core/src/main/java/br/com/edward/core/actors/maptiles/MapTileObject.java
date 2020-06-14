package br.com.edward.core.actors.maptiles;

import com.badlogic.gdx.maps.tiled.objects.TiledMapTileMapObject;
import br.com.edward.core.actors.RigidBody;
import br.com.edward.core.gamesys.GameManager;
import br.com.edward.core.screens.PlayScreen;

/**
 *
 *
 * MapTileObject
 */
public abstract class MapTileObject extends RigidBody {

    protected TiledMapTileMapObject mapObject;

    public MapTileObject(PlayScreen playScreen, float x, float y, TiledMapTileMapObject mapObject) {
        super(playScreen, x, y);

        this.mapObject = mapObject;

        setRegion(mapObject.getTextureRegion());

        float width = 16 / GameManager.PPM;
        float height = 16 / GameManager.PPM;

        setBounds(x - width / 2, y - height / 2, width, height);
    }

    @Override
    public void update(float delta) {

    }
}

package br.com.edward.core.actors.maptiles;

import com.badlogic.gdx.maps.tiled.objects.TiledMapTileMapObject;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import br.com.edward.core.actors.Collider;
import br.com.edward.core.actors.Mario;
import br.com.edward.core.gamesys.GameManager;
import br.com.edward.core.screens.PlayScreen;

/**
 *
 *
 * Flagpole
 */

public class Flagpole extends MapTileObject {
    public Flagpole(PlayScreen playScreen, float x, float y, TiledMapTileMapObject mapObject) {
        super(playScreen, x, y, mapObject);
    }

    @Override
    protected void defBody() {

        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set(getX(), getY());
        bodyDef.type = BodyDef.BodyType.StaticBody;

        body = world.createBody(bodyDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(16 / GameManager.PPM / 2, 16 / GameManager.PPM / 2);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.filter.categoryBits = GameManager.FLAGPOLE_BIT;
        fixtureDef.filter.maskBits = GameManager.MARIO_BIT;
        fixtureDef.shape = shape;
        fixtureDef.isSensor = true;

        body.createFixture(fixtureDef).setUserData(this);

        shape.dispose();

    }


    @Override
    public void onTrigger(Collider other) {
        if (other.getUserData() instanceof Mario) {
            playScreen.levelCompleted();
            ((Mario) other.getUserData()).levelCompleted();
        }

    }
}

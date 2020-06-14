package br.com.edward.core.actors.effects;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import br.com.edward.core.actors.RigidBody;
import br.com.edward.core.screens.PlayScreen;

/**
 *
 *
 * Effect
 */
public abstract class Effect extends RigidBody {

    protected TextureAtlas textureAtlas;

    public Effect(PlayScreen playScreen, float x, float y) {
        super(playScreen, x, y);
        this.textureAtlas = playScreen.getTextureAtlas();

    }

}

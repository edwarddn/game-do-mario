package br.com.edward.core.actors.items;

import br.com.edward.core.actors.RigidBody;
import br.com.edward.core.screens.PlayScreen;

/**
 *
 *
 * Item
 */
public abstract class Item extends RigidBody {

    protected String name = "item";

    public Item(PlayScreen playScreen, float x, float y) {
        super(playScreen, x, y);
    }

    public String getName() {
        return name;
    }

    public abstract void use();

}

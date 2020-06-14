package br.com.edward.core;

import br.com.edward.core.gamesys.GameManager;
import br.com.edward.core.screens.PlayScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SuperMario extends Game {

	public SpriteBatch batch;
	private GameManager gameManager;

	@Override
	public void create () {
		batch = new SpriteBatch();

		if (GameManager.instance != null) {
			gameManager = GameManager.instance;
		} else {
			gameManager = new GameManager();
		}

		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose() {
		super.dispose();
		gameManager.dispose();
	}
}

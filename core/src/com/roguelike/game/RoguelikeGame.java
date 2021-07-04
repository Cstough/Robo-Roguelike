package com.roguelike.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import static com.roguelike.game.Constants.*;

public class RoguelikeGame extends Game {

	SpriteBatch batch;
	OrthographicCamera camera;

	@Override
	public void create() {

		batch = new SpriteBatch();
		camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
	}

	@Override
	public void render() {
		ScreenUtils.clear(Color.BLACK);

		batch.setProjectionMatrix(camera.combined);

		batch.begin();



		batch.end();
	}
}

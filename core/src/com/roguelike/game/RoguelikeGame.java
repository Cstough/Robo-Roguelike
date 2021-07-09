package com.roguelike.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.roguelike.game.Engine.ScreenManager;

import static com.roguelike.game.Constants.*;

public class RoguelikeGame extends Game {

	SpriteBatch batch;
	OrthographicCamera camera;

	Assets assets;

	Sprite spr;

	ScreenManager sm;

	@Override
	public void create() {

		batch = new SpriteBatch();
		camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);

		assets = new Assets();

		SplashScreen splashScreen = new SplashScreen();
		sm = new ScreenManager(splashScreen);
	}

	@Override
	public void render() {
		ScreenUtils.clear(Color.BLACK);

		camera.update();

		sm.Update(batch);

		batch.setProjectionMatrix(camera.combined);

		batch.begin();

		batch.end();
	}
}

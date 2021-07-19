package Implementation;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Engine.Assets;
import com.mygdx.game.Engine.ScreenManager;

public class Roguelike extends Game {

	ScreenManager screenManager;
	SpriteBatch batch;


	@Override
	public void create() {
		screenManager = new ScreenManager();
		batch = new SpriteBatch();

		screenManager.ChangeScreen(new MainMenuScreen());
	}

	@Override
	public void render() {
		super.render();

		screenManager.Update(Gdx.graphics.getDeltaTime());

		screenManager.Render(batch);

	}
}

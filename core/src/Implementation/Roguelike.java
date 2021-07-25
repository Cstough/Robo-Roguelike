package Implementation;

import Implementation.Screens.MainMenuScreen;
import Implementation.TransitionEffects.FadeInEffect;
import Implementation.TransitionEffects.FadeOutEffect;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Engine.ScreenManager;

public class Roguelike extends Game {

	public static ScreenManager screenManager;
	SpriteBatch batch;


	@Override
	public void create() {
		screenManager = new ScreenManager();
		batch = new SpriteBatch();

		screenManager.SetScreen(new MainMenuScreen());
		screenManager.SetTransitionEffects(new FadeInEffect(), new FadeOutEffect());
	}

	@Override
	public void render() {
		super.render();

		screenManager.Update(Gdx.graphics.getDeltaTime());

		screenManager.Render(batch);

	}
}

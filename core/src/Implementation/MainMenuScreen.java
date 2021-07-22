package Implementation;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Engine.Assets;
import com.mygdx.game.Engine.Screen;

public class MainMenuScreen extends Screen {

    Assets assets;

    public MainMenuScreen() {
        assets = new Assets();

        //Load Assets Here
    }

    @Override
    public void Update(float delta) {
        System.out.println("Main menu!");
        if(Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
            Roguelike.screenManager.ChangeScreen(new GameplayScreen());
        }
    }

    @Override
    public void Render(SpriteBatch batch) {

    }
}

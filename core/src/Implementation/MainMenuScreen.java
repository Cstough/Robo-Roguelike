package Implementation;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Engine.Assets;
import com.mygdx.game.Engine.Screen;

import static Implementation.Constants.CAMERA_HEIGHT;
import static Implementation.Constants.CAMERA_WIDTH;

public class MainMenuScreen extends Screen {

    Assets assets;
    OrthographicCamera camera;

    public MainMenuScreen() {
        assets = new Assets();
        camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);

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
        ScreenUtils.clear(Color.RED);

        batch.setProjectionMatrix(camera.combined);
        batch.enableBlending();
    }
}

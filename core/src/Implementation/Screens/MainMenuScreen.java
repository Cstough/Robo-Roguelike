package Implementation.Screens;

import Implementation.Roguelike;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.Engine.Assets;
import com.mygdx.game.Engine.Screen;

import static Implementation.Constants.CAMERA_HEIGHT;
import static Implementation.Constants.CAMERA_WIDTH;

public class MainMenuScreen extends Screen {

    Assets assets;

    public MainMenuScreen() {
        assets = new Assets();
        camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);

        //Load Assets Here
    }

    @Override
    public void Update(float delta) {
        if(Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
            Roguelike.screenManager.ChangeScreen(new GameplayScreen());
        }
    }

    @Override
    public void Render(SpriteBatch batch) {
        ScreenUtils.clear(Color.RED);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.enableBlending();
    }
}

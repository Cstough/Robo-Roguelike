package Implementation.Screens;

import Implementation.EntityManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Engine.Screen;

import static Implementation.Constants.CAMERA_HEIGHT;
import static Implementation.Constants.CAMERA_WIDTH;

public class GameplayScreen extends Screen {

    public GameplayScreen() {
        entityManager = new EntityManager();
        camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
    }

    @Override
    public void Update(float delta) {
        entityManager.Update(delta);
        if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }
    }

    @Override
    public void Render(SpriteBatch batch) {
        ScreenUtils.clear(Color.BLUE);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        entityManager.Render(batch);
    }
}

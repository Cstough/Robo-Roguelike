package Implementation.Screens;

import Implementation.Roguelike;
import com.badlogic.gdx.*;
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
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Engine.Assets;
import com.mygdx.game.Engine.Screen;

import static Implementation.Constants.CAMERA_HEIGHT;
import static Implementation.Constants.CAMERA_WIDTH;

public class MainMenuScreen extends Screen {

    Assets assets;
    Stage ui;
    Table menu;
    Viewport viewport;
    Skin skin;
    TextButton start, quit;

    public MainMenuScreen() {
        assets = new Assets();
        camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);

        viewport = new ScreenViewport(this.camera);
        ui = new Stage(viewport, Roguelike.batch);
        skin = new Skin(Gdx.files.internal("default/skin/uiskin.json"));
        menu = new Table();
        start = new TextButton("Start", skin);
        start.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Roguelike.screenManager.ChangeScreen(new GameplayScreen());
            }
        });
        menu.add(start);
        ui.addActor(menu);

        menu.setFillParent(true);
        Gdx.input.setInputProcessor(ui);
    }

    @Override
    public void Update(float delta) {

    }

    @Override
    public void Render(SpriteBatch batch) {
        ScreenUtils.clear(Color.RED);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.enableBlending();
        batch.end();
        ui.draw();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
    }
}

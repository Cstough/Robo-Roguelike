package Implementation.GameObjects;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Engine.IEntity;

public class Map implements IEntity {

    OrthographicCamera cam;

    public Map(OrthographicCamera camera) {
        this.cam = camera;
    }

    @Override
    public void Update(float delta) {

    }

    @Override
    public void Render(SpriteBatch batch) {

    }
}

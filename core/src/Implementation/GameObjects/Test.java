package Implementation.GameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Engine.IEntity;

public class Test implements IEntity {

    Sprite test;
    float accum;

    public Test() {
        test = new Sprite(new Texture(Gdx.files.internal("badlogic.jpg")));
        test.setOriginCenter();
        test.setPosition(-test.getOriginX() - 50, -test.getOriginY());
    }

    @Override
    public void Update(float delta) {

    }

    @Override
    public void Render(SpriteBatch batch) {
        test.draw(batch);
    }
}

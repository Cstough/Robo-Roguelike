package Implementation.TransitionEffects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Engine.TransitionEffect;

import static Implementation.Constants.*;

public class FadeOutEffect extends TransitionEffect {

    float delay, accum;
    boolean done;
    Sprite test;

    @Override
    public void SetupEffect() {
        accum = 0f;
        delay = FADE_DURATION;
        done = false;
        test = new Sprite(new Texture(Gdx.files.internal("fade.png")));
        test.setScale(CAMERA_WIDTH * 1.1f, CAMERA_HEIGHT * 1.1f);
        test.setOrigin(0, 0);
    }

    @Override
    public void Update(float delta) {
        accum += delta;
        if(accum > delay) {
            done = true;
        }
    }

    @Override
    public void Render(SpriteBatch batch) {
        test.draw(batch, accum/delay);
    }

    @Override
    public boolean IsDone() {
        return done;
    }
}

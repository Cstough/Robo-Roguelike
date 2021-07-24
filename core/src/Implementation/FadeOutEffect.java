package Implementation;

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
    }

    @Override
    public void Update(float delta) {
        accum += delta;
        if(accum > delay) {
            done = true;
        }
        System.out.println("fading out! " + accum);
    }

    @Override
    public void Render(SpriteBatch batch) {
        batch.begin();
        test.draw(batch, accum/delay);
        batch.end();
    }

    @Override
    public boolean IsDone() {
        return done;
    }
}

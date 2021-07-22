package Implementation;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Engine.TransitionEffect;

public class FadeInEffect extends TransitionEffect {

    float delay = 0.5f, accum;
    boolean done;

    @Override
    public void SetupEffect() {
        accum = 0f;
        done = false;
    }

    @Override
    public void Update(float delta) {
        accum += delta;
        if(accum > delay) {
            done = true;
        }
        System.out.println("fading in! " + accum);
    }

    @Override
    public void Render(SpriteBatch batch) {

    }

    @Override
    public boolean IsDone() {
        return done;
    }
}

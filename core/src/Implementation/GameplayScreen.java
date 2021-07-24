package Implementation;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Engine.Screen;

public class GameplayScreen extends Screen {
    @Override
    public void Update(float delta) {
        System.out.println("Gameplay!");
    }

    @Override
    public void Render(SpriteBatch batch) {
        ScreenUtils.clear(Color.BLUE);
    }
}

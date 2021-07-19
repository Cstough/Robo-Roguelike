package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ScreenManager {

    Screen currentScreen;

    public ScreenManager() {

    }

    public void Update(float delta) {
        currentScreen.Update(delta);
    }

    public void Render(SpriteBatch batch) {
        currentScreen.Render(batch);
    }

    public void ChangeScreen(Screen screen) {
        currentScreen = screen;
    }
}

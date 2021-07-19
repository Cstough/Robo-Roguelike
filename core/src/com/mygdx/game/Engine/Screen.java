package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Screen {

    public abstract void Update(float delta);
    public abstract void Render(SpriteBatch batch);

}

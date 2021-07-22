package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class TransitionEffect {

    public abstract void SetupEffect();
    public abstract void Update(float delta);
    public abstract void Render(SpriteBatch batch);
    public abstract boolean IsDone();

}

package com.roguelike.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Screen {



    public Screen() {

    }

    protected abstract void OnEnter();
    protected abstract void Update(SpriteBatch batch);
    protected abstract void OnExit();

}

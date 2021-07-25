package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Screen {

    protected IEntityManager entityManager;
    protected OrthographicCamera camera;

    public abstract void Update(float delta);
    public abstract void Render(SpriteBatch batch);

}

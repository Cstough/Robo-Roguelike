package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface IEntity {

    void Update(float delta);
    void Render(SpriteBatch batch);

}

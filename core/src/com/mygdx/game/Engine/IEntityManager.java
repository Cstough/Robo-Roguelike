package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface IEntityManager {

    void Update(float delta);
    void Render(SpriteBatch batch);
    void AddEntity(IEntity entity);
    void RemoveEntity(IEntity entity);

}

package Implementation;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.mygdx.game.Engine.IEntity;
import com.mygdx.game.Engine.IEntityManager;

public class EntityManager implements IEntityManager {

    DelayedRemovalArray<IEntity> entities;

    public EntityManager() {
        entities = new DelayedRemovalArray<>();
    }

    @Override
    public void Update(float delta) {
        entities.begin();
        for(IEntity e : entities) {
            e.Update(delta);
        }
        entities.end();
    }

    @Override
    public void Render(SpriteBatch batch) {
        entities.begin();
        for(IEntity e : entities) {
            e.Render(batch);
        }
        entities.end();
    }

    @Override
    public void AddEntity(IEntity entity) {
        entities.add(entity);
    }

    @Override
    public void RemoveEntity(IEntity entity) {
        entities.begin();
        entities.removeValue(entity, true);
        entities.end();
    }
}

package com.roguelike.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {

    AssetManager manager;
    Texture missingTexture;

    public Assets() {
        manager = new AssetManager();

        //Queueing assets to load
        manager.load(Constants.TEST_TEXTURE, Texture.class);

        //Load all until finished
        while(!manager.isFinished()) {
            manager.update();
        }
    }

    public Texture GetTexture(String path) {
        if(manager.contains(path)) {
            return manager.get(path);
        }
        return missingTexture;
    }

}

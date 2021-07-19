package com.mygdx.game.Engine;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {

    AssetManager assets;

    public Assets() {
        assets = new AssetManager();
    }

    public void LoadTexture(String name) {
        assets.load(name, Texture.class);
    }

    public Texture getTexture(String name) {
        return assets.get(name, Texture.class);
    }

}

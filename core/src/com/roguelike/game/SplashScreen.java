package com.roguelike.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.roguelike.game.Engine.Screen;

public class SplashScreen extends Screen {

    public SplashScreen() {
        super();
    }

    @Override
    protected void OnEnter() {
        System.out.println("Entering!");
    }

    @Override
    protected void Update(SpriteBatch batch) {
        System.out.println("Updating!");
    }

    @Override
    protected void OnExit() {
        System.out.println("Exiting");
    }
}

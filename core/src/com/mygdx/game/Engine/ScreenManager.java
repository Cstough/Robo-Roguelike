package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ScreenManager {

    Screen currentScreen, nextScreen;
    TransitionManager transitionManager;

    public ScreenManager() {
        transitionManager = new TransitionManager();
    }

    public void Update(float delta) {
        currentScreen.Update(delta);
        if(transitionManager.IsTransitioning()) {
            transitionManager.Update(delta);
            if(transitionManager.IsOutTransitionDone()) {
                currentScreen = nextScreen;
            }
        }
    }

    public void Render(SpriteBatch batch) {
        batch.begin();
        currentScreen.Render(batch);
        if(transitionManager.IsTransitioning()) {
            transitionManager.Render(batch);
        }
        batch.end();
    }

    public void ChangeScreen(Screen screen) {

        //if already in a transition, dont start another one
        if(!transitionManager.IsTransitioning()) {
            transitionManager.BeginTransition();
            nextScreen = screen;
        }
    }

    public void SetScreen(Screen screen) {
        currentScreen = screen;
    }

    public void SetTransitionEffects(TransitionEffect In, TransitionEffect Out) {
        In.SetupEffect();
        Out.SetupEffect();
        transitionManager.SetTransitionEffects(In, Out);
    }
}

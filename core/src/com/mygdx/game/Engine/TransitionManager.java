package com.mygdx.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TransitionManager {

    private boolean isTransitioning, transitionOUTDone;
    private TransitionEffect transitionEffect_IN, transitionEffect_OUT;

    public void Update(float delta) {
        //Updating the current transition
        if(!transitionOUTDone) {
            transitionEffect_OUT.Update(delta);
        }
        else {
            transitionEffect_IN.Update(delta);
        }
        //checking if the IN transition is done, then setting the bool
        if(!transitionOUTDone) {
            if(transitionEffect_OUT.IsDone()) {
                transitionOUTDone = true;
            }
        }
        else {
            if(transitionEffect_IN.IsDone()) {
                isTransitioning = false;
            }
        }
    }

    public void Render(SpriteBatch batch) {
        if(!transitionOUTDone) {
            transitionEffect_OUT.Render(batch);
        }
        else {
            transitionEffect_IN.Render(batch);
        }
    }

    public boolean IsTransitioning() {
        return isTransitioning;
    }

    public boolean IsOutTransitionDone() {
        return transitionOUTDone;
    }

    protected void BeginTransition() {
        transitionEffect_IN.SetupEffect();
        transitionEffect_OUT.SetupEffect();
        isTransitioning = true;
        transitionOUTDone = false;
    }

    protected void SetTransitionEffects(TransitionEffect in, TransitionEffect out) {
        this.transitionEffect_IN = in;
        this.transitionEffect_OUT = out;
    }
}

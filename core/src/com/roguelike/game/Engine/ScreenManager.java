package com.roguelike.game.Engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.roguelike.game.Engine.Screen;

/*
    This class will handle the currently handled screen, as well as screen transitions
 */
public class ScreenManager {

    private static Screen currentScreen;

    public ScreenManager(Screen screen) {

        //setting the initial screen
        currentScreen = screen;

        //enter the current screen initially
        currentScreen.OnEnter();

    }

    public void Update(SpriteBatch batch) {
        currentScreen.Update(batch);
    }

    public static void SetScreen(Screen nextScreen) {

        //Exit the current screen
        currentScreen.OnExit();

        //set the new current screen
        currentScreen = nextScreen;

        //enter the new current screen
        currentScreen.OnEnter();

    }

}

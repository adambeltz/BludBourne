package com.mygdx.bludbourne;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector3;

import java.util.HashMap;
import java.util.Map;

public class PlayerController implements InputProcessor{

    private final static String TAG = PlayerController.class.getSimpleName();

    enum Keys {
        LEFT, RIGHT, UP, DOWN, QUIT
    }

    enum Mouse {
        SELECT, DOACTION
    }

    private static Map<Keys, Boolean> keys = new HashMap<PlayerController.Keys, Boolean>();
    private static Map<Mouse, Boolean> mouseButtons = new HashMap<PlayerController.Mouse, Boolean>();
    private Vector3 lastMouseCoordinates;

    // Initialize the hashmap for inputs
    static {
        keys.put(Keys.LEFT, false);
        keys.put(Keys.RIGHT, false);
        keys.put(Keys.UP, false);
        keys.put(Keys.DOWN, false);
        keys.put(Keys.QUIT, false);
    };

    static {
        mouseButtons.put(Mouse.SELECT, false);
        mouseButtons.put(Mouse.DOACTION, false);
    };

    private Entity player;

    public PlayerController(Entity player){
        this.lastMouseCoordinates = new Vector3();
        this.player = player;
    }

    @Override
    public boolean keyDown(int keycode){
        if (keycode == Input.Keys.LEFT || keycode == Input.Keys.A){
            this.leftPressed();
        }
    }

}

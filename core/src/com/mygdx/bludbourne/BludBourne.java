package com.mygdx.bludbourne;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BludBourne extends Game {

	public static final MainGameScreen mainGameScreen = new MainGameScreen();
	
	@Override
	public void create () {
		setScreen(mainGameScreen);

	}

	@Override
	public void render () {

	}
	
	@Override
	public void dispose () {
		mainGameScreen.dispose();

	}
}

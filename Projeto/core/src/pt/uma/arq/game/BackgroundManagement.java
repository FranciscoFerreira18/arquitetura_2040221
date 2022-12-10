package pt.uma.arq.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BackgroundManagement {

    private Texture background;
    private Texture background2;
    private Sprite sprite;

    private Sprite sprite1;

    int y;
    SpriteBatch spriteBatch;

    public BackgroundManagement(SpriteBatch batch) {
        this.spriteBatch = batch;
        background = new Texture("space.png");
        background2 = new Texture("space1.png");
        sprite = new Sprite(background);
        sprite1 = new Sprite(background2);
        y =0;
        sprite.setPosition(0, y);
        sprite1.setPosition(0,y);
    }

    public void render() {
        sprite1.draw(spriteBatch);
        sprite1.setPosition(0,y+800);
        sprite.draw(spriteBatch);
        sprite.setPosition(0,y);
        y-=3;
        if (y < -800){
            y=0;
        }


    }

}

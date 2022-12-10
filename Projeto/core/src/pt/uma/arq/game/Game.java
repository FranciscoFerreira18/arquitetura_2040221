package pt.uma.arq.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.entities.*;


public class Game extends ApplicationAdapter {
    private SpriteBatch batch;

    private Music music;

    private BackgroundManagement backgroundManagement;
    private BitmapFont font;
    private PlayerShip playerShip;

    private Fleet frota;


    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(600, 800);
        batch = new SpriteBatch();
        playerShip = new PlayerShip(batch, 300, 100);
        frota = new Fleet(batch);
        playerShip.create();
        frota.create();
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"),
                Gdx.files.internal("gamefont.png"), false);
        backgroundManagement = new BackgroundManagement(batch);
        music=Gdx.audio.newMusic(Gdx.files.internal("music_game.mp3"));


    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        backgroundManagement.render();
        frota.render();
        frota.handleColisions(playerShip);
        frota.handleColisionsPlayer(playerShip);
        if (playerShip.getPlayerLife() > 0){
                music.setVolume(0.5F);
                music.setLooping(true);
                music.play();
            }
        else music.pause();
         if(!playerShip.isCollided()){
                playerShip.render();
                this.font.draw(this.batch, "Score: " + this.playerShip.getPlayerScore() + "%", 1.0F, 780.0F);
            }

            if (this.playerShip.getPlayerLife() <= 0) {
                this.playerShip.setCollided(true);
                this.font.draw(this.batch, "Game Over", 250.0F, 400.0F);
                this.font.draw(this.batch,"Score: " + this.playerShip.getPlayerScore()+"%",250.0F,300.0F);
            }
            else   this.font.draw(this.batch, "Life: " + this.playerShip.getPlayerLife(), 490.0F, 780.0F);
            if (frota.isFleetStatus()){
                this.font.draw(this.batch, "You Win", 250.0F, 400.0F);
                music.pause();

        }


        batch.end();

    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
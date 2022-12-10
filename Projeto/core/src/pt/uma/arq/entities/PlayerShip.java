package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Laser;


import java.util.ArrayList;


public class PlayerShip extends Ship{

    private float playerScore = 0;

    private int playerLife = 100;

    private ArrayList<Laser> lasers;

    private Music laserMusic;




    public PlayerShip (SpriteBatch batch, int x, int y){
        super(x, y, "ship.png", batch,5,2);
        this.lasers = new ArrayList<>();
        this.create();
    }



    @Override
    public void shoot() {
        laser = new Laser(batch, this.x, this.y + 5,true,false,"laser-bolts.png");
        lasers.add(laser);
        this.laserMusic = Gdx.audio.newMusic(Gdx.files.internal("laserSound.mp3"));
        laserMusic.setVolume(0.5F);
        laserMusic.play();
    }


    @Override
    public void render(){
        this.animator.render(getX(),getY());
        handleInputs();
        if(laser != null){
            for (int i = 0; i < lasers.size(); i ++){
                lasers.get(i).render();
                if (lasers.get(i).getY() > 800 || lasers.get(i).isCollied()) {
                    lasers.remove(i);
                }
            }
        }
        }


    public void handleInputs(){
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            if (getX() > 0)
                x -= 5;


        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            if (getX() < 575)
                x += 5;

        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
            shoot();
        }
        this.BoundingBox.setLocation(x,y);

    }

    public ArrayList<Laser> getLasers() {
        return lasers;
    }

    public Laser getLaser() {
        return laser;
    }

    public float getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(float playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerLife() {
        return playerLife;
    }

    public void setPlayerLife(int playerLife) {
        this.playerLife = playerLife;
    }
}


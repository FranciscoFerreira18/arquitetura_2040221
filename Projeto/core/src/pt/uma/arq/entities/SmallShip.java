package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

public class SmallShip extends Ship {

    public SmallShip (SpriteBatch batch, int x, int y){
        super(x,y);
        this.animator = new Animator(batch, "enemy-small.png",2,1);
    }

    public void create(){
        this.animator.create();
    }


    @Override
    public void render() {
        this.animator.render(getX(),getY());
    }

}

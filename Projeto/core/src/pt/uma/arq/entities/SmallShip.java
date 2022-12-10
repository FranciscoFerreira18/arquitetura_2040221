package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Laser;




public class SmallShip extends Ship {

    public SmallShip (SpriteBatch batch, int x, int y){
        super(x, y, "enemy-small.png", batch,2,1);
        this.damage = 10;
        this.create();
    }

    @Override
    public void shoot() {
        laser = new Laser(batch, this.x,this.y + 5,false,false,"enemy-laser.png");

    }


    @Override
    public void render() {
        this.animator.render(getX(),getY());
        this.BoundingBox.setLocation(getX(),getY());
        if(laser != null){
            if (laser.isCollied()==false)
                laser.render();
        }
        }

    @Override
    public String toString() {
        return "SmallShip";
    }
}




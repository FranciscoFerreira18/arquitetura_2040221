package pt.uma.arq.game;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import java.awt.*;


public class Laser {

     private Rectangle BoundinBox;
    private Animator animator;
    private SpriteBatch batch;

   private int x,y;

    private boolean isPLayer;

    private boolean collied;

    public Laser (SpriteBatch batch, int x , int y, boolean isPlayer, boolean collied, String path){
        this.x=x;
        this.isPLayer = isPlayer;
        this.y=y;
        this.collied = collied;
        this.batch = batch;
        this.animator = new Animator(batch, path,2,1);
        this.animator.create();
        this.BoundinBox = new Rectangle(this.x,this.y,2,7);
    }


    public void render(){
        this.animator.render(x,y);
        if (isPLayer){
            y+=10;

        }
        else {
            y-=15;
            if (this.y < 0){
                setCollied(true);
            }

        }
        this.BoundinBox.setLocation(x,y);
    }


    public Rectangle getBoundinBox() {
        return BoundinBox;
    }

    public int getY() {
        return y;
    }

    public boolean isCollied() {
        return collied;
    }

    public void setCollied(boolean collied) {
        this.collied = collied;
    }


}

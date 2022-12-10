package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;
import pt.uma.arq.game.Laser;

import java.awt.*;

public abstract class Ship {

    private int rows;
    private int colums;

    protected SpriteBatch batch;
    protected int x,y;
    protected Laser laser;

    protected int damage;

    protected Rectangle BoundingBox;
    protected boolean isCollided;

   protected Animator animator;

    public Ship(int x, int y, String path, SpriteBatch batch,int colums, int rows) {
        this.x = x;
        this.y = y;
        this.isCollided = false;
        this.batch = batch;
        this.colums = colums;
        this.rows = rows;
        this.animator = new Animator(this.batch,path,colums,rows);
    }


    public int getDamage() {
        return damage;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Rectangle getBoundingBox() {
        return BoundingBox;
    }

    public boolean isCollided() {
        return isCollided;
    }

    public void setCollided(boolean collided) {
        isCollided = collided;
    }

    public void render() {
    }

    public void create() {
        this.animator.create();
        this.BoundingBox = new Rectangle(this.x,this.y,animator.getWidth(),animator.getHeight());
    }

    public Laser getLaser() {
        return laser;
    }

    public abstract void shoot();

}

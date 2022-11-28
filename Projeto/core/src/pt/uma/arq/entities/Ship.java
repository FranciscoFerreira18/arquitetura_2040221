package pt.uma.arq.entities;

import pt.uma.arq.game.Animator;

public abstract class Ship {
    public int x,y;
    public Animator animator;

    public Ship(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Ship(){
        x = 0;
        y = 0;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void render() {
    }

    public void create() {
    }
}

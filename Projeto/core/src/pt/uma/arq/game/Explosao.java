package pt.uma.arq.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Explosao {

    public boolean acabou;
    private int y,x,duracao;
    private Animator animator;
    private SpriteBatch batch;

    public Explosao(int x, int y, SpriteBatch batch) {
        this.x = x;
        this.y = y;
        this.batch = batch;
        this.duracao = 20;
        this.animator = new Animator(batch, "explosion.png",5,1);
        this.animator.create();
    }

    public void update(){
        duracao--;
    }

    public void render(){
        this.animator.render(x,y);
    }

    public boolean endExplosion(){
        if (duracao <=0)
            return true;
        return false;
    }


}

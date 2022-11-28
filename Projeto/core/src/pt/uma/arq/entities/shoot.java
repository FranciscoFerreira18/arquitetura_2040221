package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

public abstract class shoot extends Ship {

    public shoot(SpriteBatch batch, int x, int y) {
        super(x, y);
        this.animator = new Animator(batch, "laser-bolts.png", 2, 1);
    }

    @Override
    public void create() {
        this.animator.create();
    }

    @Override
    public void render() {
        this.animator.render(getX(),getY());
    }
}

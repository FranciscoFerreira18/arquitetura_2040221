package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;


public class PlayerShip extends Ship{

    public PlayerShip (SpriteBatch batch,int x, int y){
        super(x,y);
        this.animator = new Animator(batch, "ship.png",5,2);
    }

    public void create(){
         this.animator.create();
    }

    public void render(){
        this.animator.render(getX(),getY());
        handleInputs();
    }

    public void handleInputs(){
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            if (getX() > 0)
                //Andar para a esquerda
                x -= 5;
         if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            if (getX() < 575)//Andar para a direita
                x += 5;
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            PlayerShip.atirar();

        }
    }
    private static void atirar() {
        System.out.println("Atirarar");
    }


}

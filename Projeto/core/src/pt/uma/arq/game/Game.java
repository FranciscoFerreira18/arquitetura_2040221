package pt.uma.arq.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.entities.*;


public class Game extends ApplicationAdapter {
    private SpriteBatch batch;

    private BackgroundManagement backgroundManagement;
    private BitmapFont font;
    private PlayerShip playerShip;

    private SmallShip s1,s2,s3,s4,s5,s6,s7,s8;

    private MediumShip m1,m2,m3,m4,m5,m6,m7,m8;

    private LargeShip l1,l2,l3,l4,l5,l6,l7,l8;


    private Fleet frota= new Fleet();






    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(600, 800);
        batch = new SpriteBatch();
        playerShip = new PlayerShip(batch, 300, 100);
        // Criar frota Small
        s1 = new SmallShip(batch,180,500);
        s2 = new SmallShip(batch,210,500);
        s3 = new SmallShip(batch,240,500);
        s4 = new SmallShip(batch,270,500);
        s5 = new SmallShip(batch,300,500);
        s6 = new SmallShip(batch,330,500);
        s7 = new SmallShip(batch,360,500);
        s8 = new SmallShip(batch,390,500);
        // Criar frota medium
        m1= new MediumShip(batch,100,600);
        m2= new MediumShip(batch,150,600);
        m3= new MediumShip(batch,200,600);
        m4= new MediumShip(batch,250,600);
        m5= new MediumShip(batch,300,600);
        m6= new MediumShip(batch,350,600);
        m7= new MediumShip(batch,400,600);
        m8= new MediumShip(batch,450,600);
        // Criar frota large
        l1 = new LargeShip(batch,100,700);
        l2 = new LargeShip(batch,150,700);
        l3 = new LargeShip(batch,200,700);
        l4 = new LargeShip(batch,250,700);
        l5 = new LargeShip(batch,300,700);
        l6 = new LargeShip(batch,350,700);
        l7 = new LargeShip(batch,400,700);
        l8 = new LargeShip(batch,450,700);
        s1.create();
        s2.create();
        s3.create();
        s4.create();
        s5.create();
        s6.create();
        s7.create();
        s8.create();

        m1.create();
        m2.create();
        m3.create();
        m4.create();
        m5.create();
        m6.create();
        m7.create();
        m8.create();

        l1.create();
        l2.create();
        l3.create();
        l4.create();
        l5.create();
        l6.create();
        l7.create();
        l8.create();
        playerShip.create();
        // Frota smallShips
        frota.addFrota(s1);
        frota.addFrota(s2);
        frota.addFrota(s3);
        frota.addFrota(s4);
        frota.addFrota(s5);
        frota.addFrota(s6);
        frota.addFrota(s7);
        frota.addFrota(s8);
        // Frota mediumShips
        frota.addFrota(m1);
        frota.addFrota(m2);
        frota.addFrota(m3);
        frota.addFrota(m4);
        frota.addFrota(m5);
        frota.addFrota(m6);
        frota.addFrota(m7);
        frota.addFrota(m8);
        // Frota largeships
        frota.addFrota(l1);
        frota.addFrota(l2);
        frota.addFrota(l3);
        frota.addFrota(l4);
        frota.addFrota(l5);
        frota.addFrota(l6);
        frota.addFrota(l7);
        frota.addFrota(l8);
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"),
                Gdx.files.internal("gamefont.png"), false);
        backgroundManagement = new BackgroundManagement(batch);


    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        backgroundManagement.render();
        for (Ship i: frota.getFrota()) {
           i.render();
        }
        playerShip.render();
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
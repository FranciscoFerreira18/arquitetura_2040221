package pt.uma.arq.entities;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Timer;
import pt.uma.arq.game.Explosao;
import pt.uma.arq.game.Laser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class Fleet {

    private SpriteBatch batch;
    private ArrayList<Ship> frota;

    private ArrayList<Explosao> explosoes;

    private Timer timer;

    private Music explosionMusic;

    private boolean fleetStatus;


    public Fleet(SpriteBatch batch) {
        this.batch = batch;
        this.frota = new ArrayList<Ship>();
        this.explosoes = new ArrayList<Explosao>();
        timer = new Timer();
        timer.scheduleTask(new Timer.Task() {
            @Override
            public void run() {
                RandomShoot();
            }
        }, 1, 1, -1);
    }

    public void RandomShoot() {
        if (isFleetStatus()==false){
            Random r = new Random();
            int index = r.nextInt(frota.size());
            frota.get(index).shoot();
        }

    }

    public void create() {
        int ssx = 180;

        int msx = 50;


        int lsx = 100;

            for (int i = 0; i < 8; i++) {
                Ship s = new SmallShip(batch, ssx, 500);
                s.create();
                frota.add(s);
                ssx += 30;
            }

            for (int i = 0; i < 8; i++) {
                Ship m = new MediumShip(batch, msx, 600);
                m.create();
                frota.add(m);
                msx += 62;
            }

            for (int i = 0; i < 8; i++) {
                Ship l = new LargeShip(batch, lsx, 700);
                l.create();
                frota.add(l);
                lsx += 50;
            }
    }

    public void render() {
            for (int i = 0; i < frota.size(); i++) {
                if (!frota.get(i).isCollided())
                    frota.get(i).render();
            }
            for (int i = 0; i < explosoes.size(); i++) {
                explosoes.get(i).update();
                explosoes.get(i).render();
                if (explosoes.get(i).endExplosion()) {
                    explosoes.remove(i);

                }

            }
        }


    public void handleColisions(PlayerShip player) {
        Iterator<Ship> it = this.frota.iterator();
        while (it.hasNext()) {
            Ship ship = it.next();
            for (Laser laser : player.getLasers()) {
                if (laser.getBoundinBox().intersects(ship.getBoundingBox())) {
                    this.explosionMusic = Gdx.audio.newMusic(Gdx.files.internal("explosion.mp3"));
                    explosionMusic.setVolume(0.4F);
                    explosionMusic.play();
                    explosoes.add(new Explosao(ship.getX(),ship.getY(),batch));
                    laser.setCollied(true);
                    it.remove();
                    if (ship.getClass().getSimpleName().equals("LargeShip")){
                        player.setPlayerScore((float) (player.getPlayerScore()+5.0));
                    }
                    if (ship.getClass().getSimpleName().equals("MediumShip")){
                        player.setPlayerScore((float) (player.getPlayerScore()+4.0));
                    }
                    if (ship.getClass().getSimpleName().equals("SmallShip")){
                        player.setPlayerScore((float) (player.getPlayerScore()+3.5));
                    }
                    if (frota.size() == 0){
                        setFleetStatus(true);
                    }
                }
            }
        }

    }

    public void handleColisionsPlayer(PlayerShip player){
        for (Ship ship: frota) {
            if (ship.getLaser() != null)
            if (ship.getLaser().getBoundinBox().intersects(player.getBoundingBox())){
                player.setPlayerLife(player.getPlayerLife()-ship.getDamage());
                ship.getLaser().setCollied(true);
                ship.getLaser().getBoundinBox().setBounds(0,0,0,0);
            }


        }

    }
    public void setFleetStatus(boolean fleetStatus) {
        this.fleetStatus = fleetStatus;
    }

    public boolean isFleetStatus() {
        return fleetStatus;
    }
}











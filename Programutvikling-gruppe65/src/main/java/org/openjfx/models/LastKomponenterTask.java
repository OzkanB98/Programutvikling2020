package org.openjfx.models;

import javafx.concurrent.Task;
import org.openjfx.models.filbehandling.JOBJLeser;
import org.openjfx.models.filbehandling.Leser;

import java.io.File;

public class LastKomponenterTask extends Task<Void> {

    private File fil;
    private TilLagring komponenter;
    private Runnable runnable;

    public LastKomponenterTask(File fil, TilLagring komponenter, Runnable runnable) {
        this.fil = fil;
        this.komponenter = komponenter;
        this.runnable = runnable;
    }

    @Override
    protected Void call() throws InterruptedException{
        try {
            Leser lastFil = new JOBJLeser();
            //komponenter = new TilLagring();
            lastFil.lesFraFil(fil, komponenter);
            System.out.println("Task påkalt");
        }catch(Exception e){
            e.printStackTrace();
        }
        Thread.sleep(3000);
        return null;
    }

    @Override
    protected void succeeded() {
        //System.out.println(komponenter.getKomponentArrayList());
        runnable.run();
    }
}

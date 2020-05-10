package org.openjfx.models;

import javafx.concurrent.Task;
import org.openjfx.models.filbehandling.JOBJLeser;
import org.openjfx.models.filbehandling.Leser;

import java.io.File;

public class LastKomponenterTask extends Task<Void> {

    private File fil;
    private Komponent komponent;
    private Runnable runnable;

    public LastKomponenterTask(File fil, Komponent komponent, Runnable runnable) {
        this.fil = fil;
        this.komponent = komponent;
        this.runnable = runnable;
    }

    @Override
    protected Void call() throws Exception {
        Leser lastFil = new JOBJLeser();
        lastFil.lesFraFil(fil, komponent);
        Thread.sleep(3000);
        return null;
    }

    @Override
    protected void succeeded() {
        runnable.run();
    }
}

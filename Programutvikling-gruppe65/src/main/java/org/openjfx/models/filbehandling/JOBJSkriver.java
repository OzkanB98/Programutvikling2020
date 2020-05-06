package org.openjfx.models.filbehandling;

import org.openjfx.models.TilLagring;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JOBJSkriver implements Skriver {

    @Override
    public void skrivTilFil(File file, TilLagring obj) {

        try(ObjectOutputStream out = new ObjectOutputStream((new FileOutputStream(file)))){
            out.writeObject(obj);
            out.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

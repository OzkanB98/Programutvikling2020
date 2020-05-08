package org.openjfx.models.filbehandling;

import org.openjfx.models.TilLagring;

import java.io.File;
import java.io.FileNotFoundException;

public class JOBJLeser implements Leser {

    @Override
    public void lesFraFil(File file, TilLagring obj) throws FileNotFoundException, Exception {

    }

    private void tomFil(File file) throws Exception {
        if (file.length() == 0){
            throw new Exception("Filen er tom!");
        }
    }
    
}


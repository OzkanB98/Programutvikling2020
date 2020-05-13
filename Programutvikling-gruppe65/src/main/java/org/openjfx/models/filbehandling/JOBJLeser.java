package org.openjfx.models.filbehandling;

import org.openjfx.models.Komponenter;
import org.openjfx.models.TilLagring;

import java.io.*;
import java.util.ArrayList;

public class JOBJLeser implements Leser {

    @Override
    public void lesFraFil(File file, TilLagring obj) throws Exception {

        obj.setKomponentArrayList(new ArrayList<>());
        if(file.length() == 0){
            throw new FileNotFoundException("Ingen data funnet");
        }

        try(FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream))
        {
            TilLagring komponenter = (TilLagring) objectInputStream.readObject();
            objectInputStream.close();
            obj.setKomponentArrayList(komponenter.getKomponentArrayList());
            System.out.println(obj.getKomponentArrayList());
        } catch (FileNotFoundException fnfe){
            System.out.println("Ingen fil funnet");
        }

    }

}


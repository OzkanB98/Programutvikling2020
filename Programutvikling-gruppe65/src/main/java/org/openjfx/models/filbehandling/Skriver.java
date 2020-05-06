package org.openjfx.models.filbehandling;

import org.openjfx.models.TilLagring;

import java.io.File;
import java.io.FileNotFoundException;

public interface Skriver {

    void skrivTilFil(File file, TilLagring obj) throws FileNotFoundException, Exception;
}

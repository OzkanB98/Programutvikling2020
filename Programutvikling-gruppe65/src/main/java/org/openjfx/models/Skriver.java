package org.openjfx.models;

import java.io.File;
import java.io.FileNotFoundException;

public interface Skriver {

    void skrivTilFil(File file, TilLagring obj) throws FileNotFoundException, Exception;
}

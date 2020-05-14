package org.openjfx.models.filbehandling;

import org.openjfx.models.TilLagring;

import java.io.File;


public interface Skriver {

    void skrivTilFil(File file, TilLagring obj) throws Exception;
}

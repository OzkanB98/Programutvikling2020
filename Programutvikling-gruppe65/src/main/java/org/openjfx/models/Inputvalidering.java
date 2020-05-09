package org.openjfx.models;

public class Inputvalidering {


    public void sjekkNullInput(String input) throws NullPointerException{
        input = input.trim();
        if(!(input.length() > 0)){
            throw new NullPointerException("Vennligst fyll ut alle felt");
        }
    }

    

}

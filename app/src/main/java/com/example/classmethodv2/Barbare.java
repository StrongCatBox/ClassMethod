package com.example.classmethodv2;

import android.graphics.Color;

public class Barbare extends Personnage{

    public Barbare(String nom, int vita, int force) {
        super(nom, vita, force);
    }

    public Barbare(String nom) {
        super(nom);
    }

    public void PertePv () {setVita(getVita()-100);}


    public void Berserker (ModeRage mR)
    {

        mR.augmenteForce(1000);

    }

    public interface ModeRage {

        public void augmenteForce(int f);


    }
}

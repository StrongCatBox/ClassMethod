package com.example.classmethodv2;

public class Magicien extends Personnage {

    public Magicien(String nom, int vita, int force, int mana) {
        super(nom, vita, force, mana);
    }

    public Magicien(String nom) {
        super(nom);
    }

    public void sortilegeDeVie () {
        setVita(getVita()+1000); // ou vita = vita -10
    }

}

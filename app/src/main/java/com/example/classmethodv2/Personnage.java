package com.example.classmethodv2;

import android.graphics.Color;

public class Personnage {

    private String nom;
    private int vita;
    private int force;
    private int mana;

    public Personnage(String nom, int vita, int force, int mana) {
        this.nom = nom;
        this.vita = vita;
        this.force = force;
        this.mana = mana;
    }

    public Personnage(String nom, int vita, int force){
        this.nom = nom;
        this.vita = vita;
        this.force = force;
    }

    public Personnage(String nom) {
        this.nom = nom;
        vita = 80;
        force = 50;
        mana = 60;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(Integer vita) {
        this.vita = vita;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }


    public void perteDePV (int pvPerdu) {
        vita -= pvPerdu; // ou vita = vita -pvPerdu
    }
    public void perteDePV (MegaStats mS)
    {
        vita -=10; // ou vita = vita -10
        mS.augmenteForce(1000);
        mS.augmenteMana(1000);
        mS.augmenteVie(1000);
        mS.changeNom("Mega");
        mS.changeCouleur(Color.GREEN);
    }


    public interface MegaStats {
        public void augmenteForce(int f);
        public void augmenteVie(int v);
        public void augmenteMana(int m);
        public void changeNom(String s);
        public void changeCouleur(int c);
    }




}

package com.example.classmethodv2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Personnage.MegaStats {
    private TextView infoPerso, infoPersoDef, infoPersoMage, infoPersoBarbare;
    private Personnage persoDef, perso1, persoMage, persoBarbare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoPerso=findViewById(R.id.textView);
        infoPersoDef=findViewById(R.id.textView2);
        infoPersoMage = findViewById(R.id.textView3);
        infoPersoBarbare = findViewById(R.id.textView4);




        perso1 = new Personnage("Luna", 100, 87, 78);
        persoDef = new Personnage("Ruby");
        Magicien persoMage = new Magicien ("Nova", 100, 10, 78);
        Barbare persoBarbare = new Barbare("Kenny", 80, 130);


        persoDef.perteDePV(25);
        perso1.perteDePV(25);
        persoBarbare.Berserker(new Barbare.ModeRage() {
            @Override
            public void augmenteForce(int f) {

                persoBarbare.setForce(persoBarbare.getForce()+f);

            }
        });
        perso1.perteDePV(new Personnage.MegaStats() {
            @Override
            public void augmenteForce(int f) {
                perso1.setForce(perso1.getForce()+f);

            }

            @Override
            public void augmenteVie(int v) {
                perso1.setVita(perso1.getVita()+v);

            }

            @Override
            public void augmenteMana(int m) {
                perso1.setMana(perso1.getMana()+m);

            }

            @Override
            public void changeNom(String s) {
                perso1.setNom(s+perso1.getNom());

            }

            @Override
            public void changeCouleur(int c) {
                infoPerso.setTextColor(c);

            }
        });

        //persoDef.vita += 100;
        // perso1.vita += 100;

        perso1.setNom("Nyla");
        persoDef.setNom("Lyra");
        persoMage.sortilegeDeVie();

        String stats= "Nom: "+perso1.getNom()+"\n"+
                "Pt de vie : " +perso1.getVita()+"\n"+
                "Pt de force: "+perso1.getForce()+ "\n"+
                "Pt de mana: "+perso1.getMana();

        String statsMage = "Nom: " + persoMage.getNom()+ "\n"+
                "Pt de vie : " +persoMage.getVita()+"\n"+
                "Pt de force: "+persoMage.getForce()+ "\n"+
                "Pt de mana: "+persoMage.getMana();

        String statsBarbare = "Nom" +persoBarbare.getNom()+ "\n"+
                "Pt de vie : " +persoBarbare.getVita()+"\n"+
                "Pt de force: "+persoBarbare.getForce()+ "\n";






        augmenteForce(555);
        augmenteMana(555);
        augmenteVie(555);
        changeNom("Super "+persoDef.getNom());
        changeCouleur(Color.MAGENTA);
        String statsDefaut = "Nom: " + persoDef.getNom() + "\n"+
                "Pt de vie : " +persoDef.getVita()+"\n"+
                "Pt de force: "+persoDef.getForce()+ "\n"+
                "Pt de mana: "+persoDef.getMana();

        infoPerso.setText(stats);
        infoPersoDef.setText(statsDefaut);
        infoPersoMage.setText(statsMage);
        infoPersoBarbare.setText(statsBarbare);

    }


    @Override
    public void augmenteForce(int f) {
        persoDef.setForce(f);

    }

    @Override
    public void augmenteVie(int v) {
        persoDef.setVita(v);

    }

    @Override
    public void augmenteMana(int m) {
        persoDef.setMana(m);

    }

    @Override
    public void changeNom(String s) {
        persoDef.setNom(s);

    }

    @Override
    public void changeCouleur(int c) {
        infoPersoDef.setTextColor(c);

    }
}
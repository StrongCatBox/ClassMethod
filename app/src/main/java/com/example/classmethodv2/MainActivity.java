package com.example.classmethodv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView infoPerso, infoPersoDef, infoPersoMage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoPerso=findViewById(R.id.textView);
        infoPersoDef=findViewById(R.id.textView2);
        infoPersoMage = findViewById(R.id.textView3);




        Personnage perso1 = new Personnage("Luna", 100, 87, 78);
        Personnage persoDef = new Personnage("Ruby");
        Magicien persoMage = new Magicien ("Nova", 100, 10, 78);

        persoDef.perteDePV(25);
        perso1.perteDePV(25);

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



       /*
       String stats = "Nom: "+perso1.nom+"\n"+

                "Pt de vie : " +perso1.vita+"\n"+
                "Pt de force: "+perso1.force+ "\n"+
                "Pt de mana: "+perso1.mana;

        */

        String statsDefaut = "Nom: "+persoDef.getNom()+"\n"+
                "Pt de vie : " +persoDef.getVita()+"\n"+
                "Pt de force: "+persoDef.getForce()+ "\n"+
                "Pt de mana: "+persoDef.getMana();




        /*

        String statsDefaut = "Nom: "+persoDef.nom+"\n"+
                "Pt de vie : " +persoDef.vita+"\n"+
                "Pt de force: "+persoDef.force+ "\n"+
                "Pt de mana: "+persoDef.mana;

        */


        infoPerso.setText(stats);
        infoPersoDef.setText(statsDefaut);
        infoPersoMage.setText(statsMage);
    }


}
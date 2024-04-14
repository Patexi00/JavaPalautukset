package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teht16 {
    public static List<Integer> numeroita = new ArrayList<>();
    public static Random random = new Random();

    public static int teenumerolistajaetsipuuttuvanumero(int määrä) {
        for (int i = 1; i <= määrä; i++) {
            numeroita.add(i);
        }
        for (int numero : numeroita) {
            System.out.println(numero);
        }                                                                   //Tehdään numerolista jossa on annettu määrä numeroita alkaen numerosta 1 ja printataan ne konsoliin havainnollistamisen vuoksi.

        int poistettu = numeroita.remove(random.nextInt(numeroita.size()));
        System.out.println("Numero " + poistettu + " poistettu!");          //Poistetaan random numero ja tallennetaan se "poistettu" muuttujaan, jotta on helpompi nähdä mikä numero on poistettu

        int pituus = numeroita.size() + 1;                                  //Apumuuttuja jonka suuruus on numerolistan pituus jos siitä ei olisi poistetti yhtä numeroa.
        int oikeasumma = pituus * (pituus + 1) / 2;                         //Lasketaan mikä täydellisen listan numeroiden yhteenlaskettu summa olisi.
        int summa = 0;                                                      //Apumuuttuja, johon lasketana varsinainen summa ilman yhtä numeroa

        for (int numero : numeroita) {
            summa += numero;
            System.out.println(summa);                                      //Yhteenlasketaan listassa olevat numerot. Printataan myös havainnollistamiseksi.
        }
        int vastaus = oikeasumma - summa;                                   //Puuttuva numero on siis "oikeasumma" eli summa joka tulisi jos lista olisi täydellinen - "summa" joka saatiin kun yhteenlaskettiin kaikki listassa sillä heltkellä olevat numerot.
        System.out.println("Täältähän puuttuu numero " + vastaus);          //Printataan puutuva numero konsoliin.
        return vastaus;
    }

}


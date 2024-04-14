package org.example;

public class Main {
    public static void main(String[] args) {
        Pankki pankki1 = new Pankki("Fi4321", "Säästöpankki", 100.000);
        Pankkitili tili1 = new Pankkitili("Fi1234","Pertti", 500 );
        Pankkitili tili2 = new Pankkitili("Fi12345","Antti", 20 );
        //Luonti

        pankki1.lisaaTili(tili1);
        pankki1.lisaaTili(tili2);
        //Lisätään tilit pankin kirjoille

        tili1.talleta(500);
        tili1.saldo();
        tili2.talleta(50);
        tili2.saldo();
        //Talletusta ja tarkistusta

        pankki1.tulostaKaikkiTiliTiedot("Fi1234");
        pankki1.tulostaKaikkiTiliTiedot("Fi12345");
        //Pankin tarkastus tilitiedoista

        pankki1.poistaTili(tili1);
        pankki1.tulostaKaikkiTiliTiedot("Fi1234");
        //Poistetaan toinen tili ja koitetaan tulostaa tietoja = tyhjää
    }

}
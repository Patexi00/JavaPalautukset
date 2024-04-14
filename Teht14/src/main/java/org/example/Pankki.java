package org.example;
import java.util.ArrayList;
import java.util.List;

public class Pankki extends Pankkitili{
    public List<Pankkitili> tilit;      //Lista pankissa olevista tileistä
    public Pankki(String _tilinumero, String _omistaja, double _saldo) {        //Konstruktori
        super(_tilinumero, _omistaja, _saldo);
        this.tilit = new ArrayList<>();
    }
    public void poistaTili(Pankkitili tili){    //Tilin poisto pankin listoilta (Ei pysty enää tulostamaan tietoja tämän jälkeen)
        tilit.remove(tili);
        System.out.println("Tili poistettu järjestelmästä, tilejä järjestelmässä: " + tilit.size());
    }
    public void lisaaTili(Pankkitili tili) {    //Tilin lisääminen pankin listaan
        tilit.add(tili);
        System.out.println("Tili lisätty järjestelmään, tilejä järjestelmässä: " + tilit.size());
    }
    public void tulostaKaikkiTiliTiedot(String tilinumero){     //Etsii annetun tilinumeron omaajan pankkitili objectin ja printtaa sen objection tiedot. Overridee Pankkitili luokan version
        for(Pankkitili tili : tilit){
            if(tili.haetilinumero().equals(tilinumero)){
                tili.tulostaKaikkiTiliTiedot();
            }
        }
    }
}

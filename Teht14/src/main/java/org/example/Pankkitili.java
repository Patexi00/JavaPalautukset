package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pankkitili{
    public final String tiliNumero; //tilinumero, jota ei voi mukata kun se on asetettu
    public String omistaja;
    public double saldo;

    public String haetilinumero(){      //Noutotyökalu Pankki luokkaa varten
        return tiliNumero;
    }
    public Pankkitili(String _tilinumero, String _omistaja, double _saldo){     //Konstruktori
        tiliNumero = _tilinumero;
        omistaja = _omistaja;
        saldo = _saldo;
    }
    public void nosta(int maara){   //Rahan nosto
        saldo -= maara;
    }
    public void talleta(int maara){ //Rahan talletus
        saldo += maara;
    }
    public void saldo(){            //Printtaa tilin saldon
        System.out.println(saldo);
    }
    protected void tulostaKaikkiTiliTiedot(){   //Tulostaa tilin kaikki tiedot. Protected
        System.out.println(tiliNumero);
        System.out.println(omistaja);
        System.out.println(saldo);
    }


}

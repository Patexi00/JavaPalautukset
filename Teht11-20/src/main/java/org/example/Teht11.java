package org.example;

import javax.xml.transform.Result;

public class Teht11 {
    public static void EtsiSuurinSumma(int[] numeroarray){
        int suurinLoydettySumma = numeroarray[0] + numeroarray[1] + numeroarray[2];             //Muuttuja johon talletetaan suurin löydetty summa. Aluksi se olkoon kolme ensimmäistä lukua yhteenlaskettuna.
        int[] suurimmatNumerot = {numeroarray[0], numeroarray[1], numeroarray[2]};              //Tallennetaan numerot joista suurin summa saatiin. Aluksi kolme ensimmäistä lukua.

        for(int i = 0; i < numeroarray.length - 2; i++){
            int laskettuSumma = numeroarray[i] + numeroarray[i + 1]+ numeroarray[i + 2];

            if(laskettuSumma > suurinLoydettySumma){                                            //Looppi joka laskee kolme peräkkäistä numeroa yhteen ja tallentaa luvun mikäli se on isompi kuin mitä on saatu aikaisemmin. Tallentaa myös luvut joista suurin luku saatiin.
                suurinLoydettySumma = laskettuSumma;
                suurimmatNumerot[0] = numeroarray[i];
                suurimmatNumerot[1] = numeroarray[i+1];
                suurimmatNumerot[2] = numeroarray[i+2];
            }
        }
        System.out.println(suurinLoydettySumma + " ("+ suurimmatNumerot[0] + "," + suurimmatNumerot[1] + "," + suurimmatNumerot[2] + ")");  //Prosessin jälkeen printataan suurin luku ja myös mistä numeroista se saatiin.
    }
}

package org.example;

public class Teht17 {
    public static String Kaannateksti(String teksti){
        char[] chararray = teksti.toCharArray();                //Laitetaan annettu stringi chararrayhyn
        int vasenindexi = 0;                                    //Vasenindexi eli ensimmäisen kirjaimen indexi
        int oikeaindexi = chararray.length - 1;                 //Oikeaindexi eli viimeisen kirjaimen indexi

        while(vasenindexi < oikeaindexi){                       //Loopataan kunnes ollaan keskikohdassa
            char muisti = chararray[vasenindexi];               //Muisti johon tallennetaan vasemmassa indexissä oleva kirjain
            chararray[vasenindexi] = chararray[oikeaindexi];    //Muutetaan vasenmman indexin kirjain samaksi kuin oikean indexin kirjain
            chararray[oikeaindexi] = muisti;                    //Muutetaan oikean indexin kirjain muistissa olevaksi kirjaimeksi joka on "vanha" vasemman indexin kirjain

            vasenindexi ++;                                     //Siirrytään seuraaviin kirjaimiin
            oikeaindexi --;
        }
        return new String(chararray);                           //Palautetaan uudelleen järjestelty chararray stringinä
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] jokuarray1 = {9, 8, 32, -2, 1};
        int[] jokuarray2 = {2,5,1,3,2};                 //Pari arrayta teht11 varten

        Teht11.EtsiSuurinSumma(jokuarray1);             //Teht11 algoritmi
        Teht11.EtsiSuurinSumma(jokuarray2);             //Teht11 algoritmi V2

        for(int i = 0; i < 10; i++){
            System.out.println(Teht12.printtaaetujasukunimi()); //Teht12 10 kertaa random etu ja sukunimi yhdistelmä.
        }

        Teht15 jukeboxi = Teht15.LuoSoitin();           //Luodaan jukeboxi
        jukeboxi.playTrack();                           //Yritetään soittaa, ei biisä valittu
        jukeboxi.setTrack("Baarikärpänen");             //Asetetaan biisi
        jukeboxi.playTrack();                           //Soitetaan biisi, nyt soi
        Teht15 jukeboxi2 = Teht15.LuoSoitin();          //Luodaan "toinen" jukeboxi
        jukeboxi2.playTrack();                          //Laitetaan sekin soittamaan ja se soittaa saman biisin kuin on asetettu jukeboxi ykköseen
            if(jukeboxi == jukeboxi2){                  //Lisätodistus että jukeboxi ja jukeboxi2 ovat täysin sama instanssi.
                System.out.println("Tämä on singletön");
            }else{
                System.out.println("Eipä ollutkaan");
            }


        Teht16.teenumerolistajaetsipuuttuvanumero(10);   //Teht16 etsitään 1-X(annetun luvun) väliltä puuttuva luku.

        System.out.println(Teht17.Kaannateksti("Tämä teksti on takaperin xd"));     //Teht17 printtaa konsoliin annetun tekstin takaperin.j
    }
}
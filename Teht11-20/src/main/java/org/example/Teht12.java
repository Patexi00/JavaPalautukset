package org.example;

import java.util.Random;

public class Teht12 {
    public static String[] etunimia = {"Matti","Pekka", "Raimo","Markus","Paavo","Juulia","Anette","Nea"};
    public static String[] sukunimia = {"Paasivirta","Kuusisto","Leppo","Auro","Hellman","Johansson","Soini","Räikkönen"};

    static Random random = new Random();
    public static String printtaaetujasukunimi(){
        String etunimi = etunimia[random.nextInt(etunimia.length)];
        String sukunimi = sukunimia[random.nextInt(sukunimia.length)];
        //System.out.println(etunimi + " " + sukunimi);
        return etunimi + " " + sukunimi;                                //Valitsee ennalta määritetystä listasta random etu ja sukunimen ja printtaa ne konsoliin.
    }


}

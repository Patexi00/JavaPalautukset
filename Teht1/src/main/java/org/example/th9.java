package org.example;

public class th9 {
    public static String kellonaika(int luku){
        int tunnit = luku / 3600;
        int jäännös1 = luku % 3600;
        int minuutit = jäännös1 / 60;
        int jäännös2 = jäännös1 % 60;

        return String.format("%02d:%02d:%02d", tunnit, minuutit, jäännös2);
    }
}

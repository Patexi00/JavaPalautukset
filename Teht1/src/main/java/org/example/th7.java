package org.example;

public class th7 {
    public static int laskeFibanocci(int luku){
        double vastaus = 1/Math.sqrt(5) * Math.pow(((1 + Math.sqrt(5))/2),luku) - Math.pow(((1 - Math.sqrt(5))/2),luku);
        return (int) Math.round(vastaus);
    }
}

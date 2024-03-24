package org.example;

public class th1 {
    double[] a = {1,0};
    double[] b = {0,1};

    public static void etaisyys(double[] a, double[] b){
        double vastaus = Math.sqrt(Math.pow((a[0]-b[0]),2)+ Math.pow((a[1]-b[1]),2));
        System.out.println(vastaus);
    }

    //System.out.println(Math.pow(2,3));
}

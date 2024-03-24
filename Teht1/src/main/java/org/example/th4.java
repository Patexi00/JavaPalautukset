package org.example;

public class th4 {
    static int[][] matriisi = {
            {1,5,7},
            {0,3,1},
            {0,1,9}
    };
    static int isoin = 0;
    static int isoinA = 0;
    static int isoinB = 0;


    public static void isoimmanNumeronIndeksi(){
        for (int a = 0; a < matriisi.length; a++){
            for(int b = 0; b < matriisi[a].length; b++){
                if(isoin < matriisi[a][b]){
                    isoin = matriisi[a][b];
                    isoinA = a;
                    isoinB = b;
                }
            }
        }
        System.out.println(isoinA + ", " + isoinB);

    }
}

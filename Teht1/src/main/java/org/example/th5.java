package org.example;

import java.util.Arrays;

public class th5 {
    //static int[] numeroita = {12,53,5,67,43};

    public static void jarjNumerotJaPrinttaa(int[] array){
        int[]jarjNumerot = Arrays.copyOf(array, array.length);
        Arrays.sort(jarjNumerot);
        System.out.println(Arrays.toString(jarjNumerot));

    }





}

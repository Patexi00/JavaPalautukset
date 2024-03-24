package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class th10 {
    public static HashMap<String, ArrayList<Integer>> numeroLista() {
        HashMap<String, ArrayList<Integer>> numeroMap = new HashMap<>();
        ArrayList<Integer> positiivisetNumerot = new ArrayList<>();
        ArrayList<Integer> negatiivisetNumerot = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt(101) - 50;
            if (randomNumber < 0) {
                negatiivisetNumerot.add(randomNumber);
            } else if (randomNumber > 0) {
                positiivisetNumerot.add(randomNumber);
            } else {
                zero.add(randomNumber);
            }
        }

        numeroMap.put("negative", negatiivisetNumerot);
        numeroMap.put("positive", positiivisetNumerot);
        numeroMap.put("zero", zero);

        return numeroMap;
    }
}

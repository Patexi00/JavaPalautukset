package org.example;

import java.util.ArrayList;

public class th8 {
    public static ArrayList<Integer> etsiAlkuLuvut(int luku){
        ArrayList<Integer> alkuluvut = new ArrayList<>();
        int puoliväli = (int)Math.ceil(luku / 2.0);

        for (int i = puoliväli; i <= luku; i++) {
            boolean onkoAlkuluku = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ( i % j == 0) {
                    onkoAlkuluku = false;
                    break;
                }
            }
            if (onkoAlkuluku) {
                alkuluvut.add(i);
            }
        }
        return alkuluvut;
    }
}

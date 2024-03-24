package org.example;

public class th6 {
    public static boolean isPalindromi(String sana){
        sana = sana.toLowerCase().replaceAll("//s+", " ");

        int etuIndexi = 0;
        int takaIndexi = sana.length() - 1 ;

        while(etuIndexi < takaIndexi){
            if(sana.charAt(etuIndexi) != sana.charAt(takaIndexi)){
                return false;
            }
            etuIndexi ++;
            takaIndexi --;
        }
        return true;
    }
}

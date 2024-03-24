package org.example;

public class th2{
    boolean newLine = false;
    public static void PrintChars(int count, char printChar, boolean newLine)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print(printChar);
        }
        if (newLine)
        {
            System.out.println();
        }
    }

    public static void printtaKuusi(int Koko){
        int oksat = 1;
        int valilyonti = 2;
        int koko = Koko;

        while(koko > 0){
            PrintChars(koko, ' ', false);
            PrintChars(oksat, '*', false);
            PrintChars(koko, ' ', true);
            valilyonti++;
            oksat = oksat + 2;
            koko--;
        }
    }
}

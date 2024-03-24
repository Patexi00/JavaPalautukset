package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {

    public static void main(String[] args) {
        th1.etaisyys(new double[] { 0, 1 }, new double[] { 1, 0 });

        th2.printtaKuusi(5);

        th3.ympyra(6.2);

        th3.nelio(3);

        th3.kolmio(2,3);

        th4.isoimmanNumeronIndeksi();

        int[] numeroita = {23,56,687,5,35,87};
        th5.jarjNumerotJaPrinttaa(numeroita);

        System.out.println(th6.isPalindromi("Saippuakauppias"));

        System.out.println(th7.laskeFibanocci(23));

        System.out.println(th8.etsiAlkuLuvut(10));

        System.out.println(th9.kellonaika(3661));

        System.out.println(th10.numeroLista());
    }

}
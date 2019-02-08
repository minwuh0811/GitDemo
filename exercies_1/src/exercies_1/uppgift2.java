package exercies_1;

import java.util.Scanner;

public class uppgift2 {

    public static void main(String[] args) {


        do {
            System.out.println("Skicka in ett tal");
            int N = Main.getInt();
//            System.out.println(N);
//            IsTest(N);
            if (N >= 0 && N < 10) {
                System.out.println("Gratis! i Intervallet!!");
                return; // return means??
            }
            }
        while (true);


    }

    public static void IsTest(int M) {
        if (M >= 0 && M < 10) {
            System.out.println("Gratis! i Intervallet!!");
       }
    }
}


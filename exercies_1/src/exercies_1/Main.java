package exercies_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner S=new Scanner(System.in);

    public static int getInt() {
        int tal = 0;
        try {
            tal=S.nextInt();
//            System.out.println(tal);
        } catch (InputMismatchException e) {
            System.out.println("Felaktig inmatning");
        }
        return tal;
    }
    public static String getString(){
        return S.nextLine();
        }
    }

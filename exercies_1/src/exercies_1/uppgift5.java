package exercies_1;

import java.util.HashSet;
import java.util.Set;

public class uppgift5 {
    static Set password = new HashSet();
    static Set user_input = new HashSet();

    public static void main(String[] args) {
        password.add("piggy");
        password.add("snuff");
        password.add("bark");

//        for (int i = 0; i < 5; i++) {
//            if (i == 3 && isAuthorised()) {
//                System.out.println("password proved");
//                return;
//            }
        }



    public static boolean isAuthorised() {
        for (int i = 0; i < 3; i++) {
            user_input.add(Main.getString());
        }
        return true;
    }
}







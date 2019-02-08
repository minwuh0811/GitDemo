package exercies_1;

public class uppgift1 {

    public static void main(String[] args) {
        int m = 100;
        boolean answer = isEven(m);
        System.out.println(answer);
    }
    public static boolean isEven(int s){
        if (s%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
}

package exercies_1;

public class uppgift4 {
    public static void main(String[] args) {
        System.out.println("skicka in ett tal");
        int N=Main.getInt();
        System.out.println("skicka in andra tal");
        int M=Main.getInt();
        double mean=isAve(N,M);
        System.out.println("The average of ett tal: "+ N + " och  ett tal: " + M+ " är " + mean + ". \n");

    }
    public static double isAve(int a, int b) {
        double average= (a+b)/2.0;
        return average;
    }


}

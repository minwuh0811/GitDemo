package exercies_1;

public class uppgift3 {
    public static void main(String[] args) {
        System.out.println("Skicka in en textsträng");
        String a = Main.getString();
        System.out.println("Skicka in en textsträng");
        String b = Main.getString();
        do {
            if (a.equals(b)) {
                return;

            } else {
                a = b;
                System.out.println("Skicka in en textsträng");
                b = Main.getString();
            }
        } while (true);

    }
}


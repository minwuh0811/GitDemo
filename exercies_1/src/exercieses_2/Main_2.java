package exercieses_2;

public class Main_2 {
    public static void main(String[] args) {
        person_2 person_1=new person_2("Min", "Wu",32);
        person_2 person_2=new person_2("Bisheng", "Chen", 35);
        System.out.println(person_1.getElder());
        person_1.setElder(33);
        System.out.println(person_1.getElder());
    }

}

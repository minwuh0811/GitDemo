package exercieses_2;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        ArrayList<person> person_1 = new ArrayList<>();
        Bil bil_1 = new Bil("toyota", 28000, 160000);
        Bil bil_2 = new Bil("BMW", 260000, 15000);
        house house_1 = new house( "Ja" , 150, 3 , 230 ,1986, "Topasgatan", bil_1);
        house house_2= new house("Nej", 200, 2 ,120, 1990, "Frölunda",bil_2);
        person_1.add(new person("Min Wu","student", 32, 15000,  172,house_1 ));
        person_1.add(new person("Bisheng Chen","student", 35, 25000,  178,house_1));
        person_1.add(new person("Richelle Chen","student", 7, 15000,  172,house_2));

        System.out.println(house_1);
        System.out.println(person_1.get(2));
    }
}

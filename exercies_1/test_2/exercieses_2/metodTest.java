package exercieses_2;
import exercieses_2.Bil;
import exercieses_2.house;
import exercieses_2.metod;
import exercieses_2.person;
import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.*;

class metodTest {

    @Test
    void Blien_PricetestYear10() {
        metod method_test = new metod(new person("Min Wu", "student", 32, 18000, 172, new house( "Ja", 72, 3, 220, 1968, "Topasgatan 84", new Bil("toyota",15000, 160000))), 2020);
        assertEquals(15000*Math.pow(0.8,20),method_test.Bilen(method_test.getPerson(),2038));

    }

    @Test
    void Hus_PricetestYear10(){
        metod method_test = new metod(new person("Min Wu", "student", 32, 18000, 172, new house( "Ja", 72, 3, 220, 1968, "Topasgatan 84", new Bil("toyota",15000, 160000))), 2020);
        assertEquals(220*Math.pow(1.05,20),method_test.housen(method_test.getPerson(),2038));
    }


    @Test
    void person_Elder() {
        metod method_test = new metod(new person("Min Wu", "student", 32, 18000, 172, new house( "Ja", 72, 3, 220, 1968, "Topasgatan 84", new Bil("toyota",15000, 160000))), 2020);
        assertEquals(52,method_test.Person(method_test.getPerson(),2038));
    }

}
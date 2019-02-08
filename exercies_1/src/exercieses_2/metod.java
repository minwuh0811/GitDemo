package exercieses_2;

public class metod {
    private person person;
    private int year;
    private double hus_price;
    private int person_alder;
    int current_year=2018;


    public exercieses_2.person getPerson() {
        return person;
    }

    public void setPerson(exercieses_2.person person) {
        this.person = person;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public metod(person person, int year) {
        this.person = person;
        this.year = year;
    }

    public double Bilen(person person, int year) {
        return person.getHouse_1().getBil().getPrices() * Math.pow(0.80,(year-current_year));
    }

    public double housen(person person, int year)
    {
        return person.getHouse_1().getPrice()*Math.pow(1.05,(year-current_year));
    }
    public int Person(person person, int year) {
        return person.getOlder()+(year-current_year);
    }
}

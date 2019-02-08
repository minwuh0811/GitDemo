package exercieses_2;

public class person {
    private String name;
    private String occupation;
    private int older;
    private int salary;
    private int length;
    private house house_1;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", older=" + older +
                ", salary=" + salary +
                ", length=" + length +
                ", house_1=" + house_1 +
                '}';
    }

    public person(String name, String occupation, int older, int salary, int length, house house_1) {
        this.name=name;
        this.occupation=occupation;
        this.older=older;
        this.salary=salary;
        this.length=length;
        this.house_1=house_1;
    }

    public house getHouse_1() {
        return house_1;
    }

    public void setHouse_1(house house_1) {
        this.house_1 = house_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getOlder() {
        return older;
    }

    public void setOlder(int older) {
        this.older = older;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

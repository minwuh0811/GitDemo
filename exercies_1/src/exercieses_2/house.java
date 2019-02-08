package exercieses_2;

public class house {
    private String balcome;
    private int size;
    private int floor;
    private int price;
    private int year;
    private String address;
    private Bil bil;

    public String getAddress() {
        return address;
    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }

    public String getBalcome() {
        return balcome;
    }

    public void setBalcome(String balcome) {
        this.balcome = balcome;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "house{" +
                "balcome='" + balcome + '\'' +
                ", size=" + size +
                ", floor=" + floor +
                ", price=" + price +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", bil=" + bil +
                '}';
    }

    public house(String balcome, int size, int floor, int price, int year, String address, Bil bil){
        this.balcome=balcome;
        this.size=size;
        this.floor=floor;
        this.price=price;
        this.year=year;
        this.address=address;
        this.bil=bil;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}

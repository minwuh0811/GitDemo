package exercieses_2;

public class person_2 {
    private String first_name;
    private String last_name;
    private int elder;

    public String getFirst_name() {
        return first_name;
    }

    public void setName(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name=last_name;
    }
    public void setName(String first_name) {
        this.first_name=first_name;
    }

        public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getElder() {
        if(elder < 100 &&  elder > 0) {
            return elder;
        }
        else { return 20;}
    }

    public void setElder(int elder) {
        this.elder = elder;
    }
    public person_2(String first_name,String last_name, int elder){
        this.first_name=first_name;
        this.last_name=last_name;
        this.elder=elder;
    }

}

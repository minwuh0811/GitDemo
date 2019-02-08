package exercieses_2;

public class Bil {
    private String modell;
    private int prices;
    private int Dsitance;

    public Bil(String modell, int prices, int Dsitance) {
        this.modell=modell;
        this.prices=prices;
        this.Dsitance=Dsitance;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public int getDsitance() {
        return Dsitance;
    }

    public void setDsitance(int dsitance) {
        Dsitance = dsitance;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "modell='" + modell + '\'' +
                ", prices=" + prices +
                ", Dsitance=" + Dsitance +
                '}';
    }
}


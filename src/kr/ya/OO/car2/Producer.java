package kr.ya.OO.car2;

public class Producer {
    private String name;
    private String homecountry;
    private double discount;

    public Producer(String name, String homecountry, double discount) {
        this.name = name;
        this.homecountry = homecountry;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomecountry() {
        return homecountry;
    }

    public void setHomecountry(String homecountry) {
        this.homecountry = homecountry;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

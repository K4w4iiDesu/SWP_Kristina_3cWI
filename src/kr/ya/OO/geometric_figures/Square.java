package kr.ya.OO.geometric_figures;

public class Square extends Figure {
    private double a;

    public Square(String name,double a) {
        this.a = a;
        super.setName(name);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        double Area = Math.pow(a,2);
        return Area;
    }
}

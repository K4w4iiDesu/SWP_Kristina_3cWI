package kr.ya.OO.geometric_figures;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(String name,double a, double b) {
        this.a = a;
        this.b = b;
        super.setName(name);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getArea (){
        double Area = a*b;
        return Area;
    }
}

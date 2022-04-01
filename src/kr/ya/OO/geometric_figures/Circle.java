package kr.ya.OO.geometric_figures;

public class Circle extends Figure {


    private double r;

    public Circle(String name, double r) {
        super.setName(name);
        this.r = r;
    }


    public double getArea() {
        double Area = Math.PI * Math.pow(r, 2);
        return Area;
    }
}

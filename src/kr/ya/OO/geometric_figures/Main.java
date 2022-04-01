package kr.ya.OO.geometric_figures;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Circle",20);
        Cube cu = new Cube(10,"Cube");
        Rectangle r = new Rectangle("Rectangle",10,20);
        Square s = new Square("Square",20);


        double res = c.getArea();
        String name = c.getName();

        System.out.println(res);
        System.out.println(name);

        System.out.println(cu.getArea());
        System.out.println(cu.getName());

        System.out.println(r.getArea());
        System.out.println(r.getName());

        System.out.println(s.getArea());
        System.out.println(s.getName());
        System.out.println(s.getName() + " " + s.getArea());
    }
}

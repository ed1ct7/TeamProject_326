package allclasses.skrypnikova;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double area() {
        return a * a;
    }

    public double perimeter() {
        return a * 4;
    }

    public double diagonal() {
        return a * Math.sqrt(2);
    }
}

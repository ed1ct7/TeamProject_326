package allclasses.kulikov;

public class Parallelogram {
    private double length;
    private double height;

    public Parallelogram(double length, double height){
        this.height = height;
        this.length = length;
    }

    public double getSquare() { return length * height; }
    public String toString() { return "Площадь параллелограмма:" + getSquare();}
}
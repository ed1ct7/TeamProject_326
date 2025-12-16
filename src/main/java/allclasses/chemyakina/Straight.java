package allclasses.chemyakina;
import java.util.Locale;

public class Straight {
    private double a, b;

    public Straight(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { return a; }
    public double getB() { return b; }

    public String getEquation() {
        return String.format(Locale.US, "y = %.1fx + %.1f", a, b);
    }

    public double getIntersectionOX() {
        return a == 0 ? Double.NaN : -b / a;
    }

    public double getIntersectionOY() {
        return b;
    }

    public boolean isParallelTo(Straight other) {
        return this.a == other.a;
    }

    public String getIntersectionPoint(Straight other) {
        if (this.a == other.a) return "Прямые параллельны";
        double x = (other.b - this.b) / (this.a - other.a);
        return String.format(Locale.US,"(%.1f; %.1f)", x, this.a * x + this.b);
    }
}

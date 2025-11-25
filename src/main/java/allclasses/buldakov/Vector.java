package allclasses.buldakov;

public class Vector {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Vector() {
        x = y = 0;
    }
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getLength() {
        return Math.sqrt(x*x + y*y);
    }
    public String ToString() {
        return "x="+this.getX()+" y="+this.getY()+" length="+this.getLength();
    }
}

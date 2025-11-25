package allclasses.gulyaev;

public class Rectangle {
    private int a;
    private int b;


    public Rectangle(int a, int b){
        if (a > 0 && b >0) {
            this.a = a;
            this.b = b;
        }
    }
    public Rectangle(){
        this.a = 5;
        this.b = 5;
    }


    public int Square(){
        return a * b;
    }
    public int Perimeter(){
        return (a*2)+(b*2);
    }
}

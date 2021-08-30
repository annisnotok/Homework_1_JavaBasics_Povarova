package Task2;

public class Triangle extends Figure{
    private final double a, b, c;

    @Override
    public String getName() {
        return "треугольник";
    }

    public Triangle(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(getPerimeter()*(getPerimeter()-a)*(getPerimeter()-b)*(getPerimeter()-c)));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

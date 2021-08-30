package Task2;

public class Rectangle extends Figure{
    private final double h, w;

    @Override
    public String getName() {
        return "прямоугольник";
    }

    public Rectangle(){
        this.h = 1;
        this.w = 1;
    }

    public Rectangle(double h, double w){
        this.h = h;
        this.w = w;
    }

    @Override
    public double getArea() {
        return h * w;
    }

    @Override
    public double getPerimeter() {
        return h * 2 + w * 2;
    }
}

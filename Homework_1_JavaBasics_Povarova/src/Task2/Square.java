package Task2;

public class Square extends Figure{
    private final double a;

    @Override
    public String getName() {
        return "квадрат";
    }

    public Square(){
        this.a = 1;
    }

    public Square(double a){
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }
}

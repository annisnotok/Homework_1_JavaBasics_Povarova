package Task2;

public class Circle extends Figure{
    private final double r;

    @Override
    public String getName() {
        return "круг";
    }

    public Circle(){
        this.r = 1;
    }

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea(){
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }
}

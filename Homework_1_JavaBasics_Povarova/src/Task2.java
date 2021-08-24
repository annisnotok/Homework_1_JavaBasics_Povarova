import java.util.ArrayList;

import static java.lang.System.out;

public class Task2 {

    public static void main(String[] args){
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(4));
        figures.add(new Rectangle(2, 3));
        figures.add(new Triangle(1, 2, 3));
        figures.add(new Square(1));
        out.println("Периметры добавленных фигур:");
        for(Figure f:figures){
            out.println(f.perimeter());
        }
        out.println("Площади добавленных фигур:");
        for(Figure f:figures){
            out.println(f.square());
        }
    }

}


class Figure{
    public double square(){return 0;}
    public double perimeter(){return 0;}
}

class Square extends Figure{
    private double a;
    public Square(double a){
        this.a = a;
    }
    public double square(){
        return a * a;
    }
    public double perimeter(){
        return a * 4;
    }
}

class Rectangle extends Figure{
    private double a, b;
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double square(){
        return a * b;
    }
    public double perimeter(){
        return a * 2 + b * 2;
    }
}

class Circle extends Figure{
    private double r;
    public Circle(double r){
        this.r = r;
    }
    public double square(){
        return Math.PI * r * r;
    }
    public double perimeter(){
        return 2 * Math.PI * r;
    }
}

class Triangle extends Figure{
    private double a, b, c;
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimeter(){
        return a + b + c;
    }
    public double square(){
        return (Math.sqrt(perimeter()*(perimeter()-a)*(perimeter()-b)*(perimeter()-c)));
    }
}

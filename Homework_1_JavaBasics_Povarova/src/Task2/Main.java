package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Rectangle(3,4));
        figures.add(new Circle(5));
        figures.add(new Triangle(3,4,5));
        figures.add(new Square());
        //выведем периметры полученных фигур
        for(Figure f:figures){
            System.out.println("Периметр "+f.getName()+"а равен "+f.getPerimeter());
        }
        //выведем площади полученных фигур
        for(Figure f:figures){
            System.out.println("Площадь "+f.getName()+"а равна "+f.getArea());
        }
    }
}

package academy.belhard;

import academy.belhard.api.AreaCalculatable;
import academy.belhard.api.PerimeterCalculatable;

public class Main {

    public static void main(String[] args) {
        AreaCalculatable[] areas = new AreaCalculatable[2];
        areas[0] = new Rectangle(5, 8);
        areas[1] = new RightTriangle(3, 4);

        for (AreaCalculatable figure : areas) {
            System.out.println("Тип фигуры: " + figure.getFigureName());
            System.out.println("Площадь фигуры = " + figure.calculateArea());

            System.out.println();
        }

        PerimeterCalculatable[] perimeters = new PerimeterCalculatable[2];
        perimeters[0] = new Rectangle(11, 20);
        perimeters[1] = new RightTriangle(67, 81);

        for (PerimeterCalculatable figure : perimeters) {
            System.out.println("Тип фигуры: " + figure.getFigureName());
            System.out.println("Периметр фигуры = " +figure.calculatePerimeter());

            System.out.println();
        }
    }
}

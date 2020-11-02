package academy.belhard;

import academy.belhard.api.AreaCalculatable;
import academy.belhard.api.PerimeterCalculatable;

/**
 * Класс RightTriangle (Правильный треугольник)
 * Реализует интерфейсы AreaCalculatable и PerimeterCalculatable
 */
public class RightTriangle implements AreaCalculatable, PerimeterCalculatable {
    private static final String FIGURE_NAME = "Прямоугольный треугольник";

    private double a;
    private double b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Реализация интерфейса AreaCalculatable
     */
    @Override
    public double calculateArea() {
        return a * b / 2;
    }

    /**
     * Реализация интерфейса PerimeterCalculatable
     */
    @Override
    public double calculatePerimeter() {
        double hypotenuse = Math.sqrt(a * a + b * b);
        return (a + b) + hypotenuse;
    }

    /**
     * Реализация интерфейса FigureNameProvider
     */
    @Override
    public String getFigureName() {
        return FIGURE_NAME;
    }
}

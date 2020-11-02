package academy.belhard;

import academy.belhard.api.AreaCalculatable;
import academy.belhard.api.PerimeterCalculatable;

/**
 * Класс Rectangle (Прямоугольник)
 * Реализует интерфейсы AreaCalculatable и PerimeterCalculatable
 */
public class Rectangle implements AreaCalculatable, PerimeterCalculatable {
    private static final String FIGURE_NAME = "Прямоугольник";

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Реализация интерфейса AreaCalculatable
     */
    @Override
    public double calculateArea() {
        return a * b;
    }

    /**
     * Реализация интерфейса PerimeterCalculatable
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    /**
     * Реализация интерфейса FigureNameProvider
     */
    @Override
    public String getFigureName() {
        return FIGURE_NAME;
    }
}

package academy.belhard.api;

/**
 * Интерфейс PerimeterCalculatable (Считающий периметр - имеется ввиду самого себя)
 * Любой класс реализующий данный интерфейс,
 * должен реализовать методы calculatePerimeter() и getFigureName() [от FigureNameProvider]
 */
public interface AreaCalculatable extends FigureNameProvider {

    double calculateArea();
}

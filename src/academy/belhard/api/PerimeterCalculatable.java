package academy.belhard.api;

/**
 * Интерфейс PerimeterCalculatable (Считающий периметр - имеется ввиду самого себя)
 * Любой класс реализующий данный интерфейс,
 * должен реализовать методы calculatePerimeter() и getFigureName() [от FigureNameProvider]
 */
public interface PerimeterCalculatable extends FigureNameProvider {

    double calculatePerimeter();
}

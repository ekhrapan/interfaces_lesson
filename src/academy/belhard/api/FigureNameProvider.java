package academy.belhard.api;

/**
 * Интерфейс FigureNameProvider (Предоставляющий имя самого себя)
 * Любой класс реализующий данный интерфейс, должен реализовать метод getFigureName()
 */
public interface FigureNameProvider {

    String getFigureName();
}

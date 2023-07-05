package works;
import java.awt.*;
public class task {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);

        render.showIndicator(building, "строение1");

        Hero hero = new Hero(100, 50);
        hero.setCurrentHealthPoint(80);
        hero.setCurrentManaPoint(30);

        render.showIndicator(hero, "герой1");

        Neutral neutral = new Neutral(75);
        neutral.setCurrentHealthPoint(60);

        render.showIndicator(neutral, "нейтрал11");
    }
}

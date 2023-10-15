package template.game_design;

public abstract class Game {

    public abstract void initialize();

    public abstract void start();

    public abstract void end();

    public final void play() {
        System.out.println("Playing game...");
        initialize();
        start();
        end();
    }

}

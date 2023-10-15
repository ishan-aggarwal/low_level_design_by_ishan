package template.game_design;

public class CricketGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket game initialized! Start playing.");
    }

    @Override
    public void start() {
        System.out.println("Cricket game started. Enjoy the game!");
    }

    @Override
    public void end() {
        System.out.println("Cricket game finished!");
    }
}

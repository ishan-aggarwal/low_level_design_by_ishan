package template.game_design;

public class FootballGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Football game initialized! Start playing.");
    }

    @Override
    public void start() {
        System.out.println("Football game started. Enjoy the game!");
    }

    @Override
    public void end() {
        System.out.println("Football game finished!");
    }
}

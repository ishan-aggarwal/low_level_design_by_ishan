package template.game_design;

public class TemplateClientApplication {
    public static void main(String[] args) {
        Game game = new CricketGame();
        game.play();
        System.out.println("==================================");
        game = new FootballGame();
        game.play();
    }
}

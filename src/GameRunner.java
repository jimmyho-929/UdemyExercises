public class GameRunner {
    public static void main(String[] args) {
       //GamingConsole game = new MarioGame();
        GamingConsole game = new ChessGame();
        game.up();
        game.right();
        game.down();
    }
}

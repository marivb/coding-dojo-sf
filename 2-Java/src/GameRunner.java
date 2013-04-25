public class GameRunner {

   private Game game;

   public GameRunner(Game game) {
      //To change body of created methods use File | Settings | File Templates.
      this.game = game;
   }

   public GameRunner() {
      //To change body of created methods use File | Settings | File Templates.
   }

   public static void main(String[] args) {
      new GameRunner().run();
   }

   public void run() {
      game.tic();
   }
}

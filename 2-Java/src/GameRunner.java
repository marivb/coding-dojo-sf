public class GameRunner {

   private Game game;

   public GameRunner(Game game) {
      this.game = game;
   }


   public static void main(String[] args) {
      final Game game = new Game();
      game.food(5, 4);
      new GameRunner(game).run();
   }

   public void run() {
      int count = 0;
      while (!game.isFinished() && count < 10) {
         System.out.println(game.print());
         game.tic();
         count++;
      }

   }
}

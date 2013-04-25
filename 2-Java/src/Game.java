public class Game {

   public static final int SIZE = 10;
   private String[][] board = new String[SIZE][SIZE];
   private PacMan pacman;

   public Game() {
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j < SIZE; j++) {
            board[i][j] = " ";
         }
      }
   }


   public String print() {
      StringBuffer s = new StringBuffer();
      s.append("++++++++++++\n");

      for (int i = 0; i < SIZE; i++) {
         s.append("+");
         for (int j = 0; j < SIZE; j++) {
            s.append(board[i][j]);
         }
         s.append("+\n");
      }

      s.append("++++++++++++\n");

      return s.toString();
   }

   public void pacMan(int x, int y) {
      this.pacman = new PacMan(x, y);
      this.board[x][y] = "@";
   }

   public void food(int x, int y) {
      this.board[x][y] = ".";
   }
}

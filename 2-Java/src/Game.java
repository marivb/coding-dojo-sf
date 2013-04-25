public class Game {

   public static final int SIZE = 10;
   private String[][] board = new String[SIZE][SIZE];
   private PacMan pacMan;

   public Game() {
      this.pacMan = new PacMan(-1,-1);
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j < SIZE; j++) {
            board[i][j] = " ";
         }
      }
   }


   public String print() {
      StringBuffer s = new StringBuffer();
      s.append("++++++++++++\n");

      for (int y = 0; y < SIZE; y++) {
         s.append("+");
         for (int x = 0; x < SIZE; x++) {
            if (pacMan.getX() == x && pacMan.getY() == y) {
               s.append("@");
            } else {
               s.append(board[y][x]);
            }
         }
         s.append("+\n");
      }

      s.append("++++++++++++\n");

      return s.toString();
   }

   public void pacMan(int x, int y) {
      this.pacMan = new PacMan(x, y);
   }

   public void food(int x, int y) {
      this.board[x][y] = ".";
   }

   public void tic() {
      this.pacMan.move();
   }
}

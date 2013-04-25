public class Board {

   public static final int SIZE = 10;
   private int pacX = -1;
   private int pacY = -1;
   private String[][] grid = new String[SIZE][SIZE];

   public Board() {
      for (int i = 0; i < SIZE; i++) {
         for (int j = 0; j < SIZE; j++) {
            grid[i][j] = " ";
         }
      }
   }


   public String print() {
      StringBuffer s = new StringBuffer();
      s.append("++++++++++++\n");

      for (int i = 0; i < SIZE; i++) {
         s.append("+");
         for (int j = 0; j < SIZE; j++) {
            s.append(grid[i][j]);
         }
         s.append("+\n");
      }

      s.append("++++++++++++\n");

      return s.toString();
   }

   public void pacMan(int x, int y) {
      this.pacX = x;
      this.pacY = y;
      this.grid[x][y] = "@";
   }

   public void food(int x, int y) {
      this.grid[x][y] = ".";
   }
}

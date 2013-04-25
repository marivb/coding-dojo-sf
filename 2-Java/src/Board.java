public class Board {

   public static final int SIZE = 10;
   private int pacX = -1;
   private int pacY = -1;

   public Board() {

   }


   public String print() {
      StringBuffer s = new StringBuffer();
      s.append("++++++++++++\n");

      for (int i = 0; i < SIZE; i++) {
         s.append("+");
         for (int j = 0; j < SIZE; j++) {
            if (pacX == i && pacY == j)
               s.append("@");
            else
               s.append(" ");
         }
         s.append("+\n");
      }

      s.append("++++++++++++\n");

      return s.toString();
   }

   public void pacMan(int x, int y) {
      this.pacX = x;
      this.pacY = y;
   }
}

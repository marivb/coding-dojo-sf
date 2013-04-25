public class PacMan {
   private int x;
   private int y;

   public PacMan(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public int getX() {
      return x;
   }

   public void move() {
      x++;
   }

   public int getY() {
      return y;
   }

   public Direction getDirection() {
      return Direction.EAST;
   }
}

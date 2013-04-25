public class PacMan {
   private int x;
   private int y;
   private Direction direction;

   public PacMan(int x, int y) {
      this.x = x;
      this.y = y;
      this.direction = Direction.EAST;
   }

   public int getX() {
      return x;
   }

   public void move() {
      if (direction.equals(Direction.NORTH)) {
         y--;
      } else {
         x++;
      }
   }

   public int getY() {
      return y;
   }

   public Direction getDirection() {
      return direction;
   }

   public void setDirection(Direction direction) {
      this.direction = direction;
   }
}

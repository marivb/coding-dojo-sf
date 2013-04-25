import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PacManTest {

   @Test
   public void shouldReturnCurrentPosition(){
      PacMan p = new PacMan(5,6);
      assertThat(p.getX(), is(5));
      assertThat(p.getY(), is(6));
   }

   @Test
   public void shouldBeAbleToMove(){
      PacMan p = new PacMan(5,5);
      p.move();
      assertThat(p.getX(), is(6));
   }

   @Test
   public void hasDirection() {
      PacMan p = new PacMan(5,6);
      assertThat(p.getDirection(), is(Direction.EAST));
   }
}

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PacManTest {

   private PacMan pacMan;

   @Before
   public void setUp() throws Exception {
      pacMan = new PacMan(5,6);
   }

   @Test
   public void shouldReturnCurrentPosition(){
      assertThat(pacMan.getX(), is(5));
      assertThat(pacMan.getY(), is(6));
   }

   @Test
   public void shouldBeAbleToMove(){
      pacMan.move();
      assertThat(pacMan.getX(), is(6));
      assertThat(pacMan.getY(), is(6));
   }

   @Test
   public void hasDirection() {
      assertThat(pacMan.getDirection(), is(Direction.EAST));
   }

   @Test
   public void canChangeDirection(){
      pacMan.setDirection(Direction.NORTH);
      assertThat(pacMan.getDirection(), is(Direction.NORTH));
   }

   @Test
   public void shouldMoveInTheRightDirection(){
      pacMan.setDirection(Direction.NORTH);
      pacMan.move();
      assertThat(pacMan.getX(), is(5));
      assertThat(pacMan.getY(), is(5));
   }

}

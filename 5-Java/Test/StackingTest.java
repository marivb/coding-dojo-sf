import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StackingTest {

   @Test
   public void printWorldWithOneBlock(){
      Stacking s = new Stacking(1);
      assertThat(s.printState(), is("0: 0\n"));
   }

   @Test
   public void doesSomething(){
      Stacking s = new Stacking(2);
      assertThat(s.printState(), is("0: 0\n1: 1\n"));
   }
   @Test
   public void printInitialState(){
      Stacking s = new Stacking(3);
      assertThat(s.printState(), is("0: 0\n1: 1\n2: 2\n"));
   }

}

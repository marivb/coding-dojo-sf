import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StackingTest {

   @Test
   public void doesNothing(){
      Stacking s = new Stacking();
      assertThat(s.printState(), is("0: 0"));
   }

   @Test
   public void doesSomething(){
      Stacking s = new Stacking(2);
      assertThat(s.printState(), is("0: 0\n1: 1\n2: 2\n"));
   }
   @Test
   public void printInitialState(){
      Stacking s = new Stacking(2);
      assertThat(s.printState(), is("0: 0\n1: 1\n2: 2\n"));
   }

}

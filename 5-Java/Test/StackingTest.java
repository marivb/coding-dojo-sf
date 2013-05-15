import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StackingTest {

   @Test
   public void doesNothing(){
      Stacking s = new Stacking();
      Stacking oldS = s;
      assertThat(s.printState(), is("0: 0"));
   }

}

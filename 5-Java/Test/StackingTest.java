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
   public void printWorldWithTwoBlocks(){
      Stacking s = new Stacking(2);
      assertThat(s.printState(), is("0: 0\n1: 1\n"));
   }

   @Test
   public void printWorldWithThreeBlocks(){
      Stacking s = new Stacking(3);
      assertThat(s.printState(), is("0: 0\n1: 1\n2: 2\n"));
   }

   @Test
   public void moveBlockTwoOntoOne(){
      Stacking stacking = new Stacking(3);
      stacking.moveOnto(2, 1);
      assertThat(stacking.printState(), is("0: 0\n1: 1 2\n2: \n"));
   }

   @Test
   public void moveBlockOneOntoTwo(){
      Stacking stacking = new Stacking(3);
      stacking.moveOnto(1, 2);
      assertThat(stacking.printState(), is("0: 0\n1: \n2: 2 1\n"));

   }
   @Test
   public void moveAllBlocksOntoZero(){
      Stacking stacking = new Stacking(3);
      stacking.moveOnto(1, 0);
      stacking.moveOnto(2, 1);
      assertThat(stacking.printState(), is("0: 0 1 2\n1: \n2: \n"));
   }

}

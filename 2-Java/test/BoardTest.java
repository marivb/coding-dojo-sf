import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {



   @Test
   public void shouldDisplayEmptyBoard(){
      Board b = new Board();
      final String display =  "++++++++++++\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "+          +\n" +
                              "++++++++++++\n";
      assertThat(b.print(), is(display));
   }

   @Test
   public void shouldPlacePacManOnBoard(){
      Board b = new Board();
      b.pacMan(4,4);
      final String display =  "++++++++++++\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+    @     +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "++++++++++++\n";
      assertThat(b.print(), is(display));

   }
   @Test
   public void shouldPlaceFoodOnBoard(){
      Board b = new Board();
      b.pacMan(4,4);
      b.food(4,5);
      final String display =  "++++++++++++\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+    @.    +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "+          +\n" +
            "++++++++++++\n";
      assertThat(b.print(), is(display));
   }



}

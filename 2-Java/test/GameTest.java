import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {



   @Test
   public void shouldDisplayEmptyBoard(){
      Game b = new Game();
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
      Game b = new Game();
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
      Game b = new Game();
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

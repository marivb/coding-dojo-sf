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



}

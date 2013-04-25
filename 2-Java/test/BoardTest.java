import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {



   @Test
   public void printBoard(){
      Board b = new Board();
      assertThat(b.print(), is("*"));
   }



}

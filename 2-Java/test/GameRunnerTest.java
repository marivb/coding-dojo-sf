import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameRunnerTest {
   @Test
   public void callsTick(){
      Game game = mock(Game.class);
      GameRunner gameRunner = new GameRunner(game);
      gameRunner.run();
      verify(game).tic();
   }
}

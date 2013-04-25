import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameRunnerTest {

   private Game game;
   private GameRunner gameRunner;

   @Before
   public void setUp() throws Exception {
      game = mock(Game.class);
      when(game.isFinished()).thenReturn(false, true);
      gameRunner = new GameRunner(game);
   }

   @Test
   public void callsTick(){
      gameRunner.run();
      verify(game).tic();
   }

   @Test
   public void callsPrint(){
      gameRunner.run();
      verify(game).print();
   }

   @Test
   public void shouldLoopUntilGameIsFinished() {
      when(game.isFinished()).thenReturn(false, false, true);
      gameRunner.run();
      verify(game, times(2)).print();
      verify(game, times(2)).tic();
   }


}

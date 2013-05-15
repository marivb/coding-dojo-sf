import java.util.Arrays;

public class Stacking {
   private final int numberOfBlocks;

   public Stacking(int numberOfBlocks) {
      this.numberOfBlocks = numberOfBlocks;
      blocks = new String[numberOfBlocks];
   }

   public Stacking() {
      this(0);
   }

   String[] blocks;

   public String printState() {
      return Arrays.toString(blocks);
   }
}

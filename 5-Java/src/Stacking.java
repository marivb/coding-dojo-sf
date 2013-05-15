import java.util.ArrayList;
import java.util.List;

public class Stacking {
   private final int numberOfBlocks;
   private final List<String> blocks;

   public Stacking(int numberOfBlocks) {
      this.numberOfBlocks = numberOfBlocks;
      blocks = new ArrayList<String>(numberOfBlocks);
      for (int i = 0; i < numberOfBlocks; i++) {
         blocks.add(i, "" + i);
      }
   }

   public String printState() {
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < numberOfBlocks; i++) {
            stringBuilder.append(i + ": " + blocks.get(i) + "\n");
      }
      return stringBuilder.toString();
   }

   public void moveOnto(int source, int target) {

      blocks.set(target, target+" "+source);
      blocks.set(source, "");
   }
}

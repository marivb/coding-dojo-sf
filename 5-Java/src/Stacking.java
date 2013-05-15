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

   // 1 0
   // 2 1
   public void moveOnto(int sourceBlock, int targetBlock) {
      int initialColumnOfSourceBlock = columnOf(sourceBlock);
      String blocksInSourcesColumn = blocks.get(initialColumnOfSourceBlock); // 2
      String blocksInTargetsColumn = blocks.get(columnOf(targetBlock)); // "0 1"
      blocks.set(columnOf(targetBlock), blocksInTargetsColumn + " " + sourceBlock); //want 0 1 2
      blocks.set(initialColumnOfSourceBlock, removeLastBlockFrom(blocksInSourcesColumn));                   // ''
   }

   public String removeLastBlockFrom(String blocksInSourcesColumn) {
       return blocksInSourcesColumn.substring(0, blocksInSourcesColumn.length() - 1).trim();
   }
   // 0: "0 1"
   // 1: ""
   // 2: "2"

   // 0: "0"
   // 1: ""
   // 2: "2 1"

   private int columnOf(int blockNumberToFind) {
      for(int i = 0; i < numberOfBlocks; i++) {
         if (blocks.get(i).contains(blockNumberToFind+ ""))
            return i;
      }
      return -1;
   }
}

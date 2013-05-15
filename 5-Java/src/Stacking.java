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
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < numberOfBlocks; i++) {
         if (blocks[i] == null) {
            stringBuilder.append(i + ": " + i + "\n");

         }
      }
      return stringBuilder.toString();
   }
}

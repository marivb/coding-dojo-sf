public class Stacking {
   private final int numberOfBlocks;

   public Stacking(int numberOfBlocks) {
      this.numberOfBlocks = numberOfBlocks;
      blocks = new ArrayList<String>();
      for (int i = 0; i < numberOfBlocks; i++) {
         stringBuilder.append(i + ": " + i + "\n");
      }
      return stringBuilder.toString();
   }

   public String printState() {
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < numberOfBlocks; i++) {
            stringBuilder.append(i + ": " + i + "\n");
      }
      return stringBuilder.toString();
   }

   public void moveOnto(int source, int target) {

   }
}

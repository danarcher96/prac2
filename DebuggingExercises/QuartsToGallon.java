public class QuartsToGallon
{
   public static void main(String[] args)
   {
      int quartsRatio = 4;
      int quartsReq = 26;
      int neededGallon;
      int neededQuarts;
      neededGallon = quartsReq / quartsRatio;
      neededQuarts = quartsReq % quartsRatio;
      System.out.println("You will need " + neededGallon +" gallons and " + neededQuarts + " quarts");


   }
}

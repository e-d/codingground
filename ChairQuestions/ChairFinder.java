import java.util.List;
import java.util.LinkedList;

public class ChairFinder {

     public static void main(String []args) {
         LinkedList<Chair> chairs = new LinkedList<Chair>();
         for (int i = 0; i < 10; i++) {
            Chair c = new Chair();
            c.setComfortLevel(i);
            chairs.add(c);
         }
         System.out.println("Most comfortable: " + findMostComfortableChair(chairs));
     }
     
     private static Chair findMostComfortableChair(List<Chair> chairs) {
         return null;
     }
}

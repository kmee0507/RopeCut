import java.util.*;
public class RopeCut{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of ropes: ");
      int ropes = sc.nextInt();
      Scanner sc1 = new Scanner(System.in);
      System.out.print("Enter the " + ropes + " rope lengths: ");
      String length = sc1.nextLine();
      String[] ropeLengths = length.split(" ");   
      ArrayList<Integer> lengthsOfRopes = new ArrayList<Integer>();
      for(int i = 0; i < ropeLengths.length;i++){
         lengthsOfRopes.add(Integer.parseInt(ropeLengths[i]));
      }
      Collections.sort(lengthsOfRopes);
      
      while(lengthsOfRopes.size() != 0){
         System.out.println(lengthsOfRopes.size());
         for(int j = 0; j < lengthsOfRopes.size();j++){
            int cutSize = lengthsOfRopes.get(0);
            
            int newLength = lengthsOfRopes.get(j) - cutSize;
            lengthsOfRopes.set(j,newLength);
            
            if(lengthsOfRopes.get(j) == 0)
               lengthsOfRopes.remove(j);
            
         }
         
         
      }
      
   }
}
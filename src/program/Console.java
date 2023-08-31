package program;

import java.util.Scanner;

public class Console {

     private static Scanner scanner = new Scanner(System.in);

     public static String userInput(String prompt){
         System.out.println(prompt + " ");
         return scanner.nextLine();
     }

     public static boolean readDecision(String prompt){
          while (true){
               System.out.println(prompt + " ");
               String response = scanner.nextLine();
               if (response.equalsIgnoreCase("yes"))
                    return true;
               else if (response.equalsIgnoreCase("no"))
                    return false;
               else {
                    System.out.println("Your answer is incorrect. Please try again.");
               }
          }
     }
}

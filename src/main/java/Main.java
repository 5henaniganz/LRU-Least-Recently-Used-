import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //New Doubly Linked-List Object
        DLLFunctions dll = new DLLFunctions();

        //Random object and random integer
        Random rand = new Random();
        dll.addToDll(rand.nextInt(2000));

        //Keeps program alive until false
        boolean programLifespan = true;

        //Generated list with random number constraints
        System.out.println("Current List:");
        dll.printDll();

        //User input, adding to the cache for visual purposes
        while (programLifespan == true) {
            System.out.println("\nEnter a number to add to the list:");
            Scanner userNumber = new Scanner(System.in);
            String result = userNumber.next();
            try {
                int num = Integer.parseInt(result);
                dll.push(num);

                System.out.println("Updated List");
                dll.printDll();
            } catch (Exception e) {
                programLifespan = false;
                System.out.println("Thats not a number, goodbye!");
            }

        }
    }
}
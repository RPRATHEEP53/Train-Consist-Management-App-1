import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmnt1 {

    public static void main(String[] args) {

        // 1. Display welcome banner
        System.out.println("============================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("============================================\n");

        // 2. Create a dynamic list to store train bogies
        // Using List interface with ArrayList implementation
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial consist information
        System.out.println("Train initialized successfully...");

        // Display initial bogie count using size()
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Print the current state of the train (empty list)
        System.out.println("Current Train Consist : " + trainConsist);

        // Example of adding bogies (optional, to see it in action)
        /*
        trainConsist.add("Engine");
        trainConsist.add("Passenger Car 1");
        System.out.println("Updated Bogie Count : " + trainConsist.size());
        System.out.println("Updated Train Consist : " + trainConsist);
        */
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] values = new int[4];
        boolean found = false;
        int position = -1;

        System.out.println("Enter 4 numbers:");

        // Read 4 integers from the user
        for (int i = 0; i < values.length; i++) {
            while (true) {
                try {
                    values[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number:");
                    scanner.next(); // clear invalid input
                }
            }
        }

        // Ask for the number to search
        System.out.println("Enter the number to search:");
        int searchValue = scanner.nextInt();

        // Linear search
        for (int i = 0; i < values.length; i++) {
            if (values[i] == searchValue) {
                found = true;
                position = i;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Found at position: " + position);
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Read1 {
    public Read1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter length
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

        // Prompt user to enter breadth
        System.out.print("Enter the breadth: ");
        int breadth = scanner.nextInt();

        // Displaying the input values
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);

        // Calculate area (if needed)
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

import java.util.Scanner;

public class Substraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a, b;

        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        
	System.out.println("Enter your choice: ");
	System.out.println("Enter 1 for Addition: ");
	System.out.println("Enter 2 for Substraction: ");
	System.out.println("Enter 3 for Multiplication: ");
	System.out.println("Enter 4 for Division: ");
	int choice = scanner.nextInt();

	if (choice == 2){
		System.out.println("Substraction of both number is : " + (a-b));
}

        scanner.close();
    }
}

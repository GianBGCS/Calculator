import java.util.Scanner;

public class MDASCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MDAS Calculator\n [1] Addition \n[2] Subtraction \n[3] Multiplication");
        System.out.print("\nChoose an operation (1-3): ");
        int operation = scanner.nextInt();

        switch (operation){
            case 1:
                System.out.print("Enter first number: ")
                
        }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
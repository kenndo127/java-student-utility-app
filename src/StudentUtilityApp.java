import java.util.Scanner;
public class StudentUtilityApp {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
                ==== STUDENT UTILITY APP ====
                1. Add two numbers
                2. Check is a number is EVEN or ODD
                3. Print numbers from 1 to N
                4. Display day of the week
                5. Exit
                """);
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch(choice){
            case(1):
                //call sum function
                System.out.println(add());
                break;
            case(2):
                //call is Even or Odd function
                System.out.println(isEvenOrOdd());
                break;
            case(3):
                // call print N numbers function
                printN();
                break;
            case(4):
                // call the Display the day of the week function
                break;
            case(5):
                System.out.println("Thank You for Using the app");
                break;
            default:
                System.out.println("Enter a valid choice.");
        }
    }

    public static String add(){
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;

        return "The sum of " + num1 + " and " + num2 + " is " + sum;
    }
    public static String isEvenOrOdd(){
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        return ((num % 2) == 0) ? "Even" : "Odd";
    }
    public static void printN(){
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}

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
        System.out.print("Enter your choice:");
        int choice = scan.nextInt();
    }
}

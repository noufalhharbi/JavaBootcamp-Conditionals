import java.util.Scanner;
import java.util.Random;
public class DayThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // q1 print welcoming message based on role
        /*
        String role = "admin";
        if (role.equals("admin")) {
            System.out.println("Welcome Admin");
        }
        else if (role.equals("superuser")) {
            System.out.println("Welcome Superuser");
        }
        else if (role.equals("user")) {
            System.out.println("Welcome User");
        }
        */

        // q2
        /*
        System.out.println("Please enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = input.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The greatest: " + firstNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The greatest: " + secondNumber);
        }
        else  {
            System.out.println("The greatest: " + thirdNumber);
        }
        */

        //q3 generate number and display the matching weekday
        /*
        Random rand = new Random();
        int number = rand.nextInt(7) + 1;

        System.out.println("Generated number: " + number);


        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }
        */

        //q4 take score and print the grade
        /*
        System.out.print("Enter your numeric score: ");
        int score = input.nextInt();

        System.out.println("Numeric Score: " + score);


        if (score >= 90 && score <= 100) {
            System.out.println("Letter Grade: A");
        } else if (score >= 80) {
            System.out.println("Letter Grade: B");
        } else if (score >= 70) {
            System.out.println("Letter Grade: C");
        } else if (score >= 60) {
            System.out.println("Letter Grade: D");
        } else if (score >= 0) {
            System.out.println("Letter Grade: F");
        } else {
            System.out.println("Invalid score");
        }
        */

        // q5 take age and print which category it belongs to
       /*
        System.out.print("Enter your age: ");
        int age = input.nextInt();


        if (age < 13) {
            System.out.println("You are a Child.");
        } else if (age <= 19) {   // covers 13–19
            System.out.println("You are a Teenager.");
        } else {
            System.out.println("You are an Adult.");
        }
        */
    }
}

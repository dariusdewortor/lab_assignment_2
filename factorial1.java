import java.util.Scanner;
public class factorial1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int factorialNumber;
        System.err.println("Enter the number whose factorial you want to find: ");
        factorialNumber = input.nextInt();
        int number = 1;
        int factorial = 1;
        while (number <= factorialNumber){
            factorial *= number;
            number++;
        }
        System.out.println("The factorial of " + factorialNumber + " is " + factorial);
    }
}
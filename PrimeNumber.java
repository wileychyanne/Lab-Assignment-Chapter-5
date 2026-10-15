import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // set count to 0
        int count = 0;
        //ask user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        //check how many factors the number has
        for (int i = 1; i <= number; i++) {
            // if user enters a prime number, 1 and itself will result in 0
            // then counter should == 2
            if (number % i == 0) {
                count++;
            }
        }
        //check if number is prime
        if (count == 2) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
        input.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        int number;
        Random random = new Random();
        number = random.nextInt(101);
        int guess;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("enter a no.:");
            guess = sc.nextInt();
            if (i == 1 && guess == number) {
                System.out.println("you won!! and marks are 3/3");
            } else if (i == 2 && guess == number) {
                System.out.println("okk done!! and marks are 2/3");
            } else if (i == 3 && guess == number) {
                System.out.println("finally you got it!! and marks are 1/3");
            } else {
                if (i < 3) {
                    System.out.println("try again..");
                } else {
                    System.out.println("sorry the no. was " + number + " better luck next time");
                }
            }
        }
    }
}

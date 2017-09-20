import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class IntroProgrammingExercises {


    public static void printAnAsterisk() {
        System.out.println("*");
    }

    public static void printAsterisksInHorizontalLine() {
        int inputNumber = getInputNumber();
        for (int i = 0; i < inputNumber; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printAsterisksInVerticalLine() {
        int inputNumber = getInputNumber();
        for (int i = 0; i < inputNumber; i++) {
            System.out.println("*");
        }
    }

    public static void printRightTriangle() {
        int inputNumber = getInputNumber();
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printIsoscelesTriangle() {
        int inputNumber = getInputNumber();
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = inputNumber; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printDiamond() {
        int inputNumber = getInputNumber();
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = inputNumber; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = inputNumber - 1; i > 0; i--) {
            for (int j = i; j < inputNumber; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printDiamondWithName() {
        int inputNumber = getInputNumber();

        for (int i = 1; i <= inputNumber - 1; i++) {
            for (int j = inputNumber; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Archana");

        for (int i = inputNumber - 1; i > 0; i--) {
            for (int j = i; j < inputNumber; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println(); // formatting output
    }

    public static void generate(int n) {
        int inputNumber = n;
        List intList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                intList.add(i);
                n /= i;
            }
        }
        Collections.sort(intList);
        System.out.println("The prime factors of " + inputNumber + " are: " + intList.toString());
    }

    private static int getInputNumber() {
        System.out.println("Please enter a number below:");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void main(String[] args) {
        printAnAsterisk();
        printAsterisksInHorizontalLine();
        printAsterisksInVerticalLine();
        printRightTriangle();
        printIsoscelesTriangle();
        printDiamond();
        printDiamondWithName();
        fizzBuzz();
        generate(1);
    }
}
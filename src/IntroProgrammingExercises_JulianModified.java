import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class IntroProgrammingExercises_JulianModified {

    public static void printAnAsterisk(PrintStream printStream) {
        printStream.println("*");
    }

    public static void printAsterisksInHorizontalLine(Scanner scanner, PrintStream printStream) {
        int inputNumber = getInputNumber(scanner, printStream);
        for (int i = 0; i < inputNumber; i++) {
            printStream.print("*");
        }
        printStream.print("\n");
    }

    public static void printAsterisksInVerticalLine(Scanner input, PrintStream printStream) {
        int inputNumber = getInputNumber(input, printStream);
        for (int i = 0; i < inputNumber; i++) {
            printStream.println("*");
        }
    }

    public static void printRightTriangle(Scanner input, PrintStream printStream) {
        int inputNumber = getInputNumber(input, printStream);
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printIsoscelesTriangle(Scanner input, PrintStream printStream) {
        int inputNumber = getInputNumber(input, printStream);
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

    public static void printDiamond(Scanner input, PrintStream printStream) {
        int inputNumber = getInputNumber(input, printStream);
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

    public static void printDiamondWithName(Scanner input, PrintStream printStream) {
        int inputNumber = getInputNumber(input, printStream);

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
        System.out.println(); // formatting printStream
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

    public static int getInputNumber(Scanner input, PrintStream printStream) {
        printStream.println("Please enter a number below:");

        //This next line will fetch the value that is loaded in the scanner
        String  userResponse = input.nextLine();

        int number = Integer.parseInt(userResponse);

        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        printAnAsterisk(output);
        printAsterisksInHorizontalLine(input, output);
        printAsterisksInVerticalLine(input, output);
        printRightTriangle(input, output);
        printIsoscelesTriangle(input, output);
        printDiamond(input, output);
        printDiamondWithName(input, output);
        fizzBuzz();
        generate(1);
    }

}
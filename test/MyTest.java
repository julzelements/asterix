import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by julianscharf on 19/9/17.
 */

public class MyTest {

    @Test
    public void whenPrintAnAsterixIsCalledConsoleShouldPrintAnAsterix() {
        //This creates a BAOS and loads it into a printStream
        //later we will use the printstream in our test instead of System.println.out
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        //The scanner is not actually required here for anything except to help construct the app
        Scanner scanner = new Scanner("");

        IntroProgrammingExercises_JulianModified app = new IntroProgrammingExercises_JulianModified();

        //When we call the printAnAsterix method, we can "capture" the result of the program
        //Instead of having it dumped out on the console
        app.printAnAsterisk(printStream);

        //Here we dump out the contents of the BAOS to a string
        String output = byteArrayOutputStream.toString();

        //Now we inspect the string with our actual test
        Assert.assertEquals(output, "*\n");



        //IMPORTANT NOTE:
        //The byte array output stream stuff is (initially) confusing as heck
        //If you want you I can explain how it works, or you can take it at
        //face value and just use what I have shown you. For now, just think of it
        //as a little thingy that captures what gets printed to the console.
    }

    @Test
    public void loadAScannerWithAString() {
        Scanner input = new Scanner("potato");
        String scannerDump = input.nextLine();
        System.out.println(scannerDump);
    }

    @Test
    public void whenprintAsterisksInVerticalLineIsCalledWith5AnOutputOf5IsPrintedToConsole() {
        //This creates a BAOS and loads it into a printStream
        //later we will use the printstream in our test instead of System.println.out
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        //Here we use the scanner and load it up with our input, 5.
        Scanner scanner = new Scanner("5");

        IntroProgrammingExercises_JulianModified app = new IntroProgrammingExercises_JulianModified();

        app.printAsterisksInVerticalLine(scanner, printStream);

        String output = byteArrayOutputStream.toString();

        String expectedConsoleOutput = "Please enter a number below:\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n";


        Assert.assertEquals(output, expectedConsoleOutput);

    }

    @Test
    public void getInputNumberShouldCaptureInteger5SuppliedbyUser() throws Exception {
        //This creates a BAOS and loads it into a printStream
        //later we will use the printstream in our test instead of System.println.out
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        //Here we use the scanner and load it up with our input, 5.
        Scanner scanner = new Scanner("5");

        IntroProgrammingExercises_JulianModified app = new IntroProgrammingExercises_JulianModified();

        //Now I'm testing to see what the getInputNumber method returns
        int number = app.getInputNumber(scanner, printStream);

        Assert.assertEquals(number, 5);

    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // created a new ArrayList that takes in the BoardingPass class and the name is boardingPassList
    // this takes in everything that lives inside our class
    public static ArrayList<BoardingPass> boardingPassList = new ArrayList<>();

    public static void main(String[] args) {

        // we set choice to 0 for our switch statements for the cases
        int choice = 0;
        // we create a new instance of a BoardingPass
        BoardingPass BoardingPass = new BoardingPass();

        // we did a do-while loop here (do-while loops check the condition at the end of the statement)
        // so while the choice is NOT 3, we're going to execute the code inside the code block of do
        do {
            // we created a new Scanner here that takes in user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello! Welcome to Dragon Airlines!");
            System.out.println("At our airlines, we provide quick trips at almost half the price!");
            System.out.println("\n==============================================\n");
            System.out.println("Please enter from the following choices: ");
            System.out.println("1.) Enter BoardingPass Information\n2.) Print BoardingPass Info \n3.) Exit");

            // the user will choose between 1 - enter boarding pass info | 2 - print boarding pass | 3 - exit the program
            choice = scanner.nextInt();

            // we then take a switch statement
            switch (choice) {
                // case 1 - enter boarding pass info
                case 1:
                    // here we are evoking a method called enterInfo() we created down below
                    BoardingPass boardingPass = enterInfo();
                    // this is another method that's evoked that will add the boarding pass to a file - databoardingpassinfo.txt
                    addBoardingPassToFile(boardingPass);
                    // and then we're going to actually print out the boarding pass into the console and use the .toString method
                    System.out.println(boardingPass.toString());
                    break;

                case 2:
                    // once the boarding information has been put in, we can then print it out
                    System.out.println("Please wait - Printing BoardingPass...");
                    System.out.println("(If boarding pass does not show, please select 1 and enter information!)");
                    // this method printBoardingPassInfo will be evoked to print out the actual boarding pass into
                    printBoardingPassInfo(BoardingPass);
                    break;

                case 3:
                    // this just exits out of the whole program, allowing the user to just do nothing
                    System.out.println("Thank you - Exiting ...");
                    choice = 3;
                    break;

                // in switch statements, we always need a default
                default:
                    break;
            }
            // a do-while loop has its condition at the of the statements and hence it checks the condition at the end of the loop
            // that means the statement inside the loop body will be executed at least once, even if the condition is never true
            // do-while loops are exit controlled loops, where even if the condition is false, the loop body will execute once
        } while (choice != 3);
    }

    // we're now creating the ability to create a file and write to that file
    private static void addBoardingPassToFile(BoardingPass boardingPass) {
        // we created a File variable that allows us to communicate to that file
        File file = new File("databoardingpassinfo.txt");

        // we implement a try catch, which essentially attempts the code inside the try and if unable to, will catch an exception
        // it's similar to adding a throw an IOException - but doing a try catch allows us to handle any exceptions here instead

        // so we're going to create a FileWriter class that will be used to write data into the file we created above
        // and, we do append: true, because if we didn't - it would essentially erase everything written in that file before
        // so appending it will append things we want to write onto that file constantly

        // and then we have to do a .close to close the file to tell our code we're done with writing to that file
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(boardingPass.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            // this print stack trace will essentially throw an error message
            // this message usually prints when we haven't established a file to read or write to
            e.printStackTrace();
        }
    }

    // this is a private static method called enterInfo(), so methods and data are only accessible within this class
    // it's static, so any objects we define here will belong specifically to that class
    // that means we'll only have to create one instance of that member that is scared across all instances of the class
    // and, it's return type is a BoardingPass
    private static BoardingPass enterInfo() {
//         here we declare a Scanner class called scanner and the System.in tells our code it's meant to take in user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: " + "\n(Ex. Sally Smith)");
        String name = scanner.nextLine();

        System.out.println("Please enter your email: " + "\n(Ex. sallysmith@gmail.com)");
        String email = scanner.nextLine();

        System.out.println("Please enter your phone number: " + "\n(Ex. 123-456-7890)");
        String phoneNum = scanner.nextLine();

        System.out.println("Please enter your gender: " + "\n(Ex. F or M)");
        char gender = scanner.next().charAt(0);

        System.out.println("Please enter your age: " + "\n(Ex. 35)");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your date you would like to depart: " + "\n(Ex. 01-01-2022)");
        String date = scanner.nextLine();

        System.out.println("Please enter the time you would like to depart: " + "\n(Ex. 10:00 AM / PM)");
        String departureTime = scanner.nextLine();

        System.out.println("Please enter your origin: " + "\n(Ex. Atlanta, Georgia)");
        String origin = scanner.nextLine();

        System.out.println("Please enter your destination: " + "\n(Ex. Los Angeles, California)");
        String destination = scanner.nextLine();

        // here we are essentially creating instances of these classes and Person and BoardingPass with () are constructors
        // and what's being passed inside these constructors are parameters that live inside these classes

        Person person = new Person(name, email, phoneNum, gender, age);

        BoardingPass boardingPass = new BoardingPass(date, origin, destination, departureTime, person);

        // the code below are meant for "testing" purposes to save time during our coding by hardcoding user information

//        Person person = new Person("sally", "sally@gmail.com", "123-123-1234", 'M', 45);
//        BoardingPass boardingPass = new BoardingPass("01-01-2020", "Los Angeles, California", "Atlanta,Georgia","12:00 AM", person);

        // now we add the boardingPass information into the ArrayList that will neatly hold all the information needed for a boarding pass
        boardingPassList.add(boardingPass);
        // and we just return boardingPass
        return boardingPass;
    }

    // here is method that will be used to print the boarding pass information
    private static void printBoardingPassInfo(BoardingPass boardingPass) {
        // here we will iterate through this arrayList that will hold all the boarding pass information
        // and essentially print out every item in that list and, we evoke a toString() that will neatly print it out
        for (int i = 0; i < boardingPassList.size(); i++) {
            System.out.print(boardingPassList.get(i).toString());
        }
    }
}

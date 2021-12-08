import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<BoardingPass> boardingPassList = new ArrayList<>();

    public static void main(String[] args) {

        // we just set choice to 0 for our switch statements
        int choice = 0;
        // we create a new instance of a BoardingPass
        BoardingPass BoardingPass = new BoardingPass();

        // create a do while loop that really is just to take user input and make it almost like a user lobby/menu
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\n----------------------------------------------------\n");
            System.out.println("Please enter from the following choices: ");
            System.out.println("1.) Enter BoardingPass Information\n2.) Print BoardingPass Info \n3.) Exit");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    BoardingPass boardingPass = enterInfo();
                    System.out.println(boardingPass.toString());
                    break;

                case 2:
                    // this just prints the BoardingPass
                    System.out.println("Please wait - Printing BoardingPass...");
                    printBoardingPassInfo(BoardingPass);
                    break;

                case 3:
                    // this just exits out of the whole program
                    System.out.println("Thank you - Exiting ...");
                    choice = 3;
                    break;

                default:
                    break;
            }

        }while(choice != 3);

    }

    private static BoardingPass enterInfo()
    {
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

        System.out.println("Please enter your destination: " + "\n(Ex. Los Angeles, California)");
        String origin = scanner.nextLine();

        System.out.println("Please enter your destination: " + "\n(Ex. Los Angeles, California)");
        String destination = scanner.nextLine();

        Person person = new Person(name, email, phoneNum, gender, age);

        BoardingPass boardingPass = new BoardingPass( date , origin, destination, departureTime, person);

//        Person person = new Person("sally", "sally@gmail.com", "123-123-1234", 'F', 34);
//
//        BoardingPass boardingPass = new BoardingPass("01-01-2020", "Los Angeles, California", "Atlanta,Georgia","10:00 AM", person);

        boardingPassList.add(boardingPass);

        return boardingPass;
    }

    private static void printBoardingPassInfo(BoardingPass BoardingPass)
    {
        for (int i=0; i < boardingPassList.size(); i++)
        {
            System.out.print(boardingPassList.get(i).toString());
            System.out.println("");
        }
    }

//    private static String writeInfoToFile(BoardingPass BoardingPass, String filename)
//    {
//        return "Successfully written data to file ";
//    }
}
